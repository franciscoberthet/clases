import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hola mundo");
			//int NumeroUno = 10;
			//int NumeroDos = 2;
			//int Resultado = NumeroUno / NumeroDos; 
			//String Mensaje = "El resultado es: ";
			//System.out.println(Mensaje + Resultado);
				/* String Nombre;
				String Apellido;
				Scanner Scanner = new Scanner(System.in);
				System.out.println("Ingrese su nombre: ");
				Nombre = Scanner.nextLine();
				System.out.println("Ingrese su apellido: ");
				Apellido = Scanner.nextLine();
				System.out.println("Su nombre es: " + Nombre + " " + Apellido); */

		
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Ingrese su primer número: ");
		String Numero1s=  Scanner.nextLine();
		int numero1 = Integer.parseInt(Numero1s);

		System.out.println("Ingrese su segundo número: ");
		String Numero2s = Scanner.nextLine();
		int numero2 = Integer.parseInt(Numero2s);
		System.out.println("La suma de sus numeros es: " + numero1 + numero2);
		
		
		
	}

}
