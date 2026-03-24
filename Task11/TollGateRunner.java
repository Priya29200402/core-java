class TollGateRunner{
    public static void main(String[] args){

        TollGate[] tollgateInfos=new TollGate[10];
        TollGateStore tollGateStore=new TollGateStore(tollgateInfos);

        TollGate tollGate1=new TollGate("Attibele Toll Plaza", 14.38, 35, 10, 120, 70000);
        TollGate tollGate2=new TollGate("Electronic City Toll", 18.50, 40, 8, 100, 60000);
        TollGate tollGate3=new TollGate("Nice Road Toll", 25.00, 50, 12, 150, 80000);
        TollGate tollGate4=new TollGate("Nelamangala Toll", 30.20, 45, 9, 110, 65000);
        TollGate tollGate5=new TollGate("Hoskote Toll", 22.75, 35, 7, 90, 55000);
        TollGate tollGate6=new TollGate("Devanahalli Toll", 35.10, 60, 11, 140, 75000);
        TollGate tollGate7=new TollGate("Kanakapura Toll", 28.40, 30, 6, 80, 50000);
        TollGate tollGate8=new TollGate("Tumkur Road Toll", 40.00, 55, 13, 160, 90000);
        TollGate tollGate9=new TollGate("Mysore Road Toll", 32.60, 45, 10, 120, 70000);
        TollGate tollGate10=new TollGate("Airport Toll Plaza", 38.90, 70, 14, 170, 95000);

        tollGateStore.save(tollGate1);
        tollGateStore.save(tollGate2);
        tollGateStore.save(tollGate3);
        tollGateStore.save(tollGate4);
        tollGateStore.save(tollGate5);
        tollGateStore.save(tollGate6);
        tollGateStore.save(tollGate7);
        tollGateStore.save(tollGate8);
        tollGateStore.save(tollGate9);
        tollGateStore.save(tollGate10);

        tollGate1.printInfo();
        System.out.println("\n");

        tollGate2.printInfo();
        System.out.println("\n");

        tollGate3.printInfo();
        System.out.println("\n");

        tollGate4.printInfo();
        System.out.println("\n");

        tollGate5.printInfo();
        System.out.println("\n");

        tollGate6.printInfo();
        System.out.println("\n");

        tollGate7.printInfo();
        System.out.println("\n");

        tollGate8.printInfo();
        System.out.println("\n");

        tollGate9.printInfo();
        System.out.println("\n");

        tollGate10.printInfo();
        
    }
}