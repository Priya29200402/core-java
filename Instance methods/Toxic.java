class Toxic{

    String name;
    String chemicalType;
    String formula;
    String color;
    String state;
    double quantity;
    boolean flammable;
    boolean radioactive;
    String storageType;
    String hazardLevel;
    String manufacturer;
    String expiryDate;
    String country;
    double phValue;
    String smell;
    String safetyMeasures;
    String containerType;
    String category;
    String code;
    String supplier;

    Toxic(String name, String chemicalType, String formula,
          String color, String state, double quantity,
          boolean flammable, boolean radioactive,
          String storageType, String hazardLevel,
          String manufacturer, String expiryDate,
          String country, double phValue, String smell,
          String safetyMeasures, String containerType,
          String category, String code, String supplier) {

        this.name = name;
        this.chemicalType = chemicalType;
        this.formula = formula;
        this.color = color;
        this.state = state;
        this.quantity = quantity;
        this.flammable = flammable;
        this.radioactive = radioactive;
        this.storageType = storageType;
        this.hazardLevel = hazardLevel;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
        this.country = country;
        this.phValue = phValue;
        this.smell = smell;
        this.safetyMeasures = safetyMeasures;
        this.containerType = containerType;
        this.category = category;
        this.code = code;
        this.supplier = supplier;
    }

    void getToxicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Chemical Type: " + chemicalType);
        System.out.println("Formula: " + formula);
        System.out.println("Color: " + color);
        System.out.println("State: " + state);
        System.out.println("Quantity: " + quantity);
        System.out.println("Flammable: " + flammable);
        System.out.println("Radioactive: " + radioactive);
        System.out.println("Storage Type: " + storageType);
        System.out.println("Hazard Level: " + hazardLevel);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Country: " + country);
        System.out.println("pH Value: " + phValue);
        System.out.println("Smell: " + smell);
        System.out.println("Safety Measures: " + safetyMeasures);
        System.out.println("Container Type: " + containerType);
        System.out.println("Category: " + category);
        System.out.println("Code: " + code);
        System.out.println("Supplier: " + supplier);
    }
}