public class Contato {
    private String nome;
    private int telefone;


    public Contato(String nome, int telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome(){
        return this.nome;
    }

    public int getTelefone(){
        return this.telefone;
    }

    void exibirDados(){
        System.out.println("Nome: "+getNome()+ "| Telefone: "+getTelefone());

    }

}
