class Pawn{
    String color;
    String material;
    double height;
    boolean promoted;
    String position;

    Pawn(){}

    Pawn(String color){
        this.color=color;
    }

    Pawn(String color,String material){
        this.color=color;
        this.material=material;
    }

    Pawn(String color,String material,double height){
        this.color=color;
        this.material=material;
        this.height=height;
    }

    Pawn(String color,String material,double height,boolean promoted){
        this.color=color;
        this.material=material;
        this.height=height;
        this.promoted=promoted;
    }

    Pawn(String color,String material,double height,boolean promoted,String position){
        this.color=color;
        this.material=material;
        this.height=height;
        this.promoted=promoted;
        this.position=position;
    }
}