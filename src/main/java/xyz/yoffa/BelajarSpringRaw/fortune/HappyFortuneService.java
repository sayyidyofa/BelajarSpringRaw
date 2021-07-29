package xyz.yoffa.BelajarSpringRaw.fortune;

public class HappyFortuneService implements FortuneService{

    public void initBean() {
        System.out.println("Initializing " + this);
    }

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }

    public void destroyBean() {
        System.out.println("Destroying " + this);
    }
}
