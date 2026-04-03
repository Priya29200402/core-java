class ProductRunner{
	public static void main(String[] args){
		
		
		Product[] products=new Product[10];
        ProductStore productstore=new ProductStore(products);

        Product product1=new Product(120,"Milk","Nandini", ProductType.DAIRY,"01-04-2026","10-04-2026",56.0,1000.0);
		
		Product product2=new Product(121,"Laptop","HP",ProductType.ELECTRONICS,"12-09-2024","10-05-2028",5600.12,900.0);
		productstore.addProducts(product1);
        System.out.println("\n");
		
		productstore.addProducts(product2);
		System.out.println("\n");
		
		productstore.displayAll();
	
			
		boolean ref=productstore.searchByProductID(120);
		System.out.println("product found:"+ref);
		
		productstore.getproductPriceById(120);
		
		
		boolean ref3=productstore.getNameByCompanyName("Laptop","HP");
		System.out.println("product found:"+ref3);
	
				
	}
}