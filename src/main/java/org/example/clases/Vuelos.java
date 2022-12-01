package org.example.clases;

import java.util.Scanner;

public class Vuelos extends Alimentacion{

    private String tipoVuelo;

    private String fechaDeSalida;

    private String fechaDeLlegada;
    private double valorVuelo;
    private String destino;
    private String origen;

    public Vuelos() {
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {

        this.tipoVuelo = tipoVuelo;
    }

    public String getFechaDeSalida() {
        return fechaDeSalida;
    }

    public void setFechaDeSalida(String fechaVuelo) {
        this.fechaDeSalida = fechaVuelo;
    }

    public String getFechaDeLlegada() {
        return fechaDeLlegada;
    }

    public void setFechaDeLlegada(String fechaDeLlegada) {
        this.fechaDeLlegada = fechaDeLlegada;
    }

    public double getValorVuelo() {
        return valorVuelo;
    }

    public void setValorVuelo(double valorVuelo) {
        if (valorVuelo < 0) {
            System.out.println("ingrese un valor de vuelo valido");
        }else {
            this.valorVuelo = valorVuelo;
        }
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void agregarVuelo(){
        Scanner read= new Scanner(System.in);

        System.out.println(" tipo de vuelo nacional/ internacional: ");
        this.setTipoVuelo(read.next());
        System.out.println(" origen del vuelo: ");
        this.setOrigen(read.next());
        System.out.println(" destino del vuelo: ");
        this.setDestino(read.next());
        System.out.println(" salida del vuelo: ");
        this.setFechaDeSalida(read.next());
        System.out.println(" fecha de llegada del vuelo: ");
        this.setFechaDeLlegada(read.next());
        System.out.println("valor del vuelo: ");
        this.setValorVuelo(read.nextDouble());
    }
}
