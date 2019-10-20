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
import service.sponsoringService;


/**
 * FXML Controller class
 *
 * @author dorra
 */
public class SupprimerSponsoringController implements Initializable {

    @FXML
    private Button btna6;
    @FXML
    private TextField txta15;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         btna6.setOnAction(e->{
             try {
                 Integer c = Integer.parseInt(txta15.getText()) ;
                 sponsoringService ps = new sponsoringService();
                 ps.deletePsts(c);
                 Parent root ;
                 root=FXMLLoader.load(getClass().getResource("afficherSponsoring.fxml"));
                 btna6.getScene().setRoot(root);
             } catch (IOException ex) {
                 Logger.getLogger(SupprimerPubliciteController.class.getName()).log(Level.SEVERE, null, ex);
             }
    });    
    }    
    
}
