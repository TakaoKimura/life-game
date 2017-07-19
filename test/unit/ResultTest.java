import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.core.Is.is;

public class ResultTest {

  private Cell cell;
  private Result result;

  private void setUp(boolean state, int countOfArrive) {
    cell = new Cell(0, 0, state);
    result = new Result(cell, countOfArrive);
  }

  @Test
  public void カウントが0なら死ぬ() {
    setUp(true, 0);
    result.apply();
    assertFalse(cell.isAlive());
  }

  @Test
  public void カウントが1なら死ぬ() {
    setUp(true, 1);
    result.apply();
    assertFalse(cell.isAlive());
  }

  @Test
  public void カウントが2なら維持する() {
    setUp(false, 2);
    result.apply();
    result.apply();
    assertFalse(cell.isAlive());
  }

  @Test
  public void カウントが3なら誕生する() {
    setUp(false, 3);
    result.apply();
    assertTrue(cell.isAlive());
  }

  @Test
  public void カウントが4なら死ぬ() {
    setUp(true, 4);
    result.apply();
    assertFalse(cell.isAlive());
  }

  @Test
  public void カウントが4以上なら死ぬ() {
    setUp(true, 5);
    result.apply();
    assertFalse(cell.isAlive());
  }
}
