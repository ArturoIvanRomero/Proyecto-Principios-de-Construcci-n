/**
 * Descripción: Clase con las consultas SQL de Usuario.
 * @autor Romero Peña Arturo Iván
 * @version 1, 2019/06/07
 */
package servicioSocial.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import servicioSocial.clases.Usuario;
import servicioSocial.conexion.Conexion;
import servicioSocial.dao.DaoSqlUsuario;

public class SqlUsuario implements DaoSqlUsuario {
  @Override
  public Usuario consultarUsuario(String usuario, String contrasenia) {
    Usuario usuarioSS = new Usuario();
    Statement s;
    Connection conn = null;
    conn = new Conexion().getConnection();
    ResultSet rs = null;
    String sQuery = "select * from usuario where usuario = '" + usuario + "' and contrasenia = '" + 
            contrasenia + "';";
    try {
      s = conn.createStatement();
      rs = s.executeQuery(sQuery);
      while (rs != null && rs.next()) {
        Usuario usuario2 = new Usuario(rs.getString("usuario"), rs.getString("contrasenia"));
        usuarioSS = usuario2;
      }
    } catch (SQLException ex) {
      Logger.getLogger(SqlUsuario.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
      try {
        conn.close();
      } catch (SQLException ex) {
        Logger.getLogger(SqlUsuario.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    return usuarioSS;
  }
}
