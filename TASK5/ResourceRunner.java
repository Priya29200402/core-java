class ResourceRunner{
    public static void main(String[] args){

        Resource resource1 = new Resource();
        Resource resource2 = new Resource();

        System.out.println("====================");
        resource1.allocate();
        resource1.deallocate();
        resource2.consume();
        resource2.replenish();
        resource1.manage();
        resource1.monitor();
        resource2.optimize();
        resource1.upgrade();
        resource2.maintain();
        resource1.analyze();

        System.out.println("====================");

        Resource.getResourceType();
        Resource.getAvailability();
        Resource.getCost();
        Resource.getSupplier();
        Resource.getUsagePolicy();
    }
}