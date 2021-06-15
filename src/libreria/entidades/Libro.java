/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author tered
 */

@Entity
public class Libro {
    
    //Se autogenera el valor identitario
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    private Long isbn;

    private String titulo;
    
    private Integer anio;

    private Integer ejemplares;

    private Integer prestados;

    //Muchos libros a un autor
    @OneToOne       
    private Integer idAutor;

    //Muchos libros de una editorial
    @OneToMany       
    private Integer idEditorial;

    public Libro() {
    }

    public Libro(Long isbn, String titulo, Integer anio, Integer ejemplares, Integer prestados, Integer idAutor, Integer idEditorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
        this.idAutor = idAutor;
        this.idEditorial = idEditorial;
    }
    
    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getPrestados() {
        return prestados;
    }

    public void setPrestados(Integer prestados) {
        this.prestados = prestados;
    }

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public Integer getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(Integer IdEditorial) {
        this.idEditorial = idEditorial;
    }

    @Override
    public String toString() {
        return "LIBRO\n" + "ISBN: " + isbn + ", TITULO: " + titulo + ", ANIO: " + anio + ", EJEMPLARES: " + ejemplares + ", PRESTADOS: " + prestados + ", AUTOR: " + idAutor + ", EDITORIAL: " + idEditorial + '.';
    }     
}
