package com.example.log4j2.infrastructure;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.lookup.StrLookup;
import org.apache.logging.log4j.core.lookup.SystemPropertiesLookup;

/**
 * @author jacksparrow414
 * @date 2023/7/15
 *
 */
@Plugin(
    name="sys",
    category = StrLookup.CATEGORY
)
public class CustomerSystemPropertiesLookUp extends SystemPropertiesLookup {
    
    private static final String LOOK_UP_KEY = "log4jLayOut";
    
    @Override
    public String lookup(final LogEvent event, String key) {
        if (LOOK_UP_KEY.equals(key)) {
           return getValueBasedOnEnv();
        }else {
            return super.lookup(key);
        }
    }
    
    private String getValueBasedOnEnv() {
        String isTest = System.getProperty("isTest");
        return "true".equals(isTest) ? "test" : "prod";
    }
}
