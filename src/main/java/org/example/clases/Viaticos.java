package org.example.clases;

public class Viaticos {
    private  String idEmpleado;
    private Double costoViaje;
    private  String ciudadOrigen;
    private  String ciudadDestino;
    private  Double costoComida;
    private  Integer cantidadComida;
    private  Double valorAlojamiento;

    public Viaticos() {

    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Double getCostoViaje() {
        return costoViaje;
    }

    public void setCostoViaje(Double costoViaje) {
        this.costoViaje = costoViaje;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public Double getCostoComida() {
        return costoComida;
    }

    public void setCostoComida(Double costoComida) {
        this.costoComida = costoComida;
    }

    public Integer getCantidadComida() {
        return cantidadComida;
    }

    public void setCantidadComida(Integer cantidadComida) {
        this.cantidadComida = cantidadComida;
    }

    public Double getValorAlojamiento() {
        return valorAlojamiento;
    }

    public void setValorAlojamiento(Double valorAlojamiento) {
        this.valorAlojamiento = valorAlojamiento;
    }
}
