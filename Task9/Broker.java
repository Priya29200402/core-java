class Broker{

    String[] companies;
    BrokerType[] brokertypes;

    Broker(String[] companies, BrokerType[] brokertypes){
        this.companies = companies;
        this.brokertypes = brokertypes;
    }

    void printInfo(){

        System.out.println("\n=======Broker Details=======");

        if (this.companies != null) {
            System.out.println("Companies array length: " + this.companies.length);

            for (String company : this.companies) {
                System.out.println("Company: " + company);
            }
        }

        if (this.brokertypes != null) {
            System.out.println("BrokerType array length: " + this.brokertypes.length);

            for (BrokerType type : this.brokertypes) {
                if (type != null) {
                    type.getInfo();
                }
            }
        }
    }
}