import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.core.Is.is;

public class LifeGameTest {

  @Test
  public void allCellAreDeadAtInitialState() {
    LifeGame game = new LifeGame(2, 2);
    assertFalse(game.cells().at(1, 1).getState());
    assertFalse(game.cells().at(2, 1).getState());
    assertFalse(game.cells().at(1, 2).getState());
    assertFalse(game.cells().at(2, 2).getState());
  }

  @Test
  public void deadCellBirthsWhenItSorrowndedBy3AlivalCells() {
    LifeGame game = new LifeGame(2, 2);
    game.changeCell(2, 1, true);
    game.changeCell(1, 2, true);
    game.changeCell(2, 2, true);
    game.next();
    assertTrue(game.cells().at(2, 2).getState());
  }
}
