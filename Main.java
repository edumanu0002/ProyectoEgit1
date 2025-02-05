import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int numero1, numero2, resultado;
		System.out.print("Introduce primer número: ");
		numero1 = sc.nextInt();
		System.out.print("Introduce segundo número: ");
		numero2 = sc.nextInt();
		
		 // Llamamos a los métodos de las clases
        resultado = Principal1_1.suma(numero1, numero2);
        System.out.println("Suma: " + resultado);

        resultado = Principal1_2.resta(numero1, numero2);
        System.out.println("Resta: " + resultado);

        resultado = Principal2_1.producto(numero1, numero2);
        System.out.println("Producto: " + resultado);

        // División por cero
        if (numero2 != 0) {
            resultado = Principal2_2.dividir(numero1, numero2);
            System.out.println("División: " + resultado);
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        // Cerrar Scanner
        sc.close();
		
	}
}
