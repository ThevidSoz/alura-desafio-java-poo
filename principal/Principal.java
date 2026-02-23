package br.com.alura.minhasmusicas.principal;
import br.com.alura.minhasmusicas.modelos.Audio;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    static void main(String[] args) {
        // Atributos
        Musica luzDourada = new Musica();
        luzDourada.setTitulo("Luz Dourada");
        luzDourada.setArtista("Alucard");
        luzDourada.setAlbum("Solar");
        luzDourada.setGenero("R&B");
        luzDourada.setClassificacao(10);
        // Metodos
        luzDourada.curtir();
        luzDourada.reproduzir();
        luzDourada.reproduzir();
        luzDourada.exibirFicha();
        System.out.println("-------------");
        System.out.println("Curtidas: " + luzDourada.getTotalCurtidas());
        System.out.println("Total de reproduções: " + luzDourada.getTotalReproducoes());
        System.out.println("Classificação: " + luzDourada.getClassificacao());
        System.out.println("=============");

        Podcast chorumeTech = new Podcast();
        chorumeTech.setTitulo("Chorume Tech");
        chorumeTech.setAutor("Mano Deyvin");
        chorumeTech.setDescricao("Podcast chorume sobre o mundo de tecnologia.");

        chorumeTech.exibirFicha();
    }
}
