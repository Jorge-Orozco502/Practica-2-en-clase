package modelo;

public class EvaluacionIMC {
    //Atributos
    private double imc;
    private ClasificacionIMC clasificacion; 
    
    //Metodos
    public EvaluacionIMC(Persona persona) {
        this.imc = calcularIMC(persona);
        this.clasificacion = clasificarIMC(this.imc);
    }
    
    public double calcularIMC(Persona persona){
        if (persona.getAltura() <=0){
            return 0;
        }
        return persona.getPeso() / (persona.getAltura() * persona.getAltura());
    }
 
    public ClasificacionIMC clasificarIMC(double imc){ 
        if(imc<18.5){
            return ClasificacionIMC.Bajo;
        } else if(imc >=18.5    && imc<= 24.9){
            return ClasificacionIMC.Normal;
        } else if(imc >= 25 && imc <=29.9){
            return ClasificacionIMC.Sobrepeso; 
        } else {
            return ClasificacionIMC.Obesidad; 
        }
    }
    
    public String mostrarResultado(){ 
        return "IMC:"   +  String.format("%.2f", imc) + "Clasificacion: " +clasificacion; 
    }
    
    public double getIMC(){
        return imc;
    }
    
    public ClasificacionIMC getClasificacion() {
        return clasificacion; 
    }
   
    
    //************   
}


