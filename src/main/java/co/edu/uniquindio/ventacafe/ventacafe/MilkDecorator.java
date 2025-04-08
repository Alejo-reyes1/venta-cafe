package co.edu.uniquindio.ventacafe.ventacafe;

import co.edu.uniquindio.ventacafe.ventacafe.service.ICoffe;

public class MilkDecorator extends CoffeDecorator {
    public MilkDecorator(ICoffe coffe) {
        super(coffe);
    }

    @Override
    public String getDescription() {
        return decoratedCoffe.getDescription(); + ", leche";
    }

    @Override
    public double getCost() {

        return decoratedCoffe.getCost() + 0.5;
    }

}
