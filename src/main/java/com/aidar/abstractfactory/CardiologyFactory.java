package com.aidar.abstractfactory;

public class CardiologyFactory implements MedicalDocumentFactory {
    @Override
    public Diagnosis createDiagnosis() {
        return new CardiologyDiagnosis();
    }

    @Override
    public Prescription createPrescription() {
        return new CardiologyPrescription();
    }
}
