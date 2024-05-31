package app;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{

    public static void main(String args[]){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String agencia;
        String nomeCliente;
        int numero;
        double saldo;
        
        System.out.print("> Digite o nome do proprietario da conta: ");
        nomeCliente = sc.next();

        System.out.print("> Digite a agencia da conta: ");
        agencia = sc.next();

        System.out.print("> Digite o numero da conta: ");
        numero = sc.nextInt();

        System.out.print("> Digite o saldo atual da conta: ");
        saldo = sc.nextDouble();

        System.out.println("> Olá " 
        				+ nomeCliente 
        				+ ", obrigado por criar uma conta em nosso banco!\n> Sua agência é " 
        				+ agencia 
        				+ ", conta " 
        				+ numero + " e seu saldo R$" 
        				+ saldo 
        				+ " já está disponível para saque.");
        
        sc.close();
        
    }

}
