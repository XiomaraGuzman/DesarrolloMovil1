package org.example.clases;

import java.util.Scanner;

public class Transporte {

    private String tipoTransporte;
    private double costoTrasporte;
    private String fechaInicioTrasporte;
    private String fechaFinDeTrasporte;
    public Transporte() {
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public double getCostoTrasporte() {
        return costoTrasporte;
    }

    public void setCostoTrasporte(double costoTrasporte) {

        if (costoTrasporte < 0) {
            System.out.println("Valor correcto");
        }else {
            this.costoTrasporte = costoTrasporte;
        }
    }

    public String getFechaInicioTrasporte() {
        return fechaInicioTrasporte;
    }

    public void setFechaInicioTrasporte(String fechaInicioTrasporte) {
        this.fechaInicioTrasporte = fechaInicioTrasporte;
    }

    public String getFechaFinDeTrasporte() {
        return fechaFinDeTrasporte;
    }

    public void setFechaFinDeTrasporte(String fechaFinDeTrasporte) {
        this.fechaFinDeTrasporte = fechaFinDeTrasporte;
    }

    public void agregarTransporte(){
        Scanner read= new Scanner(System.in);
        System.out.println("Tipo de transporte: ");
        this.setTipoTransporte(read.next());
        System.out.println("Fecha de inicio del transporte: ");
        this.setFechaInicioTrasporte(read.next());
        System.out.println("Fecha final del transporte: ");
        this.setFechaFinDeTrasporte(read.next());
        System.out.println("Valor del transporte: ");
        this.setCostoTrasporte(read.nextDouble());
    }
}
