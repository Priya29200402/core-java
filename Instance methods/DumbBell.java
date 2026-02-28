class DumbBell{

    String brand;
    double weight;
    String material;
    String color;
    boolean adjustable;
    String gripType;
    double price;
    String size;
    String usage;
    int stock;
    String shape;
    String coating;
    boolean rubberized;
    String country;
    String warranty;
    String category;
    String modelNumber;
    String supplier;
    double length;
    String code;

    DumbBell(String brand, double weight, String material,
             String color, boolean adjustable, String gripType,
             double price, String size, String usage, int stock,
             String shape, String coating, boolean rubberized,
             String country, String warranty, String category,
             String modelNumber, String supplier,
             double length, String code) {

        this.brand = brand;
        this.weight = weight;
        this.material = material;
        this.color = color;
        this.adjustable = adjustable;
        this.gripType = gripType;
        this.price = price;
        this.size = size;
        this.usage = usage;
        this.stock = stock;
        this.shape = shape;
        this.coating = coating;
        this.rubberized = rubberized;
        this.country = country;
        this.warranty = warranty;
        this.category = category;
        this.modelNumber = modelNumber;
        this.supplier = supplier;
        this.length = length;
        this.code = code;
    }

    void getDumbBellInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Weight: " + weight);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Adjustable: " + adjustable);
        System.out.println("Grip Type: " + gripType);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("Usage: " + usage);
        System.out.println("Stock: " + stock);
        System.out.println("Shape: " + shape);
        System.out.println("Coating: " + coating);
        System.out.println("Rubberized: " + rubberized);
        System.out.println("Country: " + country);
        System.out.println("Warranty: " + warranty);
        System.out.println("Category: " + category);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Supplier: " + supplier);
        System.out.println("Length: " + length);
        System.out.println("Code: " + code);
    }
}