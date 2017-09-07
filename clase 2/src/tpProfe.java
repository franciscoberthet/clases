import java.util.Scanner;

public class tpProfe {
public static void tp1(){
	int contador;
	String nombre;
	int id;
	int stock;
	double precio;
	double Total = 0;
	double max = 0;
	double min = 0;
		
	Scanner s = new Scanner (System.in);
	
		for (int  i = 0; i<10; i++){
			id = i;
			nombre = "Producto nº "+i;
			stock = i+5;
			System.out.println("Ingrese precio de " + nombre);
			precio = Double.parseDouble(s.nextLine());
			precio = precio + (precio * 1.3);
			Total += precio*stock;
			if (i == 0)
			{
				min = precio;
				max = precio;
				System.out.println("precio es " + min +" " + max);
			}
			else  {
				if (precio> max)
				{				
				max = precio;
			}
				if (precio < min)
				{
					min = precio;
				}
			}
			}
		
			
		System.out.println("el maximo es " + max);
		System.out.println("El minimo es " + min);
		}
	
		
		//System.out.println("El total es: " + precioTotal);
	
}
