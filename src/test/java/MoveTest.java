import junit.framework.Assert;
import org.junit.Test;
import rps.Move;
import rps.MoveRules;
import rps.MoveSet;

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
        moves.add("sasso");
        moves.add("carta");
        moves.add("forbici");
        moves.add("lucertola");
        moves.add("spock");

        Move move = new Move();
        Assert.assertEquals(move.getMoves(), moves);
    }

    @Test
    public void testMoveKey() {

        Set moves = new HashSet();
        moves.add("sasso");
        moves.add("carta");
        moves.add("forbici");
        moves.add("lucertola");
        moves.add("spock");

        Move move = new Move();
        Assert.assertEquals(move.getMoveSet().getRules().keySet(), moves);
    }

    @Test
    public void testWinsAgain() {

        ArrayList moves = new ArrayList();
        moves.add("forbici");
        moves.add("lucertola");

        Move m = new Move();
        MoveSet moveSet= m.getMoveSet();
        MoveRules move = moveSet.getRules().get("sasso");
        Assert.assertEquals(move.getWinsAgainst(), moves);
    }

}
