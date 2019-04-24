import javax.swing.JOptionPane;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class PopUpConfirmBox {
  private Menu menu ;
  private Box box;
  public PopUpConfirmBox(String s,Box b) {
    this.box=b;
    JDialog.setDefaultLookAndFeelDecorated(true);
    int response = JOptionPane.showConfirmDialog(null, s, "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    if (response == JOptionPane.NO_OPTION) {
       this.box.dispose();
       Onglet onlget = new Onglet();
        onlget.setVisible(true);
    } else if (response == JOptionPane.YES_OPTION) {
  
    } else if (response == JOptionPane.CLOSED_OPTION) {
    
    }
  }
}