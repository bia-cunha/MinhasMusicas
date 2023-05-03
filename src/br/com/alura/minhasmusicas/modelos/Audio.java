package br.com.alura.minhasmusicas.modelos;

public class Audio {

    private String titulo;
    private int totalDeReproducoes;
    private int totalCurtidas;
    private double classificacao;

    public double getClassificacao() {
        return classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void curte(){
        this.totalCurtidas++;
    }

    public void reproduz(){
        this.totalDeReproducoes++;
    }
}


