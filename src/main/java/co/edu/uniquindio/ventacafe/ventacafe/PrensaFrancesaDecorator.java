package co.edu.uniquindio.ventacafe.ventacafe;

import co.edu.uniquindio.ventacafe.ventacafe.service.ICoffe;

public class PrensaFrancesaDecorator extends CoffeDecorator{
    public PrensaFrancesaDecorator(ICoffe coffe) {
        super(coffe);
    }

    @Override
    public String getDescription() {
        return decoratedCoffe.getDescription() + ",prensa francesa";
    }

    @Override
    public double getCost() {
        return decoratedCoffe.getCost()+ 0.6 ;
    }
}

