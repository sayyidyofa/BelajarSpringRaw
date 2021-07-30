package xyz.yoffa.BelajarSpringRaw.sweetener;

import org.springframework.stereotype.Component;

@Component
public class SugarCane implements Sweetener{
    @Override
    public boolean isArtificial() {
        return false;
    }

    @Override
    public int getCalories() {
        return 100;
    }
}
