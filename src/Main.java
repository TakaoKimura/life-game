import java.util.List;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Cells cells = CellCreater.create(10, 10);
    cells.at(3, 2).setState(true);
    cells.at(3, 3).setState(true);
    cells.at(3, 4).setState(true);

    LifeGameFrame frame = new LifeGameFrame(cells);
    frame.setVisible(true);
  }
}
