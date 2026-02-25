class FMRadio {

    static boolean isOn = false;

    static void turnOnOrOff() {
        isOn = !isOn;
        System.out.println("Radio State Changed : VALID");
    }

    static void setFrequency(float frequency) {
        if (frequency >= 88.0f && frequency <= 108.0f) {
            System.out.println("setFrequency : VALID");
        } else {
            System.out.println("setFrequency : INVALID");
        }
    }

    static void increaseVolume(int increment) {
        if (volume + increment <= 10) {
            volume += increment;
            System.out.println("increaseVolume : VALID");
        } else {
            System.out.println("increaseVolume : INVALID");
        }
    }

    static void decreaseVolume(int decrement) {
        if (volume - decrement >= 0) {
            volume -= decrement;
            System.out.println("decreaseVolume : VALID");
        } else {
            System.out.println("decreaseVolume : INVALID");
        }
    }

    static void saveStation(String stationName) {
        if (stationName != null && !stationName.isEmpty()) {
            stations[index % 5] = stationName;
            index++;
            System.out.println("saveStation : VALID");
        } else {
            System.out.println("saveStation : INVALID");
        }
    }
}
