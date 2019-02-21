/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasunitarias;
import aritmetica.Aritmetica;
/**
 *
 * @author Usuario-16
 */
public class PruebasUnitarias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aritmetica instance=new Aritmetica();
        int result = instance.suma(3, 4);
        System.out.println("Resultado="+result);
    }
    
}
