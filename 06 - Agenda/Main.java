import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Inspirado pela organização de um grande evento de networking, onde os participantes trocam
//        contatos e informações profissionais, um desenvolvedor decide criar um sistema para gerenciar
//        uma agenda de contatos. Este sistema ajudará os usuários a manter suas conexões organizadas,
//        permitindo-lhes adicionar, remover e buscar contatos facilmente.
//
//        Dica: “Crie as classes Agenda e Contato em Java. A classe Contato deve armazenar informações como nome
//        e telefone, enquanto a classe Agenda deve gerenciar uma lista de contatos, com métodos para
//        adicionar novos contatos e buscar contatos por nome.”


        Scanner leitor = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int op = 0;

        while (op != 5){
            System.out.println("Digite a opção desejada:");
            System.out.println("[1] Adicionar novo contato");
            System.out.println("[2] Lista de contatos");
            System.out.println("[3] Buscar contato por nome");
            System.out.println("[4] Remover contato");
            System.out.println("[5] Sair");
            op = leitor.nextInt();
            leitor.nextLine();

            switch (op){
                case 1:
                    System.out.println("Digite o nome do contato: ");
                    String nome = leitor.nextLine();

                    System.out.println("Digite o telefone do contato: ");
                    String telefone = leitor.nextLine();

                    agenda.adicionarContato(nome, telefone);
                    break;

                case 2:
                    agenda.exibirContato();
                    break;

                case 3:
                    System.out.println("Digite o nome do contato a ser buscado: ");
                    String buscado = leitor.nextLine();
                    agenda.buscarContato(buscado);
                    break;

                case 4:
                    System.out.println("Digite o nome do contato a ser removido: ");
                    String excluido = leitor.nextLine();
                    agenda.removerContato(excluido);
                    break;


                case 5:
                    System.out.println("Saindo...");

            }
        }



    }
}
