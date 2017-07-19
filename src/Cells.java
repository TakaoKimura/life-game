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
    List<Result> results = new ArrayList<Result>();
    CellComparator comparator = new CellComparator(this);
    for(Cell target : cells) {
      results.add(comparator.compare(target));
    }
    for(Result result : results) {
      result.apply();
    }
  }

  void changeCell(int x, int y, boolean state) {
    for(Cell cell : cells) {
      if(cell.isAt(x, y)) {
        cell.setState(state);
        return;
      }
    }
  }
}
