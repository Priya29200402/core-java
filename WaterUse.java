class WaterUse {
    public static void main(String[] args) {

        int level = 100;
        int count = 1;

        do {
            level -= 15;   
            System.out.println("Usage " + count + " Water Level: " + level);
            count++;
        } while(count <= 5);
    }
}
