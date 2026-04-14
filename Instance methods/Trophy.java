class Trophy{

    String name;
    String material;
    double height;
    double weight;
    String color;
    String event;
    int year;
    String winner;
    String category;
    String sponsor;
    String shape;
    String design;
    String engravingText;
    String country;
    double price;
    boolean customized;
    String manufacturer;
    int stock;
    String code;
    String supplier;

    Trophy(String name, String material, double height, double weight,
           String color, String event, int year, String winner,
           String category, String sponsor, String shape,
           String design, String engravingText, String country,
           double price, boolean customized, String manufacturer,
           int stock, String code, String supplier) {

        this.name = name;
        this.material = material;
        this.height = height;
        this.weight = weight;
        this.color = color;
        this.event = event;
        this.year = year;
        this.winner = winner;
        this.category = category;
        this.sponsor = sponsor;
        this.shape = shape;
        this.design = design;
        this.engravingText = engravingText;
        this.country = country;
        this.price = price;
        this.customized = customized;
        this.manufacturer = manufacturer;
        this.stock = stock;
        this.code = code;
        this.supplier = supplier;
    }

    void getTrophy(){
        System.out.println("Name: " + name);
        System.out.println("Material: " + material);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
        System.out.println("Event: " + event);
        System.out.println("Year: " + year);
        System.out.println("Winner: " + winner);
        System.out.println("Category: " + category);
        System.out.println("Sponsor: " + sponsor);
        System.out.println("Shape: " + shape);
        System.out.println("Design: " + design);
        System.out.println("Engraving Text: " + engravingText);
        System.out.println("Country: " + country);
        System.out.println("Price: " + price);
        System.out.println("Customized: " + customized);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Stock: " + stock);
        System.out.println("Code: " + code);
        System.out.println("Supplier: " + supplier);
    }
}