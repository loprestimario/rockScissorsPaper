import junit.framework.Assert;
import org.junit.Test;
import rps.Move;
import rps.MoveValidator;
import rps.RockPaperScissorsApp;
import rps.WinnerChooser;

public class RockPaperScissorsAppTest {

    private RockPaperScissorsApp rockPaperScissorsApp;
    WinnerChooser winnerChooser=new WinnerChooser();

    @Test
    public void testWinner_RockWinsOnScissors() {

        String winnerResult= winnerChooser.chooseWinner(Move.SASSO, Move.FORBICI);
        Assert.assertEquals(Move.SASSO,winnerResult);
    }

    @Test
    public void testWinner_ScissorsLooseOnRock() {

        String winnerResult= winnerChooser.chooseWinner(Move.FORBICI, Move.SASSO);
        Assert.assertEquals(Move.SASSO,winnerResult);
    }

    @Test
    public void testWinner_PaperWinsRock() {

        String winnerResult= winnerChooser.chooseWinner(Move.CARTA, Move.SASSO);
        Assert.assertEquals(Move.CARTA,winnerResult);
    }

    @Test
    public void testWinner_RockLoosePaper() {

        String winnerResult= winnerChooser.chooseWinner(Move.SASSO, Move.CARTA);
        Assert.assertEquals(Move.CARTA,winnerResult);
    }
    @Test
    public void testWinner_PaperAgainPaper(){

        String winnerResult= winnerChooser.chooseWinner(Move.CARTA, Move.CARTA);
        Assert.assertEquals(WinnerChooser.PARI,winnerResult);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testvalidateMossa() {
        MoveValidator moveValidator = new MoveValidator();
        moveValidator.validateMossa("BAD MOVE");
    }

}
