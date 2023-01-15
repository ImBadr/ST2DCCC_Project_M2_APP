package com.boirard_tadjer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
//@ImportResource("classpath:db_channels.xml")
public class Main {

	public static void main(String[] args) {
		//SpringApplication.run(Main.class, args);
		new ClassPathXmlApplicationContext("json_channels.xml");
	}

}
