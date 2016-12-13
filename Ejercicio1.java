import java.util.Scanner;
/** Documentación para el primer ejercicio del examen
 * @author Oscar Caparros
 * @version 1.0
 */
public class Ejercicio1 {
	
	public static void main (String args[]) {
		System.out.println("Inserte un número, el incremento y el número de columnas(separados por intros)");
		//Inicializamos el escáner
		Scanner sc = new Scanner(System.in);
		int primerValor = sc.nextInt();
		int incremento = sc.nextInt();
		int columnas = sc.nextInt();
		sc.close();
		System.out.printf("Se muestra una tabla con el primer valor %d, incrementandose %d veces, en %d columnas. %n", primerValor, incremento, columnas);
		
		//Hacemos la llamada al método y le pasamos los valores
		mostrarValores(primerValor, incremento, columnas);
	}
	
	public static void mostrarValores(int primerValor, int incremento, int columnas){
		int contador;
		for(contador = 1;contador <= 10; contador++){
			System.out.printf("%d\t",primerValor);
			primerValor += incremento;
			if(contador%columnas==0)
				System.out.println();
		}
		System.out.println();
	}
}

