/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import entitie.actualités;
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
public class AjouterActualiteController implements Initializable {

    @FXML
    private DatePicker dp1;
    @FXML
    private DatePicker dpa2;
    @FXML
    private TextField txta1;
    @FXML
    private TextField txta2;
    @FXML
    private TextField txta3;
    @FXML
    private TextField txta4;
    @FXML
    private Button btna1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
         btna1.setOnAction(e->{
             try {
                 java.sql.Date a = java.sql.Date.valueOf(dp1.getValue());
                 java.sql.Date b = java.sql.Date.valueOf(dpa2.getValue());
                 actualités p = new actualités(a, b, txta1.getText(), txta2.getText(), txta3.getText(), txta4.getText());
                 actualitésService ps = new actualitésService();
                 ps.inserta(p);
                 Parent root ;
                 root=FXMLLoader.load(getClass().getResource("afficherActualite.fxml"));
                 btna1.getScene().setRoot(root);
             } catch (IOException ex) {
                 Logger.getLogger(AjouterActualiteController.class.getName()).log(Level.SEVERE, null, ex);
             }
              
              
              
                    
    });    
    }    
    
}
