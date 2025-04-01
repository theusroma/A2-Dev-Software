public class Pizza {
    private String nome;
    private float valor;
    private String ingrediente;

    public Pizza(String nome, float valor, String ingrediente){
        this.nome = nome;
        this.valor = valor;
        this.ingrediente = ingrediente;
    }


    public String getNome(){
        return this.nome;
    }

    public float getValor(){
        return this.valor;
    }


    public String getIngrediente(){
        return this.ingrediente;
    }

    void exibirDados(){
        System.out.println("Nome: "+getNome()+ " | Valor: "+getValor()+ " | Ingrediente: "+getIngrediente());

    }

}
