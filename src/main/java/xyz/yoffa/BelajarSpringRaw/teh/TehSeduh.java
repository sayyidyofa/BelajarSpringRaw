package xyz.yoffa.BelajarSpringRaw.teh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xyz.yoffa.BelajarSpringRaw.fortune.FortuneService;
import xyz.yoffa.BelajarSpringRaw.sweetener.Sweetener;

@Component
public class TehSeduh implements Teh{

    private Sweetener sweetener;

    @Autowired
    public void customMethodName(Sweetener sweetener) {
        this.sweetener = sweetener;
    }

    @Override
    public String penyajian() {
        return "Seduh selama lima detik";
    }

    @Override
    public int getCalories() {
        return sweetener.getCalories();
    }

}
