import javax.swing.*;
import java.awt.*;


public class Meuble  extends JFrame {
    private JButton addJb;
    private JButton editJb;
    private JButton secondEditJb;
    private JButton deleteJb;
    private JPanel panJb;
    private JPanel panP;
    private JLabel title;
    private GridBagConstraints contraintes;
    private JPanel panGbc;
    private Boolean editMeuble;
    private JLabel  numberMeuble;
    private JTextField meubleText;
    private JButton retour;
    private Boolean deleteMeuble;
    private JButton secondDeleteJb;
    private JTable tableau;
    private JLabel name;
    private JLabel id;
    private JLabel piece;
    private JLabel volume;
    private JLabel description;
    private JLabel number;
    private JLabel detachable;
    private JLabel numberDetachable;
    private JLabel picture;
    private JPanel pan;
    private Boolean secondEditMeuble;
    private Boolean secondDeleteMeuble;
    private String[] entetes;
    private JPanel panTable;
    private JTable array;
    private JButton retourMenu;
    




 
    public Meuble(){
     super("Gestion des meubles");
	this.setSize(900, 500);
	this.setIconImage(new ImageIcon("images/menus.png").getImage());
	this.setLocation(100, 100);
	this.setResizable(false);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	this.retourMenu = new JButton("Retour menu");
	this.addJb = new JButton("Ajouter meuble");
	this.editJb = new JButton("Modifier meuble");
	this.secondEditJb = new JButton("Modifier");
	this.secondDeleteJb = new JButton("Supprimer");
	this.deleteJb = new JButton("Supprimer meuble");
	this.panJb = new JPanel();
	this.title = new JLabel("G");
	this.title.setForeground(new Color(232,232,231));
	this.numberMeuble = new JLabel("Numero de meuble :");
	this.meubleText = new JTextField(10);
	this.retour = new JButton("Retour");
	this.name = new JLabel("Nom");
	this.id = new JLabel("Numero");
	this.piece = new JLabel("Piece");
	this.volume = new JLabel("Volume");
	this.description = new JLabel("Description");
	this.number = new JLabel("Nombre de meuble");
	this.detachable = new JLabel("Piece détaché");
	this.numberDetachable = new JLabel("Nombre de piece detachable");
	this.picture = new JLabel("Photo");
	this.pan = new JPanel();
	this.panTable = new JPanel();
   	
   
	this.editMeuble = false;
    this.secondEditMeuble = false;
	this.secondDeleteMeuble = false;
	this.deleteMeuble = false;

	this.panJb.add(this.retourMenu);
	this.panJb.add(this.addJb);
	this.panJb.add(this.editJb);
	this.panJb.add(this.deleteJb);
		this.panJb.setBackground(new Color(255,194,162));
	this.pan.add(this.title);


	this.entetes = new String[]{"numero", "nom","volumeAV","quantité","piece","demontable","element","volumeAp","description"};
	this.array = new JTable(ListMeuble.donnees, entetes);


    this.add(this.pan,BorderLayout.NORTH);
    this.pan.setBackground(new Color(243,237,226));
	this.panTable.add(array.getTableHeader(), BorderLayout.NORTH);
    this.panTable.add(array, BorderLayout.CENTER);
    this.add(panTable,BorderLayout.CENTER);
    this.add(this.panJb,BorderLayout.SOUTH);
    this.panTable.setBackground(new Color(243,237,226));
   
    ControleurMeuble ctrl = new ControleurMeuble(this);
	this.addJb.addActionListener(ctrl);
	this.editJb.addActionListener(ctrl);
	this.retour.addActionListener(ctrl);
	this.deleteJb.addActionListener(ctrl);
	this.secondEditJb.addActionListener(ctrl);
	this.secondDeleteJb.addActionListener(ctrl);
	this.retourMenu.addActionListener(ctrl);


    }

    public JPanel getArrayPanel(){
    	return this.panTable;
    }

    public void setEdit(boolean x){
	this.editMeuble = x;

    }

    public void setDelete(boolean x){
	this.deleteMeuble = x;
    }

    
    public void setSecondDelete(boolean x){
	this.secondDeleteMeuble = x;
    }

      public void setSecondEdit(boolean x){
	this.secondEditMeuble = x;
    }


    public void onlyEdit(){
		
	this.panJb.add(this.numberMeuble);
	this.panJb.add(this.meubleText);
	this.panJb.remove(this.addJb);
	this.panJb.remove(this.retourMenu);
	this.panJb.remove(this.deleteJb);
	this.panJb.remove(this.editJb);
	this.panJb.add(this.secondEditJb);
	this.panJb.add(this.retour);
	revalidate();
	repaint();	
    }

    public void onlyDelete(){
		
	this.panJb.add(this.numberMeuble);
	this.panJb.add(this.meubleText);
	this.panJb.remove(this.addJb);
	this.panJb.remove(this.retourMenu);
	this.panJb.remove(this.deleteJb);
	this.panJb.remove(this.editJb);
	this.panJb.add(this.secondDeleteJb);
	this.panJb.add(this.retour);
	revalidate();
	repaint();	
    }

    public boolean getEditMeuble(){
	return this.editMeuble;
    }

      public boolean getSecondEdit(){
	return this.secondEditMeuble;
    }

        public boolean getSecondDelete(){
	return this.secondDeleteMeuble;
    }

    public boolean getDeleteMeuble(){
	return this.deleteMeuble;
    }
    public JTextField getMeubleText(){
    	return this.meubleText;
    }
    public JTable getArray(){
	return this.array;
}
   
}
