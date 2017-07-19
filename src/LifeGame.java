
class LifeGame {

  private Cells cells = new Cells();

  LifeGame(int width, int hight) {
    for(int x = 1; x <= width; x++) {
      for(int y = 1; y <= hight; y++) {
        cells.add(new Cell(x, y, false));
      }
    }
  }

  void changeCell(int x, int y, boolean state) {
    //cells.chageCell(x, y, state);
  }

  void next() {
  }

  Cells cells() {
    return cells;
  }
}
