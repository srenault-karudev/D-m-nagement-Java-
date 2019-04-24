

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ControleurService implements ActionListener{
	/**
	*la variable permet de prendre la fenetre du service.
	*/
	private Service service;
  
	
    public ControleurService(Service s){
		this.service=s;
	
	}
	
	/**
	*il va permettre d'&eacute;cuter la requete du bouton appuy&eacute;
	*/
	public void actionPerformed(ActionEvent e){
		String nomButton=e.getActionCommand();


		if(nomButton.equals("Retour au menu")){
			service.dispose();
			Onglet onglet= new Onglet();
			onglet.setVisible(true); 
		}
		else if(nomButton.equals("Enregistrer")){

				ServiceBd app = new ServiceBd();

			String name_1 = "Dates flexibles avec une plage de 1 ou 2 semaines plutot que 2 jours";
			int price = 20;
			boolean etat = this.service.getIsFlexibleDate();
			app.insert(name_1,price,etat);

			String name_2 = "Procédure par groupage";
			int price_2 = 40;
			boolean etat_2 = this.service.getIsGroupage();
			app.insert(name_2,price_2,etat_2);


			String name_3 = "Démonter sois-même certains de ses meubles";
			int price_3 = 30;
			boolean etat_3 = this.service.getIsDisassemble();
			app.insert(name_3,price_3,etat_3);



			String name_4 = "Ajout d'un plan de la destination et disposition des meubles sur ce plan";
			int price_4 = 50;
			boolean etat_4 = this.service.getIsAddPlan();
			app.insert(name_4,price_4,etat_4);



			String name_5 = "Démontage et remontage des meubles";
			int price_5 = 80;
			boolean etat_5 = this.service.getIsAllDisassemble();
			app.insert(name_5,price_5,etat_5 );


			String name_6 = "Mise en carton dans certaines pièces";
			int price_6 = 80;
			boolean etat_6 = this.service.getIsCardboard();
			app.insert(name_6,price_6,etat_6);


			String name_7 = "Nettoyage du logement de départ, extinction et relevé des compteurs (gaz, électricité, eau)";
			int price_7 = 70;
			boolean etat_7 = this.service.getIsCleaning();
			app.insert(name_7,price_7,etat_7);

			String name_8 = "Réalisation de l'état des lieux de sortie";
			int price_8 = 60;
			boolean etat_8 = this.service.getIsInProduction();
			app.insert(name_8,price_8,etat_8);

			String name_9 = " Réalisation de l'état des lieux d'entrée";
			int price_9 = 60;
			boolean etat_9 = this.service.getIsOutProduction();
			app.insert(name_9,price_9,etat_9);

		

			new PopUpConfirm("Insertion Service reussie,souhaitez-vous ajouter d'autres services ?",this.service);
		

			
		}

	
	}
}
