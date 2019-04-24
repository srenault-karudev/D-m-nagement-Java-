
/**
 * La classe <code>ControleurMenu</code> controle la fenetre menu
 *
 *@version 1
 *@author Steven Renault
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ControleurMenu implements ActionListener{
	/**
	*la variable permet de prendre la fenetre du menu.
	*/
	private Menu menu;
	

	public ControleurMenu(Menu f){
		this.menu=f;
	}

	/**
	*il va permettre d'&eacute;cuter la requete du bouton appuy&eacute;
	*/
	public void actionPerformed(ActionEvent e){
		String nomButton=e.getActionCommand();


		if(nomButton.equals("Préparer son déménagement")){
			menu.dispose();
			Onglet onglet = new Onglet();
			onglet.setVisible(true); 
		}
	}
}
