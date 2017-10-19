/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author alumno
 */
public class Persona {
    //Creamos nuestro propio tipo de datos "Persona"
    //Agrupa caracteristicas y comportamientos de una persona
    public String nombre;
    public String apellido;
    public int legajo;
    private int nota1;
    private int nota2;
    private boolean Final;
    private String VaFinal;

    public void calcularNota (){
        nota1 = (int) (Math.random()*10)+1;
        nota2 = (int) (Math.random()*10)+1;
    }
    
  public Persona(String nombre){
        this.nombre = nombre; 
   }
  
   public Persona (int l){
        this.legajo = l;
    }  
   
       public Persona(String n, String a, int l){
        //this.nombre = nombre; 
        //this.apellido = apellido;
       // this.legajo = legajo;
        
        this(n);
        this.legajo = l;
        this.apellido = a;
  // System.out.println("Constructor");
}
   
       public String Mostrar(){
           return this.nombre +" "+ this.apellido +" "+ this.legajo; 
              
       }

     public String Final (int nota1, int nota2){
    if ((nota1 + nota2) /2 > 4){
        Final = true;
    }
    if (Final){
        return "Va a final";
    }
        return "";
    }

      
    @Override
    public String toString() {
        calcularNota();
        Final(nota1, nota2);
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", legajo=" + legajo + '}' + nota1 +" " + nota2 + " "+ VaFinal ;
    }
    
 
    
}
