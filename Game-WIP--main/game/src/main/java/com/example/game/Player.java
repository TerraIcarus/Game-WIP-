package com.example.game;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Player {
    private Circle c;
    private static final String MOVE_LEFT ="a";
    private static final String MOVE_RIGHT ="d";
    private static final String MOVE_UP ="w";
    private static final String MOVE_DOWN ="s";

    private double x;
    private double y;
    private double radius;

    public Player(double x,double y,double radius,Circle c)
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

    /*public void Move(String command)
    {
        switch (command) {
            case MOVE_LEFT:
                movePlayer(-1,0);
                break;
            case MOVE_RIGHT:
                movePlayer(1,1);
                break;
            case MOVE_UP:
                movePlayer(0,-1);
                break;
            case MOVE_DOWN:
                movePlayer(0,1);
                break;
        }
    }*/

    private void movePlayer(int x, int y)
    {
        c.setRadius(radius);
        c.setTranslateX(x);
        c.setTranslateY(y);

    }
}
