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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author rockm
 */
public class RegistrarProyectoController implements Initializable {

    @FXML
    private TableView<?> dependenciasTV;
    @FXML
    private TableColumn<?, ?> nombreDependenciaTC;
    @FXML
    private Button registrarBT;
    @FXML
    private Button regresarBT;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    public void clicItem(MouseEvent event){
        if (event.getClickCount() == 2){
            System.out.println("funciona");
        }
    }

    @FXML
    private void registrarDependencia(ActionEvent event) {
    }

    @FXML
    private void regresar(ActionEvent event) {
    }
    
}
