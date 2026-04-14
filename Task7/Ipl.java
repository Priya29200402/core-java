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
		
		if(this.owner!=null){
			this.owner.getInfo();
		}
		else{
			System.out.println("owner name is null");
		}
		if(this.coach!=null){
			this.coach.getInfo();
		}
		else{
			System.out.println("Coach name is null");
		}
		if(this.captain!=null){
			this.captain.getInfo();
		}
		else{
			System.out.println("Captain name is Null");
		}
		if(this.ground!=null){
			this.ground.getInfo();
		}
		else{
			System.out.println("Ground name is Null");
		}
		if(this.sponsor!=null){
			this.sponsor.getInfo();
		}
		else{
			System.out.println("Sponsor is null");
		}
    }
}