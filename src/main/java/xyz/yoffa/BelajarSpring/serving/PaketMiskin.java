package xyz.yoffa.BelajarSpring.serving;

import org.springframework.beans.factory.annotation.Value;
import xyz.yoffa.BelajarSpring.beverage.Beverage;

public class PaketMiskin implements Serving{

    private final Beverage beverage;

    @Value("${paketmiskin.harga}")
    public int harga;

    public PaketMiskin(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDrink() {
        return beverage.getType();
    }
}
