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
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Arturo
 */
public class RegistrarDependenciaController implements Initializable {
  @FXML
  private Font x1;
  @FXML
  private TextField nombreDependenciaTF;
  @FXML
  private TextField direccionTF;
  @FXML
  private TextField ciudadTF;
  @FXML
  private TextField estadoTF;
  @FXML
  private TextField telefonoTF;
  @FXML
  private TextField correoElectronicoTF;
  @FXML
  private Button aceptarBT;
  @FXML
  private Font x2;
  @FXML
  private Button cancelarBT;

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
    Stage stage = (Stage) cancelarBT.getScene().getWindow();
    stage.close();
  }
}
