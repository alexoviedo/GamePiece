package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        GamePiece gp = new GamePiece(0, 0,false,"Jim", "blue");

//



//        print out the default values.
        System.out.println(gp);


//        test freeze method.
        gp.freeze();
        System.out.println("test freeze method " + gp);

//        test move method.
        gp.move();

//        print out values.
        System.out.println("test move method " + gp);


//        test unfreeze method.
        gp.unfreeze();


//        test move method.
        gp.move();

//        print out the values.
        System.out.println("test both methods " + gp);
    }
}
