import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("BANCO PEQUENA CIDADE");
        System.out.println("--------------------");
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        float saldo = 0;
        float deposito = 0;
        float saque = 0;

        Banco banco = new Banco(nome, saldo, deposito, saque);
        int operacao = 0;

        do {
            System.out.println("Digite a operação: ");
            System.out.println("\n1- Ver saldo\n2- Depositar\n3- Sacar\n4- Sair");
            operacao = leitor.nextInt();

            switch (operacao) {
                case 1:
                    banco.verSaldo();
                    break;
                case 2:
                    System.out.println("Digite o valor do depósito: ");
                    banco.deposito = leitor.nextFloat();
                    banco.depositar();
                    break;
                case 3:
                    System.out.println("Digite o valor do saque: ");
                    banco.saque = leitor.nextFloat();
                    banco.sacar();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Operação inválida! Tente novamente.");
            }
        }while (operacao != 4); {
            System.out.println("Sistema encerrado.");
        }
        leitor.close();
    }
}
