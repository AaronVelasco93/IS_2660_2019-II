/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.ico.fes.factory;

/**
 *
 * @author Usuario-16
 */
public class TestFactory {
 public static void main(String[] args) {
        Garnacha t=GarnachaFactory.createGarnacha("Torta");
        ((Torta)t).entregar();
    }
   
}
