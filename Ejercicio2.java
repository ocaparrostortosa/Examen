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
		
		//Método que nos muestra el numero de vocales y cuales son
		public static void mostrarNumeroVocales(String palabra){
			int contadorVocales = 0;
			int longitud = palabra.length();
			for(int j = 0;j < longitud;j++){
				char letra = palabra.charAt(j);
				if( letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
					System.out.println("Su palabra contiene la vocal: "+letra);
					contadorVocales++;
				}
			}					
			System.out.println("Numero de vocales: "+contadorVocales);
		}
		
		//Metodo que nos muestra si la palabra tiene tilde
		public static void mostrarLlevaTilde(String palabra){
			if(palabra.contains("á") || palabra.contains("é") || palabra.contains("í") || palabra.contains("ó") || palabra.contains("ú"))
				System.out.println("Su palabra contiene tildes");
			else
				System.out.println("Su palabra NO contiene tildes");
		}
		
		//Metodo que nos muestra las mayusculas y minusculas
		public static void mostrarMayusculaYMinuscula(String palabra){
			String palabraConcatenada;
			String palabraMin = palabra.toLowerCase();
			String palabraMay = palabra.toUpperCase();
			System.out.printf("Su palabra en mayúscula sería: %s, y en minúscula: %s%n y la concatenación %s%n", palabraMay, palabraMin, palabraMay.concat(palabraMin));
		}
}

