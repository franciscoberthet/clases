import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class EjerciciosEstructurasControlBORRADOR {
public static void ej1(){
	int num1 ; int num2;
	Scanner s = new Scanner (System.in);
	System.out.println("Ingrese primer numero: ");
	num1 = Integer.parseInt(s.nextLine());
	System.out.println("Ingrese segundo numero: ");
	num2 = Integer.parseInt(s.nextLine());
	System.out.println("Su suma es " + (num1+num2));
	
}

public static void ej2(){
//	hecho un poco mas complejo que el enunciado.
	String usuario = "usuario";
	String contraseña = "contraseña";
	String imputUsuario; String imputContraseña;
	int opcion; int menu = 0;
	Scanner s = new Scanner (System.in);
	do {
	System.out.println("Ingrese opcion");	
	System.out.println("1. Registrarse");
	System.out.println("2. Ingresar");
	menu = Integer.parseInt(s.nextLine());
	if (menu == 1){
		do {
			System.out.println("Nombre de usuario: (Solo letras)");
			usuario = s.nextLine();
			if (usuario.matches(".*\\d+.*")){
				System.out.println("su nombre de usuario no puede contener numeros"); }
		}
		while (usuario.matches(".*\\d+.*")); // * means any character from 0 to infinite occurence, than the \\d+ (double backslash I think is just to escape the second backslash) and \d+ means a digit from 1 time to infinite
		
		do {		
		System.out.println("Ingrese su contraseña (Solo letras)");
		contraseña = s.nextLine();
		if (contraseña.matches(".*\\d+.*")){
			System.out.println("su nombre de usuario no puede contener numeros"); }

		}
		while (contraseña.matches(".*\\d+.*"));
		menu = 0;		
	}

	
	if (menu == 2){
		do {
		System.out.println("Usuario:");
		imputUsuario = s.nextLine();
		System.out.println("Contraseña:");
		imputContraseña = s.nextLine();
		if (!imputUsuario.equals(usuario) || !imputContraseña.equals(contraseña)){
			System.out.println("nombre o contraseña invalidos");
		}
		}
		while (!imputUsuario.equals(usuario) || !imputContraseña.equals(contraseña));
		System.out.println("Acceso exitoso");
	}
	} 
	while (menu == 0);
	
	
}

public static void ej3(){
	int bancos; int alumnos;
	Scanner s = new Scanner (System.in);
	System.out.println("Ingrese la cantidad de bancos");
	bancos = Integer.parseInt(s.nextLine());
	System.out.println("Ingrese la cantidad de alumnos");
	alumnos = Integer.parseInt(s.nextLine());
	if (bancos > alumnos){
		System.out.println("Hay suficientes bancos para los alumnos");
		System.out.println("Sobran " + (bancos - alumnos) + " bancos");
	}
	if (bancos < alumnos){
		System.out.println("No hay suficientes bancos");
		System.out.println("Deben agregarse " + (alumnos - bancos) + " bancos");
	}
	else {
		System.out.println("El aula esta completa");
		
	}
	
}

public static void ej4 (){
	double montoCompra; 
	String formaPago;
	boolean descuento;
	Scanner s = new Scanner (System.in);
	
	System.out.println("Ingrese monton de su compra");
	montoCompra = Double.parseDouble(s.nextLine());
	do {
	System.out.println("Indique su forma de pago (Tarjeta / Efectivo)");
	formaPago = s.nextLine();
	formaPago.toLowerCase();
	if (!formaPago.equals("Tarjeta") && !formaPago.equals("efectivo")){
		System.out.println("Indique si su forma de pago fue contado o efectivo");
	}
	} while (!formaPago.equals("tarjeta") && !formaPago.equals("efectivo"));
	if (formaPago.equals("efectivo")){
		montoCompra = montoCompra - (montoCompra*0.1);
		descuento = true;
	}
	System.out.println("El total de su compra es: " + montoCompra);
	if (descuento = true){
		System.out.println("su compra tuvo un descuento del 10%");
	}
	
}

public static void ej5(){
	int numMes;
	Scanner s = new Scanner (System.in);
	System.out.println("Ingrese numero del mes");
	numMes = Integer.parseInt(s.nextLine());
	switch (numMes){
	case 1:
		System.out.println("Enero");
	break;
	case 2:
		System.out.println("Febrero");
		break;
	case 3: 
		System.out.println("Marzo");
		break;
	case 4:
		System.out.println("Abril");
		break;
	case 5:
		System.out.println("Mayo");
		break;
	case 6:
		System.out.println("Junio");
		break;
	case 7:
		System.out.println("Julio");
		break;
	case 8:
		System.out.println("Agosto");
		break;
	case 9:
		System.out.println("Septiembre");
		break;
	case 10:
		System.out.println("Octubre");
		break;
	case 11: 
		System.out.println("Noviembre");
		break;
	case 12:
		System.out.println("Diciembre");
		break;
		default: 
			System.out.println("Ese numero no corresponde a ningun mes");
	}
	
}

public static void ej7(){
	int numero ; int finTabla; int contador = 1;
	Scanner s = new Scanner (System.in);
	System.out.println("Ingrese numero a multiplicar");
	numero = Integer.parseInt(s.nextLine());
	System.out.println("Ingrese hasta que numero multiplicar");
	finTabla = Integer.parseInt(s.nextLine());
	do {
		if (contador == 1){
		System.out.print(numero * contador+ ",");
		contador++;
		}
	if (contador < finTabla && contador != 1) {
	System.out.print(" "+numero * contador + ",");
	contador++;
	}
	if (contador == finTabla){
		System.out.print(" "+numero * contador);
		contador++;
		}
	} while (contador <= finTabla);
	
	
}

public static void ej6(){
	int numero ; int finTabla; int contador = 1;
	Scanner s = new Scanner (System.in);
	System.out.println("Ingrese numero a multiplicar");
	numero = Integer.parseInt(s.nextLine());
	System.out.println("Ingrese hasta que numero multiplicar");
	finTabla = Integer.parseInt(s.nextLine());
	System.out.print(numero * contador+ ",");
	contador++;
	while (contador < finTabla){
	System.out.print(" "+numero * contador + ",");
	contador++;
	if (contador == finTabla)
	System.out.print(" "+numero * contador);
	} 
}

public static void ej8(){
	int cantidad = 4; double promedio = 0;
	double[] numero = new double[cantidad];
	Scanner s = new Scanner (System.in);
	DecimalFormat formato = new DecimalFormat("####.##"); 
	// dar formato a numeros para que tengan dos decimales
	for (int i = 0 ; i < cantidad ; i++){
		System.out.println("ingrese su numero ");
		numero[i] = Double.parseDouble(s.nextLine());
		if (i == 0){
		promedio = (promedio + numero[i]);}
		if (i != 0){
		promedio = (promedio + numero[i]) / i ;}
				
	}
	
	
	System.out.println("El promedio de sus numeros es " + formato.format(promedio));
	
}

public static void ej9 (){
//	int cantidad = ThreadLocalRandom.current().nextInt(1, 50+1);
	int cantidad = 30;
	boolean[] butacasOcupadas = new boolean[cantidad];
	Random random = new Random();
	int butacasLibres = 0;
	for (int i=0 ; i < cantidad ; i++ ){
	butacasOcupadas[i] = random.nextBoolean();
	}
	for (int i=0 ; i < cantidad ; i++ ){
	if (!butacasOcupadas[i]){
		butacasLibres++;
	}
	}
	if (butacasLibres == 1){
		System.out.println("Hay " + butacasLibres + " butaca desocupadas");
	}
	System.out.println("Hay " + butacasLibres + " butacas desocupadas");
		
}

public static void ej10(){
	String[] aula = {"azul", "verde", "amarillo"};
	int[] capacidad = new int[] {40, 35, 30};
	int[] resta = new int[3];
	int alumnos; 
	Scanner s = new Scanner (System.in);
	
	do { System.out.println("Ingrese la cantidad de alumnos a cursar");
		alumnos = Integer.parseInt(s.nextLine());
		if (alumnos > 40){
			System.out.println("los alumnos inscriptos no pueden ser mayores a 40");
		}
	}
	while (alumnos > 40);
	
	for ( int i = 0 ; i < 2 ; i++ ){
		resta[i] = capacidad[i] - alumnos ;
		
	}
	
	System.out.println(Arrays.toString(resta));
		
}
	
	
	
	
}

