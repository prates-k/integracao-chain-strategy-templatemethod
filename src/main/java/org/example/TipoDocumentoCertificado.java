package org.example;

public class TipoDocumentoCertificado implements TipoDocumento {
    private static TipoDocumentoCertificado tipo = new TipoDocumentoCertificado();
    private TipoDocumentoCertificado() {}
    public static TipoDocumentoCertificado getTipoDocumentoCertificado() { return tipo; }
}