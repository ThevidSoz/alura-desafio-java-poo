package br.com.alura.minhasmusicas.principal;
import br.com.alura.minhasmusicas.modelos.Audio;

public class Principal {
    static void main(String[] args) {
        Audio audio = new Audio();

        audio.setTitulo("Luz Dourada");
        audio.setClassificacao(10);
        audio.curtir(100);
        audio.reproduzir(100);

        audio.exibirFicha();
        System.out.println("Total de curtidas: " + audio.getTotalCurtidas());
        System.out.println("Total de reproduções: " + audio.getTotalReproducoes());
    }
}
