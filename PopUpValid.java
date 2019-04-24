import javax.swing.ImageIcon;

import javax.swing.JOptionPane;


public class PopUpValid {

	public PopUpValid (int x,String s) {      

		JOptionPane jop1, jop2, jop3;      
		ImageIcon img = new ImageIcon("images/infos.png");
		if(x==1){
			jop1 = new JOptionPane();



			jop1.showMessageDialog(null, s, "Information", JOptionPane.INFORMATION_MESSAGE, img);      
		}
		else if (x==2){
			jop2 = new JOptionPane();

			img = new ImageIcon("images/warning.png");

			jop2.showMessageDialog(null, s, "Attention", JOptionPane.WARNING_MESSAGE, img);      

		}
		else if (x==3){
			jop3 = new JOptionPane();

			img = new ImageIcon("images/croix.jpeg");

			jop3.showMessageDialog(null, s, "Erreur", JOptionPane.ERROR_MESSAGE, img);            

		}

	}

}