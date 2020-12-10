
package mundopc;

import com.gm.mundopc.*;

public class MundoPc {
    public static void main(String[] args) {
        
        //Creacion de computadora Toshiba
        Monitor monitorToshi = new Monitor("Toshiba", 13);
        Teclado tecladoToshi = new Teclado("bluetooth", "Toshiba");
        Raton ratonToshi = new Raton("bluetooth", "Toshiba");
        Computadora compuToshiba = new Computadora("Computadora Toshiba", monitorToshi, tecladoToshi, ratonToshi);
        
        //Creacion de computador Dell
        Monitor monitorDell = new Monitor("Dell", 15);
        Teclado tecladoDell = new Teclado("usb", "Dell");
        Raton ratonDell = new Raton("usb", "Dell");
        Computadora compuDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);

        //creacion de computadora armada
        Computadora compuArmada = new Computadora("Computadora Armada", monitorDell, tecladoToshi, ratonToshi);
        
        //Agregamos la computador a la orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(compuToshiba);
        orden1.agregarComputadora(compuDell);
        orden1.agregarComputadora(compuArmada);
        //Imprimimos la orden
        orden1.mostrarOrden();
        
        
        //Agregamos una segunda orden
        Orden orden2 = new Orden();
        orden2.agregarComputadora(compuToshiba);
        orden2.agregarComputadora(compuDell);
        orden2.agregarComputadora(compuArmada);
        //imprimimos la orden
        orden2.mostrarOrden();
    }
    
}
