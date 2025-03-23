public class Jogos {
    private String nome;
    private int pontuacao;
    private int nivel;


    Jogos(String nome, int pontuacao, int nivel){
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel= nivel;
    }

    public String getNome(){
        return this.nome;
    }

    public int getPontuacao(){
        return this.pontuacao;
    }

    public int getNivel(){
        return this.nivel;
    }

    public void exibirdados(){
        System.out.println("Perfil: "+getNome());
        System.out.println("Pontuação: "+getPontuacao());
        System.out.println("Nível: "+getNivel());
        System.out.println("");
    }

    public void aumentarNivel() {
        this.nivel++; // Aumenta o nível
        System.out.println("O nível do jogador " + this.nome + " agora é " + this.nivel);
    }

    public void aumentarPontuacao() {
        this.pontuacao = this.pontuacao + 50; // Aumenta a pontuacao de 50 em 50
        System.out.println("A pontuacao do jogador " + this.nome + " agora é " + this.pontuacao);
    }





}
