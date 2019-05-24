/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author rockm
 */
public class DocumentosYReportesController implements Initializable {

    @FXML
    private Label alumnoLB;
    @FXML
    private TextField matriculaTF;
    @FXML
    private Button buscarBT;
    @FXML
    private Label matriculaLB;
    @FXML
    private Button subirHorarioBT;
    @FXML
    private Button modificarHorarioBT;
    @FXML
    private Button subirCartaPresentacionBT;
    @FXML
    private Button modificarCartaPresentacionBT;
    @FXML
    private Button subirCartaAceptacion;
    @FXML
    private Button modificarCartaAceptacionBT;
    @FXML
    private Button subirPlanActividadesBT;
    @FXML
    private Button modificarPlanActividadesBT;
    @FXML
    private Button subirCartaLiberacionBT;
    @FXML
    private Button modificarCartaLiberacionBT;
    @FXML
    private Button subirReporteFinalBT;
    @FXML
    private Button modificarReporteFinalBT;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void irAProyectos(ActionEvent event) {
    }

    @FXML
    private void irADocumentos(ActionEvent event) {
    }
    
}
