package main.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import main.beans.Address;
import main.beans.Customers;

/**
 * @author emilylester empope1
 * CIS 175 Spring 2024
 * Apr 10, 2024
 */

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Customers customers() {
		Customers bean = new Customers ();
			bean.setFullName("Dr. Seuss");
			bean.setEmail("hello@gmail.com");
			bean.setAge( "36");
			return bean;
	}
	
	@Bean
	public Address address() {
		Address bean = new Address("123 Main Street", "Des Moines", "IA");
		return bean;
	}

}
