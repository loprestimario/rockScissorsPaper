package rps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Move {

    MoveSet moveSet = new MoveSet();

    public static final String FORBICI = "forbici";
    public static final String CARTA = "carta";
    public static final String SASSO = "sasso";
    public static final String LUCERTOLA = "lucertola";
    public static final String SPOCK = "spock";

    private Set moves;
    ArrayList sassoWinsAgainst;
    ArrayList cartaWinsAgainst;
    ArrayList forbiciWinsAgainst;
    ArrayList lucertolaWinsAgainst;
    ArrayList spockWinsAgainst;


    public Move() {
        moves = new HashSet();
        moves.add(SASSO);
        moves.add(CARTA);
        moves.add(FORBICI);
        moves.add(LUCERTOLA);
        moves.add(SPOCK);

        sassoWinsAgainst= new ArrayList();
        sassoWinsAgainst.add(Move.FORBICI);
        sassoWinsAgainst.add(Move.LUCERTOLA);
        moveSet.addRules(Move.SASSO,new MoveRules(Move.SASSO,sassoWinsAgainst));

        cartaWinsAgainst= new ArrayList();
        cartaWinsAgainst.add(Move.SASSO);
        cartaWinsAgainst.add(Move.SPOCK);
        moveSet.addRules(Move.CARTA,new MoveRules(Move.CARTA,cartaWinsAgainst));

        forbiciWinsAgainst= new ArrayList();
        forbiciWinsAgainst.add(Move.CARTA);
        forbiciWinsAgainst.add(Move.LUCERTOLA);
        moveSet.addRules(Move.FORBICI, new MoveRules(Move.FORBICI, forbiciWinsAgainst));

        lucertolaWinsAgainst= new ArrayList();
        lucertolaWinsAgainst.add(Move.CARTA);
        lucertolaWinsAgainst.add(Move.SPOCK);
        moveSet.addRules(Move.LUCERTOLA, new MoveRules(Move.LUCERTOLA, lucertolaWinsAgainst));

        spockWinsAgainst= new ArrayList();
        spockWinsAgainst.add(Move.FORBICI);
        spockWinsAgainst.add(Move.SASSO);
        moveSet.addRules(Move.SPOCK,new MoveRules(Move.SPOCK,spockWinsAgainst));

    }

    public Set getMoves() {
        return moves;
    }

    public  MoveSet getMoveSet(){
       return moveSet;
    }

}
