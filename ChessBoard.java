class ChessBoard{
    String material;
    String color;
    int size;
    boolean foldable;
    String brand;

    ChessBoard(){}

    ChessBoard(String material){
        this.material=material;
    }

    ChessBoard(String material,String color){
        this.material=material;
        this.color=color;
    }

    ChessBoard(String material,String color,int size){
        this.material=material;
        this.color=color;
        this.size=size;
    }

    ChessBoard(String material,String color,int size,boolean foldable){
        this.material=material;
        this.color=color;
        this.size=size;
        this.foldable=foldable;
    }

    ChessBoard(String material,String color,int size,boolean foldable,String brand){
        this.material=material;
        this.color=color;
        this.size=size;
        this.foldable=foldable;
        this.brand=brand;
    }
}