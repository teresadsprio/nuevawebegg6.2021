/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import libreria.servicio.ClienteServicio;
import java.util.Scanner;
import libreria.servicio.AutorServicio;
import libreria.servicio.EditorialServicio;
import libreria.servicio.LibroServicio;

/**
 *
 * @author tered
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //AUTOR   Validacion: x
        
//        autorServicio.crearAutor("Roberto Artl");   
//        autorServicio.imprimirAutor("Roberto Artl");
//        autorServicio.editarAutor(1, "Juliane Rebentisch");
//        autorServicio.eliminarAutor(2);    

        //EDITORIAL Validacion: si 
//        editorialServicio.crearEditorial("Caja Negra");
//        editorialServicio.consultarEditorial(1);
//        editorialServicio.eliminarEditorial(1);

        //LIBRO  Validacion:       
       //libroServicio.crearLibro("Cometierra", 2, 3, 1, "Dolos Reyes", "Editorial Sigilo");
       //libroServicio.buscarLibro("Cometierra");
       //libroServicio.editarLibro("Cometierra", 2, 3, 2, "Dolores Reyes", "Editorial Sigilo");
       //libroServicio.eliminarLibro(1);

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int x = 0;
        
        System.out.println("Libreria");
        
        do {
            System.out.println("Elige una opción");
            System.out.println("1. Autor");
            System.out.println("2. Cliente");
            System.out.println("3. Editorial");
            System.out.println("4. Libro");
            System.out.println("5. Prestamo");
            System.out.println("6. Salir");
            x = scan.nextInt(); 
            
            switch (x) {
                case 1:
                AutorServicio autorServicio = new AutorServicio();
                case 2:
                ClienteServicio clienteServicio = new ClienteServicio();
                case 3:
                EditorialServicio editorialServicio = new EditorialServicio();    
                case 4:
                    
                case 5:
                    
            }
            
        }while(x!=6);
        
        

    }

}
