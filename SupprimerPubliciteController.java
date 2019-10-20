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
import javafx.scene.control.TextField;
import service.publicitésService;

/**
 * FXML Controller class
 *
 * @author dorra
 */
public class SupprimerPubliciteController implements Initializable {

    @FXML
    private Button btna5;
    @FXML
    private TextField txta14;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         btna5.setOnAction(e->{
             try {
                 Integer b = Integer.parseInt(txta14.getText()) ;
                 publicitésService ps = new publicitésService();
                 ps.deletePstp(b);
                 Parent root ;
                 root=FXMLLoader.load(getClass().getResource("afficherPublicite.fxml"));
                 btna5.getScene().setRoot(root);
             } catch (IOException ex) {
                 Logger.getLogger(SupprimerPubliciteController.class.getName()).log(Level.SEVERE, null, ex);
             }
    });    
    
    }    
    
}
