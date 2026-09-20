package com.aidar.factorymethod;

public abstract class MedicalDocument {

    private String firstName;
    private String lastName;

    public MedicalDocument() {
    }

    public MedicalDocument(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getPatientFullName() {
        return firstName + " " + lastName;
    }

    public abstract void generateForm();
    public abstract void putStamp();
}
