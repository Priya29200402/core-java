class Acid{
    String name;
    String formula;
    double concentration;
    boolean isStrong;
    double quantity;
    String color;

    Acid(String name, String formula, double concentration, boolean isStrong, double quantity, String color){
        this.name = name;
        this.formula = formula;
        this.concentration = concentration;
        this.isStrong = isStrong;
        this.quantity = quantity;
        this.color = color;
    }

    void printInfo(){
        System.out.println("Acid Details");
        System.out.println("Name:"+this.name);
        System.out.println("Formula:"+this.formula);
        System.out.println("Concentration:"+this.concentration);
        System.out.println("Strong Acid:"+this.isStrong);
        System.out.println("Quantity:"+this.quantity);
        System.out.println("Color:"+this.color);
    }
}