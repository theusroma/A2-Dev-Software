import java.util.ArrayList;

public class Pedido {
    private ArrayList<Pizza> pizzas;
    private ArrayList<Pizza> menu;


    public Pedido(){
        pizzas = new ArrayList<>();
        menu = new ArrayList<>();
        // Adicionando sabores padrão automaticamente
        pizzas.add(new Pizza("Margarita", 30.0f, "Molho de tomate, queijo, manjericão"));
        pizzas.add(new Pizza("Calabresa", 35.0f, "Molho de tomate, queijo, calabresa"));
        pizzas.add(new Pizza("Portuguesa", 40.0f, "Molho de tomate, queijo, presunto, ovo, azeitona"));
        pizzas.add(new Pizza("Quatro Queijos", 45.0f, "Molho de tomate, queijo mussarela, queijo prato, queijo parmesão, queijo gorgonzola"));

    }

    public void cardapio(){
        if (pizzas.isEmpty()){
            System.out.println("Não há pizzas disponíveis no cardápio");
        } else {
            for (Pizza p : pizzas){
                p.exibirDados();
            }
        }
        System.out.println();
    }

    public void adicionarPedido(String nome) {
        for (Pizza p : pizzas) { // Verifica se a pizza está no cardápio
            if (p.getNome().equalsIgnoreCase(nome)) {
                menu.add(p); // Adiciona ao carrinho
                System.out.println("Pedido de pizza adicionado: " + nome);
                return;
            }
        }
        System.out.println("Sabor não encontrado no cardápio.");
    }

    public void carrinho() {
        System.out.println("Carrinho: ");

        if (menu.isEmpty()) {
            System.out.println("Não há pizzas no carrinho.");
        } else {
            float total = 0;
            for (Pizza p : menu) {
                System.out.println("Nome: " + p.getNome() + " | Valor: " + p.getValor());
                total += p.getValor();
            }
            System.out.println("Total: " + total);
            System.out.println();
        }
    }


    public void cancelarPedido(String nome){
        for (Pizza p : menu) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                menu.remove(p);
                System.out.println("Pizza " + nome + " removida do carrinho.");
                return;
            }
        }
        System.out.println("Pedido não encontrado.");
    }


    public void pedidosRegistrados(){
        if (menu.isEmpty()) {
            System.out.println("Nenhuma pizza foi registrada até o momento");
        } else {
            System.out.println("Pedidos registrados:");
            for (Pizza p : menu){
                p.exibirDados();
            }
        }
        System.out.println();
    }


    // Método para cadastrar um novo sabor de pizza no cardápio.

    public void cadastrarSabor(String nome, float valor, String ingrediente){

        pizzas.add(new Pizza(nome, valor, ingrediente));  // Adiciona uma nova pizza ao ArrayList.
        System.out.println("Sabor cadastrado com sucesso!"); // Confirma o cadastro ao usuário.
        System.out.println();

    }


}
