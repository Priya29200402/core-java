class Stand{

    String name;
    String color;
    double price;
    double height;
    double width;
    String material;
    String usage;
    boolean foldable;
    boolean portable;
    String country;
    int stock;
    String design;
    String finish;
    String type;
    String weightCapacity;
    String brand;
    String warranty;
    String category;
    String supplier;
    String code;

    Stand(String name, String color, double price, double height,
          double width, String material, String usage,
          boolean foldable, boolean portable, String country,
          int stock, String design, String finish,
          String type, String weightCapacity, String brand,
          String warranty, String category, String supplier, String code) {

        this.name = name;
        this.color = color;
        this.price = price;
        this.height = height;
        this.width = width;
        this.material = material;
        this.usage = usage;
        this.foldable = foldable;
        this.portable = portable;
        this.country = country;
        this.stock = stock;
        this.design = design;
        this.finish = finish;
        this.type = type;
        this.weightCapacity = weightCapacity;
        this.brand = brand;
        this.warranty = warranty;
        this.category = category;
        this.supplier = supplier;
        this.code = code;
    }

    void getStandInfo() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Material: " + material);
        System.out.println("Usage: " + usage);
        System.out.println("Foldable: " + foldable);
        System.out.println("Portable: " + portable);
        System.out.println("Country: " + country);
        System.out.println("Stock: " + stock);
        System.out.println("Design: " + design);
        System.out.println("Finish: " + finish);
        System.out.println("Type: " + type);
        System.out.println("Weight Capacity: " + weightCapacity);
        System.out.println("Brand: " + brand);
        System.out.println("Warranty: " + warranty);
        System.out.println("Category: " + category);
        System.out.println("Supplier: " + supplier);
        System.out.println("Code: " + code);
    }
}