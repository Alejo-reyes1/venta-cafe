package co.edu.uniquindio.ventacafe.ventacafe.model;

import co.edu.uniquindio.ventacafe.ventacafe.*;
import co.edu.uniquindio.ventacafe.ventacafe.service.ICoffe;

public class Fachada {

    public Fachada(){}

    public ICoffe crearCoffeDecorado(boolean isAzucar, boolean isLeche,
                                     boolean isWhisky, boolean isCanela,String tipoPreparacion,String tipoCafe){
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
            coffe = new CanelaDecorator(coffe);
        }
        if (tipoPreparacion != null) {
            if(tipoPreparacion.equalsIgnoreCase("moka")){
                coffe = new MoccaDecorator(coffe);
            }
            if(tipoPreparacion.equalsIgnoreCase("Espresso")){
                coffe = new EspressoDecorator(coffe);
            }
            if(tipoPreparacion.equalsIgnoreCase("Prensa francesa")){
                coffe= new PrensaFrancesaDecorator(coffe);
            }
        }
        if (tipoCafe != "sin especificar") {
            if(tipoCafe.equalsIgnoreCase("Especial")){
                coffe = new EspecialDecorator(coffe);
            }
            if(tipoCafe.equalsIgnoreCase("Pasilla")){
                coffe = new PasillaDecorator(coffe);
            }
        }
        return coffe;
    }

    public double calcularPrecio(boolean isAzucar, boolean isLeche, boolean isWhisky,
                                 boolean isCanela,String tipoPreparacion,String tipoCafe){
        ICoffe coffe = crearCoffeDecorado(isAzucar, isLeche, isWhisky, isCanela,tipoPreparacion,tipoCafe);
        return coffe.getCost();
    }
    public String crearIngredientes(boolean isAzucar, boolean isLeche,
                                    boolean isWhisky, boolean isCanela,String tipoPreparacion,String tipoCafe){
        ICoffe coffe=crearCoffeDecorado(isAzucar, isLeche, isWhisky, isCanela,tipoPreparacion,tipoCafe);
        return coffe.getDescription()+" tipoCafe:"+ tipoCafe;
    }

}