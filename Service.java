

import javax.swing.*;
import java.awt.*;
/**
 * La classe <code>Service</code> est  la fenetre des services
 *
 *@version 1
 *@author Steven Renault
 */

public class Service extends JFrame {
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
	* La description du Service eco
	*/
	private JLabel serviceEcoLabel;
	/**
	* La description du Service prenium
	*/
	private JLabel servicePreniumLabel;
	/**
	*Le Checkbox du service date...
	*/
	private JCheckBox dateCheck;
	/**
	*Le Checkbox du service groupage ...
	*/
	private JCheckBox groupCheck;
	/**
	*Le Checkbox du service desassemblage...
	*/
	private JCheckBox disassembeCheck;
	/**
	*Le Checkbox du service de l'ajout de plan ...
	*/
	private JCheckBox addPlanCheck;
	/**
	*Le Checkbox du service d'assemblge ...
	*/
	private JCheckBox assembleCheck;
	/**
	*Le Checkbox du service mise en carton
	*/
	private JCheckBox boxCheck;
	/**
	*Le Checkbox du service du nettoyage
	*/
	private JCheckBox cleanCheck;
	/**
	*Le Checkbox du service etat des lieux d'entree
	*/
	private JCheckBox productInCheck;
	/**
	*Le Checkbox du service etat des lieux de sortie
	*/
	private JCheckBox productOutCheck;
	/**
	* le boolean de la date flexible
	*/
	private Boolean flexibleDate;
	/**
	* le boolean du groupage
	*/
	private Boolean groupage;
	/**
	* le boolean du desassembage
	*/
	private Boolean disassemble;
	/**
	* le boolean de l'ajout plan
	*/
	private Boolean addPlan;
	/**
	* le boolean du demontage et remontage
	*/
	private Boolean allDisassemble;
	/**
	* le boolean de la mise en boite
	*/
	private Boolean cardboard;
	/**
	* le boolean  du nettoyage
	*/
	private Boolean cleaning;
	/**
	* le boolean de la realisation etat entree
	*/
	private Boolean inProduction;
	/**
	* le boolean de la realisation etat sortie
	*/
	private Boolean outProduction;






	public Service(){
		super("Ajouter services");
		this.setSize(900, 500);
		this.setLocation(100, 100);
		this.setResizable(false);
		this.setIconImage(new ImageIcon("images/menus.png").getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




		this.contraintes = new GridBagConstraints();
		this.panGbc = new JPanel();
		this.panGbc.setLayout(new GridBagLayout());
		this.contraintes.insets = new Insets(9,25,5,5);
		this.panJb = new JPanel();
		this.retour = new JButton("Retour au menu");
		this.save = new JButton("Enregistrer");
		this.serviceEcoLabel = new JLabel("Service Eco");
		this.serviceEcoLabel.setForeground(new Color(61,123,0));
		this.serviceEcoLabel.setFont(new Font("Comics sans Ms",Font.BOLD,15));
		this.servicePreniumLabel = new JLabel("Service Prenium");
		this.servicePreniumLabel.setForeground(new Color(175,139,27));
		this.servicePreniumLabel.setFont(new Font("Comics sans Ms",Font.BOLD,15));
		this.dateCheck = new JCheckBox("20€ : Des dates flexibles avec une plage de 1 ou 2 semaines plutot que 2 jours");
		this.groupCheck = new JCheckBox("40€ : Procéder par groupage");
		this.disassembeCheck = new JCheckBox("30€ : Démonter sois-même certains de ses meubles");
		
		
		this.addPlanCheck = new JCheckBox("50€ : Ajout d'un plan de la destination et disposition des meubles sur ce plan");
		this.assembleCheck = new JCheckBox("80€ : Démontage et remontage des meubles");
		this.boxCheck = new JCheckBox("80€ : Mise en carton dans certaines pièces");
		this.cleanCheck = new JCheckBox("70€ : Nettoyage du logement de départ, extinction et relevé des compteurs (gaz, électricité, eau)");
		this.productInCheck = new JCheckBox("60€ : Réalisation de l'état des lieux de sortie");
		this.productOutCheck = new JCheckBox("60€ : Réalisation de l'état des lieux d'entrée");
	


		this.flexibleDate = false;
		this.groupage =false;
		this.disassemble = false;
		this.addPlan =false;
		this.allDisassemble =false;
		this.cardboard =false;
		this.cleaning =false;
		this.inProduction=false;
		this.outProduction=false;

	
		this.panJb.add(this.retour);
		this.panJb.add(this.save);
		
		


		this.contraintes.gridx=0;
		this.contraintes.gridy=0;
		this.contraintes.fill=GridBagConstraints.NONE;
		this.panGbc.add(this.serviceEcoLabel,this.contraintes);

		this.contraintes.gridx=0;
		this.contraintes.gridy=1;
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.dateCheck,this.contraintes);

		this.contraintes.gridx=0;
		this.contraintes.gridy=2;
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.groupCheck,this.contraintes);

