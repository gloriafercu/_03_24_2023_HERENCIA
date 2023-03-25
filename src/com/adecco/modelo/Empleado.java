package com.adecco.modelo;

import java.time.LocalDate;

/* CLASE SUPERCLASE O PADRE */
public class Empleado {
    // 1. Atributos
    protected String nombre;
    protected float sueldo;
    protected LocalDate fNacimiento;

    // 2. Métodos
    // El método toString() nos devuelve el literal del atributo y su valor
    // @Override =>
    @Override
    public String toString() {
        return "Empleado { " +
                "Nombre = '" + nombre + '\'' +
                ", Sueldo = " + sueldo +
                ", fNacimiento = " + fNacimiento +
                '}';
    }

    // 3. Constructores


    public Empleado() {
    }

    public Empleado(String nombre, float sueldo, LocalDate fNacimiento) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fNacimiento = fNacimiento;
    }

    // 4. Setters y Getters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public void setfNacimiento(LocalDate fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public LocalDate getfNacimiento() {
        return fNacimiento;
    }


}
