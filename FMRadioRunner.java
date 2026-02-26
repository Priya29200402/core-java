class FMRadioRunner {
    public static void main(String[] args) {

        FMRadio.turnOnOrOff();
        FMRadio.turnOnOrOff();

        FMRadio.setFrequency(98.5f);
        FMRadio.setFrequency(107.2f);
        FMRadio.setFrequency(200f);

        FMRadio.increaseVolume(2);
        FMRadio.increaseVolume(10);

        FMRadio.decreaseVolume(1);
        FMRadio.decreaseVolume(10);

        FMRadio.saveStation("Radio Mirchi");
        FMRadio.saveStation("Red FM");
        FMRadio.saveStation("");
    }
}
