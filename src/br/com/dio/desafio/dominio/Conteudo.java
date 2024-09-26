package br.com.dio.desafio.dominio;

/*
 * Classe abstrata que serve como modelo para outras classes, permitindo herança de atributos e métodos. Isso evita repetição de código, pois as classes filhas compartilharão comportamentos comuns definidos aqui.
 */

public abstract class Conteudo{
    // Constante
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    // Método abstrato para calcular a experiência (XP), obrigatório para que cada subclasse forneça sua própria lógica de cálculo.
    public abstract double calcularXp();

    
    // Métodos Getters e Setters
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