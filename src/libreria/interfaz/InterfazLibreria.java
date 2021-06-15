/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.interfaz;

import libreria.servicio.AutorServicio;
import libreria.servicio.EditorialServicio;
import libreria.servicio.LibroServicio;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;

/**
 *
 * @author tered
 */
public class InterfazLibreria {

    private final AutorServicio autorServicio;
    private final EditorialServicio editorialServicio;
    private final LibroServicio libroServicio;
    private final Scanner scan;

    public InterfazLibreria() {
        autorServicio = new AutorServicio();
        editorialServicio = new EditorialServicio();
        libroServicio = new LibroServicio();
        scan = new Scanner(System.in).useDelimiter("\n");
    }

    public void menu() {
        System.out.println("Ingrese que quiere hacer");
        System.out.println("1- Crear Autor");
        System.out.println("2- Crear Editorial");
        System.out.println("3- Crear Libro");
        System.out.println("4- Mostrar libro");
        System.out.println("5- Salir");
        int opcion = scan.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el nombre del autor");
                String nombreA = scan.next();
                autorServicio.crearAutor(nombreA);
                break;
            case 2:
                System.out.println("Ingrese el nombre de la editorial");
                String nombreE = scan.next();

                editorialServicio.crearEditorial(nombreE);
                break;
            case 3:
                System.out.println("Ingrese el titulo del libro");
                String titulo = scan.next();
                System.out.println("Ingrese el año del libro");
                Integer anio = scan.nextInt();
                System.out.println("Ingrese los ejemplares del libro");
                Integer ejemplares = scan.nextInt();
                System.out.println("Ingrese el numero de prestados");
                Integer prestados = scan.nextInt();
                System.out.println("Ingrese el id del autor");
                Integer idAutor = scan.nextInt();
                System.out.println("Ingrese el id de la editorial");
                Integer idEditorial = scan.nextInt();

                LibroServicio.crearLibro(titulo, anio, ejemplares, prestados, idAutor, idEditorial);
                break;
            case 4:
                LibroServicio.imprimirLibro();
                break;
            case 5:
                System.exit(0);
        }

    }

}
