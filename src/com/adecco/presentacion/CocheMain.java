package com.adecco.presentacion;

import com.adecco.modelo.Coche;
import com.adecco.modelo.CocheElectrico;

public class CocheMain {
    public static void main(String[] args) {

        Coche cocheObj2 = new CocheElectrico("rojo", "honda", "civic", 1430.45, 5.4,"MND");
        cocheObj2.acelerar(50);
        System.out.println(cocheObj2);
        cocheObj2.setPeso(1350.8); // como el atributo peso está protegido para cambiar su valor necesitamos el setter
        System.out.println(cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.motorElectrico = "motor electrico";
        cocheElectrico.setColor("verde");
        cocheElectrico.setFabricante("honda");
        cocheElectrico.setModelo("civic");
        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("azul", "Hyundai", "ionic", 2200.5, 5.25, "ezt");
        System.out.println(cocheElectrico2);
        cocheElectrico2.acelerar(50);
        System.out.println(cocheElectrico2);
    }
}
