package com.github.avdyk.myjavaclopedia.spring.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource(
        value = {"classpath:/application.properties",
                "classpath:/application-${spring.profiles.active}.properties"
        },
        ignoreResourceNotFound = true
)
@ComponentScan({AppConfig.PACKAGE_SCAN})
public class AppConfig {

    public static final String PACKAGE_SCAN = "com.github.avdyk.myjavaclopedia.spring.profile";
    private int cpt;

    @Value("${foo}")
    private String foo;

    @Value("${toto:no value for toto}")
    private String toto;

    @Value("${tata:no value for tata}")
    private String tata;

    public String getFoo() {
        return foo;
    }

    public String getToto() {
        return this.toto;
    }

    public String getTata() {
        return this.tata;
    }

    /**
     * Property placeholder configurer needed to process @Value annotations
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
