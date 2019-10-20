/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import entitie.sponsoring;
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
import service.sponsoringService;

/**
 * FXML Controller class
 *
 * @author dorra
 */
public class AfficherSponsoringController implements Initializable {

    @FXML
    private TableView<sponsoring> tablea3;
    @FXML
    private TableColumn<sponsoring, String> colnomEvent;
    @FXML
    private TableColumn<sponsoring, String> colmarqueSpons;
    @FXML
    private TableColumn<sponsoring, String> colcatégorieEvent;
    @FXML
    private TableColumn<sponsoring, Integer> colid;
    @FXML
    private TableColumn<sponsoring, String> colservice_à_offrir;
    @FXML
    private TableColumn<sponsoring, Date> coldate_contrat;
    @FXML
    private TableColumn<sponsoring, String> colnom_sponseur;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         sponsoringService ps=new sponsoringService();
        ArrayList<sponsoring> sp=(ArrayList<sponsoring>) ps.readAlls();
        ObservableList<sponsoring> obs=FXCollections.observableArrayList(sp);
        tablea3.setItems(obs);
         colnomEvent.setCellValueFactory(new PropertyValueFactory<>("nomEvent"));
        colmarqueSpons.setCellValueFactory(new PropertyValueFactory<>("marqueSpons"));
        colcatégorieEvent.setCellValueFactory(new PropertyValueFactory<>("catégorieEvent"));
        colid.setCellValueFactory(new PropertyValueFactory<>("id"));
        colservice_à_offrir.setCellValueFactory(new PropertyValueFactory<>("service_à_offrir"));
        coldate_contrat.setCellValueFactory(new PropertyValueFactory<>("date_contrat"));
        colnom_sponseur.setCellValueFactory(new PropertyValueFactory<>("nom_sponseur"));
       
    }    
    
}
