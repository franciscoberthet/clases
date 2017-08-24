import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuiaIF {
public static void ej1()
{
//Ejercitacion IF 1 repo MarioAR cursoingresoJS (Forkeado)
int edad;
Scanner s = new Scanner(System.in);
System.out.println("Ejercicio 1");	
System.out.println("Ingrese su edad");
edad = Integer.parseInt(s.nextLine());
if (edad == 15)
{ 
	System.out.println("Niña bonita");
}
}

public static void ej2()
{
	int edad;
	Scanner s = new Scanner(System.in);
	System.out.println("Ejercicio 2");	
	System.out.println("Ingrese su edad");
	edad = Integer.parseInt(s.nextLine());
	if (edad >= 18)
	{ 
		System.out.println("Usted es mayor de edad");
	}
}

public static void ej3()
{
	int edad;
	Scanner s = new Scanner(System.in);
	System.out.println("Ejercicio 3");	
	System.out.println("Ingrese su edad");
	edad = Integer.parseInt(s.nextLine());
	if (edad >= 18)
	{ 
		System.out.println("Usted es mayor de edad");
	}
	else
	{
		System.out.println("Usted es menor de edad");
	}
}

public static void ej4(){
	int edad;
	Scanner s = new Scanner(System.in);
	System.out.println("Ejercicio 4");	
	System.out.println("Ingrese su edad");
	edad = Integer.parseInt(s.nextLine());
	if (edad >= 13 && edad <=17) // IF con operador && ("Y")
	{
		System.out.println("Usted es adolescente");
	}

// Otra forma con if anidados
/* int edad
	Scanner s = new Scanner.(system.in);
	system.out.printLin("ingrese su edad"";
	edad = integer.parseInt(s.nextLine());
	if (edad >= 13)^
	{
		if (edad <= 17)
		system.out.printLn("Usted es adolescente")
		*/
		
}
public static void ej5(){
	int edad;
	Scanner s = new Scanner(System.in);
	System.out.println("Ejercicio 5");	
	System.out.println("Ingrese su edad");
	edad = Integer.parseInt(s.nextLine());
	if (edad <= 13 || edad >=17) // IF con operador || ("O")
	{
		System.out.println("Usted no es adolescente");
	}
	
}
public static void ej6(){
	int edad;
	Scanner s = new Scanner(System.in);
	System.out.println("Ejercicio 6");
	System.out.println("Ingrese su edad");
	edad = Integer.parseInt(s.nextLine());
	if (edad < 13){
		System.out.println("Usted es un niño");
	}
	else
		if (edad > 18) {
			System.out.println("Usted es mayor de edad");
		}
		else
			System.out.println("Usted es adolescente");
			
}

public static void ej7(){
	int edad;
	int estadoCivil;
	Scanner s = new Scanner(System.in);
	System.out.println("Ejercicio 7");
	System.out.println("Ingrese su edad");
	edad = Integer.parseInt(s.nextLine());
	System.out.println("Indique su estado civil (Nº de opcion)");
	System.out.println("1. Soltero");
	System.out.println("2. Casado");
	System.out.println("3. Separado");
	estadoCivil = Integer.parseInt(s.nextLine());
	if (estadoCivil == 1) 
		System.out.println("Usted es soltero");
	else
		if (edad < 18  && (estadoCivil == 2 || estadoCivil == 3))
		{
			System.out.println("Usted es muy pequeño para no ser soltero");		

}
}

public static void ej8(){
	int edad;
	int estadoCivil;
	Scanner s = new Scanner(System.in);
	System.out.println("Ejercicio 8");
	System.out.println("Ingrese su edad");
	edad = Integer.parseInt(s.nextLine());
	System.out.println("Indique su estado civil (Nº de opcion)");
	System.out.println("1. Soltero");
	System.out.println("2. Casado");
	System.out.println("3. Separado");
	estadoCivil = Integer.parseInt(s.nextLine());
	if (edad >= 18  && estadoCivil == 1)
		{
			System.out.println("Usted es soltero y no es menor");		

}
	
}

public static void ej9(){
	int numeroRandom = ThreadLocalRandom.current().nextInt(0,10 +1);
	System.out.println("Ejercicio 9");
	System.out.println(numeroRandom);
}

public static void ej10(){
	int numeroRandom = ThreadLocalRandom.current().nextInt(1,10 + 1);
	System.out.println("Ejercicio 10");
	if (numeroRandom <= 4){
		System.out.println(numeroRandom + " Vamos, la proxima se puede");
	}
	else
	if (numeroRandom >= 4 && numeroRandom < 9){
		System.out.println(numeroRandom + " APROBO");
	}
	else {
		System.out.println(numeroRandom + " EXCELENTE");
	}
}
}



