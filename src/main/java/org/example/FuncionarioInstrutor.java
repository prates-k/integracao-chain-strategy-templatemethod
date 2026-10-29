package org.example;

public class FuncionarioInstrutor extends Funcionario {

    public FuncionarioInstrutor(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoFichaTreino.getTipoDocumentoFichaTreino());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Instrutor";
    }
}