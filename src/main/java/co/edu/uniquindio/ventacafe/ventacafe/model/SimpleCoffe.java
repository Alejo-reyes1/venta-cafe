package co.edu.uniquindio.ventacafe.ventacafe.model;

import co.edu.uniquindio.ventacafe.ventacafe.service.ICoffe;

public class SimpleCoffe implements ICoffe {
    @Override
    public String getDescription() {
        return "cafe";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}
