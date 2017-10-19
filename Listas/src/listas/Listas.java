/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // ArrayList lista;
       // lista = new ArrayList();
       
       Materias java = new Materias("java");
       //Persona p1 = new Persona ("Juan", "Alfredo", 10375);
       //java.alumnos.add(p1);
       
       java.alumnos.add(new Persona("Francisco", "Berthet", 10375));
       java.alumnos.add(new Persona("Natalia", "Natalia", 10400));
       java.alumnos.add(new Persona("Federico", "Alonso", 19800));
       java.alumnos.add(new Persona("Andres", "Marcos", 17700));
      
        java.Mostrar();
        
     /* Persona p = new Persona("Juan", "Alfredo" , 10375);
        System.out.println(p.nombre);
        System.out.println(p.apellido);
     //   p.legajo = 10375;
        System.out.println(p.legajo);
              
/*              
        ArrayList<String> lista;
        lista = new ArrayList<String>();
        lista.add("Juan");
        lista.add("Pepe");
        lista.add("natalia");
    //    lista.add(10);
        // for (Object o: lista) {
            for (String o: lista) {
                //"String" porque ya que de que clase es la lista
           // System.out.println(o.toString());
              //System.out.println(((String) o).toUpperCase());
                System.out.println(o.toUpperCase());
        }
  */      
        // TODO code application logic here
    }
    
}
