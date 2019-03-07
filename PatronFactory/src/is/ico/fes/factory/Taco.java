/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.ico.fes.factory;

import is.ico.fes.comida.*;

/**
 *
 * @author Usuario-16
 */
public class Taco implements Garnacha{
    private boolean conQueso;
    private String salsa;
    private String proteina;
    private boolean dobleTortilla;

    public Taco() {
    }

    public Taco(boolean conQueso, String salsa, String proteina, boolean dobleTortilla) {
        this.conQueso = conQueso;
        this.salsa = salsa;
        this.proteina = proteina;
        this.dobleTortilla = dobleTortilla;
    }

    public boolean isConQueso() {
        return conQueso;
    }

    public void setConQueso(boolean conQueso) {
        this.conQueso = conQueso;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String getProteina() {
        return proteina;
    }

    public void setProteina(String proteina) {
        this.proteina = proteina;
    }

    public boolean isDobleTortilla() {
        return dobleTortilla;
    }

    public void setDobleTortilla(boolean dobleTortilla) {
        this.dobleTortilla = dobleTortilla;
        
    }
    
    public void entregar(){
      String mensaje="Listos tus tacos de "+ proteina+" con:";
      if(conQueso)mensaje+=" queso\n";
      if(dobleTortilla)mensaje+=" doble tortilla\n";
      mensaje+=" "+salsa;
        System.out.println(mensaje);
    }

}
