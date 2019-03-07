/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import patronadapter.ClienteMoroso;
import patronadapter.ClienteNuevo;
import patronadapter.ClientePremium;

/**
 *
 * @author Usuario-16
 */
public class TestAdapter {
    public static void main(String[] args) {
        Cliente[]  carteraClientes={
          new ClienteNuevoAdapter(new ClienteNuevo("Jesús")),
          new ClienteMorosoAdapter(new ClienteMoroso("Jose")),
          new ClientePremiumAdapter(new ClientePremium("Windsord"))
        };
        
        float cuotaMensual=500.0f;
        float multa=5.0f;
        float descuento=10.0f;
        
        for (Cliente cliente : carteraClientes) {
            cliente.cobrarCuotaMensual(cuotaMensual, multa, descuento);
        }
        
        
    }
}
