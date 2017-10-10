/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batallanaval;

import java.util.Scanner;

/**
 *
 * @author Frann
 */
public class BatallaNaval {
 public static Scanner s = new Scanner (System.in);


 
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int tamanio;
        System.out.println("Ingrese nº de filas");
      do {
      tamanio = Integer.parseInt(s.nextLine());
      } while (tamanio > 9);
    // String n;
     //n = s.nextLine();
      //  System.out.println(Funciones.letraACoord(n));
       Funciones.crear(tamanio);
       Funciones.dificultad();
       Funciones.setBarcos();
       // String jugador1 = s.nextLine();
        Funciones.setJugador1("jugador1") ;
       // String jugador2 = s.nextLine();
        Funciones.setJugador2("jugador2") ;
       // System.out.print(jugador1);
        Funciones.espacios(20);
        //System.out.println(jugador2);

      Funciones.mostrarTablero(1);
      Funciones.asignarBarcos(1);
      Funciones.asignarBarcos(2);
      do {
          if (Funciones.aciertos[0] < Funciones.barcos && Funciones.aciertos[1] < Funciones.barcos)
              Funciones.Disparar(1);
           if (Funciones.aciertos[0] < Funciones.barcos && Funciones.aciertos[1] < Funciones.barcos)
               Funciones.Disparar(2); 
           
    }
    while (Funciones.aciertos[0] < Funciones.barcos && Funciones.aciertos[1] < Funciones.barcos);
 //             System.out.println(Funciones.barcos);  
   //   System.out.println(Funciones.aciertos[0]);
     //   System.out.println(Funciones.aciertos[1]);
      
   

}
    }
    
