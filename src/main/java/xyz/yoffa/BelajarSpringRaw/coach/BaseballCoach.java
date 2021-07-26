package xyz.yoffa.BelajarSpringRaw.coach;

import xyz.yoffa.BelajarSpringRaw.fortune.FortuneService;

public class BaseballCoach implements Coach{

    private final FortuneService fortuneService;

    public BaseballCoach(FortuneService FortuneService) {
        fortuneService = FortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Throw balls";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
