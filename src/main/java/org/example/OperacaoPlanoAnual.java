package org.example;

public class OperacaoPlanoAnual implements Operacao {
    public float calcular(float valor1, float valor2) {
        if (valor2 == 0) {
            throw new IllegalArgumentException("Divisão por zero");
        }
        return valor1 / valor2;
    }
}