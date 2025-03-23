import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Calculadora numeros = new Calculadora();
        int operacao = 0;

            do{
                System.out.println("CALCULADORA EM JAVA");
                System.out.println("-------------------");
                System.out.println("Operações:\n\n1-Adição\n2-Subtração\n3-Multiplicação\n" +
                        "4-Divisão\n5-Sair\n\nDigite:");
                operacao = leitor.nextInt();

                switch (operacao) {
                    case 1:
                        System.out.println("Digite o número 1:");
                        numeros.numero1 = leitor.nextFloat();
                        System.out.println("Digite o número 2:");
                        numeros.numero2 = leitor.nextFloat();
                        numeros.calcularSoma();
                        break;
                    case 2:
                        System.out.println("Digite o número 1:");
                        numeros.numero1 = leitor.nextFloat();
                        System.out.println("Digite o número 2:");
                        numeros.numero2 = leitor.nextFloat();
                        numeros.calcularSubtracao();
                        break;
                    case 3:
                        System.out.println("Digite o número 1:");
                        numeros.numero1 = leitor.nextFloat();
                        System.out.println("Digite o número 2:");
                        numeros.numero2 = leitor.nextFloat();
                        numeros.calcularMulti();
                        break;
                    case 4:
                        System.out.println("Digite o número 1:");
                        numeros.numero1 = leitor.nextFloat();
                        System.out.println("Digite o número 2:");
                        numeros.numero2 = leitor.nextFloat();
                        numeros.calcularDiv();
                        break;
                    case 5:
                        break;
                    default:
                    System.out.println("Operação inválida!");
                }
            } while (operacao != 5); {
            System.out.println("Sistema encerrado!");
            }

        leitor.close();
        }
}
