package com.company;

import java.util.Random;



public class Main {

    public static void allToFalse(boolean [] array){
        for(int i=0; i<array.length;i++){
            array[i] = false;
        }

    }
    public static void main(String[] args) {

        Random myRandom = new Random();
        int i = 0;
        int countUsed=0;
        boolean [] isUsed = new boolean[6];


        while (i<9999) {
            int piece = myRandom.nextInt(6)+1;

            if (countUsed==6){
                allToFalse(isUsed);
                countUsed=0;
            }

            if (!isUsed[piece-1]){
                Renderer.renderPiece(piece);
                isUsed[piece-1] = true;
                countUsed++;

            }

            i++;
        }



        for(i = 0; i<isUsed.length;i++){
            System.out.print(isUsed[i]);
        }


/*
        // rendering all pieces
        Renderer.renderPiece(1);
        Renderer.renderPiece(2);
        Renderer.renderPiece(3);
        Renderer.renderPiece(4);
        Renderer.renderPiece(5);
        Renderer.renderPiece(6);
*/


    }


}