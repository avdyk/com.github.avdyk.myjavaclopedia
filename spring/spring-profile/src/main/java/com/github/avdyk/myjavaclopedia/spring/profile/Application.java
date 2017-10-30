package com.github.avdyk.myjavaclopedia.spring.profile;

import org.springframework.context.ApplicationContext;

/**
 * Application
 */
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = new org.springframework.context.annotation
                .AnnotationConfigApplicationContext(AppConfig.class);
        final AppConfig config = ctx.getBean(AppConfig.class);
        System.out.println("Default profiles:");
        for (final String profile : ctx.getEnvironment().getDefaultProfiles()) {
            System.out.println("\to " + profile);
        }
        System.out.println("Active profiles:");
        for (final String profile : ctx.getEnvironment().getActiveProfiles()) {
            System.out.println("\to " + profile);
        }
        System.out.println(config.getFoo());
        System.out.println(config.getToto());
        System.out.println(config.getTata());
        System.out.println("Get several my beans:");
        System.out.println(ctx.getBean(MyBean.class).getValue());
        System.out.println(ctx.getBean(MyBean.class).getValue());
        System.out.println(ctx.getBean(MyBean.class).getValue());
        System.out.println(ctx.getBean(MyBean.class).getValue());
    }
}
