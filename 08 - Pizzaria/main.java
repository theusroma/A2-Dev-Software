import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Pedido pedido = new Pedido();



    int op = 0;

    while (op != 7){

        System.out.println("Digite a opção desejada:");
        System.out.println("[1] Cardápio");
        System.out.println("[2] Adicionar pedido");
        System.out.println("[3] Cancelar pedido");
        System.out.println("[4] Pedidos registrados");
        System.out.println("[5] Cadastrar novo sabor");
        System.out.println("[6] Carrinho");
        System.out.println("[7] Sair");
        op = leitor.nextInt();
        leitor.nextLine();

        switch (op){
            case 1:
                pedido.cardapio();
                break;

            case 2:
                System.out.println("Qual sabor de pizza você deseja?");
                String sabor = leitor.nextLine();
                pedido.adicionarPedido(sabor);
                break;

            case 3:
                System.out.println("Qual sabor de pizza você deseja remover?");
                pedido.pedidosRegistrados();
                String remove = leitor.nextLine();
                pedido.cancelarPedido(remove);
                break;

            case 4:
                pedido.pedidosRegistrados();
                break;

            case 5:
                System.out.println("Digite o sabor a ser cadastrado: ");
                String saborCadastrado = leitor.nextLine();

                System.out.println("Digite qual será o preço: ");
                float precoCadastrado = leitor.nextFloat();
                leitor.nextLine();

                System.out.println("Digite qual será o ingrediente: ");
                String ingredienteCadastrado = leitor.nextLine();

                pedido.cadastrarSabor(saborCadastrado, precoCadastrado, ingredienteCadastrado);

                break;

            case 6:
                pedido.carrinho();
                break;

            case 7:
                System.out.println("Saindo...");
                break;
        }
    }

    }
}



//Uma pizzaria local busca modernizar seu processo de registro de pedidos, optando por desenvolver um sistema
//em Java que ofereça praticidade e eficiência aos seus clientes e funcionários. O objetivo é criar uma solução
//simples e acessível, capaz de armazenar detalhes fundamentais de cada pedido, como o tipo de pizza escolhida, o
//tamanho desejado, o valor a ser pago e o endereço de entrega. Para atender a essa demanda, a empresa pretende
//implementar uma classe Pedido, responsável por todas as operações relacionadas aos pedidos.

//Dentro da classe Pedido, os funcionários poderão adicionar novos pedidos ao sistema, fornecer detalhes
//específicos sobre cada pedido, como sabor da pizza e endereço de entrega, além de ter a capacidade de cancelar
//pedidos, se necessário. Além disso, o sistema será capaz de gerar um relatório completo de todos os pedidos
//registrados, oferecendo insights valiosos, como o número total de pedidos realizados e a média de preço dos
//pedidos. Essa abordagem integrada visa simplificar e otimizar o processo de registro e gerenciamento de pedidos,
//contribuindo para uma experiência mais eficiente e satisfatória tanto para a pizzaria quanto para seus clientes.

//Além disso, faça com que o sistema já tenha algumas pizzas cadastradas com nome para serem escolhidas em um
//menu antes de adicionadas ao pedido. Desta forma, além da classe Pedido responsável por gerenciar os pedidos
//realizados na pizzaria, cria uma classe Pizza que contenha o nome, valor e ingredientes de cada pizza a ser
//escolhida em um pedido.

//Obs. os objetos “pizzas” da classe pizza podem ser criados e adicionados manualmente em uma lista pelo código
//na main. Mas caso queira, é possível também fazer um menu para adicionar novos sabores além dos existentes.
