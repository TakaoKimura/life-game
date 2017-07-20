import java.util.List;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.JFrame;

class LifeGameFrame extends JFrame implements ActionListener {

  private List<CellPresenter> presenters = new ArrayList<CellPresenter>();
  private Cells cells;
  private boolean canSimulate = false;

  LifeGameFrame(Cells cells) {
    this.cells = cells;
    for(Cell cell : this.cells.all()) {
      presenters.add(new CellPresenter(cell));
    }
    setBounds(0, 0, 1000, 1000);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.presenters = presenters;
    Button button = new Button("simulation");
    button.addActionListener(this);
    getContentPane().add(button, BorderLayout.SOUTH);
  }

  @Override
  public void paint(Graphics g) {
    if(canSimulate) {
      Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
      g.clearRect(0, 0, (int) dimension.getWidth(), (int) dimension.getHeight());
      for(CellPresenter cell : presenters) {
        cell.present(g);
      }
    }
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    canSimulate = true;
    Thread t = new Thread() {
      @Override
      public void run() {
        while(true) {
          paint(getGraphics());
          try{
            Thread.sleep(1000);
          } catch (InterruptedException e){}
          cells.update();
        }
      }
    };
    t.run();
  }
}
