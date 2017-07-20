import org.junit.Test;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.core.Is.is;

public class CellsCreaterTest {

  public void 起点から横にxこ縦にyこのセルを生成する() {
    Cells cells = CellsCreater.create(2, 2);
    assertNotNull(cells.at(1, 1));
    assertNotNull(cells.at(2, 1));
    assertNull(cells.at(3, 1));
    assertNotNull(cells.at(1, 2));
    assertNotNull(cells.at(2, 2));
    assertNull(cells.at(3, 2));
    assertNull(cells.at(1, 3));
    assertNull(cells.at(2, 3));
    assertNull(cells.at(3, 3));
  }

  public void デフォルトは全てのCellが死んでいる() {
    Cells cells = CellsCreater.create(2, 2);
    assertFalse(cells.at(1, 1).isAlive());
    assertFalse(cells.at(2, 1).isAlive());
    assertFalse(cells.at(1, 2).isAlive());
    assertFalse(cells.at(2, 2).isAlive());
  }

}
