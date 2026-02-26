class Rain{
    String type;
    double intensity;
    String season;
    boolean thunder;
    String location;

    Rain(){
    }

    Rain(String type){
        this.type = type;
    }

    Rain(String type, double intensity){
        this.type = type;
        this.intensity = intensity;
    }

    Rain(String type, double intensity, String season){
        this.type = type;
        this.intensity = intensity;
        this.season = season;
    }

    Rain(String type, double intensity, String season, boolean thunder){
        this.type = type;
        this.intensity = intensity;
        this.season = season;
        this.thunder = thunder;
    }

    Rain(String type, double intensity, String season, boolean thunder, String location){
        this.type = type;
        this.intensity = intensity;
        this.season = season;
        this.thunder = thunder;
        this.location = location;
    }
}