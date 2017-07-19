import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LifeGameTest {

  @Test
  public void allCellAreDeadAtInitialState() {
    LifeGame game = new LifeGame(2, 2);
    assertFalse(game.cells().at(1, 1).isAlive());
    assertFalse(game.cells().at(2, 1).isAlive());
    assertFalse(game.cells().at(1, 2).isAlive());
    assertFalse(game.cells().at(2, 2).isAlive());
  }

  @Test
  public void deadCellBirthesWhenItSorrowndedBy3AlivalCells_atTheUpperLeft() {
    testBirth(1, 1);
  }

  @Test
  public void deadCellBirthesWhenItSorrowndedBy3AlivalCells_atTherUnderRight() {
    testBirth(2, 2);
  }

  @Test
  public void deadCellDiesWhenItSorrowndedBy4AlivalCells() {
    LifeGame game = new LifeGame(3, 3);
    game.changeCell(2, 2, true);

    game.changeCell(1, 1, true);
    game.changeCell(3, 1, true);
    game.changeCell(1, 3, true);
    game.changeCell(3, 3, true);

    game.next();
    assertFalse(game.cells().at(2, 2).isAlive());
  }

  private void testBirth(int targetX, int targetY) {
    LifeGame game = new LifeGame(2, 2);
    game.changeCell(1, 1, true);
    game.changeCell(2, 1, true);
    game.changeCell(1, 2, true);
    game.changeCell(2, 2, true);
    game.changeCell(targetX, targetY, false);
    game.next();
    assertTrue(game.cells().at(targetX, targetY).isAlive());
  }
}
