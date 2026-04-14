class Organizer{

    String name;
    String type;
    double price;
    String material;
    String color;
    int compartments;
    boolean portable;
    boolean waterproof;
    String brand;
    String usage;
    double height;
    double width;
    double weight;
    String design;
    String country;
    int stock;
    String warranty;
    String category;
    String supplier;
    String code;

    Organizer(String name, String type, double price, String material,
              String color, int compartments, boolean portable,
              boolean waterproof, String brand, String usage,
              double height, double width, double weight,
              String design, String country, int stock,
              String warranty, String category, String supplier, String code) {

        this.name = name;
        this.type = type;
        this.price = price;
        this.material = material;
        this.color = color;
        this.compartments = compartments;
        this.portable = portable;
        this.waterproof = waterproof;
        this.brand = brand;
        this.usage = usage;
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.design = design;
        this.country = country;
        this.stock = stock;
        this.warranty = warranty;
        this.category = category;
        this.supplier = supplier;
        this.code = code;
    }

    void getOrganizerInfo(){
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Compartments: " + compartments);
        System.out.println("Portable: " + portable);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Brand: " + brand);
        System.out.println("Usage: " + usage);
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Weight: " + weight);
        System.out.println("Design: " + design);
        System.out.println("Country: " + country);
        System.out.println("Stock: " + stock);
        System.out.println("Warranty: " + warranty);
        System.out.println("Category: " + category);
        System.out.println("Supplier: " + supplier);
        System.out.println("Code: " + code);
    }
}