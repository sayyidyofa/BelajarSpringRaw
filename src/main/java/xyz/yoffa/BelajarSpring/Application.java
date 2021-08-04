package xyz.yoffa.BelajarSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xyz.yoffa.BelajarSpring.serving.PaketMiskin;
import xyz.yoffa.BelajarSpring.serving.Serving;

public class Application {
    public static void main(String[] args) {

        // Fire up a Spring IoC Container via Java class config
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Serving pesanan = context.getBean("paketMiskin", Serving.class);

        System.out.println("Minuman di pesanan: " + pesanan.getDrink());

        System.out.println("Harga pesanan: " + ((PaketMiskin)pesanan).harga);

        // close the context
        context.close();
    }
}
