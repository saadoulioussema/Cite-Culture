/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dorra
 */
public class Datasource {
     private String url="jdbc:mysql://localhost:3306/cité";
    private String username="root";
    private String password="";
    private Connection connexion;
    private static Datasource instance;

    private Datasource() {
        
         try {
             connexion=DriverManager.getConnection(url,username,password );
         } catch (SQLException ex) {
             Logger.getLogger(Datasource.class.getName()).log(Level.SEVERE, null, ex);
         }
            System.out.println("Connexion etablie");
       
    }

    public Connection getConnexion() {
        return connexion;
    }
    
    
    
    public static Datasource getInstance(){
        if(instance==null)
            instance=new Datasource();
        return instance;
    }
    
    
    
    
    
    
}
