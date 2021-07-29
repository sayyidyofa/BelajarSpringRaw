package xyz.yoffa.BelajarSpringRaw;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.yoffa.BelajarSpringRaw.coach.Coach;
import xyz.yoffa.BelajarSpringRaw.coach.CricketCoach;
import xyz.yoffa.BelajarSpringRaw.coach.SoccerCoach;
import xyz.yoffa.BelajarSpringRaw.teh.Teh;

public class Application {
    public static void main(String[] args) {

        // load the app context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("goodbyeXmlContext.xml");

        // retrieve the bean from container

        Teh tehCelupku = context.getBean("tehCelup", Teh.class);

        System.out.println("Cara penyajian teh: " + tehCelupku.penyajian());

        // close the context
        context.close();
    }
}
