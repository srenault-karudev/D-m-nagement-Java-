
	/**
	 * La classe <code>ControleurMenu</code> est utilis&eacute;e pour d&eacute;marrer une nouvelle,reprendre une nouvelle partie ou bien quitter le jeu.
	 *
	 *@version 1
	 *@author Steven Renault
	 */

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;


	public class ControleurServiceCheckbox implements ItemListener{
		/**
		*la variable permet de prendre la fenetre du service.
		*/
		private Service service ;
		
		public ControleurServiceCheckbox(Service s){
			this.service=s;
		}
		
		/**
		*il va permettre d'&eacute;cuter la requete du checkbox coche;
		*/
		public void itemStateChanged(ItemEvent e) {
			
			

			if (e.getStateChange() == ItemEvent.SELECTED) {
				String name =((JCheckBox)e.getSource()).getText() ;
				if(name.equals("20€ : Des dates flexibles avec une plage de 1 ou 2 semaines plutot que 2 jours")){
					this.service.isFlexibleDate(true);
				}
			} 
			else{
				String name =((JCheckBox)e.getSource()).getText() ;
				if(name.equals("20€ : Des dates flexibles avec une plage de 1 ou 2 semaines plutot que 2 jours")){
					this.service.isFlexibleDate(false);
				}
			}



			if (e.getStateChange() == ItemEvent.SELECTED) {
				String name =((JCheckBox)e.getSource()).getText();
				if(name.equals("40€ : Procéder par groupage")){
					this.service.isGroupage(true);
				}
			} 
			else{
				String name =((JCheckBox)e.getSource()).getText();
				if(name.equals("40€ : Procéder par groupage")){
					this.service.isGroupage(false);
				}

			}

			if (e.getStateChange() == ItemEvent.SELECTED) {
				String name =((JCheckBox)e.getSource()).getText();
				if(name.equals("30€ : Démonter sois-même certains de ses meubles")){
					this.service.isDisassemble(true);
				}
			} 
			else{
				String name =((JCheckBox)e.getSource()).getText();
				if(name.equals("30€ : Démonter sois-même certains de ses meubles")){
					this.service.isDisassemble(false);
				}

			}


			if (e.getStateChange() == ItemEvent.SELECTED) {
				String name =((JCheckBox)e.getSource()).getText();
				if(name.equals("50€ : Ajout d'un plan de la destination et disposition des meubles sur ce plan")){
					this.service.isAddPlan(true);
				}
			} 
			else{
				String name =((JCheckBox)e.getSource()).getText();
				if(name.equals("50€ : Ajout d'un plan de la destination et disposition des meubles sur ce plan")){
					this.service.isAddPlan(false);
				}

			}


			if (e.getStateChange() == ItemEvent.SELECTED) {
				String name =((JCheckBox)e.getSource()).getText();
				if(name.equals("80€ : Démontage et remontage des meubles")){
					this.service.isAllDisassemble(true);

				}
			} 
			else{
				String name =((JCheckBox)e.getSource()).getText();
				if(name.equals("80€ : Démontage et remontage des meubles")){
					this.service.isAllDisassemble(false);
			
				}

			}


			if (e.getStateChange() == ItemEvent.SELECTED) {
				String name =((JCheckBox)e.getSource()).getText();
				if(name.equals("80€ : Mise en carton dans certaines pièces")){
					this.service.isCardboard(true);
				
				}
			} 
			else{
				String name =((JCheckBox)e.getSource()).getText();
				if(name.equals("80€ : Mise en carton dans certaines pièces")){
					this.service.isCardboard(false);
					
				}

			}


			if (e.getStateChange() == ItemEvent.SELECTED) {
				String name =((JCheckBox)e.getSource()).getText();
				if(name.equals("70€ : Nettoyage du logement de départ, extinction et relevé des compteurs (gaz, électricité, eau)")){
					this.service.isCleaning(true);
							
				}
			} 
			else{
				String name =((JCheckBox)e.getSource()).getText();
				if(name.equals("70€ : Nettoyage du logement de départ, extinction et relevé des compteurs (gaz, électricité, eau)")){
					this.service.isCleaning(false);
				
				}

			}

			if (e.getStateChange() == ItemEvent.SELECTED) {
				String name =((JCheckBox)e.getSource()).getText();
				if(name.equals("60€ : Réalisation de l'état des lieux de sortie")){
					this.service.isInProduction(true);
							
				}
			} 
			else{
				String name =((JCheckBox)e.getSource()).getText();
				if(name.equals("60€ : Réalisation de l'état des lieux de sortie")){
					this.service.isInProduction(false);
					
				}

			}


			if (e.getStateChange() == ItemEvent.SELECTED) {
				String name =((JCheckBox)e.getSource()).getText();
				if(name.equals("60€ : Réalisation de l'état des lieux d'entrée")){
					this.service.isOutProduction(true);
						
				}
			} 
			else{
				String name =((JCheckBox)e.getSource()).getText();
				if(name.equals("60€ : Réalisation de l'état des lieux d'entrée")){
					this.service.isOutProduction(false);
						
				}

			}

		

			
		}

	}
