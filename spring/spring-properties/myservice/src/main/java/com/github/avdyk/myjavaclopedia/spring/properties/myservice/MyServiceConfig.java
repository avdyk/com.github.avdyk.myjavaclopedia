package com.github.avdyk.myjavaclopedia.spring.properties.myservice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(MyServiceConfig.PACKAGE_SCAN)
@PropertySource("application.properties")
public class MyServiceConfig {

    public static final String PACKAGE_SCAN = "com.github.avdyk.myjavaclopedia.spring.properties.myservice";

}
