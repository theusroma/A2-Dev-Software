import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Gerenciamento gerenciamento = new Gerenciamento();

        int op = 0; // para o switch case e o while

        while (op != 3) {
            System.out.println("Digite a opção desejada\n[1] Inserir um livro   [2] Ver livros disponíveis   [3] Sair");
            op = leitor.nextInt();
            leitor.nextLine();

            switch (op) {
                case 1:
                        System.out.println("Digite o título do livro: ");
                        String titulo = leitor.nextLine();

                        System.out.println("Digite o autor do livro: ");
                        String autor = leitor.nextLine();

                        System.out.println("Digite o ano de lançamento do livro: ");
                        int ano = leitor.nextInt();
                        leitor.nextLine();

                        gerenciamento.adicionarLivro(titulo, autor, ano);

                        System.out.println("Livro cadastrado com sucesso!\n");
                    break;

                case 2:
                    gerenciamento.livrosCadastrados();
                    break;

                case 3:
                    System.out.println("Finalizando o programa!");
                    break;

                default:
                    System.out.println("Opção inválida. Digite novamente.");
            }
        }

        leitor.close();
    }
}
