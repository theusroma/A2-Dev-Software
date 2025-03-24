public class Agenda {
    private Contato[] contatos;
    private int contador;

    public Agenda(int tamanho){
        contatos = new Contato[tamanho];
        contador = 0;
    }

    public void adicionarContato(String nome, int telefone){
        if(contador < contatos.length){
        contatos[contador] = new Contato(nome, telefone);
        contador++;

        System.out.println("Contato adicionado com sucesso!");

        } else{
            System.out.println("Agenda cheia!");
        }
    }

    public void exibirContato(){
        if (contador >= 1){
            for(int i = 0; i < contador; i++){
                contatos[i].exibirDados();
            }
        } else {
            System.out.println("A agenda está vazia!");
        }
    }

    public void buscarContato(String nome) {
        for (int i = 0; i < contador; i++) { // Percorre a agenda
            if (contatos[i].getNome().equalsIgnoreCase(nome)) { // Se o nome for igual   .equal é usado para comparar o NOME.

                System.out.println("Contato encontrado:");
                contatos[i].exibirDados();

                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }

    public void removerContato(String nome) {

        for (int i = 0; i < contador; i++) {
            if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                contatos[i] = null;
                contador--;
                System.out.println("Contato " + nome + " removido com sucesso.");
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }

}
