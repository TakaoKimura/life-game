import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.core.Is.is;

public class ResultTest {
  @Test
  public void カウントが0なら死ぬ() {
    Cell cell = new Cell(0, 0, true);
    Result result = new Result(cell, 0);
    result.apply();
    assertFalse(cell.getState());
  }

  @Test
  public void カウントが1なら死ぬ() {
    Cell cell = new Cell(0, 0, true);
    Result result = new Result(cell, 1);
    result.apply();
    assertFalse(cell.getState());
  }

  @Test
  public void カウントが2なら維持する() {
    Cell cell = new Cell(0, 0, false);
    Result result = new Result(cell, 2);
    result.apply();
    assertFalse(cell.getState());
  }

  @Test
  public void カウントが3なら誕生する() {
    Cell cell = new Cell(0, 0, false);
    Result result = new Result(cell, 3);
    result.apply();
    assertTrue(cell.getState());
  }

  @Test
  public void カウントが4なら死ぬ() {
    Cell cell = new Cell(0, 0, true);
    Result result = new Result(cell, 4);
    result.apply();
    assertFalse(cell.getState());
  }

  @Test
  public void カウントが4以上なら死ぬ() {
    Cell cell = new Cell(0, 0, true);
    Result result = new Result(cell, 5);
    result.apply();
    assertFalse(cell.getState());
  }
}
