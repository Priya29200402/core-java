class Mouse{

    String brand;
    double price;
    boolean bluetooth;
    boolean wired;
    int quantity;
    MouseCompany mouseCompany;
    Scroller scroller;
    Connection connection;
    Applicable applicable;
    MouseColor mouseColor;

    Mouse(String brand,double price,boolean bluetooth,boolean wired,int quantity,
          MouseCompany mouseCompany,Scroller scroller,Connection connection,
          Applicable applicable,MouseColor mouseColor){

        this.brand = brand;
        this.price = price;
        this.bluetooth = bluetooth;
        this.wired = wired;
        this.quantity = quantity;
        this.mouseCompany = mouseCompany;
        this.scroller = scroller;
        this.connection = connection;
        this.applicable = applicable;
        this.mouseColor = mouseColor;
    }

    void getMouseDetails(){

        System.out.println("Mouse Details");
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
        System.out.println("Bluetooth: " + this.bluetooth);
        System.out.println("Wired: " + this.wired);
        System.out.println("Quantity: " + this.quantity);

        if(this.mouseCompany != null){
            this.mouseCompany.getDetails();
        }
        else{
            System.out.println("Mouse Company is not there...");
        }

        if(this.scroller != null){
            this.scroller.getDetails();
        }
        else{
            System.out.println("Scroller is not there...");
        }

        if(this.connection != null){
            this.connection.getDetails();
        }
        else{
            System.out.println("Connection is not there...");
        }

        if(this.applicable != null){
            this.applicable.getDetails();
        }
        else{
            System.out.println("Applicable is not there...");
        }

        if(this.mouseColor != null){
            this.mouseColor.getDetails();
        }
        else{
            System.out.println("Mouse Color is not there...");
        }
    }
}