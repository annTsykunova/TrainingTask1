package com.epam.training.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/data")
public class RequestController {

    private static final Logger logger = Logger.getLogger(RequestController.class);

    @RequestMapping("/request")
    public String getDataRequest(@RequestParam(value = "id")Integer id){
        logger.info(" Request param:" + id);
        return "Request param:" + id;
    }

    @RequestMapping("url")
    public String getURLRequest(HttpServletRequest request){
        String test = request.getRequestURI();
        logger.info("URL:" + test);
        return test;
    }

}
