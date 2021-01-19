package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
	private Map<String,Object> cache=new HashMap<String,Object>();
	public static void main(String[] args) {
		ConfigurableApplicationContext run=SpringApplication.run(Application.class, args);
		//changes for HIS-134
		run.close();
	}

	//HIS-300 changes
	public void loadDataToCache(){
		//Logic
	}

}
