/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicio;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import libreria.entidades.Autor;

/**
 *
 * @author tered
 */
public class AutorServicio {

    public void crearAutor(String nombreA) {

        //utilizar los recursos del entitymanager. Guardar los datos en la base de datos llamada como la carpeta persistence.xml
        EntityManager em = (EntityManager) Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();

        //abrir transaccion
        em.getTransaction().begin();

        Autor autor = new Autor();

        autor.setNombreA(nombreA);

        //persistir los datos
        em.persist(autor);

        //cerrar transaccion
        em.getTransaction().commit();

    }

    public List<Autor> buscarAutor(String nombreA) {

        EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
        
        List<Autor> autor = em.createQuery("SELECT c FROM Autor c WHERE c.nombreA LIKE :nombreA")
                .setParameter("nombre", "%" + nombreA + "%")
                .getResultList();
        
        return autor;
    }
    
    public void imprimirAutor(String nombreA) {
        
        EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
        
        List <Autor> autor = buscarAutor(nombreA);
        
        for (Autor autor1 : autor) {
            System.out.println(autor1);
        }
    }
    
    public void editarAutor(Integer id, String nombreA) {

        EntityManager em = (EntityManager) Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();

        em.getTransaction().begin();

        Autor autor = em.find(Autor.class, id);

        autor.setNombreA(nombreA);

        //modificar merge
        em.merge(autor);

        em.getTransaction().commit();

    }

    public void eliminarAutor(Integer id) {

        EntityManager em = (EntityManager) Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();

        em.getTransaction().begin();

        Autor autor = em.find(Autor.class, id);

        //autor.setNombre(nombre);

        //eliminar remove
        em.remove(autor);

        em.getTransaction().commit();

    }
}

