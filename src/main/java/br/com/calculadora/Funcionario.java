package br.com.calculadora;

public class Funcionario {

    private String nome;
    private Double salario;
    private Cargo cargo;

    Funcionario(String nome, Double salario, Cargo cargo){
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo.getClass().getSimpleName();
    }

    public double calcula() {
        return this.cargo.calcula(this.salario);
    }
}
