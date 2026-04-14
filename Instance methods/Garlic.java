class Garlic{

    String type;
    String color;
    double weight;
    double price;
    String origin;
    String taste;
    String packaging;
    String brand;
    String expiryDate;
    boolean organic;
    boolean peeled;
    String form;
    int stock;
    String grade;
    String supplier;
    String storage;
    String certification;
    String market;
    String exportCountry;
    String code;

    Garlic(String type, String color, double weight, double price,
           String origin, String taste, String packaging, String brand,
           String expiryDate, boolean organic, boolean peeled,
           String form, int stock, String grade,
           String supplier, String storage, String certification,
           String market, String exportCountry, String code) {

        this.type = type;
        this.color = color;
        this.weight = weight;
        this.price = price;
        this.origin = origin;
        this.taste = taste;
        this.packaging = packaging;
        this.brand = brand;
        this.expiryDate = expiryDate;
        this.organic = organic;
        this.peeled = peeled;
        this.form = form;
        this.stock = stock;
        this.grade = grade;
        this.supplier = supplier;
        this.storage = storage;
        this.certification = certification;
        this.market = market;
        this.exportCountry = exportCountry;
        this.code = code;
    }

    void getGarlicInfo() {
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Origin: " + origin);
        System.out.println("Taste: " + taste);
        System.out.println("Packaging: " + packaging);
        System.out.println("Brand: " + brand);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Organic: " + organic);
        System.out.println("Peeled: " + peeled);
        System.out.println("Form: " + form);
        System.out.println("Stock: " + stock);
        System.out.println("Grade: " + grade);
        System.out.println("Supplier: " + supplier);
        System.out.println("Storage: " + storage);
        System.out.println("Certification: " + certification);
        System.out.println("Market: " + market);
        System.out.println("Export Country: " + exportCountry);
        System.out.println("Code: " + code);
    }
}