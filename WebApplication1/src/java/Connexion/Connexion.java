/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author User
 */
public class Connexion {
       
  private Connection connexion;
  
    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }
  
  public Connexion() 
  {
  }
  public Connection connecter() throws Exception{
     
     String server = "localhost";
         int port = 3306;
         String database = "corona";
         String username = "root"; 
         String password = "root";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://" + server + ":" + port + "/" + database;
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("connected");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();          
        }
      
      return null;
  }

}   
