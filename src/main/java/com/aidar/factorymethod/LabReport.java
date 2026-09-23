package com.aidar.factorymethod;

public class LabReport extends MedicalDocument{
    private String submittedSample;
    private String labResults;

    public LabReport(String pFirstName, String pLastName, String submittedSample, String labResults){
        super(pFirstName, pLastName);
        this.submittedSample = submittedSample;
        this.labResults = labResults;
    }
    
    @Override
    public StringBuilder generateForm() {
        StringBuilder sb = new StringBuilder();
        sb.append("== Lab Report ==").append("\n");
        sb.append("Name of Patient: ").append(getPatientFullName()).append("\n");
        sb.append("Submitted Sample: ").append(submittedSample).append("\n");
        sb.append("Lab Results: ").append(labResults).append("\n");
        
        return sb;
    }

    @Override
    public void putStamp() {
        System.out.println("LAB TECH STAMP\n");
    }
}
