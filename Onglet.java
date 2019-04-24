import javax.swing.*;
import java.awt.*;


public class Onglet  extends JFrame {
      private GridBagConstraints contraintes;
      private JPanel pan;
      private JButton start;
      private JLabel title;
      private JPanel panGbc;
      private JButton gdm;
      private JButton addBox;
      private JButton addService;

 
public Onglet(){
        super("Menu");
		this.setSize(900, 500);
		this.setIconImage(new ImageIcon("images/menus.png").getImage());
		this.setLocation(100, 100);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		this.gdm = new JButton("Gestion des meubles");
		this.addBox = new JButton("Ajouter Cartons");
		this.addService = new JButton("Ajouter services");
		this.panGbc = new JPanel();

		this.contraintes = new GridBagConstraints();
		this.panGbc.setLayout(new GridBagLayout());
		this.contraintes.insets = new Insets(60,0,0,0);


		this.contraintes.gridx=0;
		this.contraintes.gridy=0;
		this.contraintes.ipadx = 85;
		this.contraintes.ipady = 45; 
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.gdm,this.contraintes);


		this.contraintes.gridx=0;
		this.contraintes.gridy=1;
		this.contraintes.ipadx = 85;
		this.contraintes.ipady = 45; 
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.addBox,this.contraintes);

		this.contraintes.gridx=0;
		this.contraintes.gridy=2;
		this.contraintes.ipadx = 85;
		this.contraintes.ipady = 45; 
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.addService,this.contraintes);
		

		ControleurOnglet ctrl = new ControleurOnglet(this);
		this.gdm.addActionListener(ctrl);
		this.addService.addActionListener(ctrl);
		this.addBox.addActionListener(ctrl);

		this.add(panGbc,BorderLayout.CENTER);
		this.panGbc.setBackground(new Color(255,194,162));

		
		
		
	

	}
   
}
