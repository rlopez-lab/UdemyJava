
package palabrafinal;


public class EjemploPalabraFinal {
    public static void main(String[] args) {
        //Modificar un atributo final
        
        ClaseFinal.VAR_PERSONA.setNombre("Juan");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
        
        ClaseFinal.VAR_PERSONA.setNombre("Carlos");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
    }
}
