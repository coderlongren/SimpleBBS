package com.coderlong.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import test.test;


@Configuration
public class AppConfig {
	@Bean(name="helloworld")
	public test helloworld(){
		return new test();
	}
}
