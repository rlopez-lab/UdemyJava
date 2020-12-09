
package arreglos;

public class EjemploArreglos {
    public static void main(String[] args) {
        int edades[];
        edades = new int[3];
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;
        
        System.out.println("arreglo de enteros indice 0: " + edades[0]);
        System.out.println("arreglo de enteros indice 1: " + edades[1]);
        System.out.println("arreglo de enteros indice 2: " + edades[2]);
        
        Persona personas[] = new Persona[4];
        
        personas[0] = new Persona("Juan");
        personas[2] = new Persona("Karla");
        
        System.out.println("Arreglo personas indice 0: " + personas[0]);
        System.out.println("Arreglo personas indice 1: " + personas[1]);
        System.out.println("Arreglo personas indice 1: " + personas[2]);
        System.out.println("Arreglo personas indice 1: " + personas[3]);
        
        //Arreglo notacion simplificada
        String nombres[] = {"Sara", "Laura", "Carlos", "Carmen"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Arreglo string indice: " + i + ": " + nombres[i]);
        }
    }
}
