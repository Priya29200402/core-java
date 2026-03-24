class CapStoreRunner{
    public static void main(String[] args){

        Cap[] caps=new Cap[10];
        CapStore capStore= new CapStore(caps);

        Cap cap1=new Cap("PUMA", 'M', "Black", 499, false, "Polyester");
        Cap cap2=new Cap("Nike", 'L', "Blue", 699, true, "Cotton");
        Cap cap3=new Cap("Adidas", 'S', "White", 599, false, "Polyester");
        Cap cap4=new Cap("Reebok", 'M', "Red", 450, true, "Cotton");
        Cap cap5=new Cap("Under Armour", 'L', "Grey", 750, true, "Polyester");
        Cap cap6=new Cap("Fila", 'S', "Black", 400, false, "Cotton");
        Cap cap7=new Cap("New Balance", 'M', "Green", 550, true, "Polyester");
        Cap cap8=new Cap("Zara", 'L', "Brown", 800, true, "Wool");
        Cap cap9=new Cap("H&M", 'S', "Yellow", 350, false, "Cotton");
        Cap cap10=new Cap("Levis", 'M', "Navy", 650, true, "Denim");

        capStore.save(cap1);
        capStore.save(cap2);
        capStore.save(cap3);
        capStore.save(cap4);
        capStore.save(cap5);
        capStore.save(cap6);
        capStore.save(cap7);
        capStore.save(cap8);
        capStore.save(cap9);
        capStore.save(cap10);

        cap1.printInfo();
        System.out.println("\n");

        cap2.printInfo();
        System.out.println("\n");

        cap3.printInfo();
        System.out.println("\n");

        cap4.printInfo();
        System.out.println("\n");

        cap5.printInfo();
        System.out.println("\n");

        cap6.printInfo();
        System.out.println("\n");

        cap7.printInfo();
        System.out.println("\n");

        cap8.printInfo();
        System.out.println("\n");

        cap9.printInfo();
        System.out.println("\n");

        cap10.printInfo();
    }
}