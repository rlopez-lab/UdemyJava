
package com.gm.javaDoc;
/**
 * Esta clase permite realizar operaciones aritmeticas como sumar, restar, 
 * 
 * @author ROBERTO LOPEZ
 * @version 1.0
 */
public class Aritmetica {
    /**
     * Primer operando
     */
    
    int operandoA;
    int operandoB;
    
    /**
     * Constructor de la clase
     */
    
    public Aritmetica(){
        
    }
    /**
     * 
     * Constructor con dos argumentos
     * @param operandoA es el primer operando
     * @param operandoB es el segundo operando
     */
    public Aritmetica(int operandoA, int operandoB){
        this.operandoA = operandoA;
        this.operandoB = operandoB;
    }
    
    /**
     * Este metodo realiza las suma de dos operandos enteros
     * @return int resultado de la suma
     */
    
    public int sumar(){
        return operandoA + operandoB;
    }
}
