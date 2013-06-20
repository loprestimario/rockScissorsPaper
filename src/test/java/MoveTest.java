import junit.framework.Assert;
import org.junit.Test;
import move.Move;
import move.MovePot;
import move.MoveRules;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: mario
 * Date: 20/06/13
 * Time: 0.29
 * To change this template use File | Settings | File Templates.
 */
public class MoveTest {

    @Test
    public void testMove() {

        Set moves = new HashSet();
        moves.add("rock");
        moves.add("paper");
        moves.add("scissor");
        moves.add("lizard");
        moves.add("spock");

        Move move = new Move();
        Assert.assertEquals(move.getMoves(), moves);
    }

    @Test
    public void testMoveKey() {

        Set moves = new HashSet();
        moves.add("rock");
        moves.add("paper");
        moves.add("scissor");
        moves.add("lizard");
        moves.add("spock");

        Move move = new Move();
        Assert.assertEquals(move.getMoveSet().getRules().keySet(), moves);
    }

    @Test
    public void testWinsAgain() {

        ArrayList moves = new ArrayList();
        moves.add("scissor");
        moves.add("lizard");

        Move m = new Move();
        MovePot moveSet= m.getMoveSet();
        MoveRules move = moveSet.getRules().get("rock");
        Assert.assertEquals(move.getWinsAgainst(), moves);
    }

}
