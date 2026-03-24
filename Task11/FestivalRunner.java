class FestivalRunner{
    public static void main(String[] args){

        Festival[] festivals=new Festival[10];
        FestivalStore festivalStore=new FestivalStore(festivals);

        Festival festival1=new Festival("Ugadi", "19-03-2026", "Hindu", false, 1, false);
        Festival festival2=new Festival("Diwali", "01-11-2026", "Hindu", true, 5, true);
        Festival festival3=new Festival("Holi", "14-03-2026", "Hindu", false, 2, true);
        Festival festival4=new Festival("Eid", "30-03-2026", "Muslim", true, 2, true);
        Festival festival5=new Festival("Christmas", "25-12-2026", "Christian", true, 3, true);
        Festival festival6=new Festival("Makar Sankranti", "14-01-2026", "Hindu", false, 1, false);
        Festival festival7=new Festival("Ganesh Chaturthi", "07-09-2026", "Hindu", true, 10, true);
        Festival festival8=new Festival("Navratri", "03-10-2026", "Hindu", true, 9, true);
        Festival festival9=new Festival("Onam", "05-09-2026", "Hindu", false, 4, true);
        Festival festival10=new Festival("Pongal", "15-01-2026", "Hindu", false, 4, false);

        festivalStore.save(festival1);
        festivalStore.save(festival2);
        festivalStore.save(festival3);
        festivalStore.save(festival4);
        festivalStore.save(festival5);
        festivalStore.save(festival6);
        festivalStore.save(festival7);
        festivalStore.save(festival8);
        festivalStore.save(festival9);
        festivalStore.save(festival10);

        festival1.printInfo();
        System.out.println("\n");

        festival2.printInfo();
        System.out.println("\n");

        festival3.printInfo();
        System.out.println("\n");

        festival4.printInfo();
        System.out.println("\n");

        festival5.printInfo();
        System.out.println("\n");

        festival6.printInfo();
        System.out.println("\n");

        festival7.printInfo();
        System.out.println("\n");

        festival8.printInfo();
        System.out.println("\n");

        festival9.printInfo();
        System.out.println("\n");

        festival10.printInfo();
    }
}