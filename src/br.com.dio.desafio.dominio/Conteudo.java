package br.com.dio.desafio.dominio;

public abstract class Conteudo { //abstract = não consigo instanciar o conteúdo

    protected static final double XP_PADRAO = 100;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
