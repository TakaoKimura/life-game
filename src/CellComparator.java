class CellComparator {

  private Cells cells;

  CellComparator(Cells cells) {
    this.cells = cells;
  }

  Result compare(Cell target) {
    int countOfAlive = 0;
    for(int x = -1; x < 2; x++) {
      for(int y = -1; y < 2; y++) {
        Cell cell = findCell(target.getX() + x, target.getY() + y);
        if(cell != target && cell.isAlive()) {
          countOfAlive++;
        }
      }
    }
    return new Result(target, countOfAlive);
  }

  private Cell findCell(int x, int y) {
    Cell cell = cells.at(x, y);
    if(cell == null) {
      return nullCell();
    }
    return cell;
  }

  private Cell nullCell() {
    return new Cell(0, 0, false);
  }
}
