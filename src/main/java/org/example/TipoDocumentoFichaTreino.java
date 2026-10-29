package org.example;

public class TipoDocumentoFichaTreino implements TipoDocumento {
    private static TipoDocumentoFichaTreino tipo = new TipoDocumentoFichaTreino();
    private TipoDocumentoFichaTreino() {}
    public static TipoDocumentoFichaTreino getTipoDocumentoFichaTreino() { return tipo; }
}
