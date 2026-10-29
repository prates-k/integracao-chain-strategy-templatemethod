package org.example;

public class AlunoMusculacao extends Aluno {

    @Override
    public String verificarAprovacao() {
        if (this.calcularMedia() >= 6.0f) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}