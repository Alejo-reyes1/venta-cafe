package co.edu.uniquindio.ventacafe.ventacafe;

import co.edu.uniquindio.ventacafe.ventacafe.service.ICoffe;

public class MoccaDecorator extends CoffeDecorator {
    public MoccaDecorator(ICoffe coffe) {
        super(coffe);
    }

    @Override
    public String getDescription() {
        return decoratedCoffe.getDescription() + ",mocca";
    }

    @Override
    public double getCost() {
        return decoratedCoffe.getCost() + 0.5;
    }
}
