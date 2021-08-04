package xyz.yoffa.BelajarSpring.beverage;

public class BloodyMary implements Beverage{
    @Override
    public String getType() {
        return "Alcohol";
    }

    @Override
    public boolean isIced() {
        return false;
    }
}
