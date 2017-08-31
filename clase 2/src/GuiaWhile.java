import java.util.Scanner;

public class GuiaWhile {
public static void ej1(){
	int cont = 0;
	while (cont < 10) {
		cont++;
		System.out.println(cont);
	}
	
}

public static void ej2(){
	int cont = 10;
	while (cont > 0){
		System.out.println(cont);
		cont--;
	}
}

public static void ej3(){
	String clave;
	String imput;
	Scanner s = new Scanner(System.in);
	clave = "utn750";
do {
	System.out.println("Ingrese su clave");
	imput = s.nextLine();
	}
	
while (!imput.equals(clave));
System.out.println("bienvenido");
}

public static void ej4(){
	int numero;
	String imput;
	Scanner s = new Scanner(System.in);
	System.out.println("ingrese un numero del 0 al 9");
	imput = s.nextLine();
	numero = Integer.parseInt(imput);
	while (numero > 0 || numero > 9){
		System.out.println("ingrese un numero del 0 al 9");
		imput = s.nextLine();
		numero = Integer.parseInt(imput);
	}
		System.out.println("Su numero es " + numero);
}

public static void ej5(){
	String sexo;
	Scanner s = new Scanner(System.in);
	
	do {
		System.out.println("Ingrese su sexo");
		sexo = s.nextLine();
	}
	while (!sexo.equals("m") && !sexo.equals("f"));
	switch (sexo){
	case "m":
		System.out.println("su sexo es masculino");
		break;
	case "f":
		System.out.println("su sexo es femenino");
		break;
	}
	}

public static void ej7(){
	int numero;
	int sumaAcumulada;
	int promedio;
	double n;
	String detener;
	Scanner s = new Scanner(System.in);
	sumaAcumulada = 0;
	n = 2;
	System.out.println("ingrese su numero");
	numero = Integer.parseInt(s.nextLine());
	sumaAcumulada = sumaAcumulada + numero;
	do {
	System.out.println("ingrese su numero");
	numero = Integer.parseInt(s.nextLine());
	sumaAcumulada = sumaAcumulada + numero;
	System.out.println("la suma acumulada es " + sumaAcumulada);
	System.out.println("El promedio es " + (double)( sumaAcumulada / n));
	System.out.println("detener? (Si/no)");
	detener = s.nextLine();
	n++;
	
	}
	while (!detener.equals("si"));
	
	
	
}

}
