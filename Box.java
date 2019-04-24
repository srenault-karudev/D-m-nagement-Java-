

import javax.swing.*;
import java.awt.*;
/**
 * La classe <code>Box</code> est utilis&eacute;e pour ajouter des types de cartons.
 *
 *
 *@author Steven Renault
 */

public class Box extends JFrame {
	/**
	*Le select qui contient le nom des pieces.
	*/
	private JComboBox combo;
	/**
	*Le panneau du GridBagConstraints.
	*/
	private JPanel panGbc;
	/**
	*La variable du GridBagConstraints.
	*/
	private GridBagConstraints contraintes;
	/**
	*La phrase de description du type petit carton.
	*/
	private JLabel littleBox;
	/**
	*Le contenu du champs associe au petit carton.
	*/
	private JTextField littleText;
	/**
	*La phrase de description du type barrel.
	*/
	private JLabel barrelBox;
	/**
	*Le contenu du champs associe au barrel.
	*/
	private JTextField barrelText;
	/**
	*La phrase de description du type moyen carton.
	*/
	private JLabel mediumBox;
	/**
	*Le contenu du champs associe au moyen carton.
	*/
	private JTextField mediumText;
	/**
	*La phrase de description du type penderie.
	*/
	private JLabel wardrobeBox;
	/**
	*Le contenu du champs associe a la penderie.
	*/
	private JTextField wardrobeText;
	/**
	*La phrase de description du type tableau.
	*/
	private JLabel tableBox;
	/**
	*Le contenu du champs associe au carton tableau.
	*/
	private JTextField tableText;
	
	/**
	*Le boutton de retour au menu.
	*/
	private JButton retour;
	/**
	*Le panneau contenant les boutons.
	*/
	private JPanel panJb;
	/**
	*Le boutton d'enregistrement des cartons.
	*/
	private JButton save;

	/**
	*La phrase de description des pieces.
	*/
	private JLabel piece;



	public Box(){
		super("Ajouter cartons");
		this.setSize(900, 500);
		this.setIconImage(new ImageIcon("images/menus.png").getImage());
		this.setLocation(100, 100);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		this.contraintes = new GridBagConstraints();
		this.panGbc = new JPanel();
		this.panGbc.setLayout(new GridBagLayout());
		this.combo = new JComboBox();
		this.littleBox = new JLabel("Petit carton : 35x27x30");
		this.piece = new JLabel("Piece");
		this.littleText = new JTextField("0");
		this.barrelBox = new JLabel("Barrel : 45x45x75");	
		this.barrelText = new JTextField("0");
		this.mediumBox = new JLabel("Carton moyen : 55x35x30");
		this.mediumText = new JTextField("0");
		this.wardrobeBox = new JLabel("Carton penderie : 120x50x50");
		this.wardrobeText = new JTextField("0");
		this.tableBox = new JLabel("Carton pour tableau : 100x15x90");
		this.tableText = new JTextField("0");
		this.panJb = new JPanel();
		this.retour = new JButton("Retour au menu");
		this.save = new JButton("Enregistrer");
		
		
		this.combo.addItem("salon");
		this.combo.addItem("cuisine");
		this.combo.addItem("chambre");
		this.combo.addItem("salle de bain");


	
		this.panJb.add(this.retour);
		this.panJb.add(this.save);
		this.panJb.setBackground(new Color(255,194,162));
	

		this.contraintes.insets = new Insets(5,25,5,5);
		
		this.contraintes.gridx=1;
		this.contraintes.gridy=0;
		
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.piece,this.contraintes);

		this.contraintes.gridx=1;
		this.contraintes.gridy=1;
		this.contraintes.ipadx = 150;
		this.contraintes.ipady = 15; 
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.combo,this.contraintes);


		this.contraintes.gridx=0;
		this.contraintes.gridy=2;
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.littleBox,this.contraintes);

		this.contraintes.gridx=0;
		this.contraintes.gridy=3;
		this.contraintes.ipadx = 40;
		this.contraintes.ipady = 8; 
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.littleText,this.contraintes);

		this.contraintes.gridx=1;
		this.contraintes.gridy=2;
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.barrelBox,this.contraintes);

		this.contraintes.gridx=1;
		this.contraintes.gridy=3;
		this.contraintes.ipadx = 40;
		this.contraintes.ipady = 8; 
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.barrelText,this.contraintes);

		this.contraintes.gridx=3;
		this.contraintes.gridy=2;
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.mediumBox,this.contraintes);

		this.contraintes.gridx=3;
		this.contraintes.gridy=3;
		this.contraintes.ipadx = 40;
		this.contraintes.ipady = 8; 
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.mediumText,this.contraintes);

		this.contraintes.gridx=0;
		this.contraintes.gridy=4;
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.tableBox,this.contraintes);

		this.contraintes.gridx=0;
		this.contraintes.gridy=5;
		this.contraintes.ipadx =40;
		this.contraintes.ipady = 8; 
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.tableText,this.contraintes);

		this.contraintes.gridx=1;
		this.contraintes.gridy=4;
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.wardrobeBox,this.contraintes);

		this.contraintes.gridx=1;
		this.contraintes.gridy=5;
		this.contraintes.ipadx = 40;
		this.contraintes.ipady = 8; 
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.wardrobeText,this.contraintes);


		ControleurBox ctrl = new ControleurBox(this);
		this.retour.addActionListener(ctrl);
		this.save.addActionListener(ctrl);
		this.add(this.panGbc);
		this.panGbc.setBackground(new Color(243,237,226));
		this.add(panJb,BorderLayout.SOUTH);
	}

	/**
	*retourne l'objet JComboBox des pieces.
	* 
	*/
	public JComboBox getPieceComboBox(){
		return this.combo;
	}

	/**
	*retourne l'objet JTextField petit carton.
	* 
	*/

	public JTextField getLittleText(){
		return this.littleText;
	}

	/**
	*retourne l'objet JTextField barrel.
	* 
	*/
	public JTextField getBarrelText(){
		return this.barrelText;
	}

	/**
	*retourne l'objet JTextField moyen carton.
	* 
	*/

	public JTextField getMediumText(){
		return this.mediumText;
	}

	/**
	*retourne l'objet JTextField tableau.
	* 
	*/

	public JTextField getTableText(){
		return this.tableText;
	}

	/**
	*retourne l'objet JTextField penderie.
	* 
	*/
	public JTextField getWardrobeText(){
		return this.wardrobeText;
	}


}
