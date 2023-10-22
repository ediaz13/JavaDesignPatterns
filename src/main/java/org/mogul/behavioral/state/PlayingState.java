package org.mogul.behavioral.state;

import javax.sound.midi.Soundbank;
import java.security.spec.RSAOtherPrimeInfo;

public class PlayingState extends State{
    public PlayingState(Game game) {
        super(game);
        System.out.println("--- Game in Playing State ---");
    }

    @Override
    public void onWelcomeScreen() {
        System.out.println("Not Allowed");
    }

    @Override
    public void onPlaying() {
        System.out.println("Currently playing!");
    }

    @Override
    public void onBreak() {
        game.changeState(new BreakState(game));
    }

    @Override
    public void onEndGame() {
        game.changeState(new EndGame(game));

    }
}
