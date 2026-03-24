class StatueRunner{
    public static void main(String[] args){

        Statue[] statueInfos=new Statue[10];
        StatueStore statueStore=new StatueStore(statueInfos);

        Statue statue1=new Statue("Statue of Unity", "India", 182.0, "Sardar Vallabhbhai Patel", 2018, "Bronze");
        Statue statue2=new Statue("Statue of Liberty", "USA", 93.0, "Liberty Enlightening the World", 1886, "Copper");
        Statue statue3=new Statue("Spring Temple Buddha", "China", 128.0, "Buddha", 2008, "Copper");
        Statue statue4=new Statue("Laykyun Sekkya", "Myanmar", 116.0, "Buddha", 2008, "Gold");
        Statue statue5=new Statue("Ushiku Daibutsu", "Japan", 100.0, "Amitabha Buddha", 1993, "Bronze");
        Statue statue6=new Statue("The Motherland Calls", "Russia", 85.0, "Motherland", 1967, "Concrete");
        Statue statue7=new Statue("Christ the Redeemer", "Brazil", 38.0, "Jesus Christ", 1931, "Concrete");
        Statue statue8=new Statue("Thiruvalluvar Statue", "India", 41.0, "Thiruvalluvar", 2000, "Stone");
        Statue statue9=new Statue("Shivaji Statue", "India", 212.0, "Chhatrapati Shivaji", 2024, "Bronze");
        Statue statue10=new Statue("Buddha Statue", "Thailand", 92.0, "Buddha", 2015, "Gold");

        statueStore.save(statue1);
        statueStore.save(statue2);
        statueStore.save(statue3);
        statueStore.save(statue4);
        statueStore.save(statue5);
        statueStore.save(statue6);
        statueStore.save(statue7);
        statueStore.save(statue8);
        statueStore.save(statue9);
        statueStore.save(statue10);

        statue1.printInfo();
        System.out.println("\n");

        statue2.printInfo();
        System.out.println("\n");

        statue3.printInfo();
        System.out.println("\n");

        statue4.printInfo();
        System.out.println("\n");

        statue5.printInfo();
        System.out.println("\n");

        statue6.printInfo();
        System.out.println("\n");

        statue7.printInfo();
        System.out.println("\n");

        statue8.printInfo();
        System.out.println("\n");

        statue9.printInfo();
        System.out.println("\n");

        statue10.printInfo();

    }
}