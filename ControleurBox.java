
/**
 * La classe <code>ControleurBox</code> permet de controler les actions sur la fenetre Box.
 *
 *
 *@author Steven Renault
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ControleurBox implements ActionListener{
	/**
	*la variable permet de prendre la fenetre box
	*/
	private Box box;

	/**
	*Constructeur de la classe ControleurBox
	* 
	*@param b 
	*	on recupere la fenetre box		 			
	*/
	public ControleurBox(Box b){
		this.box=b;
	}
	
	/**
	*il va permettre d'&eacute;cuter la requete du bouton appuy&eacute;
	*/
	public void actionPerformed(ActionEvent e){
		String nomButton=e.getActionCommand();


		if(nomButton.equals("Retour au menu")){
			box.dispose();
			Onglet onglet= new Onglet();
			onglet.setVisible(true); 
		}
		else if(nomButton.equals("Enregistrer")){


			CartonBd app = new CartonBd();

			String piece = (String)this.box.getPieceComboBox().getSelectedItem();
			int qtte_little = 0;
			int qtte_barrel = 0;
			int qtte_medium = 0;
			int qtte_table = 0;
			int qtte_penderie = 0;

			
			try{
				qtte_little = Integer.parseInt(this.box.getLittleText().getText());
				qtte_barrel = Integer.parseInt(this.box.getBarrelText().getText());
				qtte_medium = Integer.parseInt(this.box.getMediumText().getText());
				qtte_table = Integer.parseInt(this.box.getTableText().getText());
				qtte_penderie = Integer.parseInt(this.box.getWardrobeText().getText());
			}
			catch(NumberFormatException exception){;}

			String qtte_littleString = this.box.getLittleText().getText();
			String qtte_barrelString= this.box.getBarrelText().getText();
			String qtte_mediumString=this.box.getMediumText().getText();
			String qtte_tableString= this.box.getTableText().getText();
			String qtte_penderieString= this.box.getWardrobeText().getText();
			
			if(!qtte_littleString.equals("")){
				String type ="petit";
				app.insert(type,qtte_little,piece);
				
			}
			

			if(!qtte_barrelString.equals("")){
				String type ="barrel";
				app.insert(type,qtte_barrel,piece);
			
			}
			

			if(!qtte_mediumString.equals("")){
				String type ="moyen";
				app.insert(type,qtte_medium,piece);
				
			}
			
			
			if(!qtte_tableString.equals("")){
				String type ="tableau";
				app.insert(type,qtte_table,piece);
			
			}
			

			if(!qtte_penderieString.equals("")){
				String type ="penderie";
				app.insert(type,qtte_penderie,piece);
			}
			
			new PopUpConfirmBox("Insertion carton reussie, souhaitez-vous ajouter d'autres cartons ?",this.box);

		}
	}
}