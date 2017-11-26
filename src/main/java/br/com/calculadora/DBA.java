package br.com.calculadora;

public class DBA implements Cargo {

    public double calcula(Double salario) {
        return salario > 2500 ? salario * 0.75 : salario * 0.85;
    }
}
