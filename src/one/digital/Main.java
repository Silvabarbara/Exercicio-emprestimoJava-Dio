package one.digital;

import static one.digital.Mensagem.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Exercicio calculadora: ");
        Calculadora calculadora;
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9,  1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        System.out.println("Exercicio mensagem: ");
        Mensagem.obtermensagem(9);
        Mensagem.obtermensagem(14);
        Mensagem.obtermensagem(1);


        System.out.println("Exercicio emprestimo: ");
        Emprestimo emprestimo;
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 3);


    }
}
