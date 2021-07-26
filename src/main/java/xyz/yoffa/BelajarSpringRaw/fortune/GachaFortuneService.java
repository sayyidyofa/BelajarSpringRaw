package xyz.yoffa.BelajarSpringRaw.fortune;

import java.util.Random;

public class GachaFortuneService implements FortuneService{
    private final String[] gachaPossibilites = {
            "Bintang 5",
            "Bintang 3",
            "Bintang 1"
    };

    private String myGacha;

    public void setMyGacha(Random randomService) {
        this.myGacha = gachaPossibilites[randomService.nextInt(2)];
    }

    @Override
    public String getFortune() {
        return "Gacha hari ini: " + myGacha;
    }
}
