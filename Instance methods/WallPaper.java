class WallPaper{

    String brand;
    String color;
    String pattern;
    String material;
    double price;
    double width;
    double height;
    String texture;
    boolean washable;
    boolean ecoFriendly;
    String country;
    int stock;
    String designType;
    String usage;
    String durability;
    String glueType;
    String finish;
    String supplier;
    String warranty;
    String code;

    WallPaper(String brand, String color, String pattern, String material,
              double price, double width, double height, String texture,
              boolean washable, boolean ecoFriendly, String country,
              int stock, String designType, String usage,
              String durability, String glueType, String finish,
              String supplier, String warranty, String code) {

        this.brand = brand;
        this.color = color;
        this.pattern = pattern;
        this.material = material;
        this.price = price;
        this.width = width;
        this.height = height;
        this.texture = texture;
        this.washable = washable;
        this.ecoFriendly = ecoFriendly;
        this.country = country;
        this.stock = stock;
        this.designType = designType;
        this.usage = usage;
        this.durability = durability;
        this.glueType = glueType;
        this.finish = finish;
        this.supplier = supplier;
        this.warranty = warranty;
        this.code = code;
    }

    void getWallPaperInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Pattern: " + pattern);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Texture: " + texture);
        System.out.println("Washable: " + washable);
        System.out.println("Eco Friendly: " + ecoFriendly);
        System.out.println("Country: " + country);
        System.out.println("Stock: " + stock);
        System.out.println("Design Type: " + designType);
        System.out.println("Usage: " + usage);
        System.out.println("Durability: " + durability);
        System.out.println("Glue Type: " + glueType);
        System.out.println("Finish: " + finish);
        System.out.println("Supplier: " + supplier);
        System.out.println("Warranty: " + warranty);
        System.out.println("Code: " + code);
    }
}