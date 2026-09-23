package com.aidar.abstractfactory;

public class Client {
    private final Diagnosis diagnosis;
    private final Prescription prescription;
    
    public Client(MedicalDocumentFactory factory) {
        this.diagnosis = factory.createDiagnosis();
        this.prescription = factory.createPrescription();
    }

    public void printMedicalDocuments() {
        diagnosis.printDiagnosis();
        diagnosis.printRiskLevel();
        prescription.printPrescription();
        prescription.printUsageInstructions();
    }
}
