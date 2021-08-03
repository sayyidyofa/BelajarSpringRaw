package xyz.yoffa.BelajarSpring.serving;

import xyz.yoffa.BelajarSpring.beverage.Beverage;

public class PaketMiskin implements Serving{

    private final Beverage beverage;

    public PaketMiskin(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDrink() {
        return beverage.getType();
    }
}
