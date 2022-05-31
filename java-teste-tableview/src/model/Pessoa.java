package model;

public class Pessoa {
    private String nome;
    private Integer idade;
    private String animal;

    public Pessoa(String nome, int idade, String animal) {
        this.nome = nome;
        this.idade = idade;
        this.animal = animal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", animal='" + animal + '\'' +
                '}';
    }
}
