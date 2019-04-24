import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class ServiceBd {
	
	private Connection co;

	


	public ServiceBd(){
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


	public void insert ( String type,int prix,boolean etat){
		String sql = "INSERT into service(type,prix,etat)value(?,?,?)";;

		try {
			PreparedStatement requete = this.co.prepareStatement(sql);
			requete.setString(1,type);
			requete.setInt(2,prix);
			requete.setBoolean(3,etat);
			requete.executeUpdate();
			requete.close();
		} catch (SQLException e4){ 
			System.err.println("erreur insertion servie");
			System.exit(1);        
		}
	}



}



