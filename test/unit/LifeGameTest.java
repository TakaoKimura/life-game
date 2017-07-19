import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.hamcrest.core.Is.is;

public class LifeGameTest {

  @Test
  public void allCellAreDeadAtInitialState() {
    LifeGame game = new LifeGame(2, 2);
    assertFalse(game.cells().at(1, 1));
    assertFalse(game.cells().at(2, 1));
    assertFalse(game.cells().at(1, 2));
    assertFalse(game.cells().at(2, 2));
  }

  @Test
  public void allCellAreDeadAtInitialState() {
    LifeGame game = new LifeGame(2, 2);
    assertFalse(game.cells().at(1, 1));
    assertFalse(game.cells().at(2, 1));
    assertFalse(game.cells().at(1, 2));
    assertFalse(game.cells().at(2, 2));
  }
}
