/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
 
import entitie.publicités;
import java.sql.Connection;
import java.sql.Date;
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
public class publicitésService {
    
    private Connection cnx;
    private Statement ste;
    private PreparedStatement pst;
    private ResultSet rs;
    
    
    public publicitésService() {
        cnx=Datasource.getInstance().getConnexion();
    }
 
     public void insertp(publicités p){
         
        String req="insert into publicités(dt_début,dt_fin,id,type,titre,description) values ('" +p.getDt_début()+"','"+p.getDt_fin()+"','"+p.getId()+"','"+p.getType()+"','"+p.getTitre()+"','"+p.getDescription()+"')";
        try {
            ste=cnx.createStatement();
            ste.executeUpdate(req);
           
        } catch (SQLException ex) {
            Logger.getLogger(actualitésService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
     
    public List<publicités> readAllp(){
        String req="select * from publicités";
        List<publicités> list=new ArrayList<>();
        try {
            ste=cnx.createStatement();
            rs=ste.executeQuery(req);
            while(rs.next()){
                list.add(new publicités(rs.getDate("dt_début"), rs.getDate("dt_fin"),rs.getInt("id") , rs.getString("type"), rs.getString("titre"), rs.getString("description")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(publicitésService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;   
    }
    
   public void deletePstp(int id){
        String req2="delete from publicités where id = ? " ;
       try {
             pst=cnx.prepareStatement(req2);
            pst.setInt(1,id);
            pst.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(publicitésService.class.getTypeName()).log(Level.SEVERE, null, ex);
        }
   }
       
          
       
    

   
     public void updatePstp_dt_début(Date dt_début,int id ){
        String req4="update publicités set dt_début=? where id = ? ";
        
        
         
        try {
            pst=cnx.prepareStatement(req4);
            pst.setDate(1,dt_début);
            pst.setInt(2,id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(publicitésService.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
   
     }
     
      public void updatePstp_dt_fin(Date dt_fin,int id ){
        String req4="update publicités set dt_fin=? where id = ? ";
        
        
         
        try {
            pst=cnx.prepareStatement(req4);
            pst.setDate(1,dt_fin);
            pst.setInt(2,id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(publicitésService.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
   
     }
      public void updatePstp_type(String type,int id ){
        String req4="update publicités set type=? where id = ? ";
        
        
         
        try {
            pst=cnx.prepareStatement(req4);
            pst.setString(1,type);
            pst.setInt(2,id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(publicitésService.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
   
     }
      public void updatePstp_titre(String titre,int id ){
        String req4="update publicités set titre=? where id = ? ";
        
        
         
        try {
            pst=cnx.prepareStatement(req4);
            pst.setString(1,titre);
            pst.setInt(2,id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(publicitésService.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
   
     }
      
      public void updatePstp_description(String description,int id ){
        String req4="update publicités set description=? where id = ? ";
        
        
         
        try {
            pst=cnx.prepareStatement(req4);
            pst.setString(1,description);
            pst.setInt(2,id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(publicitésService.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
   
     }
 
} 


