/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicio;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import libreria.entidades.Cliente;

/**
 *
 * @author tered
 */
class ClienteServicio {
    
    public void buscarCliente(Long documento, String nombre, String apellido, String domicilio, String telefono){ 
    
}

    public void imprimirDatosCliente(Long documento, String nombre, String apellido, String domicilio, String telefono) {

        EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
        
        List <Cliente> cliente = buscarCliente(documento);
        
        
    }
}
