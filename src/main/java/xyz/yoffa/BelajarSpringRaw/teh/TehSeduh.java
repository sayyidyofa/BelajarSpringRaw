package xyz.yoffa.BelajarSpringRaw.teh;

import org.springframework.stereotype.Component;

@Component
public class TehSeduh implements Teh{
    @Override
    public String penyajian() {
        return "Seduh selama lima detik";
    }
}
