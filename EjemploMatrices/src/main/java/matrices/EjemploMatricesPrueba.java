
package matrices;


public class EjemploMatricesPrueba {
    public static void main(String[] args) {
        //1. Declaramos una matriz de int
        int edades[][];
        //2. Instanciamos la matriz de int
        edades = new int[3][2];
        //3. Instanciar los valores de la matriz
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;    
        edades[2][0] = 5;
        edades[2][1] = 38;
        
        System.out.println("Matriz enteros 0 0: " + edades[0][0]);
        System.out.println("Matriz enteros 2 0: " + edades[2][0]);
        
    }
}
