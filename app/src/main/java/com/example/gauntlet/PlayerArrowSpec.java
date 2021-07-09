package com.example.gauntlet;

import android.graphics.PointF;

class PlayerArrowSpec extends ObjectSpec {
    // This is all the unique specifications
    // for a player Arrow
    private static final String tag = "Player Arrow";
    private static final String bitmapName = "arrow";
    private static final float speed = .65f;
    private static final PointF relativeScale =
            new PointF(20f, 80f);

    private static final String[] components = new String [] {
            "StdGraphicsComponent",
            "ArrowMovementComponent",
            "ArrowSpawnComponent"};

    PlayerArrowSpec(){
        super(tag, bitmapName,
                speed, relativeScale,
                components);
    }
}
