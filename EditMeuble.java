import javax.swing.*;
import java.awt.*;


public class EditMeuble extends JFrame {

	private GridBagConstraints contraintes;
	private JPanel panGbc;
	private JLabel nameLabel;
	private JTextField nameText;
	private JLabel pieceLabel;
	private JTextField pieceText;
	private JLabel numberLabel;
	private JTextField numberText;
	private JLabel volumeLabel;
	private JTextField volumeText;
	private JLabel descriptionLabel;
	private JTextField descriptionText;
	private JCheckBox removableBox;
	private JLabel removableLabel;
	private JCheckBox noRemovableBox;
	private JTextField detachableText;
	private JLabel detachableLabel;
	private JPanel panT;
	private JButton enregistrer;
	private JButton retour;
	private JButton picture;
	private JLabel pictureLabel;
	private JComboBox combo;
	private boolean checked;
	private JButton addBox;
	private JLabel tittle;
	private JPanel tittlePan;
	private Boolean mode;
	private JLabel panPicture;
	private Icon photo;
	private String img;
	private JLabel volumeAfterLabel;
	private JTextField volumeAfterText;
	private String idMeuble;

	public String getIdMeuble(){
		return this.idMeuble;
	}

	public EditMeuble(Object[] meubleValues,boolean b){


		super("Modification du Meuble "+ meubleValues[1]);
		this.setSize(900, 500);
		this.setIconImage(new ImageIcon("images/menus.png").getImage());
		this.setLocation(100, 100);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.idMeuble = meubleValues[1].toString();
		this.panGbc = new JPanel();
		this.panT = new JPanel();
		this.nameText = new JTextField(meubleValues[2].toString());
		this.nameLabel = new JLabel("Nom *");
	
		this.pieceLabel = new JLabel("Piece *");
		this.numberText = new JTextField(meubleValues[4].toString());
		this.numberLabel = new JLabel("Quantité");
		this.volumeText = new JTextField(meubleValues[3].toString());
		this.volumeLabel = new JLabel("Volume (avant démontage)");
		this.descriptionText = new JTextField(meubleValues[9].toString());
		this.descriptionLabel = new JLabel("Description *");
		this.removableBox = new  JCheckBox("oui");
		this.noRemovableBox = new  JCheckBox("non");
		this.removableLabel = new JLabel("Démontable");
		this.detachableText = new JTextField(meubleValues[7].toString());
		this.detachableLabel = new JLabel("Nombre d'élements");
		this.enregistrer = new JButton("Enregistrer");
		this.retour = new JButton("Retour");
		this.picture = new JButton("+");
		this.pictureLabel = new JLabel("Photo");
		this.combo = new JComboBox();
		this.addBox = new JButton("Ajouter des cartons");
		this.panPicture = new JLabel();
		this.volumeAfterText = new JTextField(meubleValues[8].toString());
		this.volumeAfterLabel = new JLabel("Volume (après démontage)");
		this.checked = b;


		

		this.getDetachedLabel().setVisible(false);
		this.getDetachableTextArea().setVisible(false);
		this.getVolumeAfterLabel().setVisible(false);
		this.getVolumeAfterTexT().setVisible(false);
		this.getAddBox().setVisible(false);

		this.tittle = new JLabel("Modification du Meuble " + meubleValues[1]);

		int  i = (int)(Math.random() * 5);
		this.img = "images/image_0"+i+".jpg";
		this.photo = new ImageIcon(this.img);
		this.panPicture.setIcon(photo);

		this.tittle.setForeground(new Color(1,118,171));
		this.tittle.setFont(new Font("Comics sans Ms",Font.BOLD,20));
		this.tittlePan = new JPanel();

		
		this.combo.addItem("salon");
		this.combo.addItem("cuisine");
		this.combo.addItem("chambre");
		this.combo.addItem("salle de bain");

		this.contraintes = new GridBagConstraints();
		this.panGbc.setLayout(new GridBagLayout());
		this.contraintes.insets = new Insets(5,25,5,5);
		this.panT.add(this.retour);
		this.panT.add(this.enregistrer);
		this.panT.add(this.addBox);
		this.tittlePan.add(this.tittle);
		this.panT.setBackground(new Color(255,194,162));
		
		this.contraintes.gridx=1;
		this.contraintes.gridy=0;
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.nameLabel,this.contraintes);

		this.contraintes.gridx=2;
		this.contraintes.gridy=0;
		this.contraintes.ipadx = 85;
		this.contraintes.ipady = 4; 
		this.contraintes.fill=GridBagConstraints.NONE;
		this.panGbc.add(this.nameText,this.contraintes);

