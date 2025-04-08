package co.edu.uniquindio.ventacafe.ventacafe;

import co.edu.uniquindio.ventacafe.ventacafe.service.ICoffe;

public class EspecialDecorator extends CoffeDecorator{
    public EspecialDecorator(ICoffe coffe) {
        super(coffe);
    }

    @Override
    public String getDescription() {
        return decoratedCoffe.getDescription() + ",especial";
    }

    @Override
    public double getCost() {
        return decoratedCoffe.getCost() + 0.4;
    }

}
