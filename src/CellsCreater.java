class CellsCreater {

  public static Cells create(int width, int height) {
    Cells cells = new Cells();
    for(int x = 1; x <= width; x++) {
      for(int y = 1; y <= height; y++) {
        cells.add(new Cell(x, y, false));
      }
    }
    return cells;
  }
}
