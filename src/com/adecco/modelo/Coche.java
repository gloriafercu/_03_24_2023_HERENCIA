package com.adecco.modelo;
// LAS CLASES ABSTRACTAS NO PUEDEN SER INSTANCIADAS
// (no pueden crearse objetos),
// sólo pueden ser instanciadas a través de las clases hijas.

public abstract class Coche {
    // 1. Atributos: Son atributos protegidos, la manera de acceder a ellos desde otra clase
    protected String color;
    protected String fabricante;
    protected String modelo;
    protected Double peso;
    protected Double largo;
    protected Integer velocidad = 0;

    // 2. Métodos
    public void acelerar(Integer cantidad) {
        if (cantidad > 0 && cantidad <= 120) {
            this.velocidad += cantidad;
        }
    }
    @Override
    public String toString() {
        return "Coche { " +
                "color = '" + color + '\'' +
                ", fabricante = '" + fabricante + '\'' +
                ", modelo = '" + modelo + '\'' +
                ", peso = " + peso +
                ", largo = " + largo +
                ", velocidad = " + velocidad + " " +
                '}';
    }

    // 3. Constructores

    public Coche() {
    }

    public Coche(String color, String fabricante, String modelo, Double peso, Double largo) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }

    // 4. Setters y Getters


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }
}
