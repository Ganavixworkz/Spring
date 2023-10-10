package com.xworkz.fashionfactory.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
@ComponentScan("com.xworkz")
public class FashionFactoryConfiguration {
	
	public FashionFactoryConfiguration() {
System.out.println("FashionFactoryConfiguration constructor");
	}
	@Bean
	public LocalContainerEntityManagerFactoryBean lcefb() {
		System.out.println("LocalContainerEntityManagerFactoryBean created");
		LocalContainerEntityManagerFactoryBean bean=new LocalContainerEntityManagerFactoryBean();
		System.out.println(bean);
		return bean;
	}
}
