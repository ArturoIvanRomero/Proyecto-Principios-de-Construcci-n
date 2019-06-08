/**
 * Descripción: Clase Usuario.
 * @autor Romero Peña Arturo Iván
 * @version 1, 2019/06/07
 */
package servicioSocial.clases;

public class Usuario {
  private String usuario;
  private String contrasenia;

  public Usuario(){
    usuario = "";
  }
  
  public Usuario(String usuario, String contrasenia) {
    this.usuario = usuario;
    this.contrasenia = contrasenia;
  }

  public String getUsuario() {
    return usuario;
  }

  public String getContrasenia() {
    return contrasenia;
  }
}
