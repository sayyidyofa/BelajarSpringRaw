package xyz.yoffa.BelajarSpringRaw.teh;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import xyz.yoffa.BelajarSpringRaw.fortune.FortuneService;
import xyz.yoffa.BelajarSpringRaw.sweetener.Sweetener;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class TehSeduh implements Teh {

    private Sweetener sweetener;

    @Value("${teh.merk}")
    public String merk;

    // @Autowire is not required for constructors since Spring 4.3
    public TehSeduh(@Qualifier("sugarCane") Sweetener sweetener) {
        this.sweetener = sweetener;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println(this + " has been constructed");
    }

    @Override
    public String penyajian() {
        return "Seduh selama lima detik";
    }

    @Override
    public int getCalories() {
        return sweetener.getCalories();
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Going to destroy " + this);
    }
}
