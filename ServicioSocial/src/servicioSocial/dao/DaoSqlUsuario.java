/**
 * Descripción: DAO del SQL Alumno.
 * @autor Romero Peña Arturo Iván
 * @version 1, 2019/06/07
 */
package servicioSocial.dao;

import servicioSocial.clases.Usuario;

public interface DaoSqlUsuario {
  public Usuario consultarUsuario(String usuario, String contrasenia);
}
