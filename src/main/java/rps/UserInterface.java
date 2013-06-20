package rps;

import move.MoveValidator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInterface {
    static void userInterface() throws IOException {

        String firstMove = readInput("Giocatore numero 1");
        String secondMove = readInput("Giocatore numero 2");
        WinnerChooser winnerChooser= new WinnerChooser();
        System.out.println("vince:   " + winnerChooser.chooseWinner(firstMove, secondMove));
    }

    private static String readInput(String playerName) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print(playerName + ", fai la mossa: ");
        String move = br.readLine();
        MoveValidator moveValidator = new MoveValidator();
        moveValidator.validateMossa(move);
        return move;
    }
}