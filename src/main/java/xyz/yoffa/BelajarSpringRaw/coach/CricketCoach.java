package xyz.yoffa.BelajarSpringRaw.coach;

import xyz.yoffa.BelajarSpringRaw.fortune.FortuneService;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    private String emailAddress;

    private String team;

    public CricketCoach() {
        System.out.println("Cricket coach");
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Setting email address...");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("Setting team...");
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setFortuneService(FortuneService leFortuneService) {
        fortuneService = leFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Belalang";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
