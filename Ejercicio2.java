import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main (String args[]) {
		
		//Se hace la petición de la palabra mediante el Scanner y se verifica imprimiendola
		System.out.println("Inserte una palabra");
		Scanner in = new Scanner(System.in);
		String palabra = in.next();
		in.close();
		System.out.printf("La palabra introducida es: %s%n",palabra);
		
		//Hacemos la llamada a los métodos y les pasamos la información
		mostrarNumeroVocales(palabra);
		mostrarLlevaTilde(palabra);
		mostrarMayusculaYMinuscula(palabra);
		
		}
		public static void mostrarNumeroVocales(String palabra){
			int contadorVocales = 0;
			String a = "a";
			char e = 'e';
			char i = 'i';
			char o = 'o';
			char u = 'u';
						
			/** switch(palabra){
				case palabra.contains(a):
					contadorVocales++;
					break;
				case palabra.contains(e):
					contadorVocales++;
					break;
				case palabra.contains(i):
					contadorVocales++;
					break;
				case palabra.contains(o):
					contadorVocales++;
					break;
				case palabra.contains(u):
					contadorVocales++;
					break;
				default:
					System.out.println("Su palabra no contiene vocales");
					break;
			}
			System.out.println("Numero de vocales: "+contadorVocales);
			*/
			}
			
		public static void mostrarLlevaTilde(String palabra){
			if(palabra.contains("á") || palabra.contains("é") || palabra.contains("í") || palabra.contains("ó") || palabra.contains("ú"))
				System.out.println("Su palabra contiene tildes");
			else
				System.out.println("Su palabra NO contiene tildes");
		}
		
		public static void mostrarMayusculaYMinuscula(String palabra){
			String palabraMin = palabra.toLowerCase();
			String palabraMay = palabra.toUpperCase();
			System.out.printf("Su palabra en mayúscula sería: %s, y en minúscula: %s%n", palabraMay, palabraMin);
		}
}

