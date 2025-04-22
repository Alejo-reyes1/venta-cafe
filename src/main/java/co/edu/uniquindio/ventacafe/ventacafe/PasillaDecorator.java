package co.edu.uniquindio.ventacafe.ventacafe;

import co.edu.uniquindio.ventacafe.ventacafe.service.ICoffe;

public class PasillaDecorator extends  CoffeDecorator{
    public PasillaDecorator(ICoffe coffe) { super(coffe); }

    @Override
    public String getDescription() { return decoratedCoffe.getDescription() + ",Pasilla"; }

    @Override
    public double getCost() { return decoratedCoffe.getCost() +0.3; }
}


