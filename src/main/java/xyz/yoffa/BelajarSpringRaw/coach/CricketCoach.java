package xyz.yoffa.BelajarSpringRaw.coach;

import xyz.yoffa.BelajarSpringRaw.fortune.FortuneService;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("Cricket coach");
    }

    public void setFortuneService(FortuneService leFortuneService) {
        fortuneService = leFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Belalang";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