		this.contraintes.gridx=0;
		this.contraintes.gridy=3;
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.disassembeCheck,this.contraintes);

		this.contraintes.gridx=0;
		this.contraintes.gridy=4;
		this.contraintes.fill=GridBagConstraints.NONE;
		this.panGbc.add(this.servicePreniumLabel,this.contraintes);

		this.contraintes.gridx=0;
		this.contraintes.gridy=5;
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.addPlanCheck,this.contraintes);

		this.contraintes.gridx=0;
		this.contraintes.gridy=6;
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.assembleCheck,this.contraintes);

		this.contraintes.gridx=0;
		this.contraintes.gridy=7;
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.boxCheck,this.contraintes);

		this.contraintes.gridx=0;
		this.contraintes.gridy=8;
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.cleanCheck,this.contraintes);


		this.contraintes.gridx=0;
		this.contraintes.gridy=9;
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.productInCheck,this.contraintes);

		this.contraintes.gridx=0;
		this.contraintes.gridy=10;
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.productOutCheck,this.contraintes);

		ControleurService ctrl = new ControleurService(this);
		ControleurServiceCheckbox ctrl_2 = new ControleurServiceCheckbox(this);
		this.retour.addActionListener(ctrl);
		this.save.addActionListener(ctrl);
		this.dateCheck.addItemListener(ctrl_2);
		this.groupCheck.addItemListener(ctrl_2);
		this.disassembeCheck.addItemListener(ctrl_2);
		this.addPlanCheck.addItemListener(ctrl_2);
		this.assembleCheck.addItemListener(ctrl_2);
		this.boxCheck.addItemListener(ctrl_2);
		this.cleanCheck.addItemListener(ctrl_2);
		this.productInCheck.addItemListener(ctrl_2);
		this.productOutCheck.addItemListener(ctrl_2);

		this.add(this.panGbc);
		this.panGbc.setBackground(new Color(243,237,226));
		this.getContentPane().setBackground(Color.RED);
		this.add(panJb,BorderLayout.SOUTH);
		this.panJb.setBackground(new Color(255,194,162));

	}

	public  boolean isFlexibleDate( boolean x ){
		this.flexibleDate= x;
		return this.flexibleDate;
	}

	public  boolean isGroupage( boolean x ){
		this.groupage= x;
		return this.groupage;
	}


	public  boolean isDisassemble( boolean x ){
		this.disassemble= x;
		return this.disassemble;
	}

	public  boolean isAddPlan( boolean x ){
		this.addPlan= x;
		return this.addPlan;
	}

	public  boolean isAllDisassemble( boolean x ){
		this.allDisassemble= x;
		return this.allDisassemble;
	}

	public  boolean isCardboard( boolean x ){
		this.cardboard= x;
		return this.cardboard;
	}

	public  boolean isCleaning( boolean x ){
		this.cleaning= x;
		return this.cleaning;
	}

	public  boolean isInProduction( boolean x ){
		this.inProduction= x;
		return this.inProduction;
	}

	public  boolean isOutProduction( boolean x ){
		this.outProduction= x;
		return this.outProduction;
	}



	public boolean getIsFlexibleDate(){
		return this.flexibleDate;
	}


	public boolean getIsGroupage(){
		return this.groupage;
	}


	public boolean getIsDisassemble(){
		return this.disassemble;
	}

	public boolean getIsAddPlan(){
		return this.addPlan;
	}


	public boolean getIsAllDisassemble(){
		return this.allDisassemble;
	}

	public boolean getIsCardboard(){
		return this.cardboard;
	}

	public boolean getIsCleaning(){
		return this.cleaning;
	}

	public boolean getIsInProduction(){
		return this.inProduction;
	}

	public boolean getIsOutProduction(){
		return this.outProduction;
	}

}
