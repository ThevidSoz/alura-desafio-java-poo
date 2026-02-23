package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio{
    private String autor;
    private String descricao;

    @Override
    public void exibirFicha(){
        System.out.println("Nome do Podcast: " + getTitulo());
        System.out.println("Apresentador: " + autor);
        System.out.println("Descrição: " + descricao);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
