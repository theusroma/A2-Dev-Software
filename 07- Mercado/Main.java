import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Produto> estoque = new ArrayList<>();

    public static void adicionarProduto(String nome, int codigo, double preco, int quantidade) {
        Produto novoProduto = new Produto(nome, codigo, preco, quantidade);
        estoque.add(novoProduto);
        System.out.println("Novo produto " + nome + " adicionado ao estoque.");
    }

    public static void atualizarProduto(int codigo, String nome, double preco, int quantidade) {
        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                produto.setNome(nome);
                produto.setPreco(preco);
                produto.setQuantidade(quantidade);
                System.out.println("Produto " + produto.getNome() + " atualizado!");
                return;
            }
        }
        System.out.println("Produto inválido! Tente outro código.");
    }

    public static void removerProduto(int codigo) {
        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                estoque.remove(produto);
                System.out.println("Produto " + produto.getNome() + " removido do estoque.");
                return;
            }
        }
        System.out.println("Produto com o código " + codigo + " não encontrado.");
    }

    public static void gerarRelatorio() {
        System.out.println("\nRelatório de Estoque:");
        double valorTotalEstoque = 0;
        for (Produto produto : estoque) {
            produto.exibirInformacoes();
            valorTotalEstoque += produto.getPreco() * produto.getQuantidade();
        }
        System.out.println("Valor total em estoque: R$" + valorTotalEstoque);
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int operacao;

        // Menu principal
        do {
            System.out.println("\nGerenciamento de Estoque");
            System.out.println("1- Adicionar produto");
            System.out.println("2- Atualizar produto");
            System.out.println("3- Remover produto");
            System.out.println("4- Gerar relatório");
            System.out.println("5- Sair");
            System.out.print("Escolha uma opção: ");
            operacao = leitor.nextInt();
            leitor.nextLine();

            switch (operacao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = leitor.nextLine();
                    System.out.print("Código do produto: ");
                    int codigo = leitor.nextInt();
                    System.out.print("Preço do produto: R$");
                    double preco = leitor.nextDouble();
                    System.out.print("Quantidade em estoque: ");
                    int quantidade = leitor.nextInt();
                    adicionarProduto(nome, codigo, preco, quantidade);
                    break;
                case 2:
                    System.out.print("Código do produto a ser atualizado: ");
                    int codigoAtualizar = leitor.nextInt();
                    leitor.nextLine();
                    System.out.print("Novo nome do produto: ");
                    String nomeAtualizar = leitor.nextLine();
                    System.out.print("Novo preço do produto: R$");
                    double precoAtualizar = leitor.nextDouble();
                    System.out.print("Nova quantidade em estoque: ");
                    int quantidadeAtualizar = leitor.nextInt();
                    atualizarProduto(codigoAtualizar, nomeAtualizar, precoAtualizar, quantidadeAtualizar);
                    break;
                case 3:
                    System.out.print("Código do produto a ser removido: ");
                    int codigoRemover = leitor.nextInt();
                    removerProduto(codigoRemover);
                    break;
                case 4:
                    gerarRelatorio();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (operacao != 5);{
            System.out.println("Sistema encerrado!");
        }

        leitor.close();
    }
}
