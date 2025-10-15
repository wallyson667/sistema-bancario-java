package MeuBanco;

import java.util.Scanner;

public class Testando {
    public static void main(String[] args){
        Scanner w = new Scanner(System.in);

        System.out.print("\nQual é o valor da sua conta Corrente? ");
        int corrente = w.nextInt();
        System.out.print("Qual é o valor da sua conta Poupança? ");
        int poupanca = w.nextInt();

        ContaPoupanca contaP = new ContaPoupanca(poupanca);
        contaP.visualizar();
        ContaCorrente contaC = new ContaCorrente(corrente);
        contaC.visualizar();

    }
}
