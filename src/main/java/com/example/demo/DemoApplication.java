package com.example.demo;


import org.springframework.core.env.Environment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@SpringBootApplication
@RestController
public class DemoApplication {

	@Value("${spring.datasource.url}")
	private String url;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping(value = "/")
    public String helloWorld() {
        return "Yeyyy!!!! Your application v3 is up and running and these changes are made by Nishith. DB Connection Status: Successful";
    }
}
