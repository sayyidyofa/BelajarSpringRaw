package xyz.yoffa.BelajarSpringRaw.teh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import xyz.yoffa.BelajarSpringRaw.fortune.FortuneService;
import xyz.yoffa.BelajarSpringRaw.sweetener.Sweetener;

@Component
public class TehSeduh implements Teh{

    private Sweetener sweetener;

    // @Autowire is not required for constructors since Spring 4.3
    public TehSeduh(@Qualifier("sugarCane") Sweetener sweetener) {
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
