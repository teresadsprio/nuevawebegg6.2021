/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 *
 * @author tered
 */

@Entity
public class Prestamo {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // atributo 
    private Integer idPrestamo;
    
    @Temporal(TemporalType.DATE)
    private Date fecha;
    
    @Temporal(TemporalType.DATE)      //atributo temporal (Esto es una fecha)
    private Date devolucion;

    public Prestamo() {
    }

    public Prestamo(Integer idPrestamo, Date fecha, Date devolucion) {
        this.idPrestamo = idPrestamo;
        this.fecha = fecha;
        this.devolucion = devolucion;
    }
    
    public Integer getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Date devolucion) {
        this.devolucion = devolucion;
    }

    @Override
    public String toString() {
        return "PRESTAMO: " + ", ID: " + idPrestamo + ", FECHA: " + fecha + ", DEVOLUCION: " + devolucion + '.';
    }
     
}

