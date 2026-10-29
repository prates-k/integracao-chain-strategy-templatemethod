package org.example;

public class TipoDocumentoContrato implements TipoDocumento {
    private static TipoDocumentoContrato tipo = new TipoDocumentoContrato();
    private TipoDocumentoContrato() {}
    public static TipoDocumentoContrato getTipoDocumentoContrato() { return tipo; }
}