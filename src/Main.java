import java.util.List;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Cells cells = CellCreater.create(3, 3);
    cells.at(1, 1).setState(true);
    cells.at(2, 1).setState(true);
    cells.at(3, 2).setState(true);
    cells.at(2, 3).setState(true);

    LifeGameFrame frame = new LifeGameFrame(cells);
    frame.setVisible(true);
    //while(true) {
    //  //frame.getGraphics().fillOval(100, 100, 100, 100);
    //  frame.repaint();
    //  cells.update();
    //  //try{
    //  //  Thread.sleep(10000);
    //  //} catch (InterruptedException e){}
    //}
  }
}
