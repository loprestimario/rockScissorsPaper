package move;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Move {

    MovePot moveSet = new MovePot();

    public static final String SCISSOR = "scissor";
    public static final String PAPER = "paper";
    public static final String ROCK = "rock";
    public static final String LIZARD = "lizard";
    public static final String SPOCK = "spock";

    private Set moves;
    ArrayList sassoWinsAgainst;
    ArrayList cartaWinsAgainst;
    ArrayList forbiciWinsAgainst;
    ArrayList lucertolaWinsAgainst;
    ArrayList spockWinsAgainst;


    public Move() {
        moves = new HashSet();
        moves.add(ROCK);
        moves.add(PAPER);
        moves.add(SCISSOR);
        moves.add(LIZARD);
        moves.add(SPOCK);

        sassoWinsAgainst= new ArrayList();
        sassoWinsAgainst.add(Move.SCISSOR);
        sassoWinsAgainst.add(Move.LIZARD);
        moveSet.addRules(Move.ROCK,new MoveRules(Move.ROCK,sassoWinsAgainst));

        cartaWinsAgainst= new ArrayList();
        cartaWinsAgainst.add(Move.ROCK);
        cartaWinsAgainst.add(Move.SPOCK);
        moveSet.addRules(Move.PAPER,new MoveRules(Move.PAPER,cartaWinsAgainst));

        forbiciWinsAgainst= new ArrayList();
        forbiciWinsAgainst.add(Move.PAPER);
        forbiciWinsAgainst.add(Move.LIZARD);
        moveSet.addRules(Move.SCISSOR, new MoveRules(Move.SCISSOR, forbiciWinsAgainst));

        lucertolaWinsAgainst= new ArrayList();
        lucertolaWinsAgainst.add(Move.PAPER);
        lucertolaWinsAgainst.add(Move.SPOCK);
        moveSet.addRules(Move.LIZARD, new MoveRules(Move.LIZARD, lucertolaWinsAgainst));

        spockWinsAgainst= new ArrayList();
        spockWinsAgainst.add(Move.SCISSOR);
        spockWinsAgainst.add(Move.ROCK);
        moveSet.addRules(Move.SPOCK,new MoveRules(Move.SPOCK,spockWinsAgainst));

    }

    public Set getMoves() {
        return moves;
    }

    public MovePot getMoveSet(){
       return moveSet;
    }

}
