import javax.swing.*;
import java.awt.*;


public class Menu  extends JFrame {
      private GridBagConstraints contraintes;
      private JPanel pan;
      private JButton start;
      

 
public Menu(){
        super("Accueil");
		this.setSize(900, 500);
		this.setLocation(100, 100);
		this.setResizable(false);
		this.setIconImage(new ImageIcon("images/menus.png").getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.start = new JButton("Préparer son déménagement");
		this.pan = new JPanel();
		this.pan.add(start);
		ControleurMenu ctrl = new ControleurMenu(this);
		this.start.addActionListener(ctrl);
		DecorMenu decor = new DecorMenu();
		this.pan.setBackground(new Color(255,194,162));
		this.add(pan,BorderLayout.SOUTH);
		this.add(decor);
		
		
		
	

	}
   
}
