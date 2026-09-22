package com.aidar.abstractfactory;

public class PediatricFactory implements MedicalDocumentFactory {
    @Override
    public Diagnosis createDiagnosis() {
        return new PediatricDiagnosis();
    }

    @Override
    public Prescription createPrescription() {
        return new PediatricPrescription();
    }

}
