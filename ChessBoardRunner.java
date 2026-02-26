class ChessBoardRunner{
    public static void main(String[] args) {

        ChessBoard board1 = new ChessBoard();
        System.out.println("------ ChessBoard 1 ------");
        System.out.println("Color:"+board1.color);
        System.out.println("Size:"+board1.size);
        System.out.println("Material:"+board1.material);
        System.out.println("Foldable:"+board1.foldable);
        System.out.println("Brand:"+board1.brand);
	    System.out.println("===========================");


        ChessBoard board2 = new ChessBoard("Black & White");
        System.out.println("------ ChessBoard 2 ------");
        System.out.println("Color:"+board2.color);
        System.out.println("Size:"+board2.size);
        System.out.println("Material:"+board2.material);
        System.out.println("Foldable:"+board2.foldable);
        System.out.println("Brand:"+board2.brand);
	    System.out.println("===========================");

        ChessBoard board3 = new ChessBoard("Brown & Cream", 15.5);
        System.out.println("------ ChessBoard 3 ------");
        System.out.println("Color:"+board3.color);
        System.out.println("Size:"+board3.size);
        System.out.println("Material:"+board3.material);
        System.out.println("Foldable:"+board3.foldable);
        System.out.println("Brand:"+board3.brand);
	    System.out.println("===========================");

        ChessBoard board4 = new ChessBoard("Green & White", 18.0, "Wood");
        System.out.println("------ ChessBoard 4 ------");
       System.out.println("Color:"+board4.color);
        System.out.println("Size:"+board4.size);
        System.out.println("Material:"+board4.material);
        System.out.println("Foldable:"+board4.foldable);
        System.out.println("Brand:"+board4.brand);
	    System.out.println("===========================");
        ChessBoard board5 = new ChessBoard("Classic", 20.0, "Plastic", true);
        System.out.println("------ ChessBoard 5 ------");
       System.out.println("Color:"+board5.color);
        System.out.println("Size:"+board5.size);
        System.out.println("Material:"+board5.material);
        System.out.println("Foldable:"+board5.foldable);
        System.out.println("Brand:"+board5.brand);
	    System.out.println("===========================");

        ChessBoard board6 = new ChessBoard("Luxury", 22.5, "Marble", false, "Staunton");
        System.out.println("------ ChessBoard 6 ------");
        System.out.println("Color:"+board6.color);
        System.out.println("Size:"+board6.size);
        System.out.println("Material:"+board6.material);
        System.out.println("Foldable:"+board6.foldable);
        System.out.println("Brand:"+board6.brand);
	    System.out.println("===========================");
    }
}