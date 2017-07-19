public class Main {

  public static void main(String[] args) {
    LifeGame game = new LifeGame(3, 3);
    game.changeCell(1, 1, true);
    game.changeCell(2, 1, true);
    game.changeCell(3, 2, true);
    game.changeCell(2, 3, true);
    game.next();
    game.next();
    game.next();
    printCell(game.cells());
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
