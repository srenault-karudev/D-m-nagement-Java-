import javax.swing.JOptionPane;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class PopUpConfirm {
  private Menu menu ;
  private Service service;
  public PopUpConfirm(String s,Service serv) {
    this.service=serv;
    JDialog.setDefaultLookAndFeelDecorated(true);
    int response = JOptionPane.showConfirmDialog(null, s, "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    if (response == JOptionPane.NO_OPTION) {
       this.service.dispose();
       Onglet onlget = new Onglet();
        onlget.setVisible(true);
    } else if (response == JOptionPane.YES_OPTION) {
  
    } else if (response == JOptionPane.CLOSED_OPTION) {
    
    }
  }
}