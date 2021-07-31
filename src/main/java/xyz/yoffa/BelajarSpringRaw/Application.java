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

        TehSeduh leTeh = context.getBean("tehSeduh", TehSeduh.class);

        System.out.println("Merk leTeh: " + leTeh.merk);

        // close the context
        context.close();
    }
}
