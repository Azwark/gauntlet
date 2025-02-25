package com.example.gauntlet;

import android.graphics.PointF;

class AlienArrowSpec extends ObjectSpec {
    // This is all the unique specifications
    // for an alien arrow
    private static final String tag = "Alien Arrow";
    private static final String bitmapName = "arrow";
    private static final float speed = .75f;
    private static final PointF relativeScale =
            new PointF(20f, 80f);

    private static final String[] components = new String [] {
            "StdGraphicsComponent",
            "ArrowMovementComponent",
            "ArrowSpawnComponent"};

    AlienArrowSpec(){
        super(tag, bitmapName,
                speed, relativeScale,
                components);
    }
}

