package org.example;

public class AlunoCrossfit extends Aluno {

    @Override
    public String verificarAprovacao() {
        if (this.calcularMedia() >= 7.0f) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    @Override
    public String getTipo() {
        return "AlunoCrossfit";
    }
}