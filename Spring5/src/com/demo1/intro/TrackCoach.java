package com.demo1.intro;

public class TrackCoach implements Coach {

	protected FortuneServices fortuneServices;
	
	String returnText;
	/*public TrackCoach() {
		System.out.println("Entered the constructor");
	}*/
	public void preQueryHook() {
		System.out.println("Entered Pre Query Hook, Ready for DB connectivity");
	}
	public void postQueryHook() {
		System.out.println("Entered Post Query Hook, Ready for closing DB connectivity");
	}
	public TrackCoach(FortuneServices fortuneServices) {
		this.fortuneServices=fortuneServices;
	}
	@Override
	public String getDailyWorkouts() {
		return "Run 5 kms daily ";
		
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return this.fortuneServices.getFortuneService();
	}

}
