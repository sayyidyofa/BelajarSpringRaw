package xyz.yoffa.BelajarSpring.serving;

import org.springframework.beans.factory.annotation.Value;
import xyz.yoffa.BelajarSpring.beverage.Beverage;
import xyz.yoffa.BelajarSpring.edible.Edible;

public class PaketHalu implements Serving {

    private final Beverage beverage;
    private final Edible edible;

    @Value("${pakethalu.harga}")
    public int harga;

    public PaketHalu(Beverage beverage, Edible edible) {
        this.beverage = beverage;
        this.edible = edible;
    }

    @Override
    public String getDrink() {
        return beverage.getType();
    }

    public String getNarco() {
        return edible.getDrugName();
    }

    public String getLegalMessage() {
        return edible.isLegal()
                ? "This serving is safe in terms of law"
                : "Warning! This serving contains illegal substances. Proceed with caution";
    }
}
