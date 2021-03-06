class Cell {

  private int x;
  private int y;
  private boolean state;

  Cell(int x, int y, boolean state) {
    this.x = x;
    this.y = y;
    this.state = state;
  }

  void setState(boolean state) {
    this.state = state;
  }

  int getX() {
    return x;
  }

  int getY() {
    return y;
  }

  boolean isAt(int x, int y) {
    return this.x == x && this.y == y;
  }

  boolean isAlive() {
    return state;
  }
}
