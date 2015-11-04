package com.company;

import java.util.Random;

/**
 * Created by semanticer on 29. 10. 2015.
 */
public class FullRandomPieceGenerator implements PieceGenerator {
    @Override
    public Piece getPiece() {
        int ranIndex = getRanNumberInRange(0, Piece.values().length-1);
        return Piece.values()[ranIndex];
    }

    private int getRanNumberInRange(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}
