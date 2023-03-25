package respuesta_A;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BoletasCine {
	
	public static void main(String[] args){
		System.out.println(calcularPago());
	}
	
	public static String calcularPago() {
		Scanner teclado = new Scanner(System.in);
		int boletas = 0;
		int precio_boleta = 1000;
		String valor = "";
		try {
			System.out.println("la cantidad de boletas debe ser mayor 0 igual que cero");
			System.out.println("y tambien menor o igual que 30");
			System.out.println("digite la cantidad de boletas a comprar ");
			boletas = teclado.nextInt();
			
			teclado.close();
			
			if (boletas < 0) {				
				throw new IllegalArgumentException("las boletas no pueden ser negativas");
			} else if(boletas > 30){
				throw new IllegalArgumentException("las boletas no pueden ser mayores que 30");
			}else{
				valor = String.valueOf(precio_boleta*boletas);
			}
			
			
			
		} catch (InputMismatchException e) {
			System.out.println("el numero debe ser entero, sin letras o simbolos");
			teclado.close();			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());			
		}
		
		return valor;
		
	}
	
}

