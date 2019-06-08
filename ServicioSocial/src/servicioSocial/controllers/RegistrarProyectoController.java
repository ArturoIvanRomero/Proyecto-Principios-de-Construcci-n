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
import servicioSocial.ServicioSocial;

/**
 * FXML Controller class
 *
 * @author Arturo
 */
public class RegistrarProyectoController implements Initializable {
  @FXML
  private Button regresarBT;
  @FXML
  private TableView<?> dependenciasTV;
  @FXML
  private TableColumn<?, ?> nombreDependenciaTC;
  @FXML
  private Button registrarDependenciaBT;
  private ServicioSocial servicioSocial;

  public void setServicioSocial(ServicioSocial servicioSocial) {
    this.servicioSocial = servicioSocial;
  }

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }  

  @FXML
  private void regresar(ActionEvent event) {
    servicioSocial.consultarProyectos();
  }

  @FXML
  private void registrarDependencia(ActionEvent event) {
    servicioSocial.registrarDependencia();
  }
}
