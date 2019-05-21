/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

/**
 * FXML Controller class
 *
 * @author rockm
 */
public class RegistrarProyectoDatosController implements Initializable {

    @FXML
    private Label nombreDependenciaLB;
    @FXML
    private Font x1;
    @FXML
    private TextField nombreProyectoTF;
    @FXML
    private TextArea descripcionTA;
    @FXML
    private TextArea actividadesTA;
    @FXML
    private TableView<?> horarioTV;
    @FXML
    private TableColumn<?, ?> lunesTC;
    @FXML
    private TableColumn<?, ?> martesTC;
    @FXML
    private TableColumn<?, ?> miercolesTC;
    @FXML
    private TableColumn<?, ?> juevesTC;
    @FXML
    private TableColumn<?, ?> viernesTC;
    @FXML
    private TableColumn<?, ?> sabadoTC;
    @FXML
    private TableColumn<?, ?> domingoTC;
    @FXML
    private TextField horarioTF;
    @FXML
    private ComboBox<?> diaCB;
    @FXML
    private TextField nombreJefeProyectoTF;
    @FXML
    private TextField cargoTF;
    @FXML
    private TextField correoElectronicoTF;
    @FXML
    private Button aceptarBT;
    @FXML
    private Font x2;
    @FXML
    private Button cancelarBT;
    @FXML
    private Button regresarBT;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void aceptar(ActionEvent event) {
    }

    @FXML
    private void cancelar(ActionEvent event) {
    }

    @FXML
    private void regresar(ActionEvent event) {
    }
    
}
