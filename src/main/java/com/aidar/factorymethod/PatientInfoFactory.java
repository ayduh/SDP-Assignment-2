package com.aidar.factorymethod;

public class PatientInfoFactory implements DocumentFactory{
    private String pFirstName, pLastName;
    private String dateOfBirth, description;

    public PatientInfoFactory(
        String pFirstName, String pLastName,
        String dateOfBirth, String description
    ) {
        this.pFirstName = pFirstName;
        this.pLastName = pLastName;
        this.dateOfBirth = dateOfBirth;
        this.description = description;
    }

    @Override
    public MedicalDocument createMedicalDocument() {
        return new PatientInfo(pFirstName, pLastName, dateOfBirth, description);
    }
}
