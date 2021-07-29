package xyz.yoffa.BelajarSpringRaw;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.yoffa.BelajarSpringRaw.coach.Coach;
import xyz.yoffa.BelajarSpringRaw.coach.CricketCoach;
import xyz.yoffa.BelajarSpringRaw.coach.SoccerCoach;
import xyz.yoffa.BelajarSpringRaw.teh.Teh;

public class Application {
    public static void main(String[] args) {

        // load the app context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeContext.xml");

        // retrieve the bean from container

        Coach baseballCoach = context.getBean("myCoach", Coach.class);

        System.out.println(baseballCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
