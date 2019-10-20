/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import entitie.actualités;
import entitie.publicités;
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
import service.publicitésService;

/**
 * FXML Controller class
 *
 * @author dorra
 */
public class AjouterPubliciteController implements Initializable {

    @FXML
    private DatePicker dp3;
    @FXML
    private DatePicker dp4;
    @FXML
    private TextField txta5;
    @FXML
    private TextField txta6;
    @FXML
    private TextField txta7;
    @FXML
    private Button btna2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
         btna2.setOnAction(e->{
             try {
                 java.sql.Date a = java.sql.Date.valueOf(dp3.getValue());
                 java.sql.Date b = java.sql.Date.valueOf(dp4.getValue());
                 
                 publicités p = new publicités(a, b, txta5.getText(), txta6.getText(), txta7.getText());
                 publicitésService ps = new publicitésService();
                 ps.insertp(p);
                 Parent root ;
                 root=FXMLLoader.load(getClass().getResource("afficherPublicite.fxml"));
                 btna2.getScene().setRoot(root);
             } catch (IOException ex) {
                 Logger.getLogger(AjouterPubliciteController.class.getName()).log(Level.SEVERE, null, ex);
             }
              
              
              
                    
    });    
    }    
    
}
