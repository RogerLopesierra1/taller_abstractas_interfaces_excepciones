package banco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Corriente extends Cuenta{	
	
	public Corriente() {
		super();		
	}

	public Corriente(String numeroCuenta, double saldo, String propietario) {
		super(numeroCuenta, saldo, propietario);		
	}

	@Override
	public void depositar() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("su saldo es "+getSaldo()+" pesos");
		try {
			System.out.println("Digite la cantidad de dinero que desea depositar ");
			double dinero = teclado.nextDouble();			
			
			if (dinero < 0) {
				teclado.close();
				throw new ArithmeticException("el dinero No debe ser negativo");
			}else {
				setSaldo(getSaldo()+dinero);
			}
			
			teclado.close();
			
		} catch (InputMismatchException e) {
			System.out.println("el dinero debe ser un numero positivo");			
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}	
	}

	@Override
	public void retirar() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("su saldo es "+getSaldo()+" pesos");
		
		int retiros = 1;
		int sacar = 1;
		
		try {
			System.out.println("Digite la cantidad de dinero que desea sacar ");
			double dinero = teclado.nextDouble();
			
			if (dinero < 0) {
				teclado.close();
				throw new ArithmeticException("el dinero No debe ser negativo");
			}
			
			while (sacar == 1 && retiros < 6) {
				if (dinero <= getSaldo()) {
					if (retiros <= 5) {
						setSaldo(getSaldo()-dinero);
					}
					
					System.out.println("sacar mas dinero marque 1, salir marque 0 ");
					sacar = teclado.nextInt();
					
					if (sacar==1 && getSaldo() != 0 && retiros != 5) {
						System.out.println("su saldo es "+getSaldo()+" pesos");
						System.out.println("Digite la cantidad de dinero que desea sacar ");
						dinero = teclado.nextDouble();
						if (dinero < 0) {
							teclado.close();
							throw new ArithmeticException("el dinero No debe ser negativo");
						}else {
							retiros++;
						}						
					} else if(getSaldo() != 0) {
						System.out.println("su saldo es "+getSaldo()+" pesos");
						System.out.println("ya realizo 5 retiros el sistema lo sacara");
						System.out.println("gracias por usar nuestros servicios");
						sacar = 0;
					} else {
						System.out.println("gracias por usar nuestros servicios");
					}
				}
			}
			
			teclado.close();
		} catch (InputMismatchException e) {
			System.out.println("el dinero debe ser un numero positivo");
			System.out.println("la opcion solo puede ser 1 o 0");
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
	}

	

	
}
