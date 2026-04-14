class HamperRunner{
    public static void main(String[] args){

        Hamper hamper1 = new Hamper();
        Hamper hamper2 = new Hamper();
		
        System.out.println("====================");
        hamper1.addItem();
        hamper1.packHamper();
        hamper2.deliverHamper();
		hamper2.removeItem();
		hamper1.displayItems();
		hamper1.calculateWeight();
		hamper2.unpackHamper();
		hamper1.checkAvailability();
		hamper1.applyDiscount();
		hamper2.printLabel();
		
		System.out.println("====================");
		

        Hamper.getCompanyName();
        Hamper.getPolicyInfo();
		Hamper.getServiceArea();
		Hamper.getContactDetails();
		Hamper.getGSTInfo();
		
	}
}