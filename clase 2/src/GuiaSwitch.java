import java.util.Scanner;

import javax.lang.model.element.Element;

import org.omg.Messaging.SyncScopeHelper;

public class GuiaSwitch {

public static void tp1(){
	String mes;
	Scanner s = new Scanner(System.in);
	System.out.println("Ingrese un mes del año");
	mes = s.nextLine();
	mes = mes.toLowerCase();
	switch (mes){
	case "enero":
		System.out.println("Que comiences bien el año!!!");
		break;
	case "febrero":
		break;
	case "marzo":
		System.out.println("a clases!!!");
		break;
	case "abril":
	case "mayo":
	case "junio":
	case "julio":
		System.out.println("Se vienen las vacaciones!!!");
		break;
	case "agosto":
	case "septiembre":
	case "octubre":
	case "noviembre":
		break;
	case "diciembre":
		System.out.println("Felices fiestas!!!");
		break;
		default:
			System.out.println("Ingrese un mes valido");
		
	}	
	
}

public static void tp2(){
	String mes;
	Scanner s = new Scanner(System.in);
	System.out.println("Indique el mes del año");
	mes = s.nextLine();
	mes.toLowerCase();
	switch (mes){
	case "enero":
	case "febrero":
	case "marzo":
	case "abril":
	case "mayo":
	case "junio":
	System.out.println("Falta para el invierno.");
	break;
	case "julio":
	case "agosto":
	System.out.println("Abrigate que hace frio.");
	break;
	case "septiembre":
	case "octubre":
	case "noviembre":
	case "diciembre":
	System.out.println("Ya pasamos el frio, ahora calor!!!");
	break;
	default : System.out.println("Ingrese un mes valido");		
	}
	
			
}

public static void tp4(){
	String mes;
	Scanner s = new Scanner(System.in);
	System.out.println("Ingrese un mes");
	mes = s.nextLine();
	mes = mes.toLowerCase();
	mes = mes.substring(0, 1).toUpperCase() + mes.substring(1); // Primer letra mayuscula
	switch (mes){
	case "Febrero":
		System.out.println(mes + " tiene 28 dias");//, 28 días o 29 en año bisiesto 
	break;
	case "Abril"://  30 días
	case "Septiembre"://  30 días
	case "Noviembre": //  30 días
	case "Junio"://  30 días
	System.out.println(mes + " tiene 30 dias");
	break;
	case "Enero": // 31 dias
	case "Marzo": // 31 días
	case "Mayo":// 31 días
	case "Julio": // 31 días
	case "Agosto": // 31 días
	case "Octubre": // 31 días
	case "Diciembre": // 31 días
		System.out.println(mes + " tiene 31 dias");
		break;
		default:
			System.out.println("ingrese un mes valido");
	
	}
}
public static void tp6(){
	String horaCompleta; // hh:mm
	String horaS; // hh . String
	String minutosS; // mm - String
	int hora;
	int minutos; 
	int separacion; // ":"
	int switchMinutos;
	Scanner s = new Scanner(System.in);
	System.out.println("Ingrese la hora del dia");
	horaCompleta = s.nextLine();
	horaCompleta = horaCompleta.trim(); //devuelve el valor sin los espacios adelante
	separacion = horaCompleta.indexOf(":");  // DEVUELVE VALOR DEL STRING DONDE SE ENCUENTRA CARACTER INDICADO
	horaS = horaCompleta.substring(0,separacion); // separa la hora hasta el ":"
	hora = Integer.parseInt(horaS);
	minutosS = horaCompleta.substring(separacion+1); // Separa los minutos del string original (Luego del ":")
	minutos = Integer.parseInt(minutosS);
	switchMinutos = (int) Math.floor(minutos/60.0); 
	// (int) castea el resultado como integral - Math.floor redondea para abajo el resultado
	// si los minutos son < 60 division = 0 ; sino division > 1
	switch (switchMinutos){
	case 0: // "minutos menores a 60"
		switch (hora){
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Es de noche");
			break;
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
			System.out.println("Es de mañana");
			break;
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
			System.out.println("Es de tarde");
			break;
		case 20:
		case 21:
		case 22:
		case 23:
			System.out.println("Es de noche");
			break;
			default:
				System.out.println("Esa hora no existe");
				break;
		}
	break;
	default: 
		System.out.println("Esa hora no existe");
	}

}
}
	
	
	/*if (horacompleta.startsWith("0")){
		horacompleta = horacompleta.substring(1);
		System.out.println(horacompleta);
		hora1 = Character.getNumericValue(horacompleta.charAt(0));
		minutos1 = Integer.parseInt(horacompleta.substring(2));
		System.out.println(hora1);
		System.out.println(minutos1);
		if ((hora1 > 23) || (minutos1 >= 60))
	 {
			System.out.println("hora invalida");
			
		}
	}
	
	
	else {
		hora1 = Integer.parseInt(horacompleta.substring(0, 2));
		minutos1 = Integer.parseInt(horacompleta.substring(3));
		System.out.println(hora1);		
			if ((hora1 > 23) || (minutos1 >= 60)) {
			System.out.println("hora invalida");	
			}
			}
		}
	*/



