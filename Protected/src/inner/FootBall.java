package inner;

public class FootBall extends Ball{

    @Override
    public void roll() {
        System.out.println("Rolling the football");
    }
    void check(){
        roll();
    }
}
