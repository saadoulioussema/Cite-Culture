/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;


import entitie.publicités;
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
import service.publicitésService;

/**
 * FXML Controller class
 *
 * @author dorra
 */
public class AfficherPubliciteController implements Initializable {

    @FXML
    private TableView<publicités> tablea2;
    @FXML
    private TableColumn<publicités, Date> coldt_début;
    @FXML
    private TableColumn<publicités, Date> coldt_fin;
    @FXML
    private TableColumn<publicités, Integer> colid;
    @FXML
    private TableColumn<publicités, String> coltitre;
    @FXML
    private TableColumn<publicités, String> coldescription;
    @FXML
    private TableColumn<publicités, String> coltype;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
         publicitésService ps=new publicitésService();
        ArrayList<publicités> pb=(ArrayList<publicités>) ps.readAllp();
        ObservableList<publicités> obs=FXCollections.observableArrayList(pb);
        tablea2.setItems(obs);
        coldt_début.setCellValueFactory(new PropertyValueFactory<>("dt_début"));
        coldt_fin.setCellValueFactory(new PropertyValueFactory<>("dt_fin"));
        colid.setCellValueFactory(new PropertyValueFactory<>("id"));
        coltitre.setCellValueFactory(new PropertyValueFactory<>("titre"));
        coldescription.setCellValueFactory(new PropertyValueFactory<>("description"));
        coltype.setCellValueFactory(new PropertyValueFactory<>("type"));
        
    }    
    
}
