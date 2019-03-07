/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronfactory;

import is.ico.fes.comida.Torta;

/**
 *
 * @author Usuario-16
 */
public class PatronFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Torta t=new Torta(true, true, true, true, true, true, true, "Cubana");
        Torta t2=new Torta(false, false, false, false, false, false, true, "De chilaquiles");
        t.entregar();
        t2.entregar();
    }
    
}
