import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Livros[] livros; //declarando
        int op = 0; // para o switch case e o while
        int contador = 0; //para contar quantos livros vao ser inseridos

        System.out.println("Digite quantos livros serão cadastrados: "); //pergunta quantos livros vao ser cadastrados
        int quant = leitor.nextInt();
        leitor.nextLine();

        livros = new Livros[quant]; // cria vetor com o tamanho que foi digitado pelo usuario

        while (op != 3) {
            System.out.println("Digite a opção desejada\n[1] Inserir um livro   [2] Ver livros disponíveis   [3] Sair");
            op = leitor.nextInt();
            leitor.nextLine();

            switch (op) {
                case 1:
                    if (contador < livros.length) { // verifica se o vetor tem espaço disponivel
                        System.out.println("Digite o título do livro: ");
                        String titulo = leitor.nextLine();

                        System.out.println("Digite o autor do livro: ");
                        String autor = leitor.nextLine();

                        System.out.println("Digite o ano de lançamento do livro: ");
                        int ano = leitor.nextInt();
                        leitor.nextLine();

                        livros[contador] = new Livros(titulo, autor, ano); //criia novo objeto para armazenar os dados
                        contador++; //avança pra proxima posicao

                        System.out.println("Livro cadastrado com sucesso!\n");
                    } else {
                        System.out.println("Limite de livros atingido!");
                    }
                    break;

                case 2:
                    if (contador > 0) { // condicao para exibir apenas se houver livros cadastrados
                        System.out.println("\n Lista de livros cadastrados:");
                        for (int i = 0; i < contador; i++) {
                            livros[i].exibirInfo();
                        }
                    } else {
                        System.out.println("Não há livros cadastrados.");
                    }
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
