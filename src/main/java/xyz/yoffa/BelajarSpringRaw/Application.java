package xyz.yoffa.BelajarSpringRaw;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.yoffa.BelajarSpringRaw.teh.Teh;
import xyz.yoffa.BelajarSpringRaw.teh.TehSeduh;

import java.lang.annotation.Annotation;

public class Application {

    public static void main(String[] args) {

        // load the app context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("goodbyeXmlContext.xml");

        Teh leTeh = context.getBean("tehCelup", Teh.class);

        System.out.println("Cara Penyajian leTeh: " + leTeh.penyajian());

        // close the context
        context.close();
    }
}
