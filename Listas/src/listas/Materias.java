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
public class Materias {
    String nombre;
    ArrayList<Persona> alumnos;
    
    public Materias (String materia) {
        this.alumnos = new ArrayList<Persona>();
    
        
}
    
    public void Mostrar (){
        for (Persona a : alumnos) {
            
            System.out.println(a.toString());
        }
     
        
        
    }
    
    
}
