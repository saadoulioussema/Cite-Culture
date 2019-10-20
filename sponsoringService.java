/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entitie.sponsoring;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class sponsoringService {
    
    private Connection cnx;
    private Statement ste;
    private PreparedStatement pst;
    private ResultSet rs;
    
     public sponsoringService() {
        cnx=Datasource.getInstance().getConnexion();
     }
    
     
      public void inserts(sponsoring p ){
         
        String req="insert into sponsoring (nomEvent, marqueSpons ,catégorieEvent,id, service_à_offrir,date_contrat,nom_sponseur) values ('"
                +p.getNomEvent()+"','"+p.getMarqueSpons()+"','"+p.getCatégorieEvent()+"','"+p.getId()+"','"+p.getService_à_offrir()+"','"+p.getDate_contrat()+"','"+p.getNom_sponseur()+"')";
        try {
            ste=cnx.createStatement();
            ste.executeUpdate(req);
           
        } catch (SQLException ex) {
            Logger.getLogger(actualitésService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
      
      
      
      
    public List<sponsoring> readAlls(){
        String req="select * from sponsoring";
        List<sponsoring> list=new ArrayList<>();
        try {
            ste=cnx.createStatement();
            rs=ste.executeQuery(req);
            while(rs.next()){
                list.add(new sponsoring(rs.getString("nomEvent"), rs.getString("marqueSpons"),rs.getString("catégorieEvent"), rs.getInt("id"), rs.getString("service_à_offrir"), rs.getDate("date_contrat"), rs.getString("nom_sponseur")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(publicitésService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;   
    }
    
     public void deletePsts(int id){
        String req2="delete from sponsoring where id = ? ";
        
       
        try {
            pst=cnx.prepareStatement(req2);
            pst.setInt(1,id);
             pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(sponsoringService.class.getName()).log(Level.SEVERE, null, ex);
        }
            
       
    }
     
      public void updatePsts_nomEvent(String nomEvent,int id){
        String req5="update sponsoring set nomEvent=? where id = ? ";
        
        
         
     
        try {
            pst=cnx.prepareStatement(req5);
            pst.setString(1,nomEvent);
            pst.setInt(2,id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(sponsoringService.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
       public void updatePsts_marqueSpons(String marqueSpons ,int id){
        String req5="update sponsoring set marqueSpons=? where id = ? ";
        
        
         
     
        try {
            pst=cnx.prepareStatement(req5);
            pst.setString(1,marqueSpons);
            pst.setInt(2,id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(sponsoringService.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
       public void updatePsts_catégorieEvent(String catégorieEvent,int id){
        String req5="update sponsoring set catégorieEvent=? where id = ? ";
        
        
         
     
        try {
            pst=cnx.prepareStatement(req5);
            pst.setString(1,catégorieEvent);
            pst.setInt(2,id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(sponsoringService.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
       public void updatePsts_service_à_offrir(String service_à_offrir,int id){
        String req5="update sponsoring set service_à_offrir=? where id = ? ";
        
        
         
     
        try {
            pst=cnx.prepareStatement(req5);
            pst.setString(1,service_à_offrir);
            pst.setInt(2,id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(sponsoringService.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
       
       public void updatePsts_date_contrat(Date date_contrat,int id){
        String req5="update sponsoring set date_contrat=? where id = ? ";
        
        
         
     
        try {
            pst=cnx.prepareStatement(req5);
            pst.setDate(1,date_contrat);
            pst.setInt(2,id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(sponsoringService.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
       public void updatePsts_nom_sponseur(String nom_sponseur,int id){
        String reqq="update sponsoring set nom_sponseur=? where id = ? ";
        
        
         
     
        try {
            pst=cnx.prepareStatement(reqq);
            pst.setString(1,nom_sponseur);
            pst.setInt(2,id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(sponsoringService.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
 
}
