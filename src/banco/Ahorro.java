package banco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ahorro extends Cuenta{	

	public Ahorro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * Constructor con parámetros de la clase Ahorro
	 * que llama al constructor con parámetros de la clase Cuenta
	 * @param numeroCuenta el número de cuenta de la cuenta de ahorro
	 * @param saldo el saldo de la cuenta de ahorro
	 * @param propietario el propietario de la cuenta de ahorro
	 */
	public Ahorro(String numeroCuenta, double saldo, String propietario) {
		super(numeroCuenta, saldo, propietario);
		// TODO Auto-generated constructor stub
	}
	
	/**
	* Permite depositar dinero en la cuenta de ahorros.
	*
	* Solicita al usuario la cantidad de dinero a depositar y calcula el nuevo saldo de la cuenta de ahorros.
	* Si se realizan más de tres depósitos, se aplica una tasa de interés del 0.5% al monto depositado.
	* Permite realizar múltiples depósitos hasta que el usuario decida salir.
	* 
	* @throws InputMismatchException si se ingresa un valor no numérico como cantidad de dinero.
	* @throws ArithmeticException si se ingresa un valor negativo como cantidad de dinero.
	*/
	@Override
	public void depositar() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("su saldo es "+getSaldo()+" pesos");
		
		int depositos = 1;
		int salir = 1;
		
		try {
			System.out.println("Digite la cantidad de dinero que desea depositar ");
			double dinero = teclado.nextDouble();		
			if (dinero < 0) {
				teclado.close();
				throw new ArithmeticException("el dinero No debe ser negativo");
			}
			
			while(salir==1) {
				if (depositos < 3) {
					setSaldo(getSaldo()+dinero*100.5/100);
				} else {
					setSaldo(getSaldo()+dinero);
				}
				
				System.out.println("otro deposito marque 1, Salir marque 0");
				int opc = teclado.nextInt();
				
				if (opc==1) {
					System.out.println("su saldo es "+getSaldo()+" pesos");
					System.out.println("Digite la cantidad de dinero que desea depositar ");
					dinero = teclado.nextDouble();
					if (dinero < 0) {
						teclado.close();
						throw new ArithmeticException("el dinero No debe ser negativo");
					}else {
						depositos++;
					}
					
				} else {
					System.out.println("su saldo es "+getSaldo()+" pesos");
					System.out.println("gracias por usar nuestros servicios");
				}
			}
			
			teclado.close();
		} catch (InputMismatchException e) {
			System.out.println("el dinero debe ser un numero positivo");
			System.out.println("la opcion solo puede ser 1 o 0");
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		teclado.close();
		
	}

	/**
     * Permite retirar dinero de la cuenta.
     * Si el dinero solicitado para retirar es menor o igual al saldo disponible en la cuenta,
     * se realiza el retiro de la cantidad solicitada.
     * Si se han realizado más de tres retiros en la cuenta, se aplica una comisión del 1% sobre el monto a retirar.
     * 
     * @throws ArithmeticException si el monto a retirar es negativo.
     * @throws InputMismatchException si el usuario ingresa un valor no numérico o negativo.
     */
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
			while (sacar == 1) {
				if (dinero <= getSaldo()) {
					if (retiros > 3) {
						setSaldo(getSaldo()-dinero*101/100);
					} else {
						setSaldo(getSaldo()-dinero);
					}
					
					System.out.println("sacar mas dinero marque 1, salir marque 0 ");
					sacar = teclado.nextInt();
					
					if (sacar==1 && getSaldo() != 0) {
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
