package rps;

public class MoveValidator {

    private Move moveNames = new Move();

    public void validateMossa(String firstMove) {
        if (!moveNames.getMoves().contains(firstMove)) {
            throw new IllegalArgumentException("Carta non valida");

        }
    }
}