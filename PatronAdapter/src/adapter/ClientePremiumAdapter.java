/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import patronadapter.ClientePremium;

/**
 *
 * @author Usuario-16
 */
public class ClientePremiumAdapter implements Cliente {

    private ClientePremium adaptado;
    
    public ClientePremiumAdapter() {
    }
    
    public ClientePremiumAdapter(ClientePremium adaptado) {
        this.adaptado = adaptado;
    }
    
    @Override
    public void cobrarCuotaMensual(float cuota, float multa, float descuento) {
        adaptado.cobrarCuotaMensual(cuota, descuento);
    }
    
}
