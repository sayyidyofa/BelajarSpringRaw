package xyz.yoffa.BelajarSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xyz.yoffa.BelajarSpring.serving.PaketHalu;
import xyz.yoffa.BelajarSpring.serving.Serving;

public class Application {
    public static void main(String[] args) {

        // Fire up a Spring IoC Container via Java class config
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Serving pesanan = context.getBean("paketHalu", Serving.class);

        System.out.println("Minuman di pesanan: " + pesanan.getDrink());

        System.out.println("Harga pesanan: " + ((PaketHalu)pesanan).harga);

        System.out.println(((PaketHalu)pesanan).getLegalMessage());

        System.out.println("Drug in ths serving: " + ((PaketHalu)pesanan).getNarco());

        // close the context
        context.close();
    }
}
