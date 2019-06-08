/**
 * Descripción: Clase Inscripción.
 * @autor Acevedo Suárez Josue Armando y Romero Peña Arturo Iván
 * @version 1, 2019/06/07
 */
package servicioSocial.clases;

import javafx.beans.property.SimpleStringProperty;

public class Inscripcion {
  private int idInscripcion;
  private int numInscripcion;
  private SimpleStringProperty estado = new SimpleStringProperty();
  private int horasRealizadas;
  private SimpleStringProperty matricula = new SimpleStringProperty();
  private int idExperienciaEducativa;
  private int idPlanActividades;

  public Inscripcion(int idInscripcion, int numInscripcion, String estado, int horasRealizadas, 
          String matricula, int idExperienciaEducativa, int idPlanActividades) {
    this.idInscripcion = idInscripcion;
    this.matricula.set(matricula);
    this.idExperienciaEducativa = idExperienciaEducativa;
    this.numInscripcion = numInscripcion;
    this.estado.set(estado);
    this.horasRealizadas = horasRealizadas;
    this.idPlanActividades = idPlanActividades;
  }
  
  public Inscripcion(int idInscripcion, int numInscripcion, String estado, int horasRealizadas, 
          String matricula, int idExperienciaEducativa) {
    this.idInscripcion = idInscripcion;
    this.matricula.set(matricula);
    this.idExperienciaEducativa = idExperienciaEducativa;
    this.numInscripcion = numInscripcion;
    this.estado.set(estado);
    this.horasRealizadas = horasRealizadas;
  }

  public int getIdInscripcion() {
    return idInscripcion;
  }
}
