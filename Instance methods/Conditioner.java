class Conditioner{

    String brand;
    String name;
    String type;
    String hairType;
    double quantity;
    double price;
    String fragrance;
    boolean sulfateFree;
    boolean parabenFree;
    String color;
    String manufacturer;
    String country;
    String expiryDate;
    String ingredients;
    String packagingType;
    String usage;
    String category;
    String code;
    int stock;
    String supplier;

    Conditioner(String brand, String name, String type, String hairType,
                double quantity, double price, String fragrance,
                boolean sulfateFree, boolean parabenFree, String color,
                String manufacturer, String country, String expiryDate,
                String ingredients, String packagingType, String usage,
                String category, String code, int stock, String supplier) {

        this.brand = brand;
        this.name = name;
        this.type = type;
        this.hairType = hairType;
        this.quantity = quantity;
        this.price = price;
        this.fragrance = fragrance;
        this.sulfateFree = sulfateFree;
        this.parabenFree = parabenFree;
        this.color = color;
        this.manufacturer = manufacturer;
        this.country = country;
        this.expiryDate = expiryDate;
        this.ingredients = ingredients;
        this.packagingType = packagingType;
        this.usage = usage;
        this.category = category;
        this.code = code;
        this.stock = stock;
        this.supplier = supplier;
    }

    void getConditionerInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Hair Type: " + hairType);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Sulfate Free: " + sulfateFree);
        System.out.println("Paraben Free: " + parabenFree);
        System.out.println("Color: " + color);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country: " + country);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Ingredients: " + ingredients);
        System.out.println("Packaging: " + packagingType);
        System.out.println("Usage: " + usage);
        System.out.println("Category: " + category);
        System.out.println("Code: " + code);
        System.out.println("Stock: " + stock);
        System.out.println("Supplier: " + supplier);
    }
}