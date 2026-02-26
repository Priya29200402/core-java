class PawnRunner{
    public static void main(String[] args) {

        Pawn pawn1 = new Pawn();
        System.out.println("------ Pawn 1 ------");
        System.out.println("Color:"+pawn1.color);
        System.out.println("Position:"+pawn1.position);
        System.out.println("Material:"+pawn1.material);
        System.out.println("Alive:"+pawn1.alive);
        System.out.println("Value:"+pawn1.value);
		System.out.println("===========================");

        Pawn pawn2 = new Pawn("White");
        System.out.println("------ Pawn 2 ------");
        System.out.println("Color:"+pawn2.color);
        System.out.println("Position:"+pawn2.position);
        System.out.println("Material:"+pawn2.material);
        System.out.println("Alive:"+pawn2.alive);
        System.out.println("Value:"+pawn2.value);
		System.out.println("===========================");

        Pawn pawn3 = new Pawn("Black", "E2");
        System.out.println("------ Pawn 3 ------");
        System.out.println("Color:"+pawn3.color);
        System.out.println("Position:"+pawn3.position);
        System.out.println("Material:"+pawn3.material);
        System.out.println("Alive:"+pawn3.alive);
        System.out.println("Value:"+pawn3.value);
		System.out.println("===========================");

        Pawn pawn4 = new Pawn("White", "D4", "Wood");
        System.out.println("------ Pawn 4 ------");
        System.out.println("Color:"+pawn4.color);
        System.out.println("Position:"+pawn4.position);
        System.out.println("Material:"+pawn4.material);
        System.out.println("Alive:"+pawn4.alive);
        System.out.println("Value:"+pawn4.value);
		System.out.println("===========================");

        Pawn pawn5 = new Pawn("Black", "A7", "Plastic", true);
        System.out.println("------ Pawn 5 ------");
        System.out.println("Color:"+pawn5.color);
        System.out.println("Position:"+pawn5.position);
        System.out.println("Material:"+pawn5.material);
        System.out.println("Alive:"+pawn5.alive);
        System.out.println("Value:"+pawn5.value);
		System.out.println("===========================");

        Pawn pawn6 = new Pawn("White", "H2", "Metal", true, 1);
        System.out.println("------ Pawn 6 ------");
        System.out.println("Color:"+pawn6.color);
        System.out.println("Position:"+pawn6.position);
        System.out.println("Material:"+pawn6.material);
        System.out.println("Alive:"+pawn6.alive);
        System.out.println("Value:"+pawn6.value);
		System.out.println("===========================");
    }
}