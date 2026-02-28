class Paper{

    String type;
    String color;
    String brand;
    int quantity;
    double gsm;
    String texture;
    String usage;
    boolean recycled;
    boolean waterproof;
    String country;
    String shape;
    int sheetsPerPack;
    String quality;
    String material;
    String finish;
    String manufacturer;
    String expiryDate;
    String supplier;
    String exportCountry;
    String code;

    Paper(String type, String color, String brand, int quantity,
          double gsm, String texture, String usage,
          boolean recycled, boolean waterproof, String country,
          String shape, int sheetsPerPack, String quality,
          String material, String finish, String manufacturer,
          String expiryDate, String supplier, String exportCountry, String code) {

        this.type = type;
        this.color = color;
        this.brand = brand;
        this.quantity = quantity;
        this.gsm = gsm;
        this.texture = texture;
        this.usage = usage;
        this.recycled = recycled;
        this.waterproof = waterproof;
        this.country = country;
        this.shape = shape;
        this.sheetsPerPack = sheetsPerPack;
        this.quality = quality;
        this.material = material;
        this.finish = finish;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
        this.supplier = supplier;
        this.exportCountry = exportCountry;
        this.code = code;
    }

    void getPaperInfo() {
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Quantity: " + quantity);
        System.out.println("GSM: " + gsm);
        System.out.println("Texture: " + texture);
        System.out.println("Usage: " + usage);
        System.out.println("Recycled: " + recycled);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Country: " + country);
        System.out.println("Shape: " + shape);
        System.out.println("Sheets Per Pack: " + sheetsPerPack);
        System.out.println("Quality: " + quality);
        System.out.println("Material: " + material);
        System.out.println("Finish: " + finish);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Supplier: " + supplier);
        System.out.println("Export Country: " + exportCountry);
        System.out.println("Code: " + code);
    }
}