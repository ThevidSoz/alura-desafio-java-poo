package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio{
    private String album;
    private String artista;
    private String genero;

    @Override
    public void exibirFicha(){
        System.out.println("Nome da música: " + getTitulo());
        System.out.println("Nome do artista: " + artista);
        System.out.println("Gênero: " + genero);
        System.out.println("Álbum: " + album);
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
