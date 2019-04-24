
	/**
	 * La classe <code>ControleurNewMeubleCheckbox</code> permet de controle  l'etat de la case ajout meuble
	 *
	 *@version 1
	 *@author Steven Renault
	 */

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;


	public class ControleurNewMeubleCheckbox implements ItemListener{
	
		private NewMeuble newMeuble ;
		
		public ControleurNewMeubleCheckbox(NewMeuble n){
			this.newMeuble=n;
		}
		
		/**
		*il va permettre d'&eacute;cuter la requete de la case coche;
		*/
		public void itemStateChanged(ItemEvent e) {
			
			

			if (e.getStateChange() == ItemEvent.SELECTED) {
				this.newMeuble.isRemovableBox(true);
				this.newMeuble.getDetachedLabel().setVisible(true);	
				this.newMeuble.getDetachableTextArea().setVisible(true);
				this.newMeuble.getVolumeAfterLabel().setVisible(true);	
				this.newMeuble.getVolumeAfterTexT().setVisible(true);
			


			} 
			else{
				this.newMeuble.isRemovableBox(false);
				this.newMeuble.getDetachedLabel().setVisible(false);	
				this.newMeuble.getDetachableTextArea().setVisible(false);
				this.newMeuble.getVolumeAfterLabel().setVisible(false);	
				this.newMeuble.getVolumeAfterTexT().setVisible(false);
			
			}
				
			
		}

	}
