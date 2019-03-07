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
public class GarnachaFactory {
    public static Garnacha createGarnacha(String tipo){
        if(tipo.equals("Torta")){
            return new Torta(true, true, true, true, true, true, true, tipo);
        }else if(tipo.equals("Taco")){
            return new Taco(true, "Verde", "Pastor", true);
        }else{
            return null;
        }
    }
    
    public static Garnacha createGarnacha(String tipo,
                                        String presentacion){
        //aquiva la lógica par configurar prioducto
        return null;
    }
}
