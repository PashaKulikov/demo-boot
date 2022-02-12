package ru.learnup.spring.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.learnup.spring.boot.services.MyLogger;
import ru.learnup.spring.boot.services.MyService;

@Configuration
public class MyConfig {

    @Bean
    public MyLogger myLogger(){
        return new MyLogger();
    }

    @Bean
    public MyService myService(MyLogger myLogger){
        return new MyService(myLogger);
    }
}
