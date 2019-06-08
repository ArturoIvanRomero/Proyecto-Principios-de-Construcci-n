/**
 * Descripción: Clase principal.
 * @autor Acevedo Suárez Josué Armando, Olivo Martínez Luis Ángel, Quiñones Cordova Roberto,
 *        Romero Peña Arturo Iván.
 * @versión 1.2, 2019/06/07
 */
package servicioSocial;

import servicioSocial.controllers.ConsultarProyectosController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import servicioSocial.controllers.ConsultarProyectoController;
import servicioSocial.controllers.DocumentosYReportesController;
import servicioSocial.controllers.LoginController;
import servicioSocial.controllers.ModificarDocumentoController;
import servicioSocial.controllers.ModificarReporteController;
import servicioSocial.controllers.RegistrarDependenciaController;
import servicioSocial.controllers.RegistrarProyectoController;
import servicioSocial.controllers.RegistrarProyectoDatosController;
import servicioSocial.controllers.SubirDocumentoController;
import servicioSocial.controllers.SubirReporteController;

public class ServicioSocial extends Application {
  private Stage stage;
  private boolean coordinador = true;

  public boolean getCoordinador() {
    return coordinador;
  }

  public void setCoordinador(boolean coordinador) {
    this.coordinador = coordinador;
  }

  @Override
  public void start(Stage stage) throws Exception {
    this.stage = stage;
    //login();
    consultarProyectos();
    //documentosYReportes();
  }

  public static void main(String[] args) {
    launch(args);
  }

