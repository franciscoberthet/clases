import java.util.Scanner;

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

}
