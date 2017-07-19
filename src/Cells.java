import java.util.List;
import java.util.ArrayList;

class Cells {

  private List<Cell> cells = new ArrayList<Cell>();

  Cell at(int x, int y) {
    for(Cell cell : cells) {
      if(cell.isAt(x, y)) {
        return cell;
      }
    }
    return null;
  }

  void add(Cell cell) {
    cells.add(cell);
  }
}
