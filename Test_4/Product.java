class Product{
	int productID;
	String productName;
	String company;
	ProductType type;
	String mfgDate;
	String expiryDate;
	double price;
	double weightInGrams;
	
	Product(int productID, String productName, String company,ProductType type, String mfgDate, String expiryDate, 
	        double price, double weightInGrams){
		
		this.productID=productID;
		this.productName=productName;
		this.company=company;
		this.type=type;
		this.mfgDate=mfgDate;
		this.expiryDate=expiryDate;
		this.price=price;
		this.weightInGrams=weightInGrams;
		
	}
	
	void display(){
		
		System.out.println("Executing display in Product...");
		System.out.println("Product ID:"+this.productID);
		System.out.println("Product Name:"+this.productName);
		System.out.println("Product Company:"+this.company);
		System.out.println("Product Type:"+this.type);
		System.out.println("Manufactured Date:"+this.mfgDate);
		System.out.println("Expiry Date:"+this.expiryDate);
		System.out.println("Price:"+this.price);
		System.out.println("Weight in Grams:"+this.weightInGrams);
		
	}
	
}