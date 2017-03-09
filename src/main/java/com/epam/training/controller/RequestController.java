package com.epam.training.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Calendar;



@RestController
@RequestMapping("/data")
public class RequestController {

    private static Logger logger = LogManager.getLogger();

    @RequestMapping(value = "/request", method = RequestMethod.GET)
    public String getDataRequest(@RequestParam(value = "id") Integer id) {
        logger.info(" Request param:" + id);
        return "Request param:" + id;
    }

    @RequestMapping(value = "/url", method = RequestMethod.GET)
    public String getURLRequest(HttpServletRequest request) {
        String test = request.getRequestURI();
        logger.info("URL:" + test);
        return test;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String postData() {
        String data = Calendar.getInstance().getCalendarType() + "it's answer on POST!";
        logger.info("Post:" + data);
        return data;
    }
}