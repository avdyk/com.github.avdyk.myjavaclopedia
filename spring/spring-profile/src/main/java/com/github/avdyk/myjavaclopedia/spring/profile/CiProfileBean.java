package com.github.avdyk.myjavaclopedia.spring.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("ci")
public class CiProfileBean {

    public String getValue() {
        return "ci bean";
    }

}
