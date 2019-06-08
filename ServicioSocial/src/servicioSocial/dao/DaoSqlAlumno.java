/**
 * Descripción: DAO del SQL Alumno.
 * @autor Acevedo Suárez Josue Armando y Romero Peña Arturo Iván
 * @version 1, 2019/06/07
 */
package servicioSocial.dao;

import servicioSocial.clases.Alumno;
import java.util.List;

public interface DaoSqlAlumno {
  public Alumno consultarAlumno(String matricula);
  public List<Alumno> consultarAlumnos(String periodoEscolar);
}