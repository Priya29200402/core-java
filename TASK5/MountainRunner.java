class MountainRunner{
    public static void main(String[] args){

        Mountain mountain1 = new Mountain();
        Mountain mountain2 = new Mountain();

        System.out.println("====================");
        mountain1.climb();
        mountain1.descend();
        mountain2.explore();
        mountain2.measureHeight();
        mountain1.checkWeather();
        mountain1.camp();
        mountain2.photograph();
        mountain1.mapRoute();
        mountain2.survey();
        mountain1.protect();

        System.out.println("====================");

        Mountain.getName();
        Mountain.getHeight();
        Mountain.getLocation();
        Mountain.getClimate();
        Mountain.getFamousFor();
    }
}