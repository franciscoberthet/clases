import java.util.Scanner;

public class guiaEntradaSalida {
public static void ej1() {
	System.out.println("Esto funciona de maravilla");
}
public static void ej2(){
	String dato;
	Scanner scan = new Scanner(System.in);
	dato = scan.nextLine();
	System.out.println(dato);
}
public static void ej3(){
	String nombre;
	Scanner scan = new Scanner(System.in);
	System.out.println("Ingrese su nombre: ");
	nombre = scan.nextLine();
	System.out.println("Su nombre es: " + nombre);
	
}
public static void ej5(){
	int dividendo;
	int divisor;
	Scanner scan = new Scanner(System.in);
	System.out.println("ingrese dividendo");
	dividendo = Integer.parseInt(scan.nextLine());
	System.out.println("Ingrese divisor");
	divisor = Integer.parseInt(scan.nextLine());
	System.out.println("El resto es: " + (dividendo%divisor));
}
}

	
