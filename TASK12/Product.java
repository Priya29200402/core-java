class Product{
    String name;
    String make;
    String mfgDate;
    double cost;
    ProductTypes type;
    String seller;
    WarrantyYears warrantyYears;
    boolean warrantyExpired;
    String uniqeId;
    String originCountry;

    Product(String name, String make, String mfgDate, double cost,
            ProductTypes type, String seller, WarrantyYears warrantyYears,
            boolean warrantyExpired, String uniqeId, String originCountry){

        this.name=name;
        this.make=make;
        this.mfgDate=mfgDate;
        this.cost=cost;
        this.type=type;
        this.seller=seller;
        this.warrantyYears=warrantyYears;
        this.warrantyExpired=warrantyExpired;
        this.uniqeId=uniqeId;
        this.originCountry=originCountry;
    }

    void display() {
        System.out.println("=== Product Information ===");
        System.out.println("Name: " + this.name);
        System.out.println("Make: " + this.make);
        System.out.println("Manufactured Date: " + this.mfgDate);
        System.out.println("Cost: " + this.cost);
        System.out.println("Product Type: " + this.type);
        System.out.println("Seller: " + this.seller);
        System.out.println("Warranty Years: " + this.warrantyYears);
        System.out.println("Warranty Expired: " + this.warrantyExpired);
        System.out.println("Uniqe ID: " + this.uniqeId);
        System.out.println("Origin Country: " + this.originCountry);
    }
}