class ProductStore{
    Product[] product;
    int currentIndex = 0;

    ProductStore(Product[] product){
        this.product = product;
    }

    void save(Product product){
        System.out.println("Executing save in ProductStore...");

        if (product != null && this.product != null){
            System.out.println("Product and array are not null");

            if (currentIndex < this.product.length){
                System.out.println("Storing product at index: " + this.currentIndex);
                this.product[currentIndex] = product;
                product.display();
                this.currentIndex++;

            } else {
                System.out.println("Array is full, cannot store more products");
            }

        } else {
            System.out.println("Product or array is null");
        }
    }
	
	void save(Product[] productArray){

    if (productArray != null){

        int numberOfProductsStored = 0;

        for (Product singleProduct : productArray){

            if (singleProduct != null && numberOfProductsStored < 10){

                save(singleProduct);
                numberOfProductsStored = numberOfProductsStored + 1;
            }
        }

        System.out.println("Total products stored: " + numberOfProductsStored);

    } else{
        System.out.println("Product array is null we cannot store");
    }
    }
	
    boolean searchByID(String productID){
        System.out.println("Searching product: " + productID);
        boolean found = false;

        if (this.product != null && productID != null){
            for (Product products : this.product){

                if (products != null){
                    System.out.println("Comparing with: " + products.uniqeId);

                    if (products.uniqeId == productID){
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
	
	boolean searchByUniqeIdAndName(String productID, String productName){
		System.out.println("Searching product:"+ productID);
		System.out.println("Searching product:"+productName);
		boolean found = false;
		
		if(this.product != null && productID != null && productName != null){
			System.out.println("The provided details of product are not null we can search");
			for(Product products : this.product){
				if(products != null){
					System.out.println("Comparing with:"+ products.uniqeId);
					System.out.println("Comparing with:"+ products.name);
					
					if(products.uniqeId == productID && products.name == productName){
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
	
	boolean searchByUniqeIdAndNameAndOriginCountry(String productID, String productName, String country){
		System.out.println("Searching product:"+productID);
		System.out.println("Searching product:"+productName);
		System.out.println("Searching product:"+country);
		boolean found = false;
		
		if(this. product != null && productID != null && productName != null && country != null){
			System.out.println("The provided details of product are not null we search");
			for(Product products : this.product){
				if(products != null){
					System.out.println("Comparing with:"+products.uniqeId);
					System.out.println("Comparing with:"+products.name);
					System.out.println("Comparing with:"+products.originCountry);
					
					if(products.uniqeId == productID && products.name == productName && products.originCountry == country){
						found = true;
						break;
					}
				}
			}
			
		}else{
			System.out.println("The provided details of product are null we cannot search");
		}
		return found;
	}
	
	void printAllProducts(){

    for (Product storedProduct : product){

        if (storedProduct != null) {

            storedProduct.display();
			 System.out.println("\n");
        }
    }
  }
	
	void getAllByType(ProductTypes productType){

    if (productType != null){
		System.out.println("Product Type is not null");

        for (Product storedProduct : product){

            if (storedProduct != null && storedProduct.type == productType){

                storedProduct.display();
            }
        }
    }else{
		System.out.println("Product type is null");
	}
  }
  
    void getAllByWarrantyYears(WarrantyYears warrantyYears){

    if (warrantyYears != null){

        for (Product storedProduct : product){

            if (storedProduct != null && storedProduct.warrantyYears == warrantyYears){

                storedProduct.display();
            }
        }
    }
}

	void getAllOriginCountry(String originCountry){

    System.out.println("Getting All the Origin country");

    if(this.product != null && originCountry != null){

        System.out.println("The product array and originCountry is not null");

        for(Product storedProduct : this.product){

            if(storedProduct != null){

                System.out.println("Comparing with: " + storedProduct.originCountry);

                if(storedProduct.originCountry == originCountry){
                    storedProduct.display();
                }
            }
        }

    } else{
        System.out.println("The array or originCountry is null");
    }
}

	
	 boolean checkWarrantyExpiredByUniqueId(String productId){

    System.out.println("Checking Warranty Expired By UniqueId");
    System.out.println("Product ID: " + productId);

    if(this.product != null && productId != null){
		System.out.println("product and Profuct id is not null we can check");

        for(Product storedProduct : this.product){

            if(storedProduct != null){

                if(storedProduct.uniqeId == productId){

                    if(storedProduct.warrantyExpired == true){
                        return true;
                    } else{
                        return false;
                    }
                }
            }
        }

    } else{
        System.out.println("The product array or productId is null");
    }

    return false;
}
}
