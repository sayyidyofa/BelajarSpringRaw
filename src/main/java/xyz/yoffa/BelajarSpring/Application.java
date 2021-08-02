package xyz.yoffa.BelajarSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xyz.yoffa.BelajarSpringRaw.teh.Teh;

public class Application {
    public static void main(String[] args) {

        // Fire up a Spring IoC Container via Java class config
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Teh leTeh = context.getBean("tehCelup", Teh.class);

        System.out.println("Cara Penyajian leTeh: " + leTeh.penyajian());

        // close the context
        context.close();
    }
}
