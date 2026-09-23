package com.aidar.abstractfactory;

public class Main {
    public static void main(String[] args) {
        MedicalDocumentFactory factory = new CardiologyFactory();
        MedicalDocumentFactory pediatricFactory = new PediatricFactory();
        
        Client client = new Client(factory);
        client.printMedicalDocuments();
        
        Client pediatricClient = new Client(pediatricFactory);
        pediatricClient.printMedicalDocuments();
    }
}
