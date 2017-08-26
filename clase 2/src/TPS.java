import java.util.Scanner;

public class TPS {
	public static void tp1(){
		double precio1;
		double precio1Iva;
		double precio2;
		double precio2Iva;
		double precio3;
		double precio3Iva;
		int operacion;
		double suma;
		double promedio;
		double precioFinal;
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
		precio1Iva = ((precio1+(precio1*0.21)));
		precio2Iva = ((precio2+(precio2*0.21)));
		precio3Iva = ((precio3+(precio3*0.21)));
		precioFinal = precio1Iva+precio2Iva+precio3Iva;
		System.out.println("El precio final es: " + precioFinal);
		}
		
	}
	
public static void tp2(){
		int ancho;
		int largo;
		double radio;
		int hilosAlambre;
		int formaTerreno;
		double perimetroCirculo;
		int m2; // metros cuadrados del terreno
		int bolsasCemento = 2;
		int bolsasCal = 3;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese el Largo del terreno ");
		largo = Integer.parseInt(s.nextLine());
		System.out.println("Ingrese el ancho del terreno ");
		ancho = Integer.parseInt(s.nextLine());
		System.out.println("Ingrese el radio del terreno");
		radio = Integer.parseInt(s.nextLine());
		System.out.println("Elija la opcion deseada: ");
		System.out.println("1. Cantidad para alambrar Rectangulo");
		System.out.println("2. Cantidad para alambrar Circulo");
		System.out.println("3. Materiales de contrapiso para terreno rectangular");
		formaTerreno = Integer.parseInt(s.nextLine());
		switch (formaTerreno) {
		case 1: 	
			hilosAlambre = (((largo*2)+(ancho*2))*3);
			System.out.println("La cantidad de hilo a comprar es: " + hilosAlambre);
			break;
		case 2: 
	
			perimetroCirculo = ((radio*2)* Math.PI);
			System.out.print("La cantidad de alambre a comprar es ");
			System.out.printf("%.2f",perimetroCirculo*3);
			break;
		case 3:
			m2 = ancho*largo; // metros cuadrados del terreno
			System.out.println("para hacer el contrapiso se necesitan " + bolsasCemento*m2 + " bolsas de cemento y "+ bolsasCal*m2 +" bolsas de cal");
			break;
		default:
			System.out.println("opcion no valida");

			/// terminar ajustar perimetro de circulo
		}
		

		
	}
public static void tp3(){
	double temperatura;
	int operacion;
	double conversion;
	double fraccion;
	Scanner s = new Scanner(System.in);
System.out.println("Ingrese la temperatura");
	temperatura = Integer.parseInt(s.nextLine());
	System.out.println("Seleccione la operacion a realizar");
	System.out.println("1. De grados a fahrenheit");
	System.out.println("2. De fahrenheit a grados");
	operacion = Integer.parseInt(s.nextLine());
	switch (operacion){
	case 1:
		fraccion = 9.0/5.0;
		conversion = (((fraccion * temperatura) + 32));
		System.out.println(temperatura + "º centigrados son " + conversion + "º fahrenheit ");
		break;
	case 2:
		fraccion = 5.0/9.0;
		conversion = ((temperatura - 32) * fraccion);
		System.out.println(temperatura + "º fahrenheit son " + conversion + "º celsius" );
	
		
	}

	
}

public static void tp4(){
	int lamparas;
	double precio = 35;
	int marca;
	double total;
	double descuento;
	double iibb;
	Scanner s =  new Scanner(System.in);
	System.out.println("Cantidad de lamparas");
	lamparas = Integer.parseInt(s.nextLine());
	System.out.println("Seleccione marca de las lamparas");
	System.out.println("1. ArgentinaLuz");
	System.out.println("2. FelipeLamparas");
	System.out.println("3. JeLuz");
	System.out.println("4. HazIluminacion");
	System.out.println("5. Osram");	
	marca = Integer.parseInt(s.nextLine());
	if (lamparas >= 6){
		descuento = 35 * 0.5;
		precio = 35 - descuento;
	}
	if (lamparas == 5 && marca == 1){
		descuento = 35 * 0.4;
		precio = 35 - descuento;	
	}
	else if (lamparas == 5){
		descuento = precio * 0.4;
		precio = 35 - descuento;
	}
	else if (lamparas == 4 && marca == 2){
		descuento = precio * 0.25;
		precio = 35 - descuento;	
	}
	else if (lamparas == 4){
		descuento = precio * 0.20;
		precio = 35 - descuento;
	}
	else if (lamparas == 3 && marca == 1){
		descuento = precio * 0.15;
		precio = 35 - descuento;
	}
	else if (lamparas == 3 && marca == 2){
		descuento = precio * 0.10;
		precio = 35 - descuento;
	}
	else if (lamparas == 3 && (marca > 2 && marca <5)) {
		descuento = precio * 0.5;
		precio = 35 - descuento;
	}
	total = precio * lamparas;
	if (total > 120) {
		iibb = total * 0.1 ;
		total = total + iibb;
		System.out.println("El total es " + total);
		System.out.println("Usted pago " + iibb + " de ingresos brutos");
	}
	else{
		System.out.println("El total es " + total);
	}
	
}
}
