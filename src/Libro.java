// Esta clase solo sirve de ejemplo para ser importada al main de ClasesHerenciaPolimorfismoEtcPOO.java

public class Libro {
    String titulo;
    int paginas;
    
    public Libro(String titulo, int paginas){
        this.titulo = titulo;
        this.paginas = paginas;
    }
    
    public void leerLibro(){
        System.out.println("El libro " + titulo + " tiene " + paginas + " lo que lo hace una lectura muy buena");
    }
    
}
