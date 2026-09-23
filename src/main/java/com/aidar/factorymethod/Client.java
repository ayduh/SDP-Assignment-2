package com.aidar.factorymethod;

public class Client {
    private MedicalDocument document;

    public Client(DocumentFactory factory) {
        this.document = factory.createMedicalDocument();
    }

    public MedicalDocument getDocument() {
        return document;
    }
}
