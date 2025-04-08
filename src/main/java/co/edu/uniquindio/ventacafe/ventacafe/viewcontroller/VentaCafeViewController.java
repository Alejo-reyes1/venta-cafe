package co.edu.uniquindio.ventacafe.ventacafe.viewcontroller;

import co.edu.uniquindio.ventacafe.ventacafe.model.Fachada;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class VentaCafeViewController {

    Fachada fachada = new Fachada();

    @FXML
    private RadioButton rbPasilla;

    @FXML
    private RadioButton rbEspecial;

    @FXML
    private ComboBox<String> cmbMetodoPreparacion;

    @FXML
    private Label lbIngredientes;

    @FXML
    private CheckBox cbAzucar;

    @FXML
    private CheckBox cbLeche;

    @FXML
    private Button btnCalcularCafe;

    @FXML
    private Label lbCosto;

    @FXML
    private Label lbTipoCafe;

    @FXML
    private CheckBox cbWhisky;

    @FXML
    private CheckBox cbCanela;

    @FXML
    void onCalcularCafe(ActionEvent event) {
        boolean isAzucar = cbAzucar.isSelected();
        boolean isLeche = cbLeche.isSelected();
        boolean isWhisky = cbWhisky.isSelected();
        boolean isCanela = cbCanela.isSelected();

        String tipoCafe = obtenerTipoCafe();
        String precioCafe = calcularPrecio(isAzucar, isLeche,isWhisky, isCanela);
        String ingredientesCafe = ingresdientesCafe(isAzucar,isLeche,isWhisky, isCanela);

        lbTipoCafe.setText("Tipo de café: ");
        lbCosto.setText(precioCafe);
        lbIngredientes.setText(ingredientesCafe);
    }

    @FXML
    void onMetodoPreparacion(ActionEvent event) {
        String metodo = cmbMetodoPreparacion.getValue();
        System.out.println(metodo);
    }

    private String obtenerTipoCafe() {
        if (rbPasilla.isSelected()) { return " Pasilla"; }
        else if (rbEspecial.isSelected()) { return " Especial"; }
        else { return " sin especificar"; }
    }

    private String ingresdientesCafe(boolean isAzucar, boolean isLeche, boolean isWhisky, boolean isCanela) {
        String tipoCafe = obtenerTipoCafe();
        return "Ingredientes: " + fachada.crearIngrediente(tipoCafe, isAzucar, isLeche, isWhisky, isCanela);
    }

    private String calcularPrecio(boolean isAzucar, boolean isLeche, boolean isWhisky, boolean isCanela) {
        return "Costo: " + fachada.calcularPrecio(isAzucar, isLeche, isWhisky, isCanela);
    }

    @FXML
    void initialize() {
        cmbMetodoPreparacion.getItems().addAll("Moka", "Prensa francesa", "Espresso", "Aeropress");
    }
}

