class FlagRunner{
    public static void main(String[] args){

        Flag flag1 = new Flag();
        Flag flag2 = new Flag();

        System.out.println("====================");
        flag1.hoist();
        flag1.lower();
        flag2.fold();
        flag2.unfold();
        flag1.wave();
        flag1.salute();
        flag2.display();
        flag1.store();
        flag2.clean();
        flag1.replace();

        System.out.println("====================");

        Flag.getCountryName();
        Flag.getColors();
        Flag.getSymbol();
        Flag.getAdoptionYear();
        Flag.getFlagCode();
    }
}