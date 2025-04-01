import java.util.ArrayList;

public class Pedido {
    private ArrayList<Pizza> pizzas;
    private ArrayList<PedidoItem> menu;
    private ArrayList<PedidoItem> registros;

    public Pedido(){
        pizzas = new ArrayList<>();
        menu = new ArrayList<>();
        registros = new ArrayList<>();

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

    public void adicionarPedido(String nome, String tamanho, String endereco) {
        for (Pizza p : pizzas) { // Verifica se a pizza está no cardápio
            if (p.getNome().equalsIgnoreCase(nome)) {
                PedidoItem pedido = new PedidoItem(p, tamanho, endereco);
                menu.add(pedido); // Adiciona ao carrinho
                registros.add(pedido); // Adiciona no registro
                System.out.println("Pedido adicionado com sucesso!");
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
            for (PedidoItem p : menu) {
                p.exibirPedido();
                total += p.getPizza().getValor();
            }
            System.out.println("Total: " + total);
            System.out.println();
        }
    }

    public void cancelarPedido(String nome){
        for (PedidoItem p : menu) {
            if (p.getPizza().getNome().equalsIgnoreCase(nome)) {
                menu.remove(p);
                System.out.println("Pizza " + nome + " removida do carrinho.");
                return;
            }
        }
        System.out.println("Pedido não encontrado.");
    }

    public void pedidosRegistrados(){
        if (registros.isEmpty()) {
            System.out.println("Nenhum pedido registrado.");
        } else {
            System.out.println("Pedidos registrados:");
            float total = 0;
            for (PedidoItem p : registros){
                p.exibirPedido();
                total += p.getPizza().getValor();
            }
            System.out.println("Total de pedidos: " + registros.size());
            System.out.println("Média de preço: " + (total / registros.size()));
        }
        System.out.println();
    }

    public void cadastrarSabor(String nome, float valor, String ingrediente){
        pizzas.add(new Pizza(nome, valor, ingrediente));
        System.out.println("Sabor cadastrado com sucesso!");
        System.out.println();
    }
}
