package com.aidar.factorymethod;

public class LabReport extends MedicalDocument{
    private String submittedSample;
    private String labResults;

    public LabReport(String submittedSample, String labResults){
        this.submittedSample = submittedSample;
        this.labResults = labResults;
    }
    
    @Override
    public void generateForm() {
        StringBuilder sb = new StringBuilder();
        sb.append("== Lab Report ==").append("\n");
        sb.append("Name of Patient: ").append(getPatientFullName()).append("\n")
        sb.append("Submitted Sample: ").append(submittedSample).append("\n");
        sb.append("Lab Results: ").append(labResults).append("\n");
    }

    @Override
    public void putStamp() {
        System.out.println("LAB TECH STAMP");
    }
}
