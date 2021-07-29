package xyz.yoffa.BelajarSpringRaw;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.yoffa.BelajarSpringRaw.coach.Coach;
import xyz.yoffa.BelajarSpringRaw.coach.CricketCoach;
import xyz.yoffa.BelajarSpringRaw.coach.SoccerCoach;

public class Application {
    public static void main(String[] args) {

        // load the app context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeContext.xml");

        // retrieve the bean from container

        Coach coach1 = context.getBean("myCoach", Coach.class);

        Coach coach2 = context.getBean("myCoach", Coach.class);

        System.out.println("Coach 1 memory location: " + coach1);

        System.out.println("Couch 2 memory location: " + coach2);

        System.out.println("Do coach 1 and coach 2 point to the same object? " + (coach1 == coach2 ? "Yes" : "No"));

        // close the context
        context.close();
    }
}
