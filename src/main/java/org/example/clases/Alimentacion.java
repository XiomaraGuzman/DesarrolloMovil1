package org.example.clases;

import java.util.Scanner;

public class Alimentacion extends Alojamiento{

    private int cantidadComidas;
    private double valorComidas;




    public Alimentacion() {
    }


    public int getCantidadComidas() {
        return cantidadComidas;
    }

    public void setCantidadComidas(int cantidadComidas) {
        if (cantidadComidas < 0) {
            System.out.println("ingrese la cantidad de comidas");
        }else {
            this.cantidadComidas = cantidadComidas;
        }

    }

    public double getValorComidas() {
        return valorComidas;
    }

    public void setValorComidas(double valorComidas) {
        if (valorComidas <=0) {
            System.out.println("ingrese un valor valido");
        }else {
            this.valorComidas = valorComidas;
        }
    }
    public void agregarComidas(){
        Scanner read= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de comidas: ");
        this.setCantidadComidas(read.nextInt());
        System.out.println("Ingrese el valor de las comidas: ");
        this.setValorComidas(read.nextDouble());

    }
}
