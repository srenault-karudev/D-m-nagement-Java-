
/**
 * La classe <code>ControleurEditMeuble</code> controle la fenetre EditMeuble
 *
 *@version 1
 *@author Steven Renault
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ControleurEditMeuble implements ActionListener{
	
	private EditMeuble EditMeuble;
	
	public ControleurEditMeuble(EditMeuble n){
		this.EditMeuble=n;
   
	}
	
	/**
	*il va permettre d'&eacute;cuter la requete du bouton appuy&eacute;
	*/
	public void actionPerformed(ActionEvent e){
		String nomButton=e.getActionCommand();


		if(nomButton.equals("Retour")){
			EditMeuble.dispose();
			Meuble meuble = new Meuble();
			meuble.setVisible(true); 
		}
		else if(nomButton.equals("Enregistrer") ){



			MeubleBd app = new MeubleBd();
     
			boolean detachable = this.EditMeuble.getIsRemovableBox();		
      String name = this.EditMeuble.getName();
      String description = this.EditMeuble.getDescription();
      String piece = (String)this.EditMeuble.getPieceComboBox().getSelectedItem();

      int number = 1;
      int volumeAv =  0;
      int volumeAp = 0;
      int numberDetachable = 0;
      int id = 0;


      try{
       number = Integer.parseInt(this.EditMeuble.getNumberText()); 
       volumeAv = Integer.parseInt(this.EditMeuble.getVolume());
       if(detachable == true){
         volumeAp = Integer.parseInt(this.EditMeuble.getVolumeAfterTexT().getText());
         numberDetachable = Integer.parseInt(this.EditMeuble.getDetachableText());
       }
       id = Integer.parseInt(this.EditMeuble.getIdMeuble());
     }catch(NumberFormatException exception){;}


     if(!name.equals("") && !description.equals("")){
     	String img = this.EditMeuble.getImg();
      app.update(id,name,volumeAv,number,piece,detachable,numberDetachable,volumeAp,description,img);
      
      ListMeuble.donnees = app.getMeubles();
      EditMeuble.dispose();
      Meuble meuble = new Meuble();
      meuble.setVisible(true); 
      new PopUpValid(1,"Modification du meuble n° "+id+" reussie.");
    }else{
      new PopUpValid(2,"Veuillez remplir les champs indiquer par (*).");  
    }
    ListMeuble.donnees = app.getMeubles();

  }

}
}
