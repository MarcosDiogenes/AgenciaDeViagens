package br.uern.di.pa.abb.diogenes.marcos;

public class Viajante {

    private String nome, cpfViajante, nascimento;

    // Construtor Padrão
    public Viajante(String nome, String cpfViajante, String nascimento) {
        this.nome = nome;
        this.cpfViajante = cpfViajante;
        this.nascimento = nascimento;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfViajante() {
        return cpfViajante;
    }

    public void setCpfViajante(String cpfViajante) {
        this.cpfViajante = cpfViajante;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
}
