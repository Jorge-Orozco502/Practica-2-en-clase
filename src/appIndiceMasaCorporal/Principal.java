package appIndiceMasaCorporal;

import modelo.*;

import java.util.ArrayList;
//Libreria necesaria para trabajar con arraylist
import java.util.Scanner;
//para pedir los datos
import java.time.LocalDate;

public class Principal {

    private static ArrayList<Persona> arraypersona1 = new ArrayList<>();
    private static Scanner entrada = new Scanner(System.in);

    //metodo main que es el metodo de entrada
    //si el main es estatico los atributos y variables también lo deben ser
    public static void main(String[] args) {
        //menu de opciones

        int opcion;
        do {
            System.out.println("SISTEMA DE EVALUACION IMC");
            System.out.println("=========================");
            System.out.println("1. Registrar Personas");
            System.out.println("2. Mostrar Personas Registradas");
            System.out.println("3. Buscar Persona por Nombre");
            System.out.println("4. Salir");
            System.out.println("Profavor Ingrese un Numero de Opcion!");
            opcion = entrada.nextInt(); 
            
            entrada.nextLine(); 
            
            switch (opcion) {
                case 1:
                    registrarPersona();
                    break;
                //creamos metodo registrar persona
                case 2:
                    mostrarPersona();
                    break;
                case 3:
                    buscarPersona();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Ingrese un numero de opcion valida!");
            }

        } while (opcion != 4);
    }

    public static void registrarPersona() {
        Persona persona1 = new Persona();

        System.out.println("Ingrese los siguientes datos:");
        System.out.println("=============================");
        
        System.out.println("Nombre completo:");
        persona1.setNombreCompleto(entrada.nextLine()); //hacerlo con cada set

        System.out.println("Fecha de Nacimient (Formato AAAA-MM-DD): ");
        persona1.setFechaNacimiento(LocalDate.parse(entrada.nextLine()));

        System.out.println("Peso:");
        persona1.setPeso(entrada.nextDouble());

        System.out.println("Altura:");
        persona1.setAltura(entrada.nextDouble());

        System.out.println("Direccion:\n");
        persona1.setDireccion(entrada.nextLine());
        entrada.nextLine();

        System.out.println("Telefono:");
        persona1.setTelefono(entrada.nextLine());

        System.out.println("Correo electronico:");
        persona1.setCorreoElectronico(entrada.nextLine());

        //meter el objeto dentro del array
        arraypersona1.add(persona1); //lo estoy almacenando
    }

    public static void mostrarPersona() {
        System.out.println("PERSONAS REGISTRADAS EN EL SISTEMA");
        System.out.println("==================================");
        
        for (int i = 0; i < arraypersona1.size(); i++) {
            arraypersona1.get(i).mostrarDatos();
            System.out.println("-----------------------");
            System.out.println("\n");
        }
    }

    public static void buscarPersona() {
        System.out.println("Ingrese el nombre que quiere buscar:");
        System.out.println("==============================");

        String nombreBusqueda = entrada.nextLine();

        boolean encontrado = false;
        System.out.println("===============================");

        //BUSCANDO EL NOMBRE CON Array List
        for (Persona p : arraypersona1) {
            if (p.getNombreCompleto().equalsIgnoreCase(nombreBusqueda)) {
                System.out.println("Persona econtrada!");
                //voy a utilizar el metodo de mostrar datos de la clase Persona
                p.mostrarDatos();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No hay ninguna persona registrada con ese nombre, verifique nuevamente.\n");
        }

    }

    //************************************
}