		this.contraintes.gridx=3;
		this.contraintes.gridy=0;
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.pieceLabel,this.contraintes);

		this.contraintes.gridx=4;
		this.contraintes.gridy=0;
		this.contraintes.ipadx = 50;
		this.contraintes.ipady = 4; 
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.combo,this.contraintes);

		this.contraintes.gridx=3;
		this.contraintes.gridy=3;
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.removableLabel,this.contraintes);

		this.contraintes.gridx=4;
		this.contraintes.gridy=3;
		this.contraintes.ipadx = 85;
		this.contraintes.ipady = 4; 
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.removableBox,this.contraintes);

		this.contraintes.gridx=1;
		this.contraintes.gridy=1;
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.volumeLabel,this.contraintes);

		this.contraintes.gridx=2;
		this.contraintes.gridy=1;
		this.contraintes.ipadx = 85;
		this.contraintes.ipady = 4; 
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.volumeText,this.contraintes);

		this.contraintes.gridx=3;
		this.contraintes.gridy=1;
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.descriptionLabel,this.contraintes);

		this.contraintes.gridx=4;
		this.contraintes.gridy=1;
		this.contraintes.ipadx = 85;
		this.contraintes.ipady = 4; 
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.descriptionText,this.contraintes);

		this.contraintes.gridx=1;
		this.contraintes.gridy=3;
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.numberLabel,this.contraintes);

		this.contraintes.gridx=2;
		this.contraintes.gridy=3;
		this.contraintes.ipadx = 85;
		this.contraintes.ipady = 3; 
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.numberText,this.contraintes);

		this.contraintes.gridx=1;
		this.contraintes.gridy=4;
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.detachableLabel,this.contraintes);

		this.contraintes.gridx=2;
		this.contraintes.gridy=4;
		this.contraintes.ipadx = 85;
		this.contraintes.ipady = 4; 
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.detachableText,this.contraintes);

		this.contraintes.gridx=1;
		this.contraintes.gridy=5;
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.volumeAfterLabel,this.contraintes);

		this.contraintes.gridx=2;
		this.contraintes.gridy=5;
		this.contraintes.ipadx = 85;
		this.contraintes.ipady = 4; 
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.volumeAfterText,this.contraintes);

		this.contraintes.gridx=3;
		this.contraintes.gridy=7;
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.pictureLabel,this.contraintes);

		this.contraintes.gridx=4;
		this.contraintes.gridy=7;
		this.contraintes.ipadx = 80;
		this.contraintes.ipady = 80; 
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.panGbc.add(this.panPicture,this.contraintes);

		ControleurEditMeuble ctrl  = new ControleurEditMeuble(this);
		this.retour.addActionListener(ctrl);

		this.enregistrer.addActionListener(ctrl);

		ControleurEditMeubleCheckbox ctrl_2 = new ControleurEditMeubleCheckbox(this);
		this.removableBox.addItemListener(ctrl_2);

		
		this.add(panGbc);
		this.add(panT,BorderLayout.SOUTH);

	}

	public String getName(){
		return this.nameText.getText();
	}

	public JTextField getNameText(){
		return this.nameText;
	}

	public String getVolume(){
		return this.volumeText.getText();
	}

	public String getDescription(){
		return this.descriptionText.getText();
	}

	public String getNumberText(){
		return this.numberText.getText();
	}

	public String getDetachableText(){
		return this.detachableText.getText();
	}

	public void setName(String s){
		this.nameText.setText(s);
	}

	public void setVolume(String s){
		this.volumeText.setText(s);
	}

	public void setDescription(String s){
		this.descriptionText.setText(s);
	}

	public void setNumberText(String s){
		this.numberText.setText(s);
	}

	public void setDetachableText(String s){
		this.detachableText.setText(s);
	}

	public JButton getAddBox(){
		return this.addBox;
	}


	public boolean getChecked(){
		return this.checked;
	}

	public  boolean isRemovableBox( boolean x ){
		this.checked = x;


		return this.checked;

	}

	public boolean getIsRemovableBox(){
		return this.checked;
	}


	public JLabel getDetachedLabel(){
		return this.detachableLabel;
	}

	public JTextField getDetachableTextArea(){
		return this.detachableText;
	}


	public JLabel getVolumeAfterLabel(){
		return this.volumeAfterLabel;
	}

	public JTextField getVolumeAfterTexT(){
		return this.volumeAfterText;
	}

	public JComboBox getPieceComboBox(){
		return this.combo;
	}


	public String getImg(){
		return this.img;
	}

	public boolean contenuChamps(String s){
		if(s.equals(" ")){
			return true;
		}
		else{
			return false;
		}
	}





}
