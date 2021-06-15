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

/**
 *
 * @author tered
 */

@Entity
public class Editorial extends Exception {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String nombre;    
   
    public Editorial() {
    }

    public Editorial(Integer idEdi, String nombreEdi) {
        this.id= id;
        this.nombre = nombre;
    }

    public Integer getIdEditorial() {
        return id;
    }

    public void setIdEdi(Integer id) {
        this.id= id;
    }

    public String getNombreEdi() {
        return nombre;
    }

    public void setNombreEdi(String nombreEdi) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "EDITORIAL\n" + "ID EDITORIAL: " + id + ", NOMBRE DE LA EDITORIAL: " + nombre + '.';
    }   
}
