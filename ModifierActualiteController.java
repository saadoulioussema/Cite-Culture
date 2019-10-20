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
import service.actualitésService;

/**
 * FXML Controller class
 *
 * @author dorra
 */
public class ModifierActualiteController implements Initializable {

    @FXML
    private Button btna7;
    @FXML
    private DatePicker dp6;
    @FXML
    private DatePicker dp7;
    @FXML
    private TextField txtm1;
    @FXML
    private TextField txtm2;
    @FXML
    private TextField txtm3;
    @FXML
    private TextField txtm4;
    @FXML
    private TextField ida1;
    @FXML
    private Button btna8;
    @FXML
    private Button btna9;
    @FXML
    private Button btna10;
    @FXML
    private Button btna11;
    @FXML
    private Button btna12;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //modif date debut
         btna7.setOnAction(e->{
             try {
                 Integer b = Integer.parseInt(ida1.getText()) ;
               java.sql.Date a = java.sql.Date.valueOf(dp6.getValue());
                 
                 actualitésService ps = new actualitésService();
                
                 ps.updatePsta_date_Début(a, b);
                
                 Parent root ;
                 root=FXMLLoader.load(getClass().getResource("afficherActualite.fxml"));
                 btna7.getScene().setRoot(root);
             } catch (IOException ex) {
                 Logger.getLogger(ModifierActualiteController.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             }); 
         //modif date fin
         btna8.setOnAction(e->{
             try {
                 Integer b = Integer.parseInt(ida1.getText()) ;
               java.sql.Date c = java.sql.Date.valueOf(dp7.getValue());
                 
                 actualitésService pss = new actualitésService();
                
                 pss.updatePsta_date_Fin(c, b);
                
                 Parent root ;
                 root=FXMLLoader.load(getClass().getResource("afficherActualite.fxml"));
                 btna8.getScene().setRoot(root);
             } catch (IOException ex) {
                 Logger.getLogger(ModifierActualiteController.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             }); 
         //modif description
         btna9.setOnAction(e->{
             try {
                 Integer b = Integer.parseInt(ida1.getText()) ;
                 actualitésService ps1 = new actualitésService();
                 ps1.updatePsta_description(txtm1.getText(), b);
                
                 Parent root ;
                 root=FXMLLoader.load(getClass().getResource("afficherActualite.fxml"));
                 btna9.getScene().setRoot(root);
             } catch (IOException ex) {
                 Logger.getLogger(ModifierActualiteController.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             }); 
         //modif titre
          btna10.setOnAction(e->{
             try {
                 Integer b = Integer.parseInt(ida1.getText()) ;
                 actualitésService ps2 = new actualitésService();
                 ps2.updatePsta_titre(txtm2.getText(), b);
                
                 Parent root ;
                 root=FXMLLoader.load(getClass().getResource("afficherActualite.fxml"));
                 btna10.getScene().setRoot(root);
             } catch (IOException ex) {
                 Logger.getLogger(ModifierActualiteController.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             }); 
          //modif nomEvent
           btna11.setOnAction(e->{
             try {
                 Integer b = Integer.parseInt(ida1.getText()) ;
                 actualitésService ps3 = new actualitésService();
                 ps3.updatePsta_nomEvent(txtm3.getText(), b);
                
                 Parent root ;
                 root=FXMLLoader.load(getClass().getResource("afficherActualite.fxml"));
                 btna11.getScene().setRoot(root);
             } catch (IOException ex) {
                 Logger.getLogger(ModifierActualiteController.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             }); 
           //modif catégorieEvent
            btna12.setOnAction(e->{
             try {
                 Integer b = Integer.parseInt(ida1.getText()) ;
                 actualitésService pso = new actualitésService();
                 pso.updatePsta_catégorieEvent(txtm4.getText(), b);
                
                 Parent root ;
                 root=FXMLLoader.load(getClass().getResource("afficherActualite.fxml"));
                 btna12.getScene().setRoot(root);
             } catch (IOException ex) {
                 Logger.getLogger(ModifierActualiteController.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             }); 
          
         
         
         
    }    
    
}
