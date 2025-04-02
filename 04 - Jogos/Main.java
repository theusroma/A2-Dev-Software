import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Inspirado por esse projeto entre amigos, o desafio é desenvolver uma parte desse sistema de
//        gerenciamento de jogadores utilizando Java, com um foco especial na orientação a objetos. O
//        sistema deve permitir a criação de perfis de jogadores, armazenando informações como nome,
//        pontuação e nível. Além disso, deve ser possível atualizar a pontuação e o nível dos jogadores no
//        sistema.
//                Dica: “Crie a classe `Jogador`, que deverá conter atributos privados para o `nome`, `pontuacao` e `nivel`
//        do jogador. Inclua um construtor para inicializar esses atributos e métodos públicos para permitir
//        a manipulação segura dessas informações — por exemplo, métodos para aumentar a pontuação,
//        subir de nível e exibir as informações do jogador.”


        Scanner leitor = new Scanner(System.in);
        Jogos[] jogos;
        int op = 0;
        int contador = 0;

//        System.out.println("Quantos perfis pretende criar? ");
//        int tamanho = leitor.nextInt();
        int tamanho = 10;
        jogos = new Jogos[tamanho];

        while (op != 5) {
            System.out.println("Digite a opção desejada:\n[1]Criar perfil.\n[2]Perfis criados.\n[3]Aumentar nível.\n[4]Aumentar pontuação.\n[5]Sair.");
            op = leitor.nextInt();
            leitor.nextLine();

            switch (op) {
                case 1:
                    if (contador < jogos.length) { // verifica se o vetor tem espaço disponivel
                        System.out.println("Digite o nome do perfil: ");
                        String nome = leitor.nextLine();

                        System.out.println("Digite a pontuação do jogador: ");
                        int pontuacao = leitor.nextInt();
                        leitor.nextLine();

                        System.out.println("Digite o nível do jogador: ");
                        int nivel = leitor.nextInt();
                        leitor.nextLine();

                        jogos[contador] = new Jogos(nome, pontuacao, nivel);
                        contador++;

                        System.out.println("Perfil criado com sucesso!");
                    } else{
                        System.out.println("Limite atingido!");
                        }
                    break;

                case 2:
                    if (contador >0){
                        for (int i = 0; i < contador; i++){
                            jogos[i].exibirdados();
                        }
                    } else {
                        System.out.println("Não há perfis criados.\n");
                    }
                    break;

                case 3:
                    System.out.println("Selecione o perfil que deseja aumentar o nível: ");

                    for (int i = 0; i < contador; i++) {
                        System.out.println("[" + i + "]" + jogos[i].getNome());
                    }

                    int sele = leitor.nextInt();
                    leitor.nextLine();
                    jogos[sele].aumentarNivel();
                    break;

                case 4:
                    System.out.println("Selecione o perfil que deseja aumentar a pontuação: ");

                    for (int i = 0; i < contador; i++){
                        System.out.println("[" + i + "]" + jogos[i].getNome());
                    }

                    int selecao = leitor.nextInt();
                    leitor.nextLine();
                    jogos[selecao].aumentarPontuacao();
                    break;




                case 5:
                    System.out.println("Finalizandoo programa...");



            }
        }


    }
}
