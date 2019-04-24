
/**
 * La classe <code>ControleurMeuble</code>controle la fenetre meuble
 *@version 1
 *@author Steven Renault
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class ControleurMeuble implements ActionListener{
   
   private Meuble meuble;

   private MeubleBd app;

   private NewMeuble newMeuble;


   public ControleurMeuble(Meuble meuble){
    this.meuble=meuble;
    this.app = new MeubleBd();
    this.newMeuble= new NewMeuble();

  }

   /**
    *il va permettre d'&eacute;cuter la requete du bouton appuy&eacute;
    */
   public void actionPerformed(ActionEvent e){
    String nomButton=e.getActionCommand();


    if(nomButton.equals("Ajouter meuble")){
     meuble.dispose();
     meuble.setSecondEdit(false);
     ListMeuble.donnees = app.getMeubles();
     NewMeuble newmeuble = new NewMeuble();
      
     newMeuble.setVisible(true); 
   }
   else if(nomButton.equals("Modifier meuble")){

     meuble.setEdit(true);
     meuble.onlyEdit();


   }

   else if(nomButton.equals("Retour menu")){

     meuble.dispose();
     Onglet onglet = new Onglet();
     onglet.setVisible(true);
  

   }
   else if (nomButton.equals("Retour")){
     meuble.dispose();
     Meuble meuble = new Meuble();
     ListMeuble.donnees = app.getMeubles();
     meuble.setVisible(true); 
   }
   else if (nomButton.equals("Supprimer meuble")){
     meuble.setDelete(true);
     meuble.onlyDelete();
   }
   else if (nomButton.equals("Modifier")){

     meuble.setSecondEdit(true);

     try{
      int id = Integer.parseInt(this.meuble.getMeubleText().getText());
      boolean exist = false;
     int[][]tab = app.getId();
      for(int i=0 ;i<tab.length;i++){
        if(tab[i][0] == id){
          exist=true;
        }
      }
    if(exist == true){
      Object[] array = app.getMeubleById(id);
      boolean demontable = app.demontable;
      ListMeuble.donnees = app.getMeubles();

      this.meuble.dispose();
      EditMeuble editMeuble = new EditMeuble(array,demontable);
      editMeuble.setVisible(true);

    }
    else {
      new PopUpValid(3,"Le numero du meuble " +id +" n'existe pas.");
   }



 }catch(NumberFormatException exception){
   new PopUpValid(2,"Veuillez rentrer le numero du meuble.");
 }

}
else if (nomButton.equals("Supprimer")){
  this.meuble.setSecondDelete(true);
  try{
   int id = Integer.parseInt(this.meuble.getMeubleText().getText());
;

   if(app.delete(id)){
    ListMeuble.donnees = app.getMeubles();
    this.meuble.dispose();
    /* Meilleur solution a trouver */
    Meuble meuble = new Meuble();
    meuble.setVisible(true);
    new PopUpValid(1,"Le meuble n° "+id+" à bien été supprimé.");
  }
  else{

   new PopUpValid(3,"Le meuble n° "+id+" n'existe pas.");
 }

}catch(NumberFormatException e1){
  new PopUpValid(2,"Veuillez rentrer le numero du meuble.");
}
    
}

}
}
