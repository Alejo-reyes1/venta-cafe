package co.edu.uniquindio.ventacafe.ventacafe.viewcontroller;

import co.edu.uniquindio.ventacafe.ventacafe.model.Fachada;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class VentaCafeViewController {

    Fachada fachada=new Fachada();

    @FXML
    private Button btnCalcularCafe;

    @FXML
    private CheckBox cbAzucar;

    @FXML
    private CheckBox cbLeche;

    @FXML
    private Label lbCosto;

    @FXML
    private Label lbIngredientes;

    @FXML
    private CheckBox cbWhisky;

    @FXML
    void onCalcularCafe(ActionEvent event) {
        boolean isAzucar=cbAzucar.isSelected();
        boolean isLeche=cbLeche.isSelected();
        boolean isWhisky=cbWhisky.isSelected();
        String precioCafe=calcularPrecio(isAzucar, isLeche,isWhisky);
        String ingredientesCafe=ingresdientesCafe(isAzucar,isLeche,isWhisky);
        lbCosto.setText(precioCafe);
        lbIngredientes.setText(ingredientesCafe);
    }

    private String ingresdientesCafe(boolean isAzucar, boolean isLeche, boolean isWhisky) {
        return "Ingredientes: "+ fachada.crearIngrediente(isAzucar, isLeche, isWhisky);
    }

    private String calcularPrecio(boolean isAzucar, boolean isLeche, boolean isWhisky) {
        return "Costo: " + fachada.calcularPrecio(isAzucar, isLeche, isWhisky);
    }

    @FXML
    void initialize() {

    }

}

