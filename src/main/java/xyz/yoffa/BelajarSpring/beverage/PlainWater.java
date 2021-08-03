package xyz.yoffa.BelajarSpring.beverage;

public class PlainWater implements Beverage{
    @Override
    public String getType() {
        return "Mineral Water";
    }

    @Override
    public boolean isIced() {
        return false;
    }
}
