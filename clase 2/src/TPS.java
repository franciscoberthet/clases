import java.util.Scanner;

public class TPS {
	public static void tp1(){
		int precio1;
		int precio1Iva;
		int precio2;
		int precio2Iva;
		int precio3;
		int precio3Iva;
		int operacion;
		int suma;
		int promedio;
		int precioFinal;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese primer precio");
		precio1 = Integer.parseInt(s.nextLine());
		System.out.println("Ingrese segundo precio");
		precio2 = Integer.parseInt(s.nextLine());
		System.out.println("Ingrese tercer precio");
		precio3 = Integer.parseInt(s.nextLine());
		System.out.println("Seleccione su operacion ");
		System.out.println("1. Sumar");
		System.out.println("2. Promedio");
		System.out.println("3. Precio Final");
		operacion = Integer.parseInt(s.nextLine());
		if (operacion == 1){
			suma = precio1+precio2+precio3;
			System.out.println("La suma de sus productos es: " + suma);
		}
		if (operacion == 2)
		{
		promedio = (precio1+precio2+precio3)/3;
		System.out.println("El promedio de sus precios es: " + promedio);
		}
		if (operacion ==3)
		{
		precio1Iva = ((precio1+(precio1*21/100)));
		precio2Iva = ((precio2+(precio2*21/100)));
		precio3Iva = ((precio3+(precio3*21/100)));
		precioFinal = precio1Iva+precio2Iva+precio3Iva;
		System.out.println("El precio final es: " + precioFinal);
		}
		
	}
	
	public static void tp2(){
		int ancho;
		int largo;
		int radio;
		int hilosAlambre;
		int formaTerreno;
		Scanner s = new Scanner(System.in);
		System.out.println("Elija la opcion deseada: ");
		System.out.println("1. Cantidad para alambrar Rectangulo");
		System.out.println("2. Cantidad para alambrar Circulo");
		System.out.println("3. Materiales de contrapiso para terreno rectangular");
		formaTerreno = Integer.parseInt(s.nextLine());
		switch (formaTerreno) {
		case 1: 	
			System.out.println("Ingrese el Largo del terreno ");
			largo = Integer.parseInt(s.nextLine());
			System.out.println("Ingrese el ancho del terreno ");
			ancho = Integer.parseInt(s.nextLine());
			hilosAlambre = ((largo*2)+(ancho*2)*3);
			System.out.println("La cantidad de hilo a comprar es: " + hilosAlambre);
			break;
		case 2: 
			System.out.println("Ingrese el radio del terreno");
			radio = Integer.parseInt(s.nextLine());
			hilosAlambre = ((radio*2)*3);
			System.out.println("La cantidad de alambre a comprar es " + ((radio*2)*3) );
			break;
		default:
			System.out.println("opcion no valida");
			/// terminar ajustar perimetro de circulo
		}
		

		
	}
}
