package com.company;

import java.util.NoSuchElementException;

/**
 * Created by semanticer on 29. 10. 2015.
 */
public class Renderer {

    // TODO upgrade with constants and then with enums
    public static void renderPiece(int piece) {
        String stringRep;
        switch (piece) {
            case 1:
                stringRep = "" +
                        "OO\n" +
                        "OO\n";
                break;
            case 2:
                stringRep = "" +
                        "O\n" +
                        "O\n" +
                        "O\n" +
                        "O\n";
                break;
            case 3:
                stringRep = "" +
                        " OO\n" +
                        "OO \n";
                break;
            case 4:
                stringRep = "" +
                        "O \n" +
                        "O \n" +
                        "OO\n";
                break;
            case 5:
                stringRep = "" +
                        " O\n" +
                        " O\n" +
                        "OO\n";
                break;
            case 6:
                stringRep = "" +
                        "OOO\n" +
                        " O \n";
                break;
            default:
                throw new NoSuchElementException("There is no piece like that");
        }

        System.out.println(stringRep);
    }
}
