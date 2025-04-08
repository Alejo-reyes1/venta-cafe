package co.edu.uniquindio.ventacafe.ventacafe;

import co.edu.uniquindio.ventacafe.ventacafe.service.ICoffe;

public class WhiskyDecorator extends CoffeDecorator {
    public WhiskyDecorator(ICoffe coffe) { super(coffe); }

    @Override
    public String getDescription() { return decoratedCoffe.getDescription() + "Whisky"; }

    @Override
    public double getCost() { return decoratedCoffe.getCost() + 2;}
}