class Track{

    String type;
    double length;
    String location;
    boolean indoor;
    String material;

    Track() {

    }

    Track(String type) {
        this.type = type;
    }

    Track(String type, double length) {
        this.type = type;
        this.length = length;
    }

    Track(String type, double length, String location) {
        this.type = type;
        this.length = length;
        this.location = location;
    }

    Track(String type, double length, String location, boolean indoor) {
        this.type = type;
        this.length = length;
        this.location = location;
        this.indoor = indoor;
    }

    Track(String type, double length, String location, boolean indoor, String material) {
        this.type = type;
        this.length = length;
        this.location = location;
        this.indoor = indoor;
        this.material = material;
    }
}