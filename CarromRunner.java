class CarromRunner{
    public static void main(String[] args) {

        Carrom carrom1 = new Carrom();
        System.out.println("------ Carrom 1 ------");
        System.out.println("Brand:"+carrom1.brand);
        System.out.println("Size:"+carrom1.size);
        System.out.println("Material:"+carrom1.material);
        System.out.println("Foldable:"+carrom1.foldable);
        System.out.println("Price:"+carrom1.price);
		System.out.println("===========================");

        Carrom carrom2 = new Carrom("Synco");
        System.out.println("------ Carrom 2 ------");
        System.out.println("Brand:"+carrom2.brand);
        System.out.println("Size:"+carrom2.size);
        System.out.println("Material:"+carrom2.material);
        System.out.println("Foldable:"+carrom2.foldable);
        System.out.println("Price:"+carrom2.price);
		System.out.println("===========================");


        Carrom carrom3 = new Carrom("Precise", 29.0);
        System.out.println("------ Carrom 3 ------");
        System.out.println("Brand:"+carrom3.brand);
        System.out.println("Size:"+carrom3.size);
        System.out.println("Material:"+carrom3.material);
        System.out.println("Foldable:"+carrom3.foldable);
        System.out.println("Price:"+carrom3.price);
		System.out.println("===========================");


        Carrom carrom4 = new Carrom("Siscaa", 32.0, "Plywood");
        System.out.println("------ Carrom 4 ------");
        System.out.println("Brand:"+carrom4.brand);
        System.out.println("Size:"+carrom4.size);
        System.out.println("Material:"+carrom4.material);
        System.out.println("Foldable:"+carrom4.foldable);
        System.out.println("Price:"+carrom4.price);
		System.out.println("===========================");


        Carrom carrom5 = new Carrom("Champion", 35.0, "Wood", true);
        System.out.println("------ Carrom 5 ------");
        System.out.println("Brand:"+carrom5.brand);
        System.out.println("Size:"+carrom5.size);
        System.out.println("Material:"+carrom5.material);
        System.out.println("Foldable:"+carrom5.foldable);
        System.out.println("Price:"+carrom5.price);
		System.out.println("===========================");


        Carrom carrom6 = new Carrom("Premium", 36.0, "Rosewood", false, 8500.0);
        System.out.println("------ Carrom 6 ------");
        System.out.println("Brand:"+carrom6.brand);
        System.out.println("Size:"+carrom6.size);
        System.out.println("Material:"+carrom6.material);
        System.out.println("Foldable:"+carrom6.foldable);
        System.out.println("Price:"+carrom6.price);
		System.out.println("===========================");

    }
}