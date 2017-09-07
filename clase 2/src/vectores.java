import java.util.Scanner;

public class vectores {
public static void Vectores1(){
	int[] vector2 = new int[4];
	int[] vector1 = new int [4];
	vector1[0] = 1;
	vector1[1] = 2;
	vector1[2] = 3;
	vector1[3] = 4 ;
	
	vector2 = vector1;
	vector2[1]= 666;
	// esto sucede porque al igualar vector2 con vector1 se indica que ambos apunten 
	// a la misma referencia de memoria (quedan siendo iguales los dos, tecnicamente son 1 solo)
	System.out.println(vector1[1]);
	
	System.out.println(vector2 [1]);
}
public static void Vectores2(){
	int[] vector = new int[100];
	for (int i = 0 ; i<100; i++){
		vector[i] = i+1;
	}
	for (int i = 99; i>=0 ; i--){
		System.out.println(vector[i]);
	}
}

public static void Vectores3(){
	int cantidad = 2;
	String[] nombre = new String[cantidad];
	String nombreBuscar = null;
	int edadBuscar = 0;
	String opcion;
	String opcionEdad;
	int edadIngresada;
	int[] edad = new int [cantidad];
	int encontrado = 0;
	Scanner s = new Scanner (System.in);
	int mayoresEdad = 0;
	char opcionC;
	
	for (int i = 0; i<cantidad; i++){
		System.out.println("ingrese su nombre ");
		nombre[i] = s.nextLine();
		System.out.println( "ingrese su edad ");
		edad[i] = Integer.parseInt(s.nextLine());
		
		}
	
	do {
		System.out.println("Seleccione su busqueda");
		System.out.println("(N nombre E edad S salir)");
		opcion =  s.nextLine(); 	//N nombre E edad S salir	
		opcion = opcion.toLowerCase();
		
	}
	while (!opcion.equals("s") && !opcion.equals("n") && !opcion.equals("e"));
	
	switch (opcion){
	case "n":
		System.out.println("ingrese nombre de persona a buscar ");
		nombreBuscar = s.nextLine();
		break;
	case "e":
		System.out.println("Elija opcion a buscar");
		System.out.println("Mayor- Edad mayor a");
		System.out.println("Menor - Edad menor a");
		System.out.println("Igual - Edad igual a");
		opcionEdad = s.nextLine();
		opcionEdad = opcionEdad.toLowerCase();
		System.out.println("ingrese edad  a buscar ");
		edadBuscar = Integer.parseInt(s.nextLine());
		break;
		default: System.out.println("Ingrese una opcion valida");
		break;
	}

	if (opcion.equals("n"))
	for (int i = 0; i<cantidad; i++){
		if (nombreBuscar.equals(nombre[i])) {
			System.out.println(nombre[i]+" , " +edad[i]);
			encontrado++;
		}

	}
	
	if (opcion.equals("e"))
		for (int i = 0; i<cantidad; i++){
			if (edadBuscar == (edad[i])) {
				System.out.println(nombre[i]+" , " +edad[i]);
				encontrado++;
			}
					}
	
	else if (encontrado == 0){
		if (opcion.equals("n")){
			System.out.println("no existe persona con ese nombre");
		}
		if (opcion.equals("e")){
			System.out.println("no existe persona con esa edad");
		}
		
	}
		
	
	
	/* for (int i = 0; i<cantidad; i++){
		if (edad[i] >= 18){
			System.out.println(nombre[i]+ ", " + edad[i]);	
			mayoresEdad++;
		}
			
	}
	switch (mayoresEdad){
	case 0:
		System.out.println("ninguna persona es mayor de edad ");
		break;
	default:
	*/
	
}
}


