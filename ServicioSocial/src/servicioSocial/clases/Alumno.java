/**
 * Descripción: Clase Alumno.
 * @autor Acevedo Suárez Josue Armando y Romero Peña Arturo Iván
 * @version 1, 2019/06/07
 */
package servicioSocial.clases;

import javafx.beans.property.SimpleStringProperty;

public class Alumno {
  private SimpleStringProperty matricula = new SimpleStringProperty();
  private SimpleStringProperty nombre = new SimpleStringProperty();
  private SimpleStringProperty correoElectronico = new SimpleStringProperty();
  private SimpleStringProperty telefono = new SimpleStringProperty();
  private SimpleStringProperty programaEducativo = new SimpleStringProperty();

  public Alumno() {
    matricula.set("");
  }
  
  public Alumno(String matricula, String nombre, String correoElectronico, String telefono, 
          String programaEducativo) {
    this.matricula.set(matricula);
    this.nombre.set(nombre);
    this.correoElectronico.set(correoElectronico);
    this.telefono.set(telefono);
    this.programaEducativo.set(programaEducativo);
  }
  
  public String getMatricula() {
    return matricula.get();
  }

  public String getNombre() {
    return nombre.get();
  }
}
