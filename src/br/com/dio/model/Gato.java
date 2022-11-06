package br.com.dio.model;

import java.util.Objects;

public class Gato {
    private string nome;
    private strinf cor;
    private integer idade;

    public Gato(string nome, strinf cor, integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public string getNome() {
        return nome;
    }

    public strinf getCor() {
        return cor;
    }

    public integer getIdade() {
        return idade;
    }

    public void setNome(string nome) {
        this.nome = nome;
    }

    public void setCor(strinf cor) {
        this.cor = cor;
    }

    public void setIdade(integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(nome, gato.nome) && Objects.equals(cor, gato.cor) && Objects.equals(idade, gato.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome=" + nome +
                ", cor=" + cor +
                ", idade=" + idade +
                '}';
    }
}
