package org.example;

public class TipoDocumentoMatricula implements TipoDocumento {
    private static TipoDocumentoMatricula tipo = new TipoDocumentoMatricula();
    private TipoDocumentoMatricula() {}
    public static TipoDocumentoMatricula getTipoDocumentoMatricula() { return tipo; }
}