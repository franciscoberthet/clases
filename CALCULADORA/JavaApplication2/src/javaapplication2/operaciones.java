/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author alumno
 */
public class operaciones {
    private static int resultado;
 public static int suma(int numero1, int numero2){
     resultado = numero1+numero2;
 //    getResultado();
     return resultado;
 }
 public static int resta (int numero1, int numero2){
     resultado = numero1 - numero2;
     return resultado;
 }
 
 public static int multiplicacion (int numero1, int numero2){
     resultado = numero1 * numero2;
     return resultado;
 }
 
 public static int division(int numero1, int numero2){
     resultado = numero1 / numero2;
     return resultado;
 }
 
 

 
 //public static int getResultado (int resultado){
//     operaciones.resultado = resultado;
 //    return resultado;
 //}
}
