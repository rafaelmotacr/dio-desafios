package app;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
		
	int parametroUm = leiaInt("> Digite o primeiro numero: ", sc);
	int parametroDois = leiaInt("> Digite o segundo numero: ", sc);
	
	try {
		contar(parametroUm, parametroDois);
	}catch(ParametrosInvalidosException e) {
		System.out.println("poi");
		e.printStackTrace();
	}
	
	
	sc.close();
		
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
		if(parametroDois < parametroUm) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		
		for(int index = 0; index < contagem; index++) {
			System.out.println("Imprimindo o número " + (index + 1));		
		}
		
	}
	
	

	public static int leiaInt(String mensagem, Scanner sc) {
		
		int numero = 0;
		boolean valido = false;
		
		while(!valido) {
			
			System.out.print(mensagem);
			
			try {
				numero = sc.nextInt();
				valido = true;
			}catch(InputMismatchException e){
				System.out.println("[ENTRADA INVALIDA! TENTE NOVAMENTE!]");
				sc.next();
			}
			
		}
		
		return numero;
		
	}
	
}
