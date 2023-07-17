package principal;

import reproducao.Musica;
import reproducao.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica trap = new Musica();

        trap.setTitulo("Bem Melhor");
        trap.setArtista("MC Lipi");
        trap.setAno(2021);
        trap.setDuracao(197);
        trap.curtir();
        trap.curtir();
        trap.reproduzir();
        trap.exibeInfo();
        trap.reproduzir();





    }
}
