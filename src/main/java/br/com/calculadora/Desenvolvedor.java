package br.com.calculadora;

public class Desenvolvedor implements Cargo {


    public double calcula(Double salario) {
        return salario > 3000 ? salario * 0.80 : salario * 0.90;
    }
}
