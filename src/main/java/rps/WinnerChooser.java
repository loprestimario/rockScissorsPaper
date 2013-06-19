package rps;


public class WinnerChooser {

    public static final String PARI = "pari";

    public String chooseWinner(String firstMove, String secondMove) {
        String winner = "";
        Move m = new Move();
        MoveSet moveSet= m.getMoveSet();
        if (firstMove.equals(secondMove)) {
            winner = PARI;

        } else {
            for(String name: moveSet.getRules().keySet()) {
                MoveRules move = moveSet.getRules().get(name);
                if(move.getName().equals(firstMove)){
                    winner = move.winsOver(secondMove);
                }
            }
        }
        return winner;
    }
}