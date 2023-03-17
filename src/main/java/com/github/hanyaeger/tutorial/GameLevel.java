package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;

import java.util.Random;

public class GameLevel extends DynamicScene{
    @Override
    public void setupScene() {
        setBackgroundAudio("audio/waterworld.mp3");
        setBackgroundImage("backgrounds/background2.jpg");
    }

    @Override
    public void setupEntities() {
        //WIP
        var Swordfish = new Swordfish(
                new Coordinate2D(getWidth() / 3,  new Random().nextInt((int) getHeight()- 81))
        );

        addEntity(Swordfish);

        var Hanny = new Hanny(
                new Coordinate2D(50, 50), new HealthText(new Coordinate2D(600, 100))
        );
        addEntity(Hanny);
    }
}
