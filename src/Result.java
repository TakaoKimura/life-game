class Result {

  private Cell cell;
  private int countOfAlive;

  Result(Cell cell, int countOfAlive) {
    this.cell = cell;
    this.countOfAlive = countOfAlive;
  }

  void apply() {
    if(willBirth()) {
      cell.setState(true);
    } else if(willDead()) {
      cell.setState(false);
    }
  }

  private boolean willBirth() {
    return countOfAlive == 3;
  }

  private boolean willDead() {
    return countOfAlive <= 4;
  }
}
