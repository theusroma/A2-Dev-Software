import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda(){
        contatos = new ArrayList<>();
    }

    public void adicionarContato(String nome, String telefone){
        contatos.add(new Contato(nome, telefone));
            System.out.println("Contato adicionado com sucesso!");

    }

    public void exibirContato(){
        if (contatos.isEmpty()){
            System.out.println("A agenda está vazia!");
        } else {
            for (Contato c : contatos){
                c.exibirDados();
            }
        }
    }

    public void buscarContato(String nome) {
        for (Contato c : contatos) { // Percorre a agenda
            if (c.getNome().equalsIgnoreCase(nome)) { // Se o nome for igual   .equal é usado para comparar o NOME.

                System.out.println("Contato encontrado:");
                c.exibirDados();

                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }

    public void removerContato(String nome) {

        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                contatos.remove(c);
                System.out.println("Contato " + nome + " removido com sucesso.");
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }

}
