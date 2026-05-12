package inner;

public class AmazonForest implements Forest {
    public static void main(String[] args) {
        AmazonForest amazonForest = new AmazonForest();
        amazonForest.explore();
        amazonForest.conserve();
        amazonForest.displayInfo();

        Forest forest = new AmazonForest();
        forest.explore();
        forest.conserve();
        forest.displayInfo();
    }

    @Override
    public void explore() {
            System.out.println("Exploring the Amazon Rainforest");
    }

    @Override
    public void conserve() {
        System.out.println("Conserving the Amazon Rainforest");

    }

    @Override
    public void displayInfo() {
        Forest.getForestDetails();
    }
}
