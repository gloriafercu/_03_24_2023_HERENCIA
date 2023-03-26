package com.adecco.presentacion;

import com.adecco.modelo.Coche;
import com.adecco.modelo.CocheElectrico;
import com.adecco.modelo.CocheHibrido;

public class PolimorfismoMain {
    public static void main(String[] args) {
        //Coche coche1 = new Coche();
        CocheElectrico coche2= new CocheElectrico();
        CocheHibrido coche3 = new CocheHibrido();

        // POLIMORFISMO: Múltiples formas
        Coche coche4 = new CocheElectrico();
        Coche coche5 = new CocheHibrido();
        if (coche4 instanceof Coche) {
            System.out.println("Coche");
        }
        if (coche4 instanceof CocheElectrico) {
            System.out.println("Coche Eléctrico");
        }
        if (coche4 instanceof CocheHibrido) {
            System.out.println("Coche Híbrido");
        }
    }
}
