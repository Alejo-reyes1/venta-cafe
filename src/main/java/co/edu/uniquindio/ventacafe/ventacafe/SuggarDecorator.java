package co.edu.uniquindio.ventacafe.ventacafe;

import co.edu.uniquindio.ventacafe.ventacafe.service.ICoffe;

class SuggarDecorator extends CoffeDecorator{
    public SuggarDecorator(ICoffe coffe){
        super(coffe);
    }
    @Override
    public String getDescription(){
        return decoratedCoffe.getDescription()+ " azucar";
    }

    @Override
    public double getCost(){
        return decoratedCoffe.getCost()+ 0.2;
    }
}
