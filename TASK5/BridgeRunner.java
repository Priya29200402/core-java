class BridgeRunner{
    public static void main(String[] args){

        Bridge bridge1 = new Bridge();
        Bridge bridge2 = new Bridge();

        System.out.println("====================");
        bridge1.construct();
        bridge1.inspect();
        bridge2.repair();
        bridge2.maintain();
        bridge1.openBridge();
        bridge1.closeBridge();
        bridge2.calculateLoad();
        bridge1.paint();
        bridge2.clean();
        bridge1.monitorTraffic();

        System.out.println("====================");

        Bridge.getBridgeType();
        Bridge.getMaterial();
        Bridge.getLocation();
        Bridge.getConstructionYear();
        Bridge.getAuthority();
    }
}