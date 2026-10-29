package org.example;

public class FuncionarioGerente extends Funcionario {

    public FuncionarioGerente(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoCertificado.getTipoDocumentoCertificado());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente";
    }
}