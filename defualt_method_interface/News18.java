package inner;

public class News18 implements Channel {
    public static void main(String[] args) {
        Channel channel = new News18();
        channel.play();
        channel.stop();
        channel.displayInfo();
         Channel.getChannelDetails();
    }
    @Override
    public void play() {
        System.out.println("Playing News18");
    }

    @Override
    public void stop() {
        System.out.println("Stopping News18");
    }

    @Override
    public void displayInfo() {
        System.out.println("Channel Name:" + name);
        System.out.println("Type:" + type);
        System.out.println("Channel Number:" + channelNumber);
    }
}