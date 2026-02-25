class WaterFill {
    public static void main(String[] args) {

        int level = 0;
        int count = 1;

        do {
            level += 20;   
            System.out.println("Fill " + count + " Water Level: " + level);
            count++;
        } while(count <= 5);
    }
}
