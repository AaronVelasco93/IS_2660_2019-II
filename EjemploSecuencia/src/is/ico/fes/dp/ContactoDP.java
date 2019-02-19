/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.ico.fes.dp;

import is.ico.fes.md.ContactoDAO;




/**
 *
 * @author Usuario-16
 */
public class ContactoDP {
    private String nombre;
    private String telefono;
    private String celular;
    private String telTrabajo;
    private String  eMail;

    public ContactoDP() {
    }

    public ContactoDP(String nombre, String telefono, String celular, String telTrabajo, String eMail) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.celular = celular;
        this.telTrabajo = telTrabajo;
        this.eMail = eMail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelTrabajo() {
        return telTrabajo;
    }

    public void setTelTrabajo(String telTrabajo) {
        this.telTrabajo = telTrabajo;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    
    public boolean insert(ContactoDP c){
        ContactoDAO cdao=new ContactoDAO();
        return cdao.insert(c);
    }
    
}
