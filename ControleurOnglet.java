


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ControleurOnglet implements ActionListener{
	
	private Onglet onglet;
	private MeubleBd meubleBd;

	public ControleurOnglet(Onglet o){
		this.onglet=o;
		this.meubleBd = new MeubleBd();
		ListMeuble.donnees = this.meubleBd.getMeubles();
	}
	
	/**
	*il va permettre d'&eacute;cuter la requete du bouton appuy&eacute;
	*/
	public void actionPerformed(ActionEvent e){
		String nomButton=e.getActionCommand();


		if(nomButton.equals("Gestion des meubles")){
			onglet.dispose();
			Meuble meuble = new Meuble();
			meuble.setVisible(true); 
		}
		else if(nomButton.equals("Ajouter Cartons")){
				onglet.dispose();
				Box box = new Box();
				box.setVisible(true);
		}
		else if(nomButton.equals("Ajouter services")){
				onglet.dispose();
				Service service = new Service();
				service.setVisible(true);
		}
	}
}
