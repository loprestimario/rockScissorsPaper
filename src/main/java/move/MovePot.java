package move;

import java.util.HashMap;
import java.util.Map;

public class MovePot {
    private Map<String, MoveRules> rules;

    public MovePot() {
        rules = new HashMap<String, MoveRules>();
    }

    public void addRules(String a, MoveRules move) {
        rules.put(a,move);

    }

    public Map<String, MoveRules> getRules() {
        return rules;
    }



}
