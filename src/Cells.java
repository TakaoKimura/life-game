import java.util.List;
import java.util.ArrayList;

class Cells {

  private List<Cell> cells = new ArrayList<Cell>();

  boolean at(int x, int y) {
    for(Cell cell : cells) {
      if(cell.isAt(x, y)) {
        return cell.isAlive();
      }
    }
    return false;
  }

  void add(Cell cell) {
    cells.add(cell);
  }
}
