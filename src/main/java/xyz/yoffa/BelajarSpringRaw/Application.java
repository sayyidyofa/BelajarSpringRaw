package xyz.yoffa.BelajarSpringRaw;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.yoffa.BelajarSpringRaw.coach.Coach;

public class Application {
    public static void main(String[] args) {

        // load the app context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve the bean from container
        Coach leCoach = context.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(leCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
