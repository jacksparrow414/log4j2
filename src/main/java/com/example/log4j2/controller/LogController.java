package com.example.log4j2.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.apache.tomcat.util.net.AprEndpoint.Sendfile;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jacksparrow414
 * @date 2022/4/26
 */
@RestController
@RequestMapping
public class LogController {
    
    private static final Logger LOGGER = LogManager.getLogger();
    
    @GetMapping(value = "log")
    public void log() {
//        LOGGER.debug("Debug level log message");
//        LOGGER.info("Info level log message");
//        LOGGER.warn("Warn level log message");
//        LOGGER.error("Error level log message");
        ThreadContext.put("clientIp", "127.0.0.1");
        LOGGER.info("this is iner log");
        ThreadContext.clearAll();
    }
    
    @GetMapping(value = "logp")
    public void logP() {
        ThreadContext.put("clientIp", "192.168.100.12");
        LOGGER.info("this is private log");
        ThreadContext.clearAll();
        
    }
}
