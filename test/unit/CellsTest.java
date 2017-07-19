import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CellsTest {

  @Test
  public void allCellAreDeadAtInitialState() {
    Cells cells = CellCreater.create(2, 2);
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
    Cells cells = CellCreater.create(3, 3);

    cells.changeCell(2, 2, true);

    cells.changeCell(1, 1, true);
    cells.changeCell(3, 1, true);
    cells.changeCell(1, 3, true);
    cells.changeCell(3, 3, true);

    cells.update();
    assertFalse(cells.at(2, 2).isAlive());
  }

  private void testBirth(int targetX, int targetY) {
    Cells cells = CellCreater.create(2, 2);
    cells.changeCell(1, 1, true);
    cells.changeCell(2, 1, true);
    cells.changeCell(1, 2, true);
    cells.changeCell(2, 2, true);
    cells.changeCell(targetX, targetY, false);
    cells.update();
    assertTrue(cells.at(targetX, targetY).isAlive());
  }
}
