package co.edu.uniquindio.ventacafe.ventacafe.model;

import co.edu.uniquindio.ventacafe.ventacafe.service.ICoffe;
import co.edu.uniquindio.ventacafe.ventacafe.SuggarDecorator;
import co.edu.uniquindio.ventacafe.ventacafe.MilkDecorator;
import co.edu.uniquindio.ventacafe.ventacafe.WhiskyDecorator;
import co.edu.uniquindio.ventacafe.ventacafe.CinnamonDecorator;

public class Fachada {

    public Fachada(){}

    public ICoffe crearCoffeDecorado(boolean isAzucar, boolean isLeche, boolean isWhisky, boolean isCanela){
        ICoffe coffe = new SimpleCoffe();

        if (isAzucar) {
            coffe = new SuggarDecorator(coffe);
        }
        if (isLeche) {
            coffe = new MilkDecorator(coffe);
        }
        if (isWhisky) {
            coffe = new WhiskyDecorator(coffe);
        }
        if (isCanela) {
            coffe = new CinnamonDecorator(coffe);
        }

        return coffe;
    }

    public double calcularPrecio(boolean isAzucar, boolean isLeche, boolean isWhisky, boolean isCanela){
        ICoffe coffe = crearCoffeDecorado(isAzucar, isLeche, isWhisky, isCanela);
        return coffe.getCost();
    }
    public String crearIngrediente(String tipoCafe, boolean isAzucar, boolean isLeche, boolean isWhisky, boolean isCanela) {
        String ingrediente = "Cafe" + tipoCafe;
        if(isAzucar) ingrediente += " + Azucar";
        if(isLeche) ingrediente += " + Leche";
        if(isWhisky) ingrediente += " + Whisky";
        if(isCanela) ingrediente += " + Canela";

        return ingrediente;
    }
}