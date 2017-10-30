package com.github.avdyk.myjavaclopedia.spring.properties.myapp;

import com.github.avdyk.myjavaclopedia.spring.properties.myservice.MyService;
import com.github.avdyk.myjavaclopedia.spring.properties.myservice.MyServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@Configuration
@PropertySource("application.properties")
@Import(MyServiceConfig.class)
public class Main implements CommandLineRunner {

    private final MyService service;
    private final String bar;

    @Autowired
    public Main(final MyService service, @Value("${bar}") final String bar) {
        this.service = service;
        this.bar = bar;
    }

    @Override
    public void run(String... args) {
        System.out.println("=========================================");
        System.out.println("Foo: " + this.service.getFoo());
        System.out.println("Bar: " + this.bar);
        System.out.println("=========================================");
    }

    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder(Main.class).run(args);
    }

}
