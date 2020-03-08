package com.app.rapid;

import com.app.rapid.controllers.PageController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.app.rapid")
public class RapidApplication {

    public static void main(String[] args) {
        SpringApplication.run(RapidApplication.class, args);
    }

}
