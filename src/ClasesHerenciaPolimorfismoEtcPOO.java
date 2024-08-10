import paqueteEjemplo.Comida;
// import Libro;   // Libro no es necesario importarlo ya que al estar dentro del paquete ya se puede acceder a esta clase

public class ClasesHerenciaPolimorfismoEtcPOO {
    
    public static void main(String[] args) {
        // ----- Clases -----
        Animal humano = new Animal();
        humano.hacerSonido();
        Animal caballo = new Animal(true, "Caballo", 4, "Pradera");
        System.out.println("Este animal es un: " + caballo.getEspecie());
        
        Perro kira = new Perro();
        Perro fara = new Perro(true, "Perro", 4, "Ciudad", "Negro");
        // Perro dobby = new Animal(true, "Perro", 5, "Ciudad"); // Asi no se maneja la herencia
        
        // clases propias
        Libro cienaños = new Libro("Cien años de soledad", 600);
        Comida pizza = new Comida("Pizza", 3200);
        cienaños.leerLibro();
        pizza.comerComida();
        
        
        // ----- Polimorfismo -----
        Animal elefante = new Animal();
        Animal perro = new Perro();
        elefante.hacerSonido();
        perro.hacerSonido();
        // El objeto animal puede construirse con diferentes formas del mismo tipo
        // pero toma todas las caracteristicas del objeto que le fue apuntado (Animal o Perro, en este caso)
        
    }
    
}

class Animal {
    // Variables de clase
    private boolean vertebrado = false;
    private String especie;
    private int patas;
    private String habitat;
    
    // Constructor
    public Animal(){
        this.vertebrado = true;
        this.especie = "Homosapiens";
        this.patas = 2;
        this.habitat = "Cualquiera";
    }
    public Animal(boolean vertebrado, String especie, int patas, String habitat){
        this.vertebrado = vertebrado;
        this.especie = especie;
        this.patas = patas;
        this.habitat = habitat;
    }
    
    // Metodos de clase
    public void hacerSonido(){
        System.out.println("El animal hace ruido al moverse o al caer");
    }
    
    // Getters
    public boolean getVertebrado(){
        return this.vertebrado;
    }
    public String getEspecie(){
        return this.especie;
    }
    
    // Setters
    public void setPatas(int patas){
        this.patas = patas;
    }
    public void setHabitat(String habitat){
        this.habitat = habitat;
    }
}


// ----- Herencia -----
class Perro extends Animal{
    public String color;
    
    // Construcores
    public Perro(){
        this.color = "Cafe";
    }
    public Perro(String color){
        this.color = color;
    }
    // ----- Super -----
    public Perro(boolean vertebrado, String especie, int patas, String habitat, String color){
        super(vertebrado, especie, patas, habitat); // En un constructor super, toma uno de los constructores y sus estructura
        this.color = color;
    }
    /* 
    La palabra clave super se utiliza en Java para referirse a la clase padre. 
    Se puede utilizar para acceder a métodos y constructores de la clase padre 
    desde la clase hija. 
    */
    
    // ----- Override -----
    public void hacerSonido(){
        System.out.println("El perro hace sonido al ladrar");
    }
    
}