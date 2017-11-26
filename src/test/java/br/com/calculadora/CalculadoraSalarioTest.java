package br.com.calculadora;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraSalarioTest {

    @Test
    public void ValidaCriacaoDoFuncionario(){

        Cargo cargo = new DBA();
        Funcionario funcionario = new Funcionario("Joao", new Double(2000), cargo);

        assertEquals(funcionario.getNome(), "Joao");
        assertEquals(funcionario.getSalario(), 2000, 0.0001);
        assertEquals(funcionario.getCargo(), cargo.getClass().getSimpleName());
    }

    @Test
    public void ValidaCalculoSalarioDBAMaiorQue2500(){

        Cargo cargo = new DBA();
        Funcionario funcionario = new Funcionario("Joao", new Double(2501), cargo);

        Double salario = funcionario.calcula();
        Double esperado = new Double(2501) * 0.75;

        assertEquals(salario, esperado);
    }

    @Test
    public void ValidaCalculoSalarioDBAIgualQue2500(){

        Cargo cargo = new DBA();
        Funcionario funcionario = new Funcionario("Joao", new Double(2500), cargo);

        Double salario = funcionario.calcula();
        Double esperado = new Double(2500) * 0.85;

        assertEquals(salario, esperado);
    }

    @Test
    public void ValidaCalculoSalarioDBAMenorQue2500(){

        Cargo cargo = new DBA();
        Funcionario funcionario = new Funcionario("Joao", new Double(2499), cargo);

        Double salario = funcionario.calcula();
        Double esperado = new Double(2499) * 0.85;

        assertEquals(salario, esperado);
    }

    @Test
    public void ValidaCalculoSalarioTestadorMaiorQue2500(){

        Cargo cargo = new Testador();
        Funcionario funcionario = new Funcionario("Joao", new Double(2501), cargo);

        Double salario = funcionario.calcula();
        Double esperado = new Double(2501) * 0.75;

        assertEquals(salario, esperado);
    }

    @Test
    public void ValidaCalculoSalarioTestadorIgualQue2500(){

        Cargo cargo = new Testador();
        Funcionario funcionario = new Funcionario("Joao", new Double(2500), cargo);

        Double salario = funcionario.calcula();
        Double esperado = new Double(2500) * 0.85;

        assertEquals(salario, esperado);
    }

    @Test
    public void ValidaCalculoSalarioTestadorMenorQue2500(){

        Cargo cargo = new Testador();
        Funcionario funcionario = new Funcionario("Joao", new Double(2499), cargo);

        Double salario = funcionario.calcula();
        Double esperado = new Double(2499) * 0.85;

        assertEquals(salario, esperado);
    }

    @Test
    public void ValidaCalculoSalarioDesenvolvedorMaiorQue3000(){

        Cargo cargo = new Desenvolvedor();
        Funcionario funcionario = new Funcionario("Joao", new Double(3001), cargo);

        Double salario = funcionario.calcula();
        Double esperado = new Double(3001) * 0.80;

        assertEquals(salario, esperado);
    }

    @Test
    public void ValidaCalculoSalarioDesenvolvedorIgualQue3000(){

        Cargo cargo = new Desenvolvedor();
        Funcionario funcionario = new Funcionario("Joao", new Double(3000), cargo);

        Double salario = funcionario.calcula();
        Double esperado = new Double(3000) * 0.90;

        assertEquals(salario, esperado);
    }

    @Test
    public void ValidaCalculoSalarioTestadorMenorQue3000(){

        Cargo cargo = new Desenvolvedor();
        Funcionario funcionario = new Funcionario("Joao", new Double(2999), cargo);

        Double salario = funcionario.calcula();
        Double esperado = new Double(2999) * 0.90;

        assertEquals(salario, esperado);
    }
}
