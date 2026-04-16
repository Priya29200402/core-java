package outer;

import inner.FootBall;

public class Hemanth {

    void play(){
        System.out.println("Playing the game");
        VolleyBall volleyBall = new VolleyBall();
        volleyBall.bounce();
        FootBall footBall = new FootBall();
        footBall.roll();
    }

}
