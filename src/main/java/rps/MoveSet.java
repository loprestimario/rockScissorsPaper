package rps;

import java.util.HashMap;
import java.util.Map;

public class MoveSet {
    private Map<String, MoveRules> rules;

    public MoveSet() {
        rules = new HashMap<String, MoveRules>();
    }

    public void addRules(String a, MoveRules move) {
        rules.put(a,move);

    }

    public Map<String, MoveRules> getRules() {
        return rules;
    }



}
