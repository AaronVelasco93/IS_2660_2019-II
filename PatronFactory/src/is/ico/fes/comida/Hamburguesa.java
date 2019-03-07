/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.ico.fes.comida;

/**
 *
 * @author Usuario-16
 */
public class Hamburguesa {
    private boolean conQueso;
    private boolean conMostaza;
    private boolean conPicante;
    private boolean dobleCarne;
    private boolean dobleQueso;

    public Hamburguesa() {
    }

    public Hamburguesa(boolean conQueso, boolean conMostaza, boolean conPicante, boolean dobleCarne, boolean dobleQueso) {
        this.conQueso = conQueso;
        this.conMostaza = conMostaza;
        this.conPicante = conPicante;
        this.dobleCarne = dobleCarne;
        this.dobleQueso = dobleQueso;
    }

    public boolean isConQueso() {
        return conQueso;
    }

    public void setConQueso(boolean conQueso) {
        this.conQueso = conQueso;
    }

    public boolean isConMostaza() {
        return conMostaza;
    }

    public void setConMostaza(boolean conMostaza) {
        this.conMostaza = conMostaza;
    }

    public boolean isConPicante() {
        return conPicante;
    }

    public void setConPicante(boolean conPicante) {
        this.conPicante = conPicante;
    }

    public boolean isDobleCarne() {
        return dobleCarne;
    }

    public void setDobleCarne(boolean dobleCarne) {
        this.dobleCarne = dobleCarne;
    }

    public boolean isDobleQueso() {
        return dobleQueso;
    }

    public void setDobleQueso(boolean dobleQueso) {
        this.dobleQueso = dobleQueso;
    }
    
    public void entregar(){
        System.out.println("Lista tu hamburguesa con:");
        if(dobleQueso)System.out.println("Con doble queso");
        if(conQueso)System.out.println("Con  queso");
        if(conMostaza)System.out.println("Con mostaza");
        if(dobleCarne)System.out.println("Con doble Carne");
        if(conPicante)System.out.println("Con Picante");
        
    }
    
}
