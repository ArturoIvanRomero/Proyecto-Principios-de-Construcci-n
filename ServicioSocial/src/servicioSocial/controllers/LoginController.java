/**
 * Descripción: Controlador de la interfaz Login.
 * @autor Romero Peña Arturo Iván
 * @version 1, 2019/06/07
 */
package servicioSocial.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import servicioSocial.ServicioSocial;
import servicioSocial.clases.Usuario;
import servicioSocial.sql.SqlUsuario;

public class LoginController implements Initializable {
  @FXML
  private Font x1;
  @FXML
  private Font x2;
  @FXML
  private TextField usuarioTF;
  @FXML
  private PasswordField contraseniaPF;
  @FXML
  private Button entrarBT;
  @FXML
  private Label notaLB;
  private ServicioSocial servicioSocial;
  private SqlUsuario sqlUsuario = new SqlUsuario();

  public void setServicioSocial(ServicioSocial servicioSocial) {
    this.servicioSocial = servicioSocial;
  }

  @Override
  public void initialize(URL url, ResourceBundle rb) {
  }  

  /**
   * Método que valida si el usuario existe y si no manda un mensaje.
   * @param event Dar clic al botón "Entrar".
   */
  @FXML
  private void entrar(ActionEvent event) {
    Usuario usuario = sqlUsuario.consultarUsuario(usuarioTF.getText(), contraseniaPF.getText());
    if (!usuario.getUsuario().equals("")){
      if (!usuario.getUsuario().substring(0, 2).equals("CO")){
        servicioSocial.setCoordinador(false);
        servicioSocial.documentosYReportes();
      } else {
        servicioSocial.consultarProyectos();
      }
    } else{
      contraseniaPF.setText("");
      notaLB.setText("El nombre de usuario o contraseña son incorrectos");
    }
  }
}
