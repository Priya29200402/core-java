class Ipl{

    String teamName;
    int trophies;
    double netWorth;
    boolean champion;
    int players;

    IplOwner owner;
    IplCoach coach;
    IplCaptain captain;
    IplHomeGround ground;
    IplSponsor sponsor;

    Ipl(String teamName,int trophies,double netWorth,boolean champion,int players,
        IplOwner owner,IplCoach coach,IplCaptain captain,IplHomeGround ground,IplSponsor sponsor){

        this.teamName=teamName;
        this.trophies=trophies;
        this.netWorth=netWorth;
        this.champion=champion;
        this.players=players;

        this.owner=owner;
        this.coach=coach;
        this.captain=captain;
        this.ground=ground;
        this.sponsor=sponsor;
    }

    void getIplDetails(){

        System.out.println("Team Name:"+this.teamName);
        System.out.println("Trophies:"+this.trophies);
        System.out.println("Net Worth:"+this.netWorth);
        System.out.println("Champion:"+this.champion);
        System.out.println("Players:"+this.players);

        System.out.println("Owner:"+this.owner);
        System.out.println("Coach:"+this.coach);
        System.out.println("Captain:"+this.captain);
        System.out.println("Ground:"+this.ground);
        System.out.println("Sponsor:"+this.sponsor);
    }
}