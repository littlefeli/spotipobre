package reproducao;

public class Musica extends Audio {
    private String artista;
    private String album;
    private String genero;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void exibeInfo(){
        System.out.println("Título: " + getTitulo());
        System.out.println("Artista: " + getArtista());
        System.out.println("Ano de Lançamento: " + getAno());
        System.out.println("Duração: " + getDuracao() + "s.");
        System.out.println(getCurtidas() + " ouvintes curtem essa música.");
        System.out.println(getTotalReproducoes() + " reproduções.");
    }
}
