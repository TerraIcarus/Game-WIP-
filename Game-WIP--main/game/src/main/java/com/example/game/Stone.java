package com.example.game;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Stone {
    private double x;
    private double y;
    private double radius;
    private Circle c;

    public Stone(double x,double y,double radius,Circle c)
    {
        this.x=x;
        this.y=y;
        this.radius=radius;
        this.c=c;
    }

    public void setY(double y)
    {
        this.y=y;
    }

    public void setX(double x)
    {
        this.x=x;
    }

    public double getY()
    {
        return y;
    }

    public double getX()
    {
        return x;
    }

    public void setColor(Color color)
    {
        c.setFill(color);
    }

    public void draw()
    {
        c.setRadius(radius);
        c.setTranslateX(x);
        c.setTranslateY(y);
    }
}
