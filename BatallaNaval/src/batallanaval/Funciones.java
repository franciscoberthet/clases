/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batallanaval;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Frann
 */



public class Funciones {
    private static int[][] tableroJ1;
    private static int[][] tableroJ2;
    private static int[][] tableroJ1J2;
    //Tablero que visualiza jugador 2 sobre el jugador 1
    private static int[][] tableroJ2J1;
    // Tablero que visualiza judador 1 sobre el jugador 2
    public static int barcos;
    private static String jugador1;
    private static String jugador2;
    private static Scanner s = new Scanner (System.in);
    private static double tamanio;
    private static  String[] fila1 = {"                  "+ "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    private static String[] ordenales = {"primer" , "segundo", "tercero", "cuarto" , "quinto", "sexto", "septimo", "octavo", "noveno", "decimo", "onceavo", "doceavo", "decimotercer", "decimocuarto", "decimoquinto", "decimosexto", "decimoseptimo", "decimoOctavo", "decimoNoveno", "Veinteavo"};
    private static boolean fallo = false;
    private static boolean acerto = false;
    public static int[] aciertos = new int[2] ;

    private static boolean ganar = false;
   
    public static void crear (int t){
        Funciones.tamanio = t;
        tableroJ1 = new int[t][t];
        tableroJ2 = new int[t][t];
        tableroJ1J2 = new int[t][t];
        tableroJ2J1 = new int[t][t];
        
    }
    public static void borrar (int tablero){
        if (tablero == 1){
            tableroJ1 = new int [(int)tamanio][(int)tamanio];
        }
        if (tablero == 2){
            tableroJ2 = new int [(int)tamanio][(int)tamanio];
        }
    }
    
    public static void dificultad(){
        String dificultad;
        boolean error = false;
        int facil = (int)Math.round((Funciones.tamanio*Funciones.tamanio)/(1.6));
        int medio = (int)Math.round((Funciones.tamanio*Funciones.tamanio)/(2.5));
        int dificil = (int)Math.round((Funciones.tamanio*Funciones.tamanio)/4);
        do {
        System.out.println("Seleccione nivel de dificultad");
        System.out.println("F- Facil " + "(" +facil + " barcos)");
        System.out.println("M- Moderado "+ "(" +medio + " barcos)");
        System.out.println("D- Dificil "+ "(" +dificil + " barcos)");
        dificultad = s.nextLine();
        dificultad = dificultad.toLowerCase();
        } while (!dificultad.equals("m") && !dificultad.equals("d") && !dificultad.equals("f"));
        switch (dificultad){
            case "f":
                Funciones.barcos = facil;
                break;
            case "m":
                Funciones.barcos = medio;
                break;
            case "d":
                Funciones.barcos = dificil;
                break;
            
        }
        System.out.println(barcos);
   
        
    }
    
    public static int setBarcos(){
        Funciones.barcos = barcos;
        return barcos;
    }
    
    
    public static void setJugador1(String jugador1){
        Funciones.jugador1 = jugador1;
    }
    
    public static void setJugador2(String jugador2){
        Funciones.jugador2 = jugador2;
    }
    
    public static void asignarBarcos(int jugador){
        int coordX ; int coordY; int error=0;int opcion;
        String n; String confirmacion;
        if (jugador == 1){
        for (int i = 0 ; i < barcos; i++){
            error = 0;
            do { 
                if (error > 0){
                    System.out.println("\033[31mLa coordenada X no es una coordenada valida");
                }
                System.out.println(jugador1.toUpperCase() + " |" );
                System.out.println("Ingrese coordenada X del "+ ordenales[i] +" barco a agregar Ej: A1, B2, etc");
                // fila1[0].replaceAll("\\s+","")) elimina espacios en String
                do{
                    n = s.nextLine();
   //                 System.out.println(n.substring(0,1));
    //                System.out.println(n.substring(1));
                    
    //                System.out.println(n.substring(0,1).matches("[0-9]+"));
     //               System.out.println((n.substring(1)).matches("[0-9]+"));
                }   
               while (n.length() <= 1 || n.substring(0,1).matches("[0-9]+")==true || (n.substring(1)).matches("[0-9]+")==false);
                coordX = (letraACoord(n.substring(0,1))-1);
                coordY = (Integer.parseInt(n.substring(1))-1);
              //  coordX = (letraACoord(n)) -1;
                if (coordX >= (tableroJ1[0].length)-1) error++;
            } while (coordX > (tableroJ1[0].length)-1 );
            error = 0;
            do {
                 if (error > 0){
                    System.out.println("\033[31mLa coordenada Y no es una coordenada valida");
                    error = 0;
                }
          //  System.out.println("Ingrese coordenada Y del " + ordenales[i] +" barco a agregar" + "(1-" + (tableroJ1[0].length) +")" );
          //  coordY = (Integer.parseInt(s.nextLine()) -1);
            if (coordY >= (tableroJ1[0].length)-1) error++;
        } while (coordY > (tableroJ1[0].length)-1);
            error = 0;
            tableroJ1[coordY][coordX] = 1;
            mostrarTablero(1);
            if (i == (barcos-1)){
                System.out.println("Esta seguro de la ubicacion de sus barcos? (S/N)");
                confirmacion = s.nextLine();
                confirmacion = confirmacion.toLowerCase();
                if (confirmacion.equals("n")) {
                    borrar(jugador);
                    mostrarTablero(jugador);
                    asignarBarcos(jugador);
                }
                
            }
        }
        
        }
        if (jugador == 2){
            mostrarTablero(2);
                    for (int i = 0 ; i < barcos; i++){
            error = 0;
            do { 
                if (error > 0){
                    System.out.println("\033[31mLa coordenada X ingresada no es una coordenada valida");
                }
                System.out.println(jugador2.toUpperCase() + " |" );
                System.out.println("Ingrese coordenada del "+ ordenales[i] +" barco a agregar" + "(" +(fila1[0].replaceAll("\\s+",""))+"-" + fila1[(int)tamanio-1]+")");
                // fila1[0].replaceAll("\\s+","")) elimina espacios en String
                n = s.nextLine();
                coordX = (letraACoord(n.substring(0,1))-1);
                coordY = (Integer.parseInt(n.substring(1))-1);
                if (coordX >= (tableroJ2[0].length)-1) error++;
            } while (coordX > (tableroJ2[0].length)-1);
            
            error = 0;
            do {
                 if (error > 0){
                    System.out.println("\033[31mLa coordenada Y ingresada no es una coordenada valida");
                }
         //   System.out.println("Ingrese coordenada Y del " + ordenales[i] +" barco a agregar" + "(1-" + (tableroJ1[0].length) +")" );
          //  coordY = (Integer.parseInt(s.nextLine()) -1);
            if (coordY >= (tableroJ2[0].length)-1) error++;
        } while (coordY > (tableroJ2[0].length)-1);
            tableroJ2[coordY][coordX] = 1;
            mostrarTablero(2);
            if (i == (barcos-1)){
                System.out.println("Esta seguro de la ubicacion de sus barcos? (S/N)");
                confirmacion = s.nextLine();
                confirmacion = confirmacion.toLowerCase();
                if (confirmacion.equals("n")) {
                    borrar(jugador);
                    mostrarTablero(jugador);
                    asignarBarcos(jugador);
                }
                }
            
    }
        }
            
    
    }
  /*  public static void asignarBarcos1(){
        int coordX ; int coordY; int error=0;
        String[] ordenales = {"primer" , "segundo", "tercero", "cuarto" , "quinto", "sexto", "septimo", "octavo", "noveno", "decimo", "onceavo", "doceavo", "decimotercer", "decimocuarto", "decimoquinto", "decimosexto", "decimoseptimo", "decimoOctavo", "decimoNoveno", "Veinteavo"};
        for (int i = 0 ; i < barcos; i++){
            error = 0;
            do { 
                if (error > 0){
                    System.out.println("\033[31mLa coordenada X no puede ser mayor a " + tablero[0].length);
                }
                System.out.println("Ingrese coordenada X del "+ ordenales[i] +" barco a agregar");
                coordX = (Integer.parseInt(s.nextLine()) -1);
                if (coordX >= 5) error++;
            } while (coordX > (tablero[0].length)-1);
            error = 0;
            do {
                 if (error > 0){
                    System.out.println("\033[31mLa coordenada Y no puede ser mayor a " + tablero[0].length);
                }
            System.out.println("Ingrese coordenada Y del " + ordenales[i] +" barco a agregar");
            coordY = (Integer.parseInt(s.nextLine()) -1);
            if (coordY >= 5) error++;
        } while (coordY > (tablero[0].length)-1);
            tablero[coordY][coordX] = 1;
            mostrarTablero();
            
    }
    }*/
    
    
    public static void mostrarTablero(int tablero){
    //    String[] fila1 = {"                  "+ "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        
        boolean columna1 = false;
        for (int i = 0; i < 20; ++i) System.out.println();
       // System.out.println("\033[30m-----------------------------------------------");    
      
        if (tablero == 1){
             for (int i = 0 ; i < tamanio ; i++){
            System.out.print(fila1[i]+"  ");
        }
        
        for (int i = 0 ; i < tamanio ; i++ ){
            System.out.println(" ");
            do {
                    String iS = "" + ((i)+1);
                    int tamañoI = iS.length();
                    System.out.print("\033[30m");
                    espacios(15-tamañoI);
                    System.out.print(((i)+1) +"  ");
                    columna1 = true;
                } while (!columna1);
            for (int j= 0 ; j < tamanio ; j++){   
                columna1 = true;
                if (tableroJ1[i][j] == 0){
                    // "Incognita"
                    System.out.print("\033[37m■" + "  ");
                    }
                if (tableroJ1[i][j] == 1){
                    System.out.print("\033[30m■" + "  ");
                    //"Barco"
                }
                if (tableroJ1[i][j] == 3){
                    // Barco alcanzado por disparo
                    System.out.print("\033[31m■" + "  ");
                    }
                if (tableroJ1[i][j] == 4    ){
                    System.out.print("\033[34m■" + "  ");
                    //"Agua"
              //  System.out.print(tableroJ1[i][j] + "  ");
              // devuelve numeros (0,1,2 etc)
                
            
        }     
        }}}
        
        if (tablero == 2){
         
        
        for (int i = 0 ; i < tamanio ; i++){
            System.out.print(fila1[i]+"  ");
        }
        
        for (int i = 0 ; i < tamanio ; i++ ){
            System.out.println(" ");
            do {
                 
                    System.out.print("\033[30m               " + ((i)+1) +"  ");
                    columna1 = true;
                } while (!columna1);
            for (int j= 0 ; j < tamanio ; j++){   
                columna1 = true;
                if (tableroJ2[i][j] == 0){
                    // "Incognita"
                    System.out.print("\033[37m■" + "  ");
                    }
                if (tableroJ2[i][j] == 1){
                    System.out.print("\033[30m■" + "  ");
                    //"Barco"
                }
                if (tableroJ2[i][j] == 2){
                    // Barco alcanzado por disparo
                    System.out.print("\033[31m■" + "  ");
                    }
                if (tableroJ2[i][j] == 3 ){
                    System.out.print("\033[34m■" + "  ");
                
                
            }
      }}}
        
               if (tablero == 3){
         
        
        for (int i = 0 ; i < tamanio ; i++){
            System.out.print(fila1[i]+"  ");
        }
        
        for (int i = 0 ; i < tamanio ; i++ ){
            System.out.println(" ");
            do {
                 
                    System.out.print("\033[30m               " + ((i)+1) +"  ");
                    columna1 = true;
                } while (!columna1);
            for (int j= 0 ; j < tamanio ; j++){   
                columna1 = true;
                if (tableroJ1J2[i][j] == 0){
                    // "Incognita"
                    System.out.print("\033[37m■" + "  ");
                    }
                if (tableroJ1J2[i][j] == 1){
                    System.out.print("\033[30m■" + "  ");
                    //"Barco"
                }
                if (tableroJ1J2[i][j] == 2){
                    // Barco alcanzado por disparo
                    System.out.print("\033[31m■" + "  ");
                    }
                if (tableroJ1J2[i][j] == 3){
                    System.out.print("\033[34m■" + "  ");

                
            }

        }
            }
        }
        
               if (tablero == 4){
         
        
        for (int i = 0 ; i < tamanio ; i++){
            System.out.print(fila1[i]+"  ");
        }
        
        for (int i = 0 ; i < tamanio ; i++ ){
            System.out.println(" ");
            do {
                 
                    System.out.print("\033[30m               " + ((i)+1) +"  ");
                    columna1 = true;
                } while (!columna1);
            for (int j= 0 ; j < tamanio ; j++){   
                columna1 = true;
                if (tableroJ2J1[i][j] == 0){
                    // "Incognita"
                    System.out.print("\033[37m■" + "  ");
                    }
                if (tableroJ2J1[i][j] == 1){
                    System.out.print("\033[30m■" + "  ");
                    //"Barco"
                }
                if (tableroJ2J1[i][j] == 2){
                    // Barco alcanzado por disparo
                    System.out.print("\033[31m■" + "  ");
                    }
                if (tableroJ2J1[i][j] == 3){
                    System.out.print("\033[34m■" + "  ");

                
            }
                
           //     System.out.print(tableroJ2J1[i][j] + "  ");
                
            }
        }
       
        }
        System.out.println("");
        
        }
    
    public static void espacios (int espacio){
        for (int i = 0 ; i <= espacio ; i++){
            System.out.print(" ");    
        } 
    }
    public static int letraACoord(String n) {
        int num=0;
        n = n.toLowerCase();
        switch (n){
            case "a": 
               num = 1;
               break;
            case "b": 
                num = 2;
                break;
            case "c":
                num = 3;
                break;
            case "d": 
                num = 4;
                break;
            case "e":
                num = 5;
                break;
            case "f":
            num = 6;
            break;
            case "g": 
               num = 7;
               break;
            case "h": 
                num = 8;
                break;
            case "i":
                num = 9;
                break;
            case "j": 
                num = 10;
                break;
            case "k":
                num = 11;
                break;
            case "l":
            num = 12;
            break;
            case "m": 
               num = 13;
               break;
            case "n": 
                num = 14;
                break;
            case "o":
                num = 15;
                break;
            case "p": 
                num = 16;
                break;
            case "q":
                num = 17;
                break;
            case "r":
            num = 18;
            break;
            case "s": 
               num = 19;
               break;
            case "t": 
                num = 20;
                break;
            case "u":
                num = 21;
                break;
            case "v": 
                num = 22;
                break;
            case "w":
                num = 23;
                break;
            case "x":
            num = 24;
            break;
            case "y": 
               num = 25;
               break;
            case "z": 
                num = 26;
                break;
           
        }
    return num;
} 
 

    public static int[] Disparar(int jugador){
       int error; int coordX ; int coordY; int contador=0;
  
       int aciertos1 = 0; int aciertos2 = 0;
       String n; 

        if (jugador == 1){
            mostrarTablero(3);
            
            for (int i = 0 ; contador < 1; i++){
            error = 0;

            do { 
                if (error > 0){
                    System.out.println("\033[31mLa coordenada X no es una coordenada valida");
                }
                System.out.println(jugador1.toUpperCase() + " |" );
                if (fallo) {System.out.println("Fallaste!");}
                if (acerto) {System.out.println("Le diste a un barco!");}
                fallo = false;
                acerto = false;
                System.out.println("Ingrese coordenadas X del disparo" + "(" +(fila1[0].replaceAll("\\s+",""))+"-" + fila1[(int)tamanio-1]+")");
                // fila1[0].replaceAll("\\s+","")) elimina espacios en String
                n = s.nextLine();
                coordX = (letraACoord(n.substring(0,1))-1);
                coordY = (Integer.parseInt(n.substring(1))-1);
                if (coordX >= 5) error++;
            } while (coordX > (tableroJ1J2[0].length)-1);
            error = 0;
                   do {
                 if (error > 0){
                    System.out.println("\033[31mLa coordenada Y no es una coordenada valida");
                }
       //     System.out.println("Ingrese coordenada Y del " + ordenales[i] +" barco a agregar" );
       //     coordY = (Integer.parseInt(s.nextLine()) -1);
            
         //   if (coordY >= 5) error++;
            } while (coordY > (tableroJ1[0].length)-1);
                   
            if (tableroJ2[coordY][coordX] == 1){
                tableroJ1J2[coordY][coordX] = 2; 
                acerto = true;
                aciertos1++;
                aciertos[0] += aciertos1;
                System.out.println(aciertos[0]);
        System.out.println(aciertos[1]);
                if (aciertos[0] == barcos){
                    mostrarTablero(3);
                    espacios(13);
                    System.out.println("Le diste a un barco!");
                    espacios(13);
                    System.out.println( jugador1 + " GANASTE!!!");
                    contador++;
     
                }
                else mostrarTablero(3);
             //    System.out.println("Le diste a un barco!");
            }
            
            if (tableroJ2[coordY][coordX] == 0){
                tableroJ1J2[coordY][coordX] = 3; 
                fallo = true;
                mostrarTablero(3);
                System.out.println("Fallaste!");
                System.out.println(aciertos[0]);
                System.out.println(aciertos[1]);
                aciertos1 = 0;
                contador++;  
                
                
            }
            }
        
        return aciertos;
        }
 
            if (jugador == 2){
            mostrarTablero(4);
            
            for (int i = 0 ; contador < 1; i++){
            error = 0;

            do { 
                if (error > 0){
                    System.out.println("\033[31mLa coordenada X no es una coordenada valida");
                }
                System.out.println(jugador2.toUpperCase() + " |" );
                if (fallo) {System.out.println("Fallaste!");}
                if (acerto) {System.out.println("Le diste a un barco!");}
                fallo = false;
                acerto = false;
                System.out.println("Ingrese coordenada X del disparo" + "(" +(fila1[0].replaceAll("\\s+",""))+"-" + fila1[(int)tamanio-1]+")");
                // fila1[0].replaceAll("\\s+","")) elimina espacios en String
                n = s.nextLine();
                coordX = (letraACoord(n.substring(0,1))-1);
                coordY = (Integer.parseInt(n.substring(1))-1);
                if (coordX >= (tableroJ1J2[0].length)-1) error++;
            } while (coordX > (tableroJ1J2[0].length)-1);
            error = 0;
                   do {
                 if (error > 0){
                    System.out.println("\033[31mLa coordenada Y no es una coordenada valida");
                }
          //  System.out.println("Ingrese coordenada Y del " + ordenales[i] +" barco a agregar" );
        //    coordY = (Integer.parseInt(s.nextLine()) -1);
            if (coordY >= (tableroJ1[0].length)-1) error++;
            } while (coordY > (tableroJ1[0].length)-1);
            if (tableroJ1[coordY][coordX] == 1){
                tableroJ2J1[coordY][coordX] = 2; 
                acerto = true;
                aciertos2++;
                aciertos[1] +=  aciertos2; 
                  System.out.println(aciertos[0]);
                 System.out.println(aciertos[1]);
                if (aciertos[1] == barcos){
                    mostrarTablero(4);
                    espacios(13);
                    System.out.println("Le diste a un barco!");
                    espacios(13);
                    System.out.println( jugador2 + " GANASTE!!!");
                    contador++;
            
                }
                else mostrarTablero(4);
                
            //    System.out.println("Le diste a un barco!");
            }
         
            if (tableroJ1[coordY][coordX] == 0){
                tableroJ2J1[coordY][coordX] = 3; 
                fallo = true;
                mostrarTablero(4);
             //   System.out.println("Fallaste!");
                  System.out.println(aciertos[0]);
        System.out.println(aciertos[1]);
                aciertos2 = 0;
                contador++;  
            
                
            }
             
        
        
        
        
            
            
        }
   //   aciertos[1] +=  aciertos2;  
    }
      
return aciertos;

}
    
            

}
