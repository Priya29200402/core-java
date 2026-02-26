class Strawberry{
    String color;
    double weight;
    String taste;
    boolean fresh;
    String origin;

    Strawberry(){}

    Strawberry(String color){
        this.color=color;
    }

    Strawberry(String color,double weight){
        this.color=color;
        this.weight=weight;
    }

    Strawberry(String color,double weight,String taste){
        this.color=color;
        this.weight=weight;
        this.taste=taste;
    }

    Strawberry(String color,double weight,String taste,boolean fresh){
        this.color=color;
        this.weight=weight;
        this.taste=taste;
        this.fresh=fresh;
    }

    Strawberry(String color,double weight,String taste,boolean fresh,String origin){
        this.color=color;
        this.weight=weight;
        this.taste=taste;
        this.fresh=fresh;
        this.origin=origin;
    }
}