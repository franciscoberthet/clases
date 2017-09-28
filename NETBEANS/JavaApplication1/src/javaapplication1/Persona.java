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
public class Persona {
   private static int legajo;
   private static String nombre;
   private static String apellido;
    
   public static int getLegajo(){
       return legajo;
   }
   public static void setLegajo(int legajo){
       Persona.legajo=legajo;
   }
   
    public static String getNombre(){
       return nombre;
   }
   public static void setNombre(String nombre){
       Persona.nombre = nombre;
   }
   
    public static String getApellido(){
       return apellido;
   }
   public static void setApellido(String apellido){
       Persona.apellido = apellido;
   }
}
