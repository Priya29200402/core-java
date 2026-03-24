class AcidRunner{
    public static void main(String[] args){

        Acid[] acidInfos=new Acid[10];
        AcidStore acidStore=new AcidStore(acidInfos);

        Acid acid1=new Acid("Hydrochloric", "HCl", 37, true, 500, "Colorless");
        Acid acid2=new Acid("Sulfuric", "H2SO4", 98, true, 300, "Oily");
        Acid acid3=new Acid("Nitric", "HNO3", 70, true, 250, "Yellow");
        Acid acid4=new Acid("Acetic", "CH3COOH", 5, false, 200, "Clear");
        Acid acid5=new Acid("Hydrofluoric", "HF", 48, true, 150, "Colorless");
        Acid acid6=new Acid("Phosphoric", "H3PO4", 85, false, 180, "Clear");
        Acid acid7=new Acid("Citric", "C6H8O7", 10, false, 100, "White");
        Acid acid8=new Acid("Lactic", "C3H6O3", 12, false, 120, "Clear");
        Acid acid9=new Acid("Formic", "CH2O2", 20, false, 130, "Colorless");
        Acid acid10=new Acid("Oxalic", "C2H2O4", 15, false, 110, "White");

        acidStore.save(acid1);
        acidStore.save(acid2);
        acidStore.save(acid3);
        acidStore.save(acid4);
        acidStore.save(acid5);
        acidStore.save(acid6);
        acidStore.save(acid7);
        acidStore.save(acid8);
        acidStore.save(acid9);
        acidStore.save(acid10);

        acid1.printInfo();
		System.out.println("\n");
		
		acid2.printInfo();
		System.out.println("\n");
		
		acid3.printInfo();
		System.out.println("\n");
		
		acid4.printInfo();
		System.out.println("\n");
		
		acid5.printInfo();
		System.out.println("\n");
		
		acid6.printInfo();
		System.out.println("\n");
		
		acid7.printInfo();
		System.out.println("\n");
		
		acid8.printInfo();
		System.out.println("\n");
		
		acid9.printInfo();
		System.out.println("\n");
		
		acid10.printInfo();
		System.out.println("\n");
    }
}