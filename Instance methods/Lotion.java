class Lotion{

    String name;
    String brand;
    double price;
    int volume;
    String fragrance;
    String skinType;
    String ingredients;
    String color;
    String texture;
    boolean medicated;
    boolean organic;
    String expiryDate;
    String manufactureDate;
    String country;
    String usage;
    String packagingType;
    int stock;
    String category;
    String supplier;
    String code;

    Lotion(String name, String brand, double price, int volume,
           String fragrance, String skinType, String ingredients,
           String color, String texture, boolean medicated,
           boolean organic, String expiryDate, String manufactureDate,
           String country, String usage, String packagingType,
           int stock, String category, String supplier, String code) {

        this.name = name;
        this.brand = brand;
        this.price = price;
        this.volume = volume;
        this.fragrance = fragrance;
        this.skinType = skinType;
        this.ingredients = ingredients;
        this.color = color;
        this.texture = texture;
        this.medicated = medicated;
        this.organic = organic;
        this.expiryDate = expiryDate;
        this.manufactureDate = manufactureDate;
        this.country = country;
        this.usage = usage;
        this.packagingType = packagingType;
        this.stock = stock;
        this.category = category;
        this.supplier = supplier;
        this.code = code;
    }

    void getLotionInfo() {
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Volume: " + volume);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Skin Type: " + skinType);
        System.out.println("Ingredients: " + ingredients);
        System.out.println("Color: " + color);
        System.out.println("Texture: " + texture);
        System.out.println("Medicated: " + medicated);
        System.out.println("Organic: " + organic);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Manufacture Date: " + manufactureDate);
        System.out.println("Country: " + country);
        System.out.println("Usage: " + usage);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Stock: " + stock);
        System.out.println("Category: " + category);
        System.out.println("Supplier: " + supplier);
        System.out.println("Code: " + code);
    }
}