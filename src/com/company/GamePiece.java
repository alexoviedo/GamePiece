package com.company;

public class GamePiece {

    private int positionX;
    private int positionY;
    private boolean frozen;
    private String name;
    private String color;



    public GamePiece(int positionX, int positionY, boolean frozen, String name, String color) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.frozen = frozen;
        this.name = name;
        this.color = color;
    }


    public void move(){
        if(frozen == false) {
            positionX = 1;
            positionY = 3;
        }
    }

    @Override
    public String toString() {
        return "GamePiece{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                ", frozen=" + frozen +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }


    public void freeze(){
        frozen = true;
    }

    public void unfreeze(){
        frozen = false;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }


}