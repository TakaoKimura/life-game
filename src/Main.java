public class Main {

  public static void main(String[] args) {
    Cells cells = CellCreater.create(3, 3);
    cells.at(1, 1).setState(true);
    cells.at(2, 1).setState(true);
    cells.at(3, 2).setState(true);
    cells.at(2, 3).setState(true);
    cells.update();
    cells.update();
    printCell(cells);
  }

  private static void printCell(Cells cells) {
    for(int y = 1; y <= 3; y++) {
      for(int x = 1; x <= 3; x++) {
        Cell cell = cells.at(x, y);
        if(cell.isAlive()) {
          System.out.print('#');
        } else {
          System.out.print('*');
        }
      }
      System.out.print('\n');
    }
  }
}
