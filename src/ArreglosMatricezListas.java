import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArreglosMatricezListas {
    public static void main(String[] args) {
        
        // ----- Arreglos -----
        int[] numeros = new int[3];
        numeros[0] = 5;
        numeros[1] = 10;
        numeros[2] = 15;
        
        String[] ciudades = {"Obregon", "Hermosillo", "Tijuana"};
        
        
        // ----- Matriz -----
        int[][] matriz = new int[2][3];
        char[][] letras = {
            {'a','b'},
            {'c','d'},
            {'e','f'}
        };
        //    primero es el arreglo de mas fuera y luego el de mas adentro
        System.out.println(letras[2][1]);
        
        for(char[] filas : letras){
            // System.out.println(filas);
            for(char columnas : filas){
                System.out.println(columnas);
            }
        }
        
        
        // ----- Listas (ArrayList) -----
        // Inicializarlos
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ariel");
        nombres.add("Angel");
        nombres.add("Angie Muñoz");
        System.out.println(nombres);
        
        // Inicializar listas desde arreglos
        List<String> ciudadesLista = Arrays.asList(ciudades); // Lista Fija (No se puede agregar o eliminar valores)
        // ciudadesLista.add("Guaymas"); // Da error
        System.out.println(ciudadesLista);
        
        List<String> ciudadesLista2 = new ArrayList<>(Arrays.asList(ciudades)); // lista modificable
        ciudadesLista2.add(1, "Guaymas"); // Se permite
        System.out.println(ciudadesLista2);
        
        
        // ----- Acciones con listas -----
        System.out.println(nombres.get(0)); // obtiene valor en la posicion
        
        nombres.set(0, "Jesus"); // modifica el valor
        System.out.println(nombres.get(0));
        
        nombres.remove("Angel"); // remueve un valor, tambien se puede utilizar para extraer el valor
        System.out.println(nombres);
        nombres.add("Angel");
        String elemento = nombres.remove(nombres.indexOf("Angel"));
        System.out.println("Elemento Extraido: " + elemento);
        
        System.out.println(nombres.contains("Angel")); // regresa true si el valor se encuentra
        
        System.out.println(nombres.indexOf("Angie")); // regresa la posicion del valor si se encuentra
        
        System.out.println(nombres.getFirst()); // regresa el primer valor de la lista
        System.out.println(nombres.getLast()); // regresa el ultimo valor de la lista
        
        System.out.println(nombres.size()); // regresa el tamaño del arreglo
        
        nombres.clear(); // Vacia la lista
        System.out.println(nombres);
        
    }
    
}
