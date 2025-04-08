package co.edu.uniquindio.ventacafe.ventacafe;

import co.edu.uniquindio.ventacafe.ventacafe.service.ICoffe;

public class EspressoDecorator extends CoffeDecorator {
    public EspressoDecorator(ICoffe coffe) {
        super(coffe);
    }

    @Override
    public String getDescription() {
        return decoratedCoffe.getDescription() + ",espresso";
    }

    @Override
    public double getCost() {
        return decoratedCoffe.getCost() + 0.3;
    }
}

