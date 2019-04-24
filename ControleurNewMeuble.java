
/**
 * La classe <code>ControleurNewMeuble</code> permet de controler l'ajout des meubles *
 *@version 1
 *@author Steven Renault
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ControleurNewMeuble implements ActionListener{
  
 private NewMeuble newMeuble;
 

 public ControleurNewMeuble(NewMeuble n){
  this.newMeuble=n;
  
}

   /**
    *il va permettre d'&eacute;cuter la requete du bouton appuy&eacute;
    */
   public void actionPerformed(ActionEvent e){
   	String nomButton=e.getActionCommand();


   	if(nomButton.equals("Retour")){
   		newMeuble.dispose();
   		Meuble meuble = new Meuble();
   		meuble.setVisible(true); 
   	}
   	else if(nomButton.equals("Enregistrer")){
   		MeubleBd app = new MeubleBd();
   		boolean detachable = this.newMeuble.getIsRemovableBox();

      String name = this.newMeuble.getName();
      String description = this.newMeuble.getDescription();
      String piece = (String)this.newMeuble.getPieceComboBox().getSelectedItem();

      int number = 1;
      int volumeAv =  0;
      int volumeAp = 0;
      int numberDetachable = 0;

      try{
       number = Integer.parseInt(this.newMeuble.getNumberText()); 
       volumeAv = Integer.parseInt(this.newMeuble.getVolume());
       volumeAp = Integer.parseInt(this.newMeuble.getVolumeAfterTexT().getText());
       numberDetachable = Integer.parseInt(this.newMeuble.getDetachableText());
     }catch(NumberFormatException exception){;}

     String img = this.newMeuble.getImg();

     if(!name.equals("") && !description.equals("")){
       app.insert(name,volumeAv,number,piece,detachable,numberDetachable,volumeAp,description,img);
       ListMeuble.donnees = app.getMeubles();
       this.newMeuble.dispose();
       Meuble meuble = new Meuble();
       meuble.setVisible(true);
       new PopUpValid(1,"Insertion du meuble reussie.");

       
     }else{
      new PopUpValid(2,"Veuillez remplir les champs indiquer par (*).");
    }
    ListMeuble.donnees = app.getMeubles();

  }

}
}
