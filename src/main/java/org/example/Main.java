package org.example;

import org.example.clases.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);


        Viaticos objetoViaticos;

        ArrayList <Viaticos> viaticos = new ArrayList<Viaticos>();

        ArrayList <Empleado> empleados = new ArrayList<Empleado>();


        int seleccion = 0;

        System.out.println("**********KJX********************");


        do {
            System.out.println("*********************");
            System.out.println("*******Menu**********");
            System.out.println("*********************");
            System.out.println(" Ingrese opción del menu: ");
            System.out.println("0. Salir del menu");
            System.out.println("1. Empleado");
            System.out.println("2. Ingresar viaticos de empleado");
            System.out.println("3. Mostar todos los empleados");
            System.out.println("4. Mostar un empleado por id");
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


                    System.out.println("Ingrese el Id del empleado: ");
                    String Id = read.next();
                    boolean bandera = false;

                    for (Empleado empleado:empleados) {
                        if (empleado.getId().equals(Id)){
                            bandera = true;
                            break;
                        }else {
                            bandera = false;
                        }
                    }
                    if (bandera) {
                        objetoViaticos = new Viaticos();
                        objetoViaticos.setIdEmpleado(Id);
                        System.out.println("*******************");
                        System.out.println("Gastos de comida: " );
                        objetoViaticos.setCostoComida(read.nextDouble());
                        System.out.println("Costo viaje: ");
                        objetoViaticos.setCostoViaje(read.nextDouble());
                        System.out.println("Ciudad origen: ");
                        objetoViaticos.setCiudadOrigen(read.next());
                        System.out.println("Cuidad destino: ");
                        objetoViaticos.setCiudadDestino(read.next());
                        System.out.println("Cantidad de comida: ");
                        objetoViaticos.setCantidadComida(read.nextInt());
                        System.out.println("Costo alojamiento: ");
                        objetoViaticos.setValorAlojamiento(read.nextDouble());

                        viaticos.add(objetoViaticos);
                    }

                    break;

                case  3:
                    for(Empleado empleado:empleados){
                        System.out.println("**********************");
                        System.out.println("Los empleados son: ");
                        System.out.println("**********************");
                        System.out.println("El nombre del empleado es: " +empleado.getNombre());
                        System.out.println("El id del empleado es: "+ empleado.getId());
                        System.out.println("El cargo del empleado es: "+empleado.getCargo());
                        System.out.println("El salario del empleado es: "+empleado.getSalario());


                        for (Viaticos viatico:viaticos){
                            if (empleado.getId().equals(viatico.getIdEmpleado())){
                                System.out.println("El costo de la comida es: "+viatico.getCostoComida());
                                System.out.println("Id del empleado es: "+viatico.getIdEmpleado());
                                System.out.println("El costo del viaje es: "+viatico.getCostoViaje());
                                System.out.println("La ciudad de origen es: "+viatico.getCiudadOrigen());
                                System.out.println("La cuidad de destino es: "+viatico.getCiudadDestino());
                                System.out.println("La cantidad de comida es: "+viatico.getCantidadComida());
                                System.out.println("El costo de alojamiento es: "+viatico.getValorAlojamiento());
                                System.out.println("***************************");

                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("ingrese el Id del empleado: ");

                    String Documento = read.next();

                    boolean bandera1 = false;

                    for (Empleado empleado:empleados) {
                        if (empleado.getId().equals(Documento)){
                            bandera1 = true;
                            System.out.println("nombre del empleado: " +empleado.getNombre() );

                            break;
                        }else {
                            bandera1 = false;
                        }

                    }
                    if (bandera1) {
                        for (Viaticos viatico:viaticos) {
                            if ( viatico.getIdEmpleado().equals(Documento)){
                                System.out.println("El costo del la comida es: " +viatico.getCostoComida() );
                            }
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