package xyz.yoffa.BelajarSpring.edible;

public class FuunyCandy implements Edible{
    @Override
    public String getDrugName() {
        return "Crack Cocaine";
    }

    @Override
    public boolean isLegal() {
        return false;
    }
}
