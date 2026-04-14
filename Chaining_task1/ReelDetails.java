class SocialMedia extends Reel{

    SocialMedia(String platform, int duration, String creator){
        super(platform,duration,creator);
    }

    SocialMedia(){
        super("Instagram",30,"Triveni");
    }

    SocialMedia(String platform) {
        super(platform, 60, "Vijayalaxmi");
    }
}