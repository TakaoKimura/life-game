import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CellsTest {

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

    cells.at(2, 2).setState(true);

    cells.at(1, 1).setState(true);
    cells.at(3, 1).setState(true);
    cells.at(1, 3).setState(true);
    cells.at(3, 3).setState(true);

    cells.update();
    assertFalse(cells.at(2, 2).isAlive());
  }

  private void testBirth(int targetX, int targetY) {
    Cells cells = CellCreater.create(2, 2);
    cells.at(1, 1).setState(true);
    cells.at(2, 1).setState(true);
    cells.at(1, 2).setState(true);
    cells.at(2, 2).setState(true);
    cells.at(targetX, targetY).setState(false);
    cells.update();
    assertTrue(cells.at(targetX, targetY).isAlive());
  }
}
