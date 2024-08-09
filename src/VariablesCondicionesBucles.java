public class VariablesCondicionesBucles {
    
    public static void main(String[] args) {
        
        // ----- Variables y Constantes -----
        String nombre = "Ariel Tequida";
        int    edad   = 27;
        Double altura = 177.8;
        boolean hombre = true;
        int añoActual = 2024;
        final int AÑONACIMIENTO = 1996;
        
        // ----- Arreglos -----
        String[] nombres = {"Ariel", "Angel", "Angie"};
        int[] numeros = new int[3];
        numeros[0] = 100;
        numeros[1] = 200;
        numeros[2] = 300;
        
        // ----- Condicionales -----
        if(edad == 27)
            System.out.println("naciste en el 96");
        
        if(edad >= 18){
            System.out.println("Ya puedes votar");
        } else {
            System.out.println("Aun eres muy joven para votar");
        }
        
        if(añoActual - AÑONACIMIENTO < 18) {
            System.out.println("Eres un niño o adolescente");
        } else if(añoActual - AÑONACIMIENTO > 60) {
            System.out.println("Ya eres de la tercera edad");
        } else {
            System.out.println("Entonces eres un adulto");
        }
        
        char letraSemana = 'l';
        int  diaSemana   =  0;
        switch(diaSemana) {
            case 0:
                System.out.println("Comienza la semana");
            case 'l':
                System.out.println("Hoy es lunes");
                break; 
            case 1:
                System.out.println("Hoy tambien es lunes");
                break;
            case 'm':
                System.out.println("Hoy es martes");
                break;
            case 'x':
                System.out.println("Hoy es miercoles");
                break;
            default:
                System.out.println("Hoy no es lunes, ni martes, ni miercoles");
        }
        
        // ----- Bucles -----
        //  inicio ; condicion(true) ; incremento
        for(int i=0;      i<=2       ; i++){
            System.out.println("Cuenta if: " + i);
        }
        
        int i = 0;
        while(i < numeros.length){
            System.out.println("Posicion arreglo: " + i + ". Valor almacenado: " + numeros[i]);
            i++;
        }
        
        i = 0;
        do{
            System.out.println("Cuenta doWhile: " + i);
            i++;
        }while(i > 4);
        
        // for each
        for(String nombreForEach : nombres){
            System.out.println(nombreForEach);
        }
        
    }
    
}
