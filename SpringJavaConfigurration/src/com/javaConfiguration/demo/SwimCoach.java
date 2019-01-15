package com.javaConfiguration.demo;

public class SwimCoach implements Coach {

	FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService= fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
