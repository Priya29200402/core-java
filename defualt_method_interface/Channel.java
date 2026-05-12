package inner;

public interface Channel {
    String name="News18";
    int channelNumber = 976;
    String type="News";

    void play();
    void stop();
    default void displayInfo(){
        System.out.println("Channel Name:"+ name);
        System.out.println("Type:"+ type);
        System.out.println("Channel Number:"+ channelNumber);
    }

     static void getChannelDetails(){
        System.out.println("Channel Name: News18, Type: News, Channel Number: 976");
    }
}
