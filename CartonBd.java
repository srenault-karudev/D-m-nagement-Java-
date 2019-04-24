import javax.swing.*;
import java.awt.*;
import java.sql.*;

/**
*Cette classe est le modele qui gere les cartons.
*
* @author Steven Renault
*
*/
public class CartonBd {
	

	/**
	 * La variable permettant la connexion à la base de données
	 */
	private Connection co;

	/**
	*Ce constructeur permet la connexion a la base de donneées.
	*/
	public CartonBd(){
		try{
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e1){ 
			System.err.println("erreur connection a la db");
			System.exit(1);        
		}
		try {
			this.co = DriverManager.getConnection(
				"jdbc:mariadb://dwarves.iut-fbleau.fr/renaults","renaults","guadeloupe971");
			this.co=co;
		} catch (SQLException e2){ 
			System.err.println("erreur au chargement du pilote");
			System.exit(1);          
		}
	}



		/**
	 * Cette méthode insere les cartons dans la base de donnée
	 * 
	 * @param type
	 * 		Le type de carton
	 * @param qtte
	 * 		la quantité voulu 
	 * @param piece
	 *		la piece ou insere les cartons
	 
	 */

	public void insert ( String type,int qtte,String piece){
		String sql = "INSERT into carton (type,quantite,piece) value (?,?,?)";;

		try {
			PreparedStatement requete = this.co.prepareStatement(sql);
			requete.setString(1,type);
			requete.setInt(2,qtte);
			requete.setString(3,piece);
			requete.executeUpdate();
			requete.close();
		} catch (SQLException e4){ 
			System.err.println("erreur insertion cartonn");
			System.exit(1);        
		}
	}



}



