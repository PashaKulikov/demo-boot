package ru.learnup.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.learnup.spring.boot.services.MyService;

@SpringBootApplication
public class DemoBootApplication {

	public static void main(String[] args) {
final ConfigurableApplicationContext ctx = SpringApplication.run(DemoBootApplication.class, args);
ctx.getBean(MyService.class).doSmth();
	}

}
