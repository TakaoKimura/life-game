import java.util.List;
import java.util.ArrayList;
import java.awt.Graphics;
import javax.swing.JFrame;

class LifeGameFrame extends JFrame {

  private List<CellPresenter> cellPresenters = new ArrayList<CellPresenter>();

  LifeGameFrame(List<CellPresenter> cellPresenters) {
    setBounds(0, 0, 1000, 1000);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.cellPresenters = cellPresenters;
  }

  public void print(Graphics g) {
    for(CellPresenter cell : cellPresenters) {
      cell.present(g);
    }
  }
}
