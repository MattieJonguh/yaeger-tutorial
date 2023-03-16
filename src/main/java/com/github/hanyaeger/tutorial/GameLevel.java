package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;

public class GameLevel extends DynamicScene {
    @Override
    public void setupScene() {
        setBackgroundAudio("audio/waterworld.mp3");
        setBackgroundImage("backgrounds/background2.jpg");
    }

    @Override
    public void setupEntities() {
        var Swordfish = new Swordfish(
                new Coordinate2D(getWidth() / 3, getHeight() / 3 * 2)
        );
        addEntity(Swordfish);

        var Hanny = new Hanny(
                new Coordinate2D(50, 50)
        );
        addEntity(Hanny);
    }
}