  public void login() {
    try {
      FXMLLoader loader = new FXMLLoader(ServicioSocial.class.getResource("interfaces/Login.fxml"));
      AnchorPane root = (AnchorPane) loader.load();
      LoginController loginController
              = (LoginController) loader.getController();
      loginController.setServicioSocial(this);
      Scene scene = new Scene(root);
      stage.setTitle("Servicio Social FEI");
      stage.setScene(scene);
      stage.centerOnScreen();
      stage.show();
    } catch (IOException ex) {
      Logger.getLogger(ServicioSocial.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  public void consultarProyectos() {
    try {
      FXMLLoader loader = new FXMLLoader(ServicioSocial.class.getResource("interfaces/ConsultarProyectos.fxml"));
      AnchorPane root = (AnchorPane) loader.load();
      ConsultarProyectosController consultarProyectosController
              = (ConsultarProyectosController) loader.getController();
      consultarProyectosController.setServicioSocial(this);
      Scene scene = new Scene(root);
      stage.setTitle("Servicio Social FEI");
      stage.setScene(scene);
      stage.centerOnScreen();
      stage.show();
    } catch (IOException ex) {
      Logger.getLogger(ServicioSocial.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  public void consultarProyecto() {
    try {
      FXMLLoader loader = new FXMLLoader(ServicioSocial.class.getResource("interfaces/ConsultarProyecto.fxml"));
      AnchorPane root = (AnchorPane) loader.load();
      ConsultarProyectoController consultarProyectoController
              = (ConsultarProyectoController) loader.getController();
      consultarProyectoController.setServicioSocial(this);
      Scene scene = new Scene(root);
      stage.setTitle("Servicio Social FEI");
      stage.setScene(scene);
      stage.centerOnScreen();
      stage.show();
    } catch (IOException ex) {
      Logger.getLogger(ServicioSocial.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  public void registrarProyecto() {
    try {
      FXMLLoader loader = new FXMLLoader(ServicioSocial.class.getResource("interfaces/RegistrarProyecto.fxml"));
      AnchorPane root = (AnchorPane) loader.load();
      RegistrarProyectoController registrarProyectoController
              = (RegistrarProyectoController) loader.getController();
      registrarProyectoController.setServicioSocial(this);
      Scene scene = new Scene(root);
      stage.setTitle("Servicio Social FEI");
      stage.setScene(scene);
      stage.show();
    } catch (IOException ex) {
      Logger.getLogger(ServicioSocial.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  public void registrarDependencia() {
    try {
      Stage stage2 = new Stage();
      FXMLLoader loader = new FXMLLoader(ServicioSocial.class.getResource("interfaces/RegistrarDependencia.fxml"));
      AnchorPane root = (AnchorPane) loader.load();
      RegistrarDependenciaController registrarDependenciaController
              = (RegistrarDependenciaController) loader.getController();
      Scene scene = new Scene(root);
      stage2.setTitle("Servicio Social FEI");
      stage2.setScene(scene);
      stage2.show();
    } catch (IOException ex) {
      Logger.getLogger(ServicioSocial.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  public void registrarProyectoDatos() {
    try {
      FXMLLoader loader = new FXMLLoader(ServicioSocial.class.getResource("interfaces/RegistrarProyectoDatos.fxml"));
      AnchorPane root = (AnchorPane) loader.load();
      RegistrarProyectoDatosController registrarProyectoDatosController
              = (RegistrarProyectoDatosController) loader.getController();
      registrarProyectoDatosController.setServicioSocial(this);
      Scene scene = new Scene(root);
      stage.setTitle("Servicio Social FEI");
      stage.setScene(scene);
      stage.show();
    } catch (IOException ex) {
      Logger.getLogger(ServicioSocial.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  public void documentosYReportes() {
    try {
      FXMLLoader loader = new FXMLLoader(ServicioSocial.class.getResource("interfaces/DocumentosYReportes.fxml"));
      AnchorPane root = (AnchorPane) loader.load();
      DocumentosYReportesController documentosYReportesController
              = (DocumentosYReportesController) loader.getController();
      documentosYReportesController.setServicioSocial(this);
      Scene scene = new Scene(root);
      stage.setTitle("Servicio Social FEI");
      stage.setScene(scene);
      stage.centerOnScreen();
      stage.show();
    } catch (IOException ex) {
      Logger.getLogger(ServicioSocial.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  public void subirDocumento() {
    try {
      Stage stage2 = new Stage();
      FXMLLoader loader = new FXMLLoader(ServicioSocial.class.getResource("interfaces/SubirDocumento.fxml"));
      AnchorPane root = (AnchorPane) loader.load();
      SubirDocumentoController subirDocumentoController
              = (SubirDocumentoController) loader.getController();
      Scene scene = new Scene(root);
      stage2.setTitle("Servicio Social FEI");
      stage2.setScene(scene);
      stage2.show();
    } catch (IOException ex) {
      Logger.getLogger(ServicioSocial.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  public void subirReporte() {
    try {
      Stage stage2 = new Stage();
      FXMLLoader loader = new FXMLLoader(ServicioSocial.class.getResource("interfaces/SubirReporte.fxml"));
      AnchorPane root = (AnchorPane) loader.load();
      SubirReporteController subirReporteController
              = (SubirReporteController) loader.getController();
      Scene scene = new Scene(root);
      stage2.setTitle("Servicio Social FEI");
      stage2.setScene(scene);
      stage2.show();
    } catch (IOException ex) {
      Logger.getLogger(ServicioSocial.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  public void modificarDocumento() {
    try {
      Stage stage2 = new Stage();
      FXMLLoader loader = new FXMLLoader(ServicioSocial.class.getResource("interfaces/ModificarDocumento.fxml"));
      AnchorPane root = (AnchorPane) loader.load();
      ModificarDocumentoController modificarDocumentoController
              = (ModificarDocumentoController) loader.getController();
      Scene scene = new Scene(root);
      stage2.setTitle("Servicio Social FEI");
      stage2.setScene(scene);
      stage2.show();
    } catch (IOException ex) {
      Logger.getLogger(ServicioSocial.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  public void modificarReporte() {
    try {
      Stage stage2 = new Stage();
      FXMLLoader loader = new FXMLLoader(ServicioSocial.class.getResource("interfaces/ModificarReporte.fxml"));
      AnchorPane root = (AnchorPane) loader.load();
      ModificarReporteController modificarReporteController
              = (ModificarReporteController) loader.getController();
      Scene scene = new Scene(root);
      stage2.setTitle("Servicio Social FEI");
      stage2.setScene(scene);
      stage2.show();
    } catch (IOException ex) {
      Logger.getLogger(ServicioSocial.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
