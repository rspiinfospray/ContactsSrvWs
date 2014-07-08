package org.infospray.springboot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.infospray")
@EnableAutoConfiguration
public class Runner {

    public static void main(String[] args) {
        SpringApplication.run(Runner.class, args);
    }
    
   
}
