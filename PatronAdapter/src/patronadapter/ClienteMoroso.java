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
public class ClienteMoroso {
    private String nombre;

    public ClienteMoroso() {
    }

    public ClienteMoroso(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void cobrarCuotaMensual(float cuota, float multa){
        System.out.println("Estomado(a) Sr(ta)"+nombre+":");
        System.out.println("Tiene un atraso de pagos, por lo cual");
        System.out.println("Debe pagar un "+multa+"% por recargos");
        System.out.println("Total pagar="+(cuota+(cuota*multa/100)));
        
    }
    
}
