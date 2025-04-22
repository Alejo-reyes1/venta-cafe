package co.edu.uniquindio.ventacafe.ventacafe;

import co.edu.uniquindio.ventacafe.ventacafe.service.ICoffe;

public class CanelaDecorator extends CoffeDecorator {
    public CanelaDecorator(ICoffe coffe) { super(coffe); }

    @Override
    public String getDescription() { return decoratedCoffe.getDescription() + " Canela"; }

    @Override
    public double getCost() { return decoratedCoffe.getCost() +0.1; }
}
