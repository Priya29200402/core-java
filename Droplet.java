class Droplet{
    String color;
    double size;
    String shape;
    boolean pure;
    String source;

    Droplet(){
        
    }

    Droplet(String color){
        this.color=color;
    }

    Droplet(String color, double size){
        this.color=color;
		this.size=size;
    }

    Droplet(String color, double size, String shape){
        this.color=color;
		this.size=size;
		this.shape=shape;
    }

    Droplet(String color, double size, String shape, boolean pure){
        this.color=color;
		this.size=size;
		this.shape=shape;
		this.pure=pure;
    }

    Droplet(String color, double size, String shape, boolean pure, String source){
        this.color = color;
        this.size = size;
        this.shape = shape;
        this.pure = pure;
        this.source = source;
    }
}