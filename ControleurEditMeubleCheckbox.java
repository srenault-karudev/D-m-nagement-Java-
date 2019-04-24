
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;


	public class ControleurEditMeubleCheckbox implements ItemListener{
		/**
		*la variable permet de prendre la fenetre du de EditMeuble.
		*/
		private EditMeuble EditMeuble ;
		
		public ControleurEditMeubleCheckbox(EditMeuble n){
			this.EditMeuble=n;
		}
		
		/**
		*Verifie si on a cocher sur une checkbox;
		*/
		public void itemStateChanged(ItemEvent e) {
			
			

			if (e.getStateChange() == ItemEvent.SELECTED) {
					this.EditMeuble.isRemovableBox(true);
					this.EditMeuble.getDetachedLabel().setVisible(true);	
					this.EditMeuble.getDetachableTextArea().setVisible(true);
					this.EditMeuble.getVolumeAfterLabel().setVisible(true);	
					this.EditMeuble.getVolumeAfterTexT().setVisible(true);
					


			} 
			else{
				
					this.EditMeuble.isRemovableBox(false);
					this.EditMeuble.getDetachedLabel().setVisible(false);	
					this.EditMeuble.getDetachableTextArea().setVisible(false);
					this.EditMeuble.getVolumeAfterLabel().setVisible(false);	
					this.EditMeuble.getVolumeAfterTexT().setVisible(false);
				
			}


			
		}

	}
