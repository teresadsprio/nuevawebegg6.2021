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
@Entity    // Anotaciones de JPA (No estan preestablecidas, hay que instalar unidad de persistencia)
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    
    private String nombreA;

    public Autor(Integer id, String nombreA) {
        this.id = id;
        this.nombreA = nombreA;
    }

    public Autor() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    @Override
    public String toString() {
        return "AUTOR" + "ID:" + id + ", NOMBRE:" + nombreA + '.';
    }    
}
