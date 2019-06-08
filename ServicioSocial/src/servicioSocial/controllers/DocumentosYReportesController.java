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
import javafx.scene.control.MenuBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import servicioSocial.ServicioSocial;

/**
 * FXML Controller class
 *
 * @author Arturo
 */
public class DocumentosYReportesController implements Initializable {
  @FXML
  private MenuBar menuMB;
  @FXML
  private TextField matriculaTF;
  @FXML
  private Button buscarBT;
  @FXML
  private Font x1;
  @FXML
  private Label alumnoLB;
  @FXML
  private Label matriculaLB;
  @FXML
  private Font x3;
  @FXML
  private Button subirHorarioBT;
  @FXML
  private Font x2;
  @FXML
  private Button modificarHorarioBT;
  @FXML
  private Button subirCartaPresentacionBT;
  @FXML
  private Button modificarCartaPresentacionBT;
  @FXML
  private Button subirCartaAceptacionBT;
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
  @FXML
  private TableView<?> reporteTV;
  @FXML
  private TableColumn<?, ?> nombreTC;
  @FXML
  private Button subirReporteBT;
  @FXML
  private Button modificarReporteBT;
  private ServicioSocial servicioSocial;

  public void setServicioSocial(ServicioSocial servicioSocial){
    this.servicioSocial = servicioSocial;
    if (!servicioSocial.getCoordinador()){
      menuMB.setVisible(false);
    }
  }
  
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }  

  @FXML
  private void irAProyectos(ActionEvent event) {
    servicioSocial.consultarProyectos();
  }

  @FXML
  private void salir(ActionEvent event) {
    servicioSocial.login();
  }

  @FXML
  private void subirHorario(ActionEvent event) {
    servicioSocial.subirDocumento();
  }

  @FXML
  private void modificarHorario(ActionEvent event) {
    servicioSocial.modificarDocumento();
  }

  @FXML
  private void subirCartaPresentacion(ActionEvent event) {
    servicioSocial.subirDocumento();
  }

  @FXML
  private void modificarCartaPresentacion(ActionEvent event) {
    servicioSocial.modificarDocumento();
  }

  @FXML
  private void subirCartaAcpetacion(ActionEvent event) {
    servicioSocial.subirDocumento();
  }

  @FXML
  private void modificarCartaAceptacion(ActionEvent event) {
    servicioSocial.modificarDocumento();
  }

  @FXML
  private void subirPlanActividades(ActionEvent event) {
    servicioSocial.subirDocumento();
  }

  @FXML
  private void modificarPlanActividades(ActionEvent event) {
    servicioSocial.modificarDocumento();
  }

  @FXML
  private void subirCartaLiberacion(ActionEvent event) {
    servicioSocial.subirDocumento();
  }

  @FXML
  private void modificarCartaLiberacion(ActionEvent event) {
    servicioSocial.modificarDocumento();
  }

  @FXML
  private void subirReporteFinal(ActionEvent event) {
    servicioSocial.subirDocumento();
  }

  @FXML
  private void modificarReporteFinal(ActionEvent event) {
    servicioSocial.modificarDocumento();
  }

  @FXML
  private void subirReporte(ActionEvent event) {
    servicioSocial.subirReporte();
  }

  @FXML
  private void modificarReporte(ActionEvent event) {
    servicioSocial.modificarReporte();
  }
  
}
