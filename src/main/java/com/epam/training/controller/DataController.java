package com.epam.training.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Calendar;



@RestController
@RequestMapping("/data")
public class DataController {

    private static Logger logger = LogManager.getLogger();

    @RequestMapping(value = "/request", method = RequestMethod.GET)
    public String getDataRequest(@RequestParam("id") Long id) {
        logger.info(" Request param:" + id);
        return "Request param:" + id;
    }

    @RequestMapping(value = "/url", method = RequestMethod.GET)
    public String getURLRequest(HttpServletRequest request) {
        String test = request.getRequestURI();
        logger.info("URL:" + test);
        return test;
    }

    @RequestMapping(value = "/user/{id:[\\d]+}",method = RequestMethod.POST)
    public String postData(@PathVariable("id") Long id) {
        String data = Calendar.getInstance().getCalendarType() + "it's answer on POST with id = " + id;
        logger.info("Post:" + data);
        return data;
    }
}