package digital.innovation.on.core;

import digital.innovation.one.utils.Calculadora;

public class Runner {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sum(1,2));
        System.out.println(calculadora.mult(5,2));

    }
}
