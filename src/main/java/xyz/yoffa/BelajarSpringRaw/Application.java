package xyz.yoffa.BelajarSpringRaw;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.yoffa.BelajarSpringRaw.coach.Coach;
import xyz.yoffa.BelajarSpringRaw.coach.CricketCoach;

public class Application {
    public static void main(String[] args) {

        // load the app context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve the bean from container
        CricketCoach leCoach = context.getBean("belalang", CricketCoach.class);

        // call methods on the bean
        System.out.println(leCoach.getDailyWorkout());

        System.out.println(leCoach.getDailyFortune());

        // get literal email
        System.out.println(leCoach.getEmailAddress());

        // get literal team
        System.out.println(leCoach.getTeam());

        // close the context
        context.close();
    }
}
