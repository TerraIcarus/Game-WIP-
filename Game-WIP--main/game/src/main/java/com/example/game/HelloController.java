package com.example.game;

import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class HelloController {
    @FXML
    Pane panel;
    @FXML
    Text Score;

    private int size =400;
    private int spots=10;
    private int squareSize=size/spots;

    private ArrayList<Stone> stones;
    private ArrayList<PickUp> pickups;
    private ArrayList<Player> players;

    @FXML
    public void initialize()
    {
        for (int i =0;i<size;i+=squareSize)
        {
            for (int j=0;j<size;j+=squareSize)
            {
                Rectangle rectangle =new Rectangle(i,j,squareSize,squareSize);
                rectangle.setFill(Color.WHITE);
                rectangle.setStroke(Color.BLACK);
                panel.getChildren().add(rectangle);
            }
        }
        stones = new ArrayList<Stone>();
        for (int i=0;i<5;i++)
        {
            Circle c=new Circle();
            c.setFill(Color.GRAY);
            c.setStroke(Color.BLACK);

            double radius=squareSize/3.0;
            int x =squareSize/2+squareSize*(int)(Math.random()*spots);
            int y =squareSize/2+squareSize*(int)(Math.random()*spots);
            Stone s =new Stone(x,y,radius,c);
            stones.add(s);
            panel.getChildren().add(c);
            s.draw();
        }

        pickups = new ArrayList<PickUp>();
        for (int i=0;i<5;i++)
        {
            Circle c=new Circle();
            c.setFill(Color.BLUE);
            c.setStroke(Color.BLACK);

            double radius=squareSize/5.0;
            int x =squareSize/2+squareSize*(int)(Math.random()*spots);
            int y =squareSize/2+squareSize*(int)(Math.random()*spots);
            PickUp pu =new PickUp(x,y,radius,c);
            pickups.add(pu);

            panel.getChildren().add(c);
            pu.draw();
        }

        players = new ArrayList<Player>();
        for (int i=0;i<5;i++)
        {
            Circle c = new Circle();
            c.setFill(Color.GREEN);
            c.setStroke(Color.BLACK);

            double radius=squareSize/3.0;

            int x =squareSize/2+squareSize*(9);
            int y =squareSize/2+squareSize*(9);

            Player pu = new Player(x,y,radius,c);
            players.add(pu);

            c.setOnKeyPressed(event -> pressed(event,pu));

            panel.getChildren().add(c);
            pu.draw();
        }
    }

    public void pressed(KeyEvent event,Player pu)
    {
        //pu.setX(pu.getX() + );
        //pu.setX(pu.getX() + event.getX());
        //pu.setY(pu.getY() + event.getY());
        //pu.draw();
       /* if(event.getCode()== KeyCode.DOWN && getCenterY()<getScene().getHeight())
        {
            setCenterY(getcenreY)
        }*/
    }


    /*public  void  keyPressed(KeyEvent event,Player pu){
        keys[event.getKeyCode()] = true;
    }
    public void keyReleased(KeyEvent event,Player pu){
        keys[event.getKeyCode()] = false;
    }
    public void keyTyped(KeyEvent event,Player pu){

    }*/
}