package co.edu.uniquindio.ventacafe.ventacafe.model;

public class Fachada {

    public Fachada(){}

    public double calcularPrecio(boolean isAzucar, boolean isLeche, boolean isWhisky){
        double precio=0;

        return precio;
    }
    public String crearIngrediente(boolean isAzucar, boolean isLeche, boolean isWhisky){
        String ingrediente="Cafe";
        if(isAzucar) ingrediente+=" + Azucar";
        if(isLeche) ingrediente+=" + Leche";
        if(isWhisky) ingrediente+=" + Whisky";

        return ingrediente;
    }


}
