/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicio;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import libreria.entidades.Editorial;

/**
 *
 * @author tered
 */
public class EditorialServicio {
    
    public void consultarEditorial(Integer id) {
        
       EntityManager em = (EntityManager) Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();      
       em.getTransaction().begin();
       
       Editorial editorial = em.find(Editorial.class, id);
       
       System.out.println(editorial);    
       
       em.persist(em);      
    }
    
    public void crearEditorial(String nombre) {
        
        //recursos entitymanager
        EntityManager em = (EntityManager) Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
        
        //abrir transaccion
        em.getTransaction().begin();
       
        
        Editorial editorial = new Editorial();
        
        editorial.setNombreEdi(nombre);
        
        //persistir los datos
        em.persist(editorial);
        
        //cerrar transaccion
        em.getTransaction().commit();     
    }
    
    public void modificarEditorial(Integer id, String nombre) {
        
        EntityManager em = (EntityManager) Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
        
        em.getTransaction().begin();
        
        Editorial editorial = em.find(Editorial.class, id);
        
        editorial.setNombreEdi(nombre);
        
        //modificar merge
        
        em.merge(editorial);
        
        em.getTransaction().commit();
        
    }
    
    public void eliminarEditorial(Integer id) {
        
        EntityManager em = (EntityManager) Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
        
        em.getTransaction().begin();
        
        Editorial editorial = em.find(Editorial.class, id);
        
        em.remove(editorial);
        
        em.getTransaction().commit();
    }
}
