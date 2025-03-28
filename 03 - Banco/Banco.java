public class Banco {

    String nome;
    float saldo = 0;
    float deposito;
    float saque;
    public Banco(String nome, float saldo, float deposito, float saque){
        this.nome = nome;
        this.saldo = saldo;
        this.deposito = deposito;
        this.saque = saque;
    }


    void verSaldo(){
        System.out.println(nome);
        System.out.println("Saldo: R$" + saldo);
    }
    void depositar(){
        saldo = saldo + deposito;
        System.out.println("O depósito de R$" + deposito + " foi um sucesso!\nSaldo: R$" + saldo);
    }
    void sacar(){
        saldo = saldo - saque;
        if(saldo < 0){
            System.out.println("Saque impossível! Saldo insuficiente.");
        }else{
            System.out.println("O saque de R$" + saque + " foi um sucesso!\nSaldo: R$" + saldo);
        }
    }

}
