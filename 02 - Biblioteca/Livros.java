public class Livros {
   private String titulo;
   private String autor;
   private int ano;

    Livros(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getAno(){
        return this.ano;
    }
    public void exibirInfo(){
        System.out.println("Título: "+getTitulo());
        System.out.println("Autor: "+getAutor());
        System.out.println("Ano: "+getAno());
        System.out.println("");
    }


}
