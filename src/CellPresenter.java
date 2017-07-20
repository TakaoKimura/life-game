import java.awt.Graphics;
import java.awt.Color;

class CellPresenter {

  private Cell cell;

  CellPresenter(Cell cell) {
    this.cell = cell;
  }

  void present(Graphics g) {
    if(cell.isAlive()) {
      g.setColor(Color.BLACK);
    } else {
      g.setColor(Color.RED);
    }
    g.fillRect(100 + (cell.getX() * 10), 100 + (cell.getY() * 10), 10, 10);
  }
}
