class Snow{
    String color;
    double thickness;
    String region;
    boolean melting;
    String season;

    Snow() {
    }

    Snow(String color){
        this.color = color;
    }

    Snow(String color, double thickness){
        this.color = color;
        this.thickness = thickness;
    }

    Snow(String color, double thickness, String region){
        this.color = color;
        this.thickness = thickness;
        this.region = region;
    }

    Snow(String color, double thickness, String region, boolean melting){
        this.color = color;
        this.thickness = thickness;
        this.region = region;
        this.melting = melting;
    }

    Snow(String color, double thickness, String region, boolean melting, String season){
        this.color = color;
        this.thickness = thickness;
        this.region = region;
        this.melting = melting;
        this.season = season;
    }
}