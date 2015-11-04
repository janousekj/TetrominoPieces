package com.company;

import static org.junit.Assert.*;

/**
 * Created by semanticer on 29. 10. 2015.
 */
public class PieceGeneratorTest {

    @org.junit.Test
    public void testGetPiece() throws Exception {
        PieceGenerator gen = new FullRandomPieceGenerator();

        // there is no way piece can be generated 3 times in row
        int sameCounter = 0;
        Piece prevPiece = null;

        for (int i = 0; i < 99999; i++) {
            Piece p = gen.getPiece();
            if (p == prevPiece) {
                sameCounter++;
            } else {
                sameCounter = 1;
                prevPiece = p;
            }

            assertTrue("There where more than 2 pieces in row (index: "+i+" sameCounter: "+sameCounter+")", sameCounter < 3);
        }
    }

}