package BouncingBalls;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * Created by SurfacePro on 11.03.2015.
 */
public class Ball extends Circle {
    private double dx = 1, dy = 1;

    Ball(double x,double y, double radius , Color color){
        super(x,y,radius);
        setFill(color);
    }
}
