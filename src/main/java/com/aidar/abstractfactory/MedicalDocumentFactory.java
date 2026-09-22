package com.aidar.abstractfactory;

public interface MedicalDocumentFactory {
    Diagnosis createDiagnosis();
    Prescription createPrescription();
}
