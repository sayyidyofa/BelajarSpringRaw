package xyz.yoffa.BelajarSpringRaw.coach;

import org.springframework.beans.factory.DisposableBean;
import xyz.yoffa.BelajarSpringRaw.fortune.FortuneService;

public class BaseballCoach implements Coach, DisposableBean {

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

    @Override
    public void destroy() {
        System.out.println("Destroying " + this);
    }
}
