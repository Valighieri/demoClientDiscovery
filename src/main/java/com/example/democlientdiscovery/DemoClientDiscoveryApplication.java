package com.example.democlientdiscovery;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DemoClientDiscoveryApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DemoClientDiscoveryApplication.class)
                .web(WebApplicationType.SERVLET).run(args);
    }
}
