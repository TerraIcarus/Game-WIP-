package com.example.game;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Player {
    private Circle c;
    private static final String MOVE_LEFT ="a";
    private static final String MOVE_RIGHT ="d";
    private static final String MOVE_UP ="w";
    private static final String MOVE_DOWN ="s";

    public void setColor(Color color)
    {
        c.setFill(color);
    }








    public void Move(String command)
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
    }

    private void movePlayer(int x, int y)
    {

    }
}
