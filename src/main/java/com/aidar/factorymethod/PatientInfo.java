package com.aidar.factorymethod;

public class PatientInfo extends MedicalDocument {
    private String dateOfBirth;
    private String description;

    public PatientInfo(String dateOfBirth, String Description){
        this.dateOfBirth = dateOfBirth;
        this.description = Description;
    }
    
    @Override
    public void generateForm() {
        StringBuilder sb = new StringBuilder();
        sb.append("== Patient Info ==").append("\n");
        sb.append("Name: ").append(getPatientFullName()).append("\n")
        sb.append("Date of Birth: ").append(dateOfBirth).append("\n");
        sb.append("Description: ").append(description).append("\n");
    }

    @Override
    public void putStamp() {

    }
}
