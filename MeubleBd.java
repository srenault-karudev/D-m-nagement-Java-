import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class MeubleBd {
	
	private Connection co;
	protected boolean demontable;
	


	public MeubleBd(){
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


	public void closeSQL() {
		try {
			this.co.close();
		} catch (SQLException e3){ 
			System.out.println(e3.getMessage());             
		}
	}



	public void insert (String name,int volumeAv,int quantite,String piece,boolean detachable,int element,int volumeAp,String description,String photo){
		String sql = "INSERT INTO meubleBd(nom,volumeAv,quantité,piece,demontable,element,volumeAp,description,photo) VALUES(?,?,?,?,?,?,?,?,?);";

		try {
			PreparedStatement requete = this.co.prepareStatement(sql);
			requete.setString(1,name);
			requete.setInt(2,volumeAv);
			requete.setInt(3,quantite);
			requete.setString(4,piece);
			requete.setBoolean(5,detachable);
			requete.setInt(6,element);
			requete.setInt(7,volumeAp);
			requete.setString(8,description);
			requete.setString(9,photo);
			requete.executeUpdate();
			
			requete.close();
		} catch (SQLException e4){ 
			System.err.println("erreur insertion");
			System.exit(1);        
		}
	}





	public Object[][] getMeubles(){

		String countReq = "SELECT COUNT(id) FROM meubleBd";
		int count = 0;
		try{
			PreparedStatement requete = this.co.prepareStatement(countReq);
			ResultSet res = requete.executeQuery();

			if(res.first()){
				count = res.getInt(1);
			}


		}catch (SQLException e4){ 
			System.err.println("erreur selec count");
		}

		String sql = "SELECT id,nom,volumeAv,quantité,piece,demontable,element,volumeAp,description,photo from meubleBd";
		Object[][] donnees = new Object[count][10];

		try {
			PreparedStatement requete = this.co.prepareStatement(sql);

			ResultSet res = requete.executeQuery();

			for(int i = 0; res.next(); i++){
				for(int j = 0; j < 10; j++){
					donnees[i][j] = res.getObject(j + 1);

				}
			}

			requete.close();
		} catch (SQLException e4){ 
			System.err.println("erreur selection");
			System.exit(1);        
		}
		return donnees;

	}



	public boolean delete (int id){
		String Sql = "DELETE from meubleBd where id = ?";
		boolean retour = false;
		try {
			PreparedStatement requete = this.co.prepareStatement(Sql);
			requete.setInt(1,id);

			int res = requete.executeUpdate();
			if(res == 1){
				retour = true;
			}
			requete.close();
		} catch (SQLException e4){ 
			System.err.println("erreur suppression");
			System.exit(1);        
		}
		return retour;
	}

	public boolean update (int id,String name,int volumeAv,int quantite,String piece,boolean detachable,int element,int volumeAp,String description,String photo){
		String sql =" update meubleBd set nom =?,volumeAv=?,quantité=?,piece=?,demontable=?,element=?,volumeAp=?,description=?,photo=? where id=?";
		boolean retour = false;
		try {
			PreparedStatement requete = this.co.prepareStatement(sql);
			requete.setString(1,name);
			requete.setInt(2,volumeAv);
			requete.setInt(3,quantite);
			requete.setString(4,piece);
			requete.setBoolean(5,detachable);
			requete.setInt(6,element);
			requete.setInt(7,volumeAp);
			requete.setString(8,description);
			requete.setString(9,photo);
			requete.setInt(10,id);
			int res = requete.executeUpdate();
			if(res == 1){
				retour = true;

			}
			//ResultSet res = requete.executeQuery();
			requete.close();
		} catch (SQLException e4){ 
			System.err.println("erreur update");
			System.exit(1);        
		}
		return retour;
	}



	public Object[] getMeubleById(int id ){
		String sql = "SELECT id,nom,volumeAv,quantité,piece,demontable,element,volumeAp,description,photo from meubleBd where id = ?";
		Object[] tab = new Object[10];

		try {
			PreparedStatement requete = this.co.prepareStatement(sql);
			requete.setInt(1,id);

			ResultSet res = requete.executeQuery();
			while(res.next()){
				this.demontable= res.getBoolean(5);
				for(int i=1;i<10;i++){
					tab[i] = res.getObject(i);
				}
			}
			requete.close();
		} catch (SQLException e4){ 
			System.err.println("erreur select By id");
			System.exit(1);        
		}
		return tab;
	}




	public int[][]getId(){

		String countReq = "SELECT COUNT(id) FROM meubleBd";
		int count = 0;
		try{
			PreparedStatement requete = this.co.prepareStatement(countReq);
			ResultSet res = requete.executeQuery();

			if(res.first()){
				count = res.getInt(1);
			}


		}catch (SQLException e4){ 
			System.err.println("erreur selec count");
		}

		String sql = "SELECT id from meubleBd ";

		int[][]tab = new int[count][1];


		try {
			PreparedStatement requete = this.co.prepareStatement(sql);

			ResultSet res = requete.executeQuery();
		
			for(int i = 0; res.next(); i++){
				for(int j = 0; j < 1; j++){
					tab[i][j] = res.getInt(j + 1);	
					
				}
			}
	
			requete.close();
		} catch (SQLException e4){ 
			System.err.println("erreur select id");
			System.exit(1);        
		}
		
		return tab;
	}





}



