class GumRunner{
    public static void main(String[] args){

        Gum[] gumInfos=new Gum[10];
        GumStore gumStore=new GumStore(gumInfos);

        Gum gum1=new Gum("Orbit", "Mint", 10, true, 5, "White");
        Gum gum2=new Gum("CenterFresh", "Mint", 2, false, 10, "Green");
        Gum gum3=new Gum("Happydent", "White", 5, false, 8, "White");
        Gum gum4=new Gum("Boomer", "Strawberry", 1, false, 12, "Pink");
        Gum gum5=new Gum("Doublemint", "Mint", 15, true, 6, "Green");
        Gum gum6=new Gum("BigBabol", "Orange", 2, false, 15, "Orange");
        Gum gum7=new Gum("Mentos", "Fruit", 20, false, 7, "Mixed");
        Gum gum8=new Gum("Lotte", "Mint", 3, true, 9, "Blue");
        Gum gum9=new Gum("Xylitol", "Mint", 25, true, 4, "White");
        Gum gum10=new Gum("Wrigley", "Spearmint", 30, true, 3, "Green");

        gumStore.save(gum1);
        gumStore.save(gum2);
        gumStore.save(gum3);
        gumStore.save(gum4);
        gumStore.save(gum5);
        gumStore.save(gum6);
        gumStore.save(gum7);
        gumStore.save(gum8);
        gumStore.save(gum9);
        gumStore.save(gum10);

        gum1.printInfo();
        System.out.println("\n");

        gum2.printInfo();
        System.out.println("\n");

        gum3.printInfo();
        System.out.println("\n");

        gum4.printInfo();
        System.out.println("\n");

        gum5.printInfo();
        System.out.println("\n");
		
        gum6.printInfo();
        System.out.println("\n");

        gum7.printInfo();
        System.out.println("\n");

        gum8.printInfo();
        System.out.println("\n");

        gum9.printInfo();
        System.out.println("\n");

        gum10.printInfo();
  
    }
}