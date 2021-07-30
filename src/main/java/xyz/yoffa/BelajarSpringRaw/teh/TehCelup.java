package xyz.yoffa.BelajarSpringRaw.teh;

import org.springframework.stereotype.Component;

@Component
public class TehCelup implements Teh{
    @Override
    public String penyajian() {
        return "Dijilat, diputar, dicelupin";
    }

    @Override
    public int getCalories() {
        return 0;
    }

}
