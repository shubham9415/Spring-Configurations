package com.demo1.intro;

public class CricketCoach implements Coach {

	FortuneServices fortuneServices;
	public void setFortuneServices(FortuneServices fortuneServices) {
		this.fortuneServices = fortuneServices;
	}

	@Override
	public String getDailyWorkouts() {
		// TODO Auto-generated method stub
		return "Batting Practices";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneServices.getFortuneService();
	}

}
