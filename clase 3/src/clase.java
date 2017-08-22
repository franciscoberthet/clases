import java.util.Scanner;

public class clase {

	public static void main(String[] args) {
	/*	int numero1;
		String nombre;
		boolean booleano;
		float flotante;
		System.out.println(numero1);
		System.out.println(nombre);
		System.out.println(booleano);
		System.out.println(flotante); <- no devuelven valores porque no estan asignados*/
		// TODO Auto-generated method stub
			
		// int suma = (Integer.parseInt(numero1s+numero2s)); -> concatena strings y luego devuelve numeros que contiene
				/*	Scanner scan= new Scanner(System.in);
					System.out.println("Ingrese el primer numero");
					String numero1s = scan.nextLine();
						// int numero1 = (Integer.parseInt(numero1s));
					System.out.println("Ingrese el segundo numero");
					String numero2s = scan.nextLine();
					int numero2 = (Integer.parseInt(numero2s));
					if (numero2 == 0)
				{
					System.out.println("No se puede dividir por 0");
				}
					else
				{
					int resultado = (Integer.parseInt(numero1s)) / numero2;
								// System.out.println("La suma de sus numeros es: " + (numero1+numero2));
								//System.out.println("La suma de sus numeros es: " + (numero1s+numero2s) <- sumar directamente en el Syso;
					System.out.println("el resultado es: " + (resultado));
				}
				}	
	*/
	
	int resultado;
	int num1;
	int num2;
	Scanner s= new Scanner(System.in);
	System.out.println("ingrese el primer numero");
	num1 = Integer.parseInt(s.nextLine());
	System.out.println("ingrese el segundo numero");
	num2 = Integer.parseInt(s.nextLine());
	if (num2 == 0)
	{
		System.out.println("No se puede dividir por 0");
	}
	else
	{
		resultado = num1 / num2 ;
		System.out.println("El resultado es " + resultado);
	}
}
	}
	
		
	/*	int a;
		int b;
		a = 4;
		b = 10;
		if (a < b)
		{
		System.out.println("a es menor que b");
				}
		else 
		{
		System.out.println("a es mayor o igual b");	
		}
*/

