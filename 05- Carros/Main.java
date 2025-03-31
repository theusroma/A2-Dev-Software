public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("SISTEMA AUTOMOBILISTICO");
        System.out.println("-----------------------");
        System.out.println("Digite a marca do seu carro: ");
        String marca = leitor.nextLine();
        System.out.println("Digite o modelo: ");
        String modelo = leitor.nextLine();
        System.out.println("Digite o ano: ");
        String ano = leitor.nextLine();
        System.out.println("Digite a placa: ");
        String placa = leitor.nextLine();
        System.out.println("Digite a velocidade atual do carro em km/h: ");
        float velocidade = leitor.nextFloat();
        float aceleracao = 0;
        float freagem = 0;
        int operacao = 0;

        Carro carro = new Carro(marca, modelo, ano, placa, aceleracao, freagem, velocidade);

        do{
            System.out.println("\nDigite a ação: ");
            System.out.println("1- Acelerar\n2- Frear\n3- Exibir dados\n4- Sair");
            operacao = leitor.nextInt();

            switch(operacao){
                case 1:
                    System.out.println("Digite em km/h o quanto você quer acelerar: ");
                    carro.aceleracao = leitor.nextFloat();
                    carro.acelerar();
                    break;
                case 2:
                    System.out.println("Digite em km/h o quanto você quer frear: ");
                    carro.freagem = leitor.nextFloat();
                    carro.frear();
                    break;
                case 3:
                    carro.exibirDados();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Operação inválida! Tente novamente.");
            }

        }while(operacao != 4);{
            System.out.println("Sistema encerrado.");
        }

        leitor.close();
    }
}
