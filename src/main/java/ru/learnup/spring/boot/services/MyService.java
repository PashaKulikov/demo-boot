package ru.learnup.spring.boot.services;

public class MyService {

private MyLogger logger;


    public MyService(MyLogger logger) {
        this.logger = logger;
    }

    public void doSmth(){
       logger.log("Работаю");
    }
}
