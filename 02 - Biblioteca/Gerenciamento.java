import java.util.ArrayList;

public class Gerenciamento {
    private ArrayList<Livro> livros;

    Gerenciamento(){
        livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano){
            livros.add(new Livro(titulo, autor, ano));
    }

    public void livrosCadastrados(){
        if (livros.isEmpty()) { // condicao para exibir apenas se houver livros cadastrados
            System.out.println("Não há livros cadastrados!");
            } else {
            System.out.println("Livros cadastrados: ");
            for (Livro l : livros){
                l.exibirInfo();
            }
        }
    }



}
