rrclass ProductStore{
	Product[] products;
	int currentIndex=0;
	
	ProductStore(Product[] products){
		this.products=products;
	}
	
	void addProducts(Product product){
        System.out.println("Executing addProducts in ProductStore...");

        if (product != null && this.products != null){
            System.out.println("Product and array are not null");

            if (currentIndex < this.products.length){
                System.out.println("Storing product at index:" + this.currentIndex);
                this.products[currentIndex]=product;
                
                this.currentIndex++;

            } else {
                System.out.println("Array is full, cannot store more products");
            }

        } else {
            System.out.println("Product or array is null");
        }
    }
	
	 boolean searchByProductID(int Id){
        System.out.println("Searching product:" + Id);
        boolean found = false;

        if (this.products != null && Id != 0){
            for (Product products : this.products){

                if (products != null){
                    System.out.println("Comparing with:" + products.productID);

                    if (products.productID == Id){
                        found = true;
                        break;
                    }
                }
            }
        } else{
            System.out.println("Product name or array is null");
        }

        return found;
    }
	
	void getproductPriceById(int id){
		
		System.out.println("Searching product:"+id);
		
		if(this.products != null && id != 0){
			System.out.println("The provided details of product are not null we can search");
			for(Product products : this.products){
				if(products != null){
					System.out.println("Comparing with:"+ products.productID);
					
					if(products.productID == id){
						System.out.println(products.price);
						break;
					}
				}
			}
		}else{
			System.out.println("Product name and uniqueId and array is null");
		}

	}
	
	void displayAll(){
		if(this.products != null){
		for(int i=0;i<this.products.length;i++){
		if(this.products[i] != null){
		this.products[i].display();
		
		}
		
	  }else{
		  System.out.println("products are null...");
	  }
	}
	
	boolean getNameByCompanyName(String name, String companyName){
		System.out.println("Searching product:"+ name);
		System.out.println("Searching product:"+companyName);
		boolean found=false;
		
		if(this.products != null && name != null && companyName != null){
			System.out.println("The provided details of product are not null we can search");
			for(Product products : this.products){
				if(products != null){
					System.out.println("Comparing with:"+ products.productName);
					System.out.println("Comparing with:"+ products.company);
					
					if(products. productName == name && products.company == companyName){
						found = true;
						break;
					}
				}
			}
		}else{
			System.out.println("Product name and uniqueId and array is null");
		}
		return found;
	}
		
	}
	
	

	
	
