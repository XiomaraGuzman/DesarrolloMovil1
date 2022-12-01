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

    public void setEdad(int edad) { if (edad<18){
        System.out.println(" edad valida");
    }
    else if (edad>110) {
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
        if (cargo.equals("senior")) {
            this.cargo = cargo;
        } else if (cargo.equals("junior")) {
            this.cargo = cargo;
        }else {
            System.out.println("Invalido");
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
        System.out.println("Ingrese nombre  completo : ");
        this.setNombre (read.next());

        System.out.println("Edad : ");
        this.setEdad(read.nextInt());
        System.out.println("cargo JR/SR ");
        this.setCargo(read.next());
        System.out.println("salario : ");
        this.setSalario(read.nextDouble());

        System.out.println("0. volver atras");
        System.out.println("1. Alimentacion");
        System.out.println("2. Alojamiento");
        System.out.println("3. Trasporte");
        System.out.println("4. Vuelos");

        int opcion = 0;

        do {
            System.out.println(" Ingrese opción del menu: ");
            opcion = read.nextInt();

            switch(opcion){
                case 1:
                    this.agregarComidas();
                    break;
                case 2:
                    this.agregarAlojamiento();
                    break;
                case 3:
                    this.agregarTransporte();
                    break;
                case 4:
                    this.agregarVuelo();
                    break;
                case 0:
                    System.out.println("0. Salir del menu");
                    System.out.println("1. Empleado");
                    System.out.println("2. Mostrar Empleados");
                    break;

                default:
                    System.out.println("ingresa una opcion valida");

            }
        }
        while (opcion != 0);


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


}
