package xyz.yoffa.BelajarSpringRaw.fortune;

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}