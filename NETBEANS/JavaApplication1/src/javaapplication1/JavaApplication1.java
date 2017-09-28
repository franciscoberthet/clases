/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author alumno
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona.setLegajo(20);
     //   System.out.println(Persona.getLegajo());
        Persona.setNombre("Carlos");
     //   System.out.println(Persona.getNombre());
        Persona.setApellido("Lopez");
    //    System.out.println(Persona.getApellido());
        System.out.println(Persona.getNombre() +" "+ Persona.getApellido());
    
        
    }
    
    
}
