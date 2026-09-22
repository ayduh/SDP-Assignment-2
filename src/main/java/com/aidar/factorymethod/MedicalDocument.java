package com.aidar.factorymethod;

public abstract class MedicalDocument {

    private String patientFirstName;
    private String patientLastName;

    public MedicalDocument() {
        
    }

    public MedicalDocument(String pFirstName, String pLastName) {
        this.patientFirstName = pFirstName;
        this.patientLastName = pLastName;
    }

    public String getPatientFullName() {
        return patientFirstName + " " + patientLastName;
    }

    public abstract StringBuilder generateForm();
    public abstract void putStamp();
}
