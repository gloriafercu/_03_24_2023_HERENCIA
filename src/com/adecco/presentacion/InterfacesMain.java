package com.adecco.presentacion;

import com.adecco.interfaces.CocheService;
import com.adecco.interfaces.CocheServiceClassicImpl;
import com.adecco.interfaces.CocheServiceSportImpl;
import com.adecco.modelo.Coche;

public class InterfacesMain {
    public static void main(String[] args) {
        CocheService service1 = new CocheServiceClassicImpl();
        CocheService service2 = new CocheServiceSportImpl();

        Coche coche1 = service1.crearCocheDemo();
        Coche coche2 = service2.crearCocheDemo();
    }
}
