package org.example.clases;

import java.util.Scanner;

public class Alojamiento extends Transporte{

    private String tipoAlojamiento;
    private double valorAlojamiento;

    private String fechaInicioAlojamiento;
    private String fechaFinalAlojamiento;

    public Alojamiento() {
    }

    public String getTipoAlojamiento() {

        return tipoAlojamiento;
    }

    public void setTipoAlojamiento(String tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
    }

    public double getValorAlojamiento() {
        return valorAlojamiento;
    }

    public void setValorAlojamiento(double valorAlojamiento) {
        if (valorAlojamiento < 0) {
            System.out.println("Ingrese un valor valido");
        }else {
            this.valorAlojamiento = valorAlojamiento;
        }
    }



    public String getFechaInicioAlojamiento() {
        return fechaInicioAlojamiento;
    }

    public void setFechaInicioAlojamiento(String fechaInicioAlojamiento) {
        this.fechaInicioAlojamiento = fechaInicioAlojamiento;
    }

    public String getFechaFinal() {
        return fechaFinalAlojamiento;
    }

    public void setFechaFinalAlojamiento(String fechaFinalAlojamiento) {
        this.fechaFinalAlojamiento = fechaFinalAlojamiento;
    }

    public void agregarAlojamiento(){
        Scanner read=new Scanner (System.in);
        System.out.println("Tipo de alojamiento: ");
        this.setTipoAlojamiento(read.next());
        System.out.println(" Dia de alojamiento: ");
        this.setFechaInicioAlojamiento(read.next());
        System.out.println(" Salida de alojamiento: ");
        this.setFechaFinalAlojamiento(read.next());
        System.out.println(" Valor del alojamiento: ");
        this.setValorAlojamiento(read.nextDouble());


    }
}
