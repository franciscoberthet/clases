import java.util.Scanner;

public class GuiaEntradaSalida {
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

public static void ej4(){
	int num1;
	int num2;
	String operador;
	Scanner s = new Scanner(System.in);
	System.out.println("Ingrese el primer numero");
	num1 = Integer.parseInt(s.nextLine());
	System.out.println("Ingrese su operacion (+ - * / )");
	operador = s.nextLine();
	operador = operador.toLowerCase();
	if (operador.equals("+") || operador.equals("suma") || operador.equals("/") || operador.equals("division") || operador.equals("-") || operador.equals("resta") || operador.equals("*") || operador.equals("multiplicacion"))
			{
				System.out.println("Ingrese el segundo numero");
				num2 = Integer.parseInt(s.nextLine());
				if (operador.equals("/") && num2 == 0)
					System.out.println("no se puede dividir por 0");
				else if (operador.equals("division") || operador.equals("/"))
					System.out.println(num1/num2);
				else if (operador.equals("suma") || operador.equals("+")){
					System.out.println("la suma es " + (num1+num2));
				}
				else if (operador.equals("resta") || operador.equals("-")){
					System.out.println("la resta es " + (num1 - num2));	
				}
				else if (operador.equals("multiplicacion") || operador.equals("*")){
					System.out.println("La multiplicacion es " + (num1*num2));
				}
			
			}
			else
			{
				System.out.println("Ingrese una operacion valida");}
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

public static void ej6(){
	String numero1s;
	String numero2s;
	int resultado;
	Scanner s = new Scanner(System.in);
	System.out.println("Ingrese numero Uno");
	numero1s = s.nextLine();
	System.out.println("Ingrese numero Dos");
	numero2s = s.nextLine();
	resultado = Integer.parseInt(numero1s) + Integer.parseInt(numero2s);
	System.out.println("La suma es: " + resultado);
		
}

public static void ej7(){
	String numero1S; // "S" de string
	String numero2S;
	int num1;
	int num2;
	int operacion;
	Scanner s = new Scanner(System.in);
	System.out.println("Ingrese numero uno");
	numero1S = s.nextLine();
	num1 = Integer.parseInt(numero1S);
	System.out.println("Ingrese numero dos");
	numero2S = s.nextLine();
	num2 = Integer.parseInt(numero2S);
	System.out.println("Seleccione operacion:");
	System.out.println("1. Suma");
	System.out.println("2. Resta");
	System.out.println("3. Multiplicar");
	System.out.println("4. Dividir");
	operacion = s.nextInt();
	if (operacion == 1){
		System.out.println("La suma es " + (num1+num2) );
	}
	if (operacion == 2){
		System.out.println("La resta es " + (num1-num2));
	}
	if (operacion == 3){
		System.out.println("La multiplicacion es " + (num1*num2));
	}
	if (operacion == 4){
		System.out.println("La division es " + (num1/num2));
	}

}
public static void ej8(){
	String dividendoS; // "S" de string
	String divisorS;
	int resultado;
	Scanner s = new Scanner(System.in);
	System.out.println("Ingrese dividendo");
	dividendoS = s.nextLine();
	System.out.println("Ingrese divisor");
	divisorS = s.nextLine();
	resultado = Integer.parseInt(dividendoS) % Integer.parseInt(divisorS);
	System.out.println("El resto es: " + resultado);
			
}
public static void ej9(){
	String importeS;
	int resultado;
	int aumento;
	int importe;
	Scanner s = new Scanner(System.in);
	System.out.println("Ingrese sueldo");
	importeS = s.nextLine();
	importe = Integer.parseInt(importeS);
	aumento = (importe *10)/100;
	System.out.println("El resultado con el aumento es: " + (importe+aumento));
	
	
}

public static void ej10(){
	String importeS;
	int importe;
	int resultado;
	int descuento;
	Scanner s = new Scanner(System.in);
	System.out.println("Ingrese importe");
	importeS = s.nextLine();
	importe = Integer.parseInt(importeS);
	descuento = ((importe *25)/100);
	System.out.println("El resultado con el descuento es: " + (importe-descuento));
	
}	
}

	
