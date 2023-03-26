package com.adecco.modelo;

public class CocheElectrico extends Coche {
    public String motorElectrico;

    public CocheElectrico() {
    }

    public CocheElectrico(String motorElectrico) {
        this.motorElectrico = motorElectrico;
    }
    // Con SUPER() invocamos a todos los parámetros de la clase padre o superior
    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo, String motorElectrico) {
        super(color, fabricante, modelo, peso, largo);
        this.motorElectrico = motorElectrico;
    }

    // SOBREESCRITURA DE MÉTODOS
    @Override
    public void acelerar(Integer cantidad) {
        // Con Super estamos accediendo al método acelerar de la clase superior
        Integer cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);
    }

    @Override
    public String toString() {
        return "CocheElectrico { " +
                "motorElectrico = '" + motorElectrico + '\'' +
                "} " + super.toString();
    }

}
