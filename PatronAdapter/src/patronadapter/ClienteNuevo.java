/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronadapter;

/**
 *
 * @author Usuario-16
 */
public class ClienteNuevo {
   private String nombre;

    public ClienteNuevo() {
    }

    public ClienteNuevo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public void cobrarCuotaMensual(float cuota){
        System.out.println("Gracias por elegirnos");
        System.out.println("Sr(ta)."+ this.nombre + " pague $"+ cuota);
        System.out.println("antes del fin de mes");
    }
}
