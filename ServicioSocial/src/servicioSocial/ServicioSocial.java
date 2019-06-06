/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioSocial;

import servicioSocial.controllers.ConsultarProyectosController;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author rockm
 */
public class ServicioSocial extends Application {
    Stage stage;
    @Override
    public void start(Stage stage) throws Exception {
        this.stage=stage;
        consultarProyectos();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private void consultarProyectos() throws IOException {
        
        FXMLLoader loader=new FXMLLoader(ServicioSocial.class.getResource("interfaces/ConsultarProyectos.fxml"));
        AnchorPane root=(AnchorPane)loader.load();
        ConsultarProyectosController proyectosController=(ConsultarProyectosController)loader.getController();
        proyectosController.setServicioSocial(this);
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}
