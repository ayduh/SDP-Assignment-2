package com.aidar.factorymethod;

public class PatientInfo extends MedicalDocument {
    private String dateOfBirth;
    private String description;

    public PatientInfo(String pFirstName, String pLastName, String dateOfBirth, String description) {
        super(pFirstName, pLastName);
        this.dateOfBirth = dateOfBirth;
        this.description = description;
    }
    
    @Override
    public StringBuilder generateForm() {
        StringBuilder sb = new StringBuilder();
        sb.append("== Patient Info ==").append("\n");
        sb.append("Name of Patient: ").append(getPatientFullName()).append("\n");
        sb.append("Date of Birth: ").append(dateOfBirth).append("\n");
        sb.append("Description: ").append(description).append("\n");

        return sb;
    }

    @Override
    public void putStamp() {
        
    }
}
