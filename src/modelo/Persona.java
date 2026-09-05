package modelo;

import java.time.LocalDate;

public class Persona {

    //atritubos
    private String nombreCompleto;
    private LocalDate fechaNacimiento;
    private double peso;
    private double altura;
    private String direccion;
    private String telefono;
    private String correoElectronico;

    //============METODOS=================
    //Constructor
    //es decir con los parametros el que no esta vacio
    public Persona(String nombreCompleto, LocalDate fechaNacimiento, double peso, double altura, String direccion, String telefono, String correoElectronico) {
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.altura = altura;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    //metodo constructores SOBRECARGADOS este no va a tener nada, es decir el vacio
    public Persona() {
    }

    //GET y SET
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    //Metodo para calcular la edad de la persona
    public int calcularEdad() {
        //obteniendo la fecha actual del sistema con la funcion NOW
        LocalDate fechaActual = LocalDate.now();
        //lo dejara en año, mes dia, por venir en formato ingles
        //usar get year solo extrae el año nadamas
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        return edad;
    }

    //Metodo para saber si es mayor de edad
    public boolean esMayorEdad() {
        if (calcularEdad() >= 18) {
            return true;
        } else {
            return false;
        }
    }

    //Metodo para calcular el IMC
    public double calcularIMC() {
        if (altura <= 0) {
            return 0;
        }
        return peso / (altura * altura);
    }

    //Metodo para clasificar el IMC segun la Organizacion mundial de la salud
    public String clasificarIMC() {

        double imc = calcularIMC();

        if (imc < 18.5) {
            return "Su peso es Bajo";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Su peso es Normal";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Tiene Sobrepeso";
        } else {
            return "Esta Obeso!";
        }
    }

    //Metodo para mostrar la informacion 
    public void mostrarDatos() {
        System.out.println("Nombre:" + nombreCompleto);
        System.out.println("Fecha de Nacimiento:" + fechaNacimiento);
        System.out.println("Peso:" + peso);
        System.out.println("Altura:" + altura);
        System.out.println("Direccion:" + direccion);
        System.out.println("Telefono:" + telefono);
        System.out.println("Correo:" + correoElectronico);
    }

    //***************************
}
