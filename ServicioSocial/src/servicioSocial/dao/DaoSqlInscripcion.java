/**
 * Descripción: DAO del SQL Alumno.
 * @autor Acevedo Suárez Josue Armando y Romero Peña Arturo Iván
 * @version 1, 2019/06/07
 */
package servicioSocial.dao;

import servicioSocial.clases.Alumno;
import servicioSocial.clases.Inscripcion;

public interface DaoSqlInscripcion {
  public Inscripcion consultarInscripcion(Alumno alumno);
}
