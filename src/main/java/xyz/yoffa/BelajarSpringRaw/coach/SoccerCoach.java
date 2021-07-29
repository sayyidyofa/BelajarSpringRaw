package xyz.yoffa.BelajarSpringRaw.coach;

import org.springframework.beans.factory.DisposableBean;
import xyz.yoffa.BelajarSpringRaw.fortune.FortuneService;

public class SoccerCoach implements Coach, DisposableBean {

    private final FortuneService fortuneService;

    public SoccerCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Score 10 goals";
    }

    @Override
    public String getDailyFortune() {
        return "Today's news: " + fortuneService.getFortune();
    }

    @Override
    public void destroy() {
        System.out.println("Destroying " + this);
    }
}
