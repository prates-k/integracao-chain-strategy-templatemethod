package org.example;

public class FuncionarioRecepcionista extends Funcionario {

    public FuncionarioRecepcionista(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoMatricula.getTipoDocumentoMatricula());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Recepcionista";
    }
}