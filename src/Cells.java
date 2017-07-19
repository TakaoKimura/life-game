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

  void update() {
    changeCell(1, 1, true);
    changeCell(2, 2, true);
    //for(Cell target : cells) {
    //  Cell cell = findCell();
    //}
  }

  //private Cell findCell(int x, int y) {
  //  Cell cell = at(x, y);
  //  if(cell != null) {
  //    return NotExistCell();
  //  }
  //  return cell;
  //}

  void changeCell(int x, int y, boolean state) {
    for(Cell cell : cells) {
      if(cell.isAt(x, y)) {
        cell.setState(state);
        return;
      }
    }
  }
}
