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
import libreria.entidades.Editorial;
import libreria.entidades.Libro;

/**
 *
 * @author tered
 */
public class LibroServicio {

    public void crearLibro(String titulo, Integer anio, Integer ejemplares, Integer prestados, Integer idAutor, Integer idEditorial) {

        //recursos entitymanager
        EntityManager em = (EntityManager) Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();

        //abrir transaccion
        em.getTransaction().begin();

        Libro libro = new Libro();

        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setPrestados(prestados);
        libro.setIdAutor(idAutor);
        libro.setIdEditorial(idEditorial);

        //persistir los datos
        em.persist(libro);

        //cerrar transaccion
        em.getTransaction().commit();
    }

    public void editarLibro(String titulo, Integer anio, Integer ejemplares, Integer prestados, Integer idAutor, Integer idEditorial) {

        //recursos entitymanager
        EntityManager em = (EntityManager) Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();

        //abrir transaccion
        em.getTransaction().begin();

        Libro libro = new Libro();
        
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setPrestados(prestados);
        libro.setIdAutor(idAutor);
        libro.setIdEditorial(idEditorial);
        
        em.merge(libro);
        
        em.getTransaction().commit();
    }
    
    public List<Libro> buscarLibro(String titulo) {

        EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
        
        List<Libro> libro = em.createQuery("SELECT c FROM Libro c WHERE c.titulo LIKE :titulo")
                .setParameter("titulo", "%" + titulo + "%")
                .getResultList();
        
        return libro;
    }
    
    public void imprimirLibro(String titulo, Integer anio, Integer ejemplares, Integer prestados, Integer idAutor, Integer idEditorial) {
        
        EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
        
        List <Libro> libro = buscarLibro(titulo);
        
        for (Libro libro1 : libro) {
            System.out.println(libro1);
        }
    }

    public void eliminarLibro(Long isbn) {

        EntityManager em = (EntityManager) Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();

        em.getTransaction().begin();
        
        Libro libro = em.find(Libro.class, isbn);

        //eliminar remove
        em.remove(libro);

        em.getTransaction().commit();        
    } 
    
}
