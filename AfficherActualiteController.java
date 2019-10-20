/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import entitie.actualités;
import java.net.URL;
import java.sql.Date;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import service.actualitésService;

/**
 * FXML Controller class
 *
 * @author dorra
 */
public class AfficherActualiteController implements Initializable {

    @FXML
    private TableView<actualités> tablea1;
    @FXML
    private TableColumn<actualités, Date> coldate_Début;
    @FXML
    private TableColumn<actualités, Date> coldate_Fin;
    @FXML
    private TableColumn<actualités, Integer> colid;
    @FXML
    private TableColumn<actualités, String> coldescription;
    @FXML
    private TableColumn<actualités, String> coltitre;
    @FXML
    private TableColumn<actualités, String> colnomEvent;
    @FXML
    private TableColumn<actualités, String> colcatégorieEvent;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
         actualitésService ps=new actualitésService();
        ArrayList<actualités> act=(ArrayList<actualités>) ps.readAlla();
        ObservableList<actualités> obs=FXCollections.observableArrayList(act);
        tablea1.setItems(obs);
        colid.setCellValueFactory(new PropertyValueFactory<>("id"));
        coldate_Début.setCellValueFactory(new PropertyValueFactory<>("date_Début"));
        coldate_Fin.setCellValueFactory(new PropertyValueFactory<>("date_Fin"));
        coldescription.setCellValueFactory(new PropertyValueFactory<>("description"));
        coltitre.setCellValueFactory(new PropertyValueFactory<>("titre"));
        colnomEvent.setCellValueFactory(new PropertyValueFactory<>("nomEvent"));
        colcatégorieEvent.setCellValueFactory(new PropertyValueFactory<>("catégorieEvent"));
        
        
    }    
    
}
