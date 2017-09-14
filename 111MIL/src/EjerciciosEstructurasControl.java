import java.util.Scanner;

public class EjerciciosEstructurasControl {

public static void pedir(){
	int n1; int n2; int suma;
	Scanner s = new Scanner (System.in);
	System.out.println("Ingrese su primer numero");
	n1 = Integer.parseInt(s.nextLine());
	System.out.println("Ingrese su segundo numero");
	n2 = Integer.parseInt(s.nextLine());
	EjerciciosEstructurasControl.suma(n1, n2);
	
}


public static void suma(int n1, int n2){
	int suma = n1+n2;	
	System.out.println("Su suma es "+suma);
	
	
}

public static void tp2(){
	String usuario = "usuario";
	String contraseña = "contraseña";
	String imputUsuario; String imputContraseña;
	
}

public static void menu(){
	
}
}
