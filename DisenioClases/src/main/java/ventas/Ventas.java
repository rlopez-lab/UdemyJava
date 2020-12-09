
package ventas;

import com.gm.ventas.Orden;
import com.gm.ventas.Producto;

public class Ventas {
    public static void main(String[] args) {
        //Crear varios objetos de tipo producto
        Producto producto1 = new Producto("Camisa", 50.00);
        Producto producto2 = new Producto("Pantalon", 100.00);
        
        //Creamos un objeto de tipo orden
        Orden orden1 = new Orden();
        //Agregamos los productos a la orden
        orden1.agregarProductos(producto1);
        orden1.agregarProductos(producto2);
        
        //Imprimir la orden
        orden1.mostrarOrden();
    }
}
