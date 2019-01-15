package com.demo.annotationsDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*@Component ("TheVolleyBallCoach")
public class VolleyCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice VolleyBall Daily";
	}

}*/


@Component
public class VolleyCoach implements Coach {

	@Autowired
	FortuneService fortuneService;
	
	@Value("${value.email}")
	private String email;
	
	@Value("${value.team}")
	private String team;
	/*@Autowired
	public VolleyCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}*/
/*	@Autowired
	public void doAnything(FortuneService fortuneService) {
		System.out.println("Inside doAnything");
		this.fortuneService=fortuneService;
	}*/
	@Override
	public String getDailyWorkout() {
		return "Practice VolleyBall Daily" + "Email ID" + email + "Team name is:" + team;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortuneService();
	}

}
