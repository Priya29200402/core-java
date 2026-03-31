class ClothingRunner{
    public static void main(String[] args){

        Shirt shirt=new Shirt();
        shirt.brand="Zara";
        System.out.println("Brand:"+ shirt.brand);
        shirt.wear();         
        shirt.cottonType();   

        System.out.println("\n====================");

        Pants pants=new Pants();
        pants.brand="Levis";
        System.out.println("Brand:"+ pants.brand);
        pants.wear();         
        pants.fitType();      

        System.out.println("\n=====================");

        Jacket jacket=new Jacket();
        jacket.brand="Nike";
        System.out.println("Brand:"+ jacket.brand);
        jacket.wear();        
        jacket.winterWear(); 
    }
}