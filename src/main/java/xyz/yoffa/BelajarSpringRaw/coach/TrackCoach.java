package xyz.yoffa.BelajarSpringRaw.coach;

public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run for yer life";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
