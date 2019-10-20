/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import service.publicitésService;

/**
 * FXML Controller class
 *
 * @author dorra
 */
public class ModifierPubliciteController implements Initializable {

    @FXML
    private Button btna13;
    @FXML
    private Button btna14;
    @FXML
    private Button btna15;
    @FXML
    private Button btna16;
    @FXML
    private Button btna17;
    @FXML
    private TextField ida2;
    @FXML
    private TextField txtm5;
    @FXML
    private TextField txtm6;
    @FXML
    private TextField txtm7;
    @FXML
    private DatePicker dp8;
    @FXML
    private DatePicker dp9;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         //modif date debut
         btna13.setOnAction(e->{
             try {
                 Integer h = Integer.parseInt(ida2.getText()) ;
               java.sql.Date a = java.sql.Date.valueOf(dp8.getValue());
                 
                 publicitésService ps = new publicitésService();
                 ps.updatePstp_dt_début(a, h);
                 Parent root ;
                 root=FXMLLoader.load(getClass().getResource("afficherPublicite.fxml"));
                 btna13.getScene().setRoot(root);
             } catch (IOException ex) {
                 Logger.getLogger(ModifierActualiteController.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             }); 
         //modif date fin
        btna14.setOnAction(e->{
             try {
                 Integer b = Integer.parseInt(ida2.getText()) ;
               java.sql.Date c = java.sql.Date.valueOf(dp9.getValue());
                 
                 publicitésService ps1 = new publicitésService();
                 ps1.updatePstp_dt_fin(c, b);
                 Parent root ;
                 root=FXMLLoader.load(getClass().getResource("afficherPublicite.fxml"));
                 btna14.getScene().setRoot(root);
             } catch (IOException ex) {
                 Logger.getLogger(ModifierActualiteController.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             }); 
        
         //modif type
          btna15.setOnAction(e->{
             try {
                 Integer b = Integer.parseInt(ida2.getText()) ;
                             
                 publicitésService ps2 = new publicitésService();
                 ps2.updatePstp_type(txtm5.getText(), b);
                 Parent root ;
                 root=FXMLLoader.load(getClass().getResource("afficherPublicite.fxml"));
                 btna15.getScene().setRoot(root);
             } catch (IOException ex) {
                 Logger.getLogger(ModifierActualiteController.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             }); 
          
           //modif titre
          btna16.setOnAction(e->{
             try {
                 Integer b = Integer.parseInt(ida2.getText()) ;
               
                 publicitésService ps3 = new publicitésService();
                 ps3.updatePstp_titre(txtm6.getText(), b);
                 Parent root ;
                 root=FXMLLoader.load(getClass().getResource("afficherPublicite.fxml"));
                 btna16.getScene().setRoot(root);
             } catch (IOException ex) {
                 Logger.getLogger(ModifierActualiteController.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             }); 
         //modif description
         btna17.setOnAction(e->{
             try {
                 Integer b = Integer.parseInt(ida2.getText()) ;
                              
                 publicitésService ps4 = new publicitésService();
                  ps4.updatePstp_description(txtm7.getText(), b);
                 Parent root ;
                 root=FXMLLoader.load(getClass().getResource("afficherPublicite.fxml"));
                 btna17.getScene().setRoot(root);
             } catch (IOException ex) {
                 Logger.getLogger(ModifierActualiteController.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             }); 
        
         
           
    }    
    
}
