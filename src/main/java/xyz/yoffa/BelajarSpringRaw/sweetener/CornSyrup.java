package xyz.yoffa.BelajarSpringRaw.sweetener;

import org.springframework.stereotype.Component;

@Component
public class CornSyrup implements Sweetener{
    @Override
    public boolean isArtificial() {
        return true;
    }

    @Override
    public int getCalories() {
        return 10000;
    }
}
