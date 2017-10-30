package com.github.avdyk.myjavaclopedia.spring.properties.myservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final String foo;

    public MyService(@Value("${foo}") final String foo) {
        this.foo = foo;
    }

    public String getFoo() {
        return foo;
    }
}
