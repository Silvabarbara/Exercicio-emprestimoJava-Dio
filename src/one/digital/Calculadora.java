package one.digital;

public class Calculadora {
    public static void soma(double numero1, double numero2) {

        double resultado = numero1 + numero2;

        System.out.println("A  soma de " + numero1 + " mais " + numero2 + " è " + resultado);
    }

    public static void subtracao(double numero1, double numero2) {

        double resultado = numero1 - numero2;

        System.out.println("A subtracao de " +  numero1  +  " subt "  +  numero2  +  " é "  +  resultado);
    }

    public static void multiplicacao(double numero1 , double numero2) {

        double resultado = numero1 * numero2;

        System.out.println("A multiplição de "  +  numero1  +  " vezes "  +  numero2  +  " é "  +  resultado);
    }

    public static void divisao(double numero1, double numero2) {

        double resultado = numero1 / numero2;

        System.out.println("A divisao de  "  +  numero1  +  " div "  +  numero2  +  " é "  +  resultado);
    }

}
