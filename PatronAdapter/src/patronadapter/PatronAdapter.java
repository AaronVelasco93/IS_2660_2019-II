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
public class PatronAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*ClienteNuevo c=new ClienteNuevo("Jesús");
        c.cobrarCuotaMensual(500);*/
        Object[] carteraClientes={
                                new ClienteNuevo("Jesús"),
                                new ClienteMoroso("Juanito"),
                                new ClienteNuevo("Marco"),
                                new ClienteMoroso("Diana"),
                                new ClienteMoroso("Josefa"),
                                new ClientePremium("Winsord")
                               };
        float cuotaMensual=500.0f;
        float multa=5.0f;
        float descuento=10.0f;
        
        for (Object cliente : carteraClientes) {
            if(cliente.getClass().getSimpleName().equals("ClienteMoroso")){
                ((ClienteMoroso)cliente).cobrarCuotaMensual(cuotaMensual, multa);
            }else if(cliente.getClass().getSimpleName().equals("ClienteNuevo")){
                ((ClienteNuevo)cliente).cobrarCuotaMensual(cuotaMensual);
            }else if(cliente.getClass().getSimpleName().equals("ClientePremium")){
                ((ClientePremium)cliente).cobrarCuotaMensual(cuotaMensual,descuento);
            }
            System.out.println("----------------------------------------");
        }
        
    }
    
}
