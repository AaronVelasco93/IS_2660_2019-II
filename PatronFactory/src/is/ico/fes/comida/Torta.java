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
public class Torta {

    private boolean conQuesoBlanco;
    private boolean conSalchicha;
    private boolean conHuevo;
    private boolean conVerduras; //lechuga, jitomate, aguacate, etc
    private boolean conPierna;
    private boolean conPinia;
    private boolean conChilaquiles;
    private String nombre;

    public Torta() {
    }

    public Torta(boolean conQuesoBlanco, boolean conSalchicha, boolean conHuevo, boolean conVerduras, boolean conPierna, boolean conPinia, boolean conChilaquiles, String nombre) {
        this.conQuesoBlanco = conQuesoBlanco;
        this.conSalchicha = conSalchicha;
        this.conHuevo = conHuevo;
        this.conVerduras = conVerduras;
        this.conPierna = conPierna;
        this.conPinia = conPinia;
        this.conChilaquiles = conChilaquiles;
        this.nombre = nombre;
    }

    public boolean isConQuesoBlanco() {
        return conQuesoBlanco;
    }

    public void setConQuesoBlanco(boolean conQuesoBlanco) {
        this.conQuesoBlanco = conQuesoBlanco;
    }

    public boolean isConSalchicha() {
        return conSalchicha;
    }

    public void setConSalchicha(boolean conSalchicha) {
        this.conSalchicha = conSalchicha;
    }

    public boolean isConHuevo() {
        return conHuevo;
    }

    public void setConHuevo(boolean conHuevo) {
        this.conHuevo = conHuevo;
    }

    public boolean isConVerduras() {
        return conVerduras;
    }

    public void setConVerduras(boolean conVerduras) {
        this.conVerduras = conVerduras;
    }

    public boolean isConPierna() {
        return conPierna;
    }

    public void setConPierna(boolean conPierna) {
        this.conPierna = conPierna;
    }

    public boolean isConPinia() {
        return conPinia;
    }

    public void setConPinia(boolean conPinia) {
        this.conPinia = conPinia;
    }

    public boolean isConChilaquiles() {
        return conChilaquiles;
    }

    public void setConChilaquiles(boolean conChilaquiles) {
        this.conChilaquiles = conChilaquiles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void entregar() {
        String mensaje = "Lista tu torta"+ nombre+" con:";
        if(conVerduras)mensaje+=" Jitomate, lechuga, Aguacate.";
        if(conChilaquiles)mensaje+=" Chilaquiles.";
        if(conHuevo)mensaje+=" Huevo.";
        if(conPierna)mensaje+=" Pierna.";
        if(conPinia)mensaje+=" Piña.";
        if(conSalchicha)mensaje+=" Salchicha.";
        if(conQuesoBlanco)mensaje+=" Queso blanco.";
        System.out.println(""+mensaje);
    }

}
