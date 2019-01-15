package com.javaConfiguration.demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.javaConfiguration.demo")
@PropertySource("classpath:sport.properties")
public class ConfigurationClass {
	@Bean
	public FortuneService sadFortune() {
		return new SadFortuneService();
	}
	// define Bean and inject dependency for the fortuneService
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortune());
	}
}
