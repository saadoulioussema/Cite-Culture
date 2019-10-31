/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Entités.Personne;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Util.DataSource;

/**
 *
 * @author dorra
 */
public class personneService {

    private static personneService instance;
    private Connection cnx;
    private Statement ste;
    private PreparedStatement pst;
    private ResultSet rs;
    Personne p;

    public personneService() {
        cnx = DataSource.getInstance().getConnexion();
    }

    public static personneService getInstance() {
        if (instance == null) {
            instance = new personneService();
        }
        return instance;
    }

    public void insert(Personne o) {
        String req = "insert into personne (nom,prenom,email,password,role) values ('" + o.getNom() + "','" + o.getPrenom() + "','" + o.getEmail() + "','" + o.getPassword() + "','" + o.getRole() + "')";
        try {
            ste = cnx.createStatement();
            ste.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(personneService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Personne> readAllper() {
        String req = "select * from personne where nom not like 'sehli'";
        List<Personne> list = new ArrayList<>();
        try {
            ste = cnx.createStatement();
            rs = ste.executeQuery(req);
            while (rs.next()) {
                //                                                 
                list.add(new Personne(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("email")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(personneService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Personne SearchByMail(String email) {
        Personne p = new Personne();
        try {

            String req2 = "select * from personne where email = '" + email + "' ";

            ste = cnx.createStatement();
            rs = ste.executeQuery(req2);

            while (rs.next()) {
                p.setId(rs.getInt("id"));
                p.setPassword(rs.getString("password"));
                p.setNom(rs.getString("nom"));
                p.setPrenom(rs.getString("prenom"));
                p.setEmail(rs.getString("email"));
                p.setRole(rs.getString("role"));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return p;
    }

    public boolean check(Personne p) {
        try {

            String req2 = "select * from personne where email = '" + p.getEmail() + "' and password = '" + p.getPassword() + "' ";
            ste = cnx.createStatement();
            rs = ste.executeQuery(req2);

            while (rs.next()) {
                p.setRole(rs.getString("role"));
                return true;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    /* public String checkEmail(personne p) {
try {
   
  
            
            String req2= "select email from personne";
            ste=cnx.createStatement();
            rs=ste.executeQuery(req2);
            
            while (rs.next()) {  
                p.setRole(rs.getString("email"));
                return p.getEmail();
            }
           
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
         return "error";   
    }*/
    public void deletePers(int id) {
        String req2 = "delete from personne where id  = ? ";

        try {
            pst = cnx.prepareStatement(req2);
            pst.setInt(1, id);

            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(personneService.class.getTypeName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateclient_n(String nom, String email) {
        String req = "update personne set nom=? where email  = ? ";

        try {
            pst = cnx.prepareStatement(req);
            pst.setString(1, nom);
            pst.setString(2, email);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(personneService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateclient_p(String prenom, String email) {
        String req = "update personne set prenom=? where email  = ? ";

        try {
            pst = cnx.prepareStatement(req);
            pst.setString(1, prenom);
            pst.setString(2, email);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(personneService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateclient_mdp(String password, String email) {
        String req = "update personne set password=? where email  = ? ";

        try {
            pst = cnx.prepareStatement(req);
            pst.setString(1, password);
            pst.setString(2, email);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(personneService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Personne Authentification(String email, String pwd) throws SQLException {

        try {
            String req = "SELECT * FROM `personne` ";
            Statement ste = cnx.createStatement();

            ResultSet r = ste.executeQuery(req);

            while (r.next()) {
                if (r.getString("email").equals(email) && r.getString("password").equals(pwd)) {
                    if (r.getString("role").equals("admin")) {
                        System.out.println("Welcome Admin");
                        p = new Personne(r.getInt("id"), r.getString("nom"), r.getString("prenom"), r.getString("email"), r.getString("password"), r.getString("role"));
                        return p;
                    }
                    if (r.getString("role").equals("client")) {

                        p = new Personne(r.getInt("id"), r.getString("nom"), r.getString("prenom"), r.getString("email"), r.getString("password"), r.getString("role"));
                        return p;
                    }
//                    if (r.getString("role").equals("Ouvrier")) {
//
//                         p = new personne(r.getInt("id"), r.getString("nom"), r.getString("prenom"), r.getString("email"), r.getString("password"), r.getString("role"));
//                        return p;
//
//                    }
                }
            }

            return p;
        } catch (NullPointerException ex) {

        }
        return null;
    }
}
