package xyz.yoffa.BelajarSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xyz.yoffa.BelajarSpring.beverage.Beverage;
import xyz.yoffa.BelajarSpring.beverage.PlainWater;
import xyz.yoffa.BelajarSpring.serving.PaketMiskin;
import xyz.yoffa.BelajarSpring.serving.Serving;

@Configuration
public class ApplicationConfig {

    @Bean
    public Beverage plainWater() {
        return new PlainWater();
    }

    @Bean
    public Serving paketMiskin() {
        return new PaketMiskin(plainWater());
    }
}
