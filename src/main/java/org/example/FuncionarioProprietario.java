package org.example;

public class FuncionarioProprietario extends Funcionario {

    public FuncionarioProprietario(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoContrato.getTipoDocumentoContrato());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Proprietario";
    }
}