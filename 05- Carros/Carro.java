public class Carro {

    String marca;
    String modelo;
    String ano;
    String placa;
    float aceleracao;
    float freagem;
    float velocidade;

    public Carro(String marca, String modelo, String ano, String placa, float aceleracao, float freagem, float velocidade){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.aceleracao = aceleracao;
        this.velocidade = velocidade;
    }

    void acelerar(){
        velocidade =+ aceleracao;
        System.out.printf("Velocidade atual: " + velocidade);
    }
    void frear(){
        velocidade =- freagem;
        if(velocidade <= 0) {
            velocidade = 0;
            System.out.printf("Velocidade atual: " + velocidade);
        }else{
            System.out.printf("Velocidade atual: " + velocidade);
        }
    }
    void exibirDados(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade atual: " + velocidade);
    }
}
