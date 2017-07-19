import java.util.List;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Cells cells = CellCreater.create(3, 3);
    cells.at(1, 1).setState(true);
    cells.at(2, 1).setState(true);
    cells.at(3, 2).setState(true);
    cells.at(2, 3).setState(true);

    List<CellPresenter> presenters = new ArrayList<CellPresenter>();

    for(Cell cell : cells.all()) {
      presenters.add(new CellPresenter(cell));
    }
    LifeGameFrame frame = new LifeGameFrame(presenters);
    frame.setVisible(true);
    while(true) {
      frame.repaint();
      cells.update();
      try{
        Thread.sleep(1000);
      } catch (InterruptedException e){}
    }
  }
}
