package rps;

import java.util.ArrayList;

public class MoveRules {

    private String name="";
    private ArrayList winsAgainst;


    public MoveRules(String name, ArrayList winsAgainst) {
        this.name = name;
        this.winsAgainst = winsAgainst;
    }

    public String winsOver(String secondMove){
        if(winsAgainst.contains(secondMove)){
            return name;
        }
        else{
            return secondMove;
        }

    }

    public String getName() {
        return name;
    }

    public ArrayList getWinsAgainst() {
        return winsAgainst;
    }
}
