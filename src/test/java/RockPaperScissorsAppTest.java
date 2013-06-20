import junit.framework.Assert;
import org.junit.Test;
import move.Move;
import move.MoveValidator;
import rps.RockPaperScissorsApp;
import rps.WinnerChooser;

public class RockPaperScissorsAppTest {

    private RockPaperScissorsApp rockPaperScissorsApp;
    WinnerChooser winnerChooser=new WinnerChooser();

    @Test
    public void testWinner_RockWinsOnScissors() {

        String winnerResult= winnerChooser.chooseWinner(Move.ROCK, Move.SCISSOR);
        Assert.assertEquals(Move.ROCK,winnerResult);
    }

    @Test
    public void testWinner_ScissorsLooseOnRock() {

        String winnerResult= winnerChooser.chooseWinner(Move.SCISSOR, Move.ROCK);
        Assert.assertEquals(Move.ROCK,winnerResult);
    }

    @Test
    public void testWinner_PaperWinsRock() {

        String winnerResult= winnerChooser.chooseWinner(Move.PAPER, Move.ROCK);
        Assert.assertEquals(Move.PAPER,winnerResult);
    }

    @Test
    public void testWinner_RockLoosePaper() {

        String winnerResult= winnerChooser.chooseWinner(Move.ROCK, Move.PAPER);
        Assert.assertEquals(Move.PAPER,winnerResult);
    }
    @Test
    public void testWinner_PaperAgainPaper(){

        String winnerResult= winnerChooser.chooseWinner(Move.PAPER, Move.PAPER);
        Assert.assertEquals(WinnerChooser.PARI,winnerResult);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testvalidateMossa() {
        MoveValidator moveValidator = new MoveValidator();
        moveValidator.validateMossa("BAD MOVE");
    }

}
