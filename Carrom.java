class Carrom{
    String boardMaterial;
    double size;
    String color;
    boolean polished;
    String brand;

    Carrom(){}

    Carrom(String boardMaterial){
        this.boardMaterial=boardMaterial;
    }

    Carrom(String boardMaterial,double size){
        this.boardMaterial=boardMaterial;
        this.size=size;
    }

    Carrom(String boardMaterial,double size,String color){
        this.boardMaterial=boardMaterial;
        this.size=size;
        this.color=color;
    }

    Carrom(String boardMaterial,double size,String color,boolean polished){
        this.boardMaterial=boardMaterial;
        this.size=size;
        this.color=color;
        this.polished=polished;
    }

    Carrom(String boardMaterial,double size,String color,boolean polished,String brand){
        this.boardMaterial=boardMaterial;
        this.size=size;
        this.color=color;
        this.polished=polished;
        this.brand=brand;
    }
}