/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import entitie.publicités;
import entitie.sponsoring;
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
import service.sponsoringService;

/**
 * FXML Controller class
 *
 * @author dorra
 */
public class AjouterSponsoringController implements Initializable {

    @FXML
    private TextField txta8;
    @FXML
    private TextField txta9;
    @FXML
    private TextField txta10;
    @FXML
    private TextField txta11;
    @FXML
    private DatePicker dp5;
    @FXML
    private TextField txta12;
    @FXML
    private Button btna3;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        btna3.setOnAction(e->{
            try {
                java.sql.Date a = java.sql.Date.valueOf(dp5.getValue());
                
                sponsoring  p = new sponsoring(txta8.getText(), txta9.getText(), txta10.getText(), txta11.getText(), a, txta12.getText());
                sponsoringService ps = new sponsoringService();
                ps.inserts(p);
                Parent root ;
                root=FXMLLoader.load(getClass().getResource("afficherSponsoring.fxml"));
                btna3.getScene().setRoot(root);
            } catch (IOException ex) {
                Logger.getLogger(AjouterSponsoringController.class.getName()).log(Level.SEVERE, null, ex);
            }
              
              
              
                    
    });    
    }    
    
}
