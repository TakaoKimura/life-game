class Cell {

  private int x;
  private int y;
  private boolean state = false;

  Cell(int x, int y) {
    this.x = x;
    this.y = y;
  }

  boolean isAt(int x, int y) {
    return this.x == x && this.y == y;
  }

  boolean isAlive() {
    return state;
  }
}
