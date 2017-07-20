import java.util.List;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Cells cells = CellCreater.create(100, 100);
    int x = 50;
    int y = 50;
    cells.at(6 + x, 1 + y).setState(true);
    cells.at(7 + x, 1 + y).setState(true);
    cells.at(8 + x, 1 + y).setState(true);
    cells.at(9 + x, 1 + y).setState(true);

    cells.at(5 + x, 2 + y).setState(true);
    cells.at(5 + x, 2 + y).setState(true);
    cells.at(9 + x, 2 + y).setState(true);

    cells.at(9 + x, 3 + y).setState(true);

    cells.at(1 + x, 4 + y).setState(true);
    cells.at(2 + x, 4 + y).setState(true);
    cells.at(5 + x, 4 + y).setState(true);
    cells.at(8 + x, 4 + y).setState(true);

    cells.at(1 + x, 5 + y).setState(true);
    cells.at(2 + x, 5 + y).setState(true);
    cells.at(3 + x, 5 + y).setState(true);

    cells.at(1 + x, 6 + y).setState(true);
    cells.at(2 + x, 6 + y).setState(true);
    cells.at(5 + x, 6 + y).setState(true);
    cells.at(8 + x, 6 + y).setState(true);

    cells.at(9 + x, 7 + y).setState(true);

    cells.at(5 + x, 8 + y).setState(true);
    cells.at(5 + x, 8 + y).setState(true);
    cells.at(9 + x, 8 + y).setState(true);

    cells.at(6 + x, 9 + y).setState(true);
    cells.at(7 + x, 9 + y).setState(true);
    cells.at(8 + x, 9 + y).setState(true);
    cells.at(9 + x, 9 + y).setState(true);

    LifeGameFrame frame = new LifeGameFrame(cells);
    frame.setVisible(true);
  }
}
