package xyz.yoffa.BelajarSpringRaw;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.yoffa.BelajarSpringRaw.coach.Coach;
import xyz.yoffa.BelajarSpringRaw.coach.CricketCoach;
import xyz.yoffa.BelajarSpringRaw.coach.SoccerCoach;
import xyz.yoffa.BelajarSpringRaw.teh.Teh;

import java.lang.annotation.Annotation;

public class Application {
    public static void main(String[] args) {

        // load the app context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeContext.xml");

        System.out.println("Soccer coach bean's scope is: " + context.getBeanFactory().getBeanDefinition("soccerCoach").getScope());

        // close the context
        context.close();
    }
}
