// Esta clase solo sirve de ejemplo para ser importada al main de ClasesHerenciaPolimorfismoEtcPOO.java
package paqueteEjemplo;

public class Comida {
    String tipo;
    int calorias;
    
    public Comida(String tipo, int calorias){
        this.tipo = tipo;
        this.calorias = calorias;
    }
    
    public void comerComida(){
        System.out.println("La comida " + tipo + " tiene " + calorias);
    }
    
}
