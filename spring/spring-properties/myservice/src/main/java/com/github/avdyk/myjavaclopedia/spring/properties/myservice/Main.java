package com.github.avdyk.myjavaclopedia.spring.properties.myservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Main implements CommandLineRunner {

    private final MyService service;

    @Autowired
    public Main(MyService service) {
        this.service = service;
    }

    @Override
    public void run(String... args) {
        System.out.println("=========================================");
        System.out.println("Foo: " + this.service.getFoo());
        System.out.println("=========================================");
    }

    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder(Main.class).run(args);
    }

}
