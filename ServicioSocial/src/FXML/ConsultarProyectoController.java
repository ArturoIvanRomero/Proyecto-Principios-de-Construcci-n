/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Luis Angel Olivo
 */
public class ConsultarProyectoController implements Initializable {

    @FXML
    private Font x1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void registrarProyecto(ActionEvent event) throws IOException {
        /*final Alumno persona = getTablaPersonasSeleccionada();
        posicionPersonaEnTabla = personas.indexOf(persona);*/
        Stage stage2=new Stage();
        FXMLLoader loader=new FXMLLoader();
        AnchorPane root=(AnchorPane)loader.load(getClass().getResource("RegistrarProyecto.fxml").openStream());
        RegistrarProyectoController st2C=(RegistrarProyectoController)loader.getController();
        //st2C.recibeP(con1,persona.getNombre());
        Scene scene=new Scene(root);
        stage2.setScene(scene);
        stage2.alwaysOnTopProperty();
        stage2.initModality(Modality.APPLICATION_MODAL);
        stage2.show();
    }
    
}
