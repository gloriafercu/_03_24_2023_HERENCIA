package com.adecco.interfaces;

import com.adecco.interfaces.CocheService;
import com.adecco.modelo.Coche;
import com.adecco.modelo.CocheElectrico;

public class CocheServiceSportImpl implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche de carreras");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo coche de carreras");
    }
}
