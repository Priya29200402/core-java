class Map{

    String name;
    String type;
    String region;
    double scale;
    String language;
    boolean digital;
    String publisher;
    int pages;
    String size;
    String material;
    String edition;
    int year;
    String colorTheme;
    boolean laminated;
    String projectionType;
    String country;
    double price;
    String category;
    String code;
    String supplier;

    Map(String name, String type, String region, double scale,
        String language, boolean digital, String publisher,
        int pages, String size, String material,
        String edition, int year, String colorTheme,
        boolean laminated, String projectionType,
        String country, double price, String category,
        String code, String supplier) {

        this.name = name;
        this.type = type;
        this.region = region;
        this.scale = scale;
        this.language = language;
        this.digital = digital;
        this.publisher = publisher;
        this.pages = pages;
        this.size = size;
        this.material = material;
        this.edition = edition;
        this.year = year;
        this.colorTheme = colorTheme;
        this.laminated = laminated;
        this.projectionType = projectionType;
        this.country = country;
        this.price = price;
        this.category = category;
        this.code = code;
        this.supplier = supplier;
    }

    void getMapInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Region: " + region);
        System.out.println("Scale: " + scale);
        System.out.println("Language: " + language);
        System.out.println("Digital: " + digital);
        System.out.println("Publisher: " + publisher);
        System.out.println("Pages: " + pages);
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
        System.out.println("Edition: " + edition);
        System.out.println("Year: " + year);
        System.out.println("Color Theme: " + colorTheme);
        System.out.println("Laminated: " + laminated);
        System.out.println("Projection Type: " + projectionType);
        System.out.println("Country: " + country);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
        System.out.println("Code: " + code);
        System.out.println("Supplier: " + supplier);
    }
}