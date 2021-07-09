package com.example.gauntlet;

import android.graphics.PointF;

class ArrowMovementComponent implements MovementComponent {

    @Override
    public boolean move(long fps,
                        Transform t,
                        Transform playerTransform) {

        // Arrow can only travel two screen widths
        float range = t.getmScreenSize().x * 2;

        // Where is the Arrow
        PointF location = t.getLocation();

        // How fast is it going
        float speed = t.getSpeed();

        if(t.headingRight()){
            location.x += speed / fps;
        }
        else if(t.headingLeft()){
            location.x -= speed / fps;
        }

        // Has the Arrow gone out of range
        if(location.x < - range || location.x > range){
            // disable the Arrow
            return false;
        }

        t.updateCollider();


        return true;
    }
}
