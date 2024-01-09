package com.zhangz.springguavaevent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringGuavaEventApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringGuavaEventApplication.class, args);
    }

}
