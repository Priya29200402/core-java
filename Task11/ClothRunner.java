class ClothRunner{
    public static void main(String[] args){

        Cloth[] cloths=new Cloth[10];
        ClothStore clothStore=new ClothStore(cloths);

        Cloth cloth1=new Cloth("Shirt", "Roadster", 1200, "Cotton", 'L', true);
        Cloth cloth2=new Cloth("T-Shirt", "Puma", 800, "Polyester", 'M', true);
        Cloth cloth3=new Cloth("Jeans", "Levis", 2000, "Denim", 'L', true);
        Cloth cloth4=new Cloth("Jacket", "Zara", 3500, "Leather", 'XL', false);
        Cloth cloth5=new Cloth("Kurta", "FabIndia", 1500, "Cotton", 'M', true);
        Cloth cloth6=new Cloth("Sweater", "H&M", 1800, "Wool", 'L', false);
        Cloth cloth7=new Cloth("Shorts", "Nike", 900, "Cotton", 'S', true);
        Cloth cloth8=new Cloth("Blazer", "Allen Solly", 4000, "Polyester", 'XL', false);
        Cloth cloth9=new Cloth("TrackPant", "Adidas", 1300, "Polyester", 'M', true);
        Cloth cloth10=new Cloth("Hoodie", "US Polo", 2200, "Fleece", 'L', true);

        clothStore.save(cloth1);
        clothStore.save(cloth2);
        clothStore.save(cloth3);
        clothStore.save(cloth4);
        clothStore.save(cloth5);
        clothStore.save(cloth6);
        clothStore.save(cloth7);
        clothStore.save(cloth8);
        clothStore.save(cloth9);
        clothStore.save(cloth10);

        cloth1.printInfo();
        System.out.println("\n");

        cloth2.printInfo();
        System.out.println("\n");

        cloth3.printInfo();
        System.out.println("\n");

        cloth4.printInfo();
        System.out.println("\n");

        cloth5.printInfo();
        System.out.println("\n");

        cloth6.printInfo();
        System.out.println("\n");

        cloth7.printInfo();
        System.out.println("\n");

        cloth8.printInfo();
        System.out.println("\n");

        cloth9.printInfo();
        System.out.println("\n");

        cloth10.printInfo();
    }
}