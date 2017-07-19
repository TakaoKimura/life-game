class Cell {

  private int x;
  private int y;
  private boolean state;

  Cell(int x, int y, boolean state) {
    this.x = x;
    this.y = y;
    this.state = state;
  }

  boolean getState() {
    return state;
  }

  boolean isAt(int x, int y) {
    return true;
    //return this.x == x && this.y == y;
  }

  boolean isAlive() {
    return state;
  }
}
