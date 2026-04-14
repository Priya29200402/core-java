class BrokerType{

    String type;
    int commission;

    BrokerType(String type, int commission){
        this.type = type;
        this.commission = commission;
    }

    void getInfo() {
        System.out.println("Broker type: " + this.type);
        System.out.println("Commission: " + this.commission);
    }
}