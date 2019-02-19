/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.ico.fes.md;

import is.ico.fes.dp.ContactoDP;

/**
 *
 * @author Usuario-16
 */
public class ContactoDAO {
    public boolean insert(ContactoDP datos){
        boolean resultado=false;
        // conectarse a la BD
        //Crear un obj de tipo Statement (Consulta SQL)
        // Ejecutar la consulta a la BD con la informacion del objeto datos
        //Obtener el resultado, se espera un 1
        // si es 1 entopnces estavblecemos resultado 0 true
        resultado= true;
        
        
        
        return resultado;
    }
}
