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
import service.sponsoringService;

/**
 * FXML Controller class
 *
 * @author dorra
 */
public class ModifierSponsoringController implements Initializable {

    @FXML
    private TextField ida3;
    @FXML
    private TextField txtm8;
    @FXML
    private TextField txtmm;
    @FXML
    private TextField txtm10;
    @FXML
    private TextField txtm11;
    @FXML
    private TextField txtm12;
    @FXML
    private DatePicker dp10;
    @FXML
    private Button btna18;
    @FXML
    private Button btna23;
    @FXML
    private Button btnam;
    @FXML
    private Button btna20;
    @FXML
    private Button btna21;
    @FXML
    private Button btna22;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         btna18.setOnAction(e->{
             try {
                 Integer b = Integer.parseInt(ida3.getText()) ;
                             
                 sponsoringService ps = new sponsoringService();
                 ps.updatePsts_nomEvent(txtm8.getText(), b);
                 Parent root ;
                 root=FXMLLoader.load(getClass().getResource("afficherSponsoring.fxml"));
                 btna18.getScene().setRoot(root);
             } catch (IOException ex) {
                 Logger.getLogger(ModifierActualiteController.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             }); 
         
         
         //modif catégorieEvent 
         btna20.setOnAction(e->{
             try {
                 Integer b = Integer.parseInt(ida3.getText()) ;
                             
                 sponsoringService ps2 = new sponsoringService();
                 ps2.updatePsts_catégorieEvent(txtm10.getText(), b);
                 Parent root ;
                 root=FXMLLoader.load(getClass().getResource("afficherSponsoring.fxml"));
                 btna20.getScene().setRoot(root);
             } catch (IOException ex) {
                 Logger.getLogger(ModifierActualiteController.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             }); 
          //modif service_à_offrir 
         btna21.setOnAction(e->{
             try {
                 Integer b = Integer.parseInt(ida3.getText()) ;
                             
                 sponsoringService ps3 = new sponsoringService();
                 ps3.updatePsts_service_à_offrir(txtm11.getText(), b);
                 Parent root ;
                 root=FXMLLoader.load(getClass().getResource("afficherSponsoring.fxml"));
                 btna21.getScene().setRoot(root);
             } catch (IOException ex) {
                 Logger.getLogger(ModifierActualiteController.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             }); 
         //modif date_contrat
          btna23.setOnAction(e->{
             try {
                 Integer h = Integer.parseInt(ida3.getText()) ;
               java.sql.Date a = java.sql.Date.valueOf(dp10.getValue());
                 
                sponsoringService ps4 = new sponsoringService();
                 ps4.updatePsts_date_contrat(a, h);
                 Parent root ;
                 root=FXMLLoader.load(getClass().getResource("afficherSponsoring.fxml"));
                 btna23.getScene().setRoot(root);
             } catch (IOException ex) {
                 Logger.getLogger(ModifierActualiteController.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             }); 
          //modif nom_sponseur
         
             btna22.setOnAction(e->{
             try {
                 Integer b = Integer.parseInt(ida3.getText()) ;
                             
                 sponsoringService ps5 = new sponsoringService();
                 ps5.updatePsts_nom_sponseur(txtm12.getText(), b);
                 Parent root ;
                 root=FXMLLoader.load(getClass().getResource("afficherSponsoring.fxml"));
                 btna22.getScene().setRoot(root);
             } catch (IOException ex) {
                 Logger.getLogger(ModifierActualiteController.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             }); 
             //modif marquespons
         btnam.setOnAction(e->{
             try {
                 Integer b = Integer.parseInt(ida3.getText()) ;
                             
                 sponsoringService psss = new sponsoringService();
                 psss.updatePsts_marqueSpons(txtmm.getText(), b);
                 Parent root ;
                 root=FXMLLoader.load(getClass().getResource("afficherSponsoring.fxml"));
                 btnam.getScene().setRoot(root);
             } catch (IOException ex) {
                 Logger.getLogger(ModifierActualiteController.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             }); 

        
        
    }    
    
}
