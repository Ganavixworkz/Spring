package com.xworkz.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class UDriveConfiguration {
	
public UDriveConfiguration() {
	System.out.println("UDriveConfiguration");
}
}
