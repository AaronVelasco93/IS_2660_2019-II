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
public class ClientePremium {
   private String nombre;

    public ClientePremium() {
    }

    public ClientePremium(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public void cobrarCuotaMensual(float cuota,float descuento){
        System.out.println("Su excelencia "+nombre);
        System.out.println("Por su excelente comportamiento");
        System.out.println("le estamos haciendo un descuento del "+descuento+"%");
        System.out.println("total a pagar= $"+(cuota-cuota*(descuento/100)));
    }
}
