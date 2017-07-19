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
    for(Cell target : cells) {
      int countOfAlive = 0;
      Cell cell = findCell(target.getX() - 1, target.getY() - 1);
      if(cell.isAlive()) {
        countOfAlive++;
      }
      cell = findCell(target.getX(), target.getY() - 1);
      if(cell.isAlive()) {
        countOfAlive++;
      }
      cell = findCell(target.getX() + 1, target.getY() - 1);
      if(cell.isAlive()) {
        countOfAlive++;
      }

      cell = findCell(target.getX() - 1, target.getY());
      if(cell.isAlive()) {
        countOfAlive++;
      }
      cell = findCell(target.getX() + 1, target.getY());
      if(cell.isAlive()) {
        countOfAlive++;
      }

      cell = findCell(target.getX() - 1, target.getY() + 1);
      if(cell.isAlive()) {
        countOfAlive++;
      }
      cell = findCell(target.getX(), target.getY() + 1);
      if(cell.isAlive()) {
        countOfAlive++;
      }
      cell = findCell(target.getX() + 1, target.getY() + 1);
      if(cell.isAlive()) {
        countOfAlive++;
      }

      results.add(new Result(target, countOfAlive));
    }

    for(Result result : results) {
      if(result.countOfAlive == 3) {
        result.target.setState(true);
      } else if(result.countOfAlive == 4) {
        result.target.setState(false);
      }
    }
  }

  private Cell findCell(int x, int y) {
    Cell cell = at(x, y);
    if(cell == null) {
      return nullCell();
    }
    return cell;
  }

  private Cell nullCell() {
    return new Cell(0, 0, false);
  }

  void changeCell(int x, int y, boolean state) {
    for(Cell cell : cells) {
      if(cell.isAt(x, y)) {
        cell.setState(state);
        return;
      }
    }
  }

  private class Result {

    Cell target;
    int countOfAlive;

    Result(Cell target, int countOfAlive) {
      this.target = target;
      this.countOfAlive = countOfAlive;
    }
  }
}
