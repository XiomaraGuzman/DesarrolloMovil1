package org.example;

import org.example.clases.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Alimentacion objetoAlimentacion = new Alimentacion();
        Alojamiento objetoAlojamiento = new Alojamiento();
        Transporte objetoTransporte = new Transporte();
        Vuelos objetoVuelos = new Vuelos();


        ArrayList <Empleado> empleados = new ArrayList<Empleado>();

        int seleccion = 0;
        int mostrarEmpleado = 0;

        System.out.println("0. Salir del menu");
        System.out.println("1. Empleado");
        System.out.println("2. Mostrar Empleados");

        do {
            System.out.println(" Ingrese opción del menu: ");
            seleccion = read.nextInt();

            switch(seleccion){
                case 0:
                    System.out.println("Has salido del sistema");
                    break;
                case 1:

                    Empleado objetoEmpleado = new Empleado();
                    objetoEmpleado.agregarEmpleado();
                    empleados.add(objetoEmpleado);
                    break;
                case 2:

                    for (Empleado empleado:empleados) {

                        System.out.println("Nombre Empleado: "+ empleado.getNombre());
                        System.out.println("Cargo: "+empleado.getCargo());
                        System.out.println("Salario: "+empleado.getSalario());
                        System.out.println("Bono de Viaticos: "+empleado.bonoViejes());
                        System.out.println("Tipo de Vuelo: "+empleado.getTipoVuelo());
                        System.out.println("Gastos totales: "+empleado.calcularCostosTotales());

                        if(empleado.getTipoVuelo().equals(mostrarEmpleado)) {
                            System.out.println("informaccion empleado: "+ mostrarEmpleado);
                            break;
                        }

                    }

                    break;
                default:
                    System.out.println("Selecciona una opción valida");

            }

        }
        while (seleccion != 0);

    }
}