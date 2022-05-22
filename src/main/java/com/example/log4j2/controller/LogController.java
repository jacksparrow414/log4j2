package com.example.log4j2.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
        LOGGER.debug("Debug level log message");
        LOGGER.info("Info level log message");
        LOGGER.warn("Warn level log message");
        LOGGER.error("Error level log message");
    }
}
