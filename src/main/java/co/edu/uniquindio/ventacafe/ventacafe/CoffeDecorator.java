package co.edu.uniquindio.ventacafe.ventacafe;

import co.edu.uniquindio.ventacafe.ventacafe.service.ICoffe;

abstract class CoffeDecorator implements ICoffe {
    protected ICoffe decoratedCoffe;

    public CoffeDecorator(ICoffe decoratedCoffe) {
        this.decoratedCoffe = decoratedCoffe;
    }

    public String getDescription() {
        return decoratedCoffe.getDescription();
    }

    public double getPrice(){
        return decoratedCoffe.getCost();
    }
}
