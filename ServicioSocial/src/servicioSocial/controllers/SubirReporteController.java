/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioSocial.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

/**
 * FXML Controller class
 *
 * @author rockm
 */
public class SubirReporteController implements Initializable {

    @FXML
    private Button aceptarBT;
    @FXML
    private Font x1;
    @FXML
    private Button cancelarBT;
    @FXML
    private Button subirArchivoBT;
    @FXML
    private Label archivoLB;
    @FXML
    private Font x2;
    @FXML
    private ComboBox<?> mesCB;
    @FXML
    private TextField horasRealizadasTF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void aceptar(ActionEvent event) {
    }

    @FXML
    private void cancelar(ActionEvent event) {
    }

    @FXML
    private void subirArchivo(ActionEvent event) {
    }
    
}