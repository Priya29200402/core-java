package outer;

import inner.Ball;

public class VolleyBall extends Ball {

    @Override
    protected void roll() {
        super.roll();
    }

    void  bounce(){
        System.out.println("Bouncing the volleyball");
        roll();
    }
}
