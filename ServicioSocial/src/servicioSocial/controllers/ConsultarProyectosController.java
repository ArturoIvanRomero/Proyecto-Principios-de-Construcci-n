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
import javafx.scene.text.Font;
import servicioSocial.ServicioSocial;

/**
 * FXML Controller class
 *
 * @author Arturo
 */
public class ConsultarProyectosController implements Initializable {
  @FXML
  private Button registrarBT;
  @FXML
  private Font x1;
  @FXML
  private TableView<?> proyectosTV;
  @FXML
  private TableColumn<?, ?> nombreProyectoTC;
  @FXML
  private TableColumn<?, ?> dependenciaTC;
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
  private void irADocumentos(ActionEvent event) {
    servicioSocial.documentosYReportes();
  }

  @FXML
  private void salir(ActionEvent event) {
    servicioSocial.login();
  }

  @FXML
  private void registrarProyecto(ActionEvent event) {
    servicioSocial.registrarProyecto();
  } 
}
