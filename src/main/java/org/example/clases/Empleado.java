package org.example.clases;

import java.util.Scanner;


public class Empleado extends Vuelos{

    private String id;
    private String nombre;
    private int edad;
    private String cargo;
    private double salario;


    public Empleado() {
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad<18){
        System.out.println(" Edad valida");
    }
    else if (edad>50) {
        System.out.println("Edad invalida");
    }
    else {
        this.edad = edad;
    }

    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
        if (cargo.equals("senior")) {

        } else if (cargo.equals("")) {
            System.out.println("invalido");

        } else if (cargo.equals("junior")) {

        }else if (cargo.equals("")){
            System.out.println("invalido");

        } else {
            System.out.println("invalido");
        }

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0 ) {
            System.out.println("Ingresa una cantidad valida");
        }else{
            this.salario = salario;
        }

    }


    public void agregarEmpleado(){
        Scanner read=new Scanner(System.in);

        System.out.println("Identificacion: ");
        this.setId(read.next());
        System.out.println("Ingrese nombre: ");
        this.setNombre (read.next());
        System.out.println("Edad: ");
        this.setEdad(read.nextInt());
        System.out.println("cargo Junior/Senior: ");
        this.setCargo(read.next());
        System.out.println("salario: ");
        this.setSalario(read.nextDouble());



    }
    public double bonoViejes(){
        double bonoViaje=0;
        if (this.cargo.equals("junior") && this.getTipoVuelo().equals("nacional")){
            bonoViaje = this.salario*0.20;
        }else if (this.cargo.equals("junior") && this.getTipoVuelo().equals("internacional")){
            bonoViaje = this.salario*0.40;
        }else if (this.cargo.equals("senior") && this.getTipoVuelo().equals("nacional")){
            bonoViaje = this.salario*0.30;
        }else if (this.cargo.equals("senior") && this.getTipoVuelo().equals("internacional")){
            bonoViaje = this.salario*0.50;
        }else{
            System.out.println("Error de digitacion de cargo o tipo de vuelo");
        }
        return bonoViaje;
    }

    public double calcularCostosTotales(){
        double costos=this.getValorVuelo()+this.getValorComidas()+this.getValorAlojamiento()
                +getCostoTrasporte();
        return costos;
    }
    public void mostrarEmpleado(){
        System.out.println("identidicacion: "+this.id);
        System.out.println("nombre: "+this.nombre);
        System.out.println("edad: "+this.edad);
        System.out.println("cargo: "+this.cargo);
        System.out.println("vuelo: "+this.getTipoVuelo());
    }

}
