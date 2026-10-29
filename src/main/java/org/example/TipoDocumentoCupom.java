package org.example;

public class TipoDocumentoCupom implements TipoDocumento {
    private static TipoDocumentoCupom tipo = new TipoDocumentoCupom();
    private TipoDocumentoCupom() {}
    public static TipoDocumentoCupom getTipoDocumentoCupom() { return tipo; }
}
