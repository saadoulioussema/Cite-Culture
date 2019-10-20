/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entitie.actualités ; 
import java.sql.Connection;
import java.sql.Date ;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Datasource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dorra
 */
public class actualitésService {
    
     private Connection cnx;
    private Statement ste;
    private PreparedStatement pst;
    private ResultSet rs;
 
    
    public actualitésService() {
        cnx=Datasource.getInstance().getConnexion();
    }
    
  
    public void inserta(actualités p){
        String req="insert into actualités(date_Début,date_Fin,id,description,titre,nomEvent,catégorieEvent) values ('"+p.getDate_Début()+"','"+p.getDate_Fin()+"','"+p.getId()+"','"+p.getDescription()+"','"+p.getTitre()+"','"+p.getNomEvent()+"','"+p.getCatégorieEvent()+"')";
        try {
            ste=cnx.createStatement();
            ste.executeUpdate(req);
           
        } catch (SQLException ex) {
            Logger.getLogger(actualitésService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
 
    public List<actualités> readAlla(){
        String req="select * from actualités";
        List<actualités> list=new ArrayList<>();
        try {
            ste=cnx.createStatement();
            rs=ste.executeQuery(req);
            while(rs.next()){
                                                                       
                list.add(new actualités(rs.getDate("date_Début"), rs.getDate("date_Fin"), rs.getInt("id"), rs.getString("description"), rs.getString("titre"), rs.getString("nomEvent"), rs.getString("catégorieEvent")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(actualitésService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;   
    }
      
  
    
     public void deletePsta(int id){
        String req2="delete from actualités where id  = ? ";
        
        
         try {
             pst=cnx.prepareStatement(req2);
               pst.setInt(1,id);
           
              pst.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(actualitésService.class.getTypeName()).log(Level.SEVERE, null, ex);
         }
          
       
    }
     
     public void updatePsta_date_Début(Date date_Début,int id ){
        String req="update actualités set date_Début=? where id  = ? ";
        
        
         try {
            pst=cnx.prepareStatement(req);
            pst.setDate(1,date_Début);
            pst.setInt(2,id );
            pst.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(actualitésService.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
         
        public void updatePsta_date_Fin(Date date_Fin,int id ){
        String req="update actualités set date_Fin=? where id  = ? ";
        
        
         try {
            pst=cnx.prepareStatement(req);
            pst.setDate(1,date_Fin);
            pst.setInt(2,id );
            pst.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(actualitésService.class.getName()).log(Level.SEVERE, null, ex);
         }
   
     }
         
          public void updatePsta_description(String description,int id ){
        String req="update actualités set description=? where id  = ? ";
        
        
         try {
            pst=cnx.prepareStatement(req);
            pst.setString(1,description);
            pst.setInt(2,id );
            pst.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(actualitésService.class.getName()).log(Level.SEVERE, null, ex);
         }
   
     }
          public void updatePsta_titre(String titre,int id ){
        String req="update actualités set titre=? where id = ? ";
        
        
         try {
            pst=cnx.prepareStatement(req);
            pst.setString(1,titre);
            pst.setInt(2,id);
            pst.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(actualitésService.class.getName()).log(Level.SEVERE, null, ex);
         }
   
     }
          public void updatePsta_nomEvent(String nomEvent,int id){
        String req="update actualités set nomEvent=? where id = ? ";
        
        
         try {
            pst=cnx.prepareStatement(req);
            pst.setString(1,nomEvent);
            pst.setInt(2,id);
            pst.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(actualitésService.class.getName()).log(Level.SEVERE, null, ex);
         }
   
     }
          public void updatePsta_catégorieEvent(String catégorieEvent,int id){
        String req="update actualités set catégorieEvent=? where id = ? ";
        
        
         try {
            pst=cnx.prepareStatement(req);
            pst.setString(1,catégorieEvent);
            pst.setInt(2,id);
            pst.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(actualitésService.class.getName()).log(Level.SEVERE, null, ex);
         }
   
     }
     
}




    

