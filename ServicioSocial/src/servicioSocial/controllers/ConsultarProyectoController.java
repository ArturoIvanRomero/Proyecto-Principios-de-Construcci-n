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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import servicioSocial.ServicioSocial;

/**
 * FXML Controller class
 *
 * @author Arturo
 */
public class ConsultarProyectoController implements Initializable {
  @FXML
  private Button regresarBT;
  @FXML
  private Font x1;
  @FXML
  private Label nombreDependenciaLB;
  @FXML
  private TextField nombreProyectoTF;
  @FXML
  private TextArea descripcionTA;
  @FXML
  private TextArea actividadesTA;
  @FXML
  private TableView<?> horarioTV;
  @FXML
  private TableColumn<?, ?> lunesTC;
  @FXML
  private TableColumn<?, ?> martesTC;
  @FXML
  private TableColumn<?, ?> miercolesTC;
  @FXML
  private TableColumn<?, ?> juevesTC;
  @FXML
  private TableColumn<?, ?> viernesTC;
  @FXML
  private TableColumn<?, ?> sabadoTC;
  @FXML
  private TableColumn<?, ?> domingoTC;
  @FXML
  private TextField nombreJefeProyectoTF;
  @FXML
  private TextField cargoTF;
  @FXML
  private TextField correoElectronicoTF;
  @FXML
  private Font x2;
  private ServicioSocial servicioSocial;

  public void setServicioSocial(ServicioSocial servicioSocial) {
    this.servicioSocial = servicioSocial;
  }

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
  }  

  @FXML
  private void regresar(ActionEvent event) {
    servicioSocial.consultarProyectos();
  }
}
