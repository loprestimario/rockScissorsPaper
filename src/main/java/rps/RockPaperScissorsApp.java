package rps;

import java.io.EOFException;
import java.io.IOException;

import static java.lang.System.err;

public class RockPaperScissorsApp {

    public static void main(String[] args) throws IOException {

        try{
            UserInterface.userInterface();

        }
        catch(EOFException e) {
            err.println("Error");
        }

    }

}
