package reproducao;

public class Audio {
    private String titulo;
    private int ano;
    private int duracao;
    private int totalReproducoes;
    private int curtidas;
    private int classificacao;
    private boolean reproduzindo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public void curtir(){
        this.curtidas += 1;
    }

    public void reproduzir(){
        this.reproduzindo = true;
        this.totalReproducoes += 1;
        if (reproduzindo == true){
            System.out.println("> Reproduzindo > ");
        } else {
            System.out.println("|| Pausado ||");
        }
    }

    public void exibeInfo(){
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano de Lançamento: " + getAno());
        System.out.println("Duração: " + getDuracao() + "s.");
        System.out.println(getCurtidas() + " ouvintes curtem essa música.");
        System.out.println(getTotalReproducoes() + " reproduções.");
    }
}
