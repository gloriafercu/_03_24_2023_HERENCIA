package com.adecco.modelo;

import java.time.LocalDate;

// Solamente al poner EXTENDS, gerente hereda todos los atributos y métodos de Empleado
// Como es la última hija de la clase superior aquí ya ponemos los atributos privados.
// Si hubiera más clases hijas los pondríamos protected y la última subclase protected
public class Gerente extends Empleado {
    // 1. Atributos
    private String departamento;

    // 2. Métodos
    // Con la palabra reservada SUPER ya podemos llamar a los métodos y atributos de la clase superior o padre
    @Override
    public String toString() {
        return "Gerente { " +
                "Departamento = '" + departamento + '\'' +
                "} " + super.toString();
    }


    // 3. Constructores
    // Lo único que no se hereda son los constructores y los atributos privados de la clase padre
    public Gerente() {

    }

    public Gerente(String nombre, float sueldo, LocalDate fNacimiento) {
        super(nombre, sueldo, fNacimiento);
    }

    // 4. Setters y Getters
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }


}
