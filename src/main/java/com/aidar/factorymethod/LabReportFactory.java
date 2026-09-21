package com.aidar.factorymethod;

public class LabReportFactory implements DocumentFactory{
    private String pFirstName, pLastName;
    private String submittedSample, labResult;

    public LabReportFactory(
        String pFirstName, String pLastName,
        String submittedSample, String labResult
    ) {
        this.pFirstName = pFirstName;
        this.pLastName = pLastName;
        this.submittedSample = submittedSample;
        this.labResult = labResult;
        
    }

    @Override
    public MedicalDocument createMedicalDocument() {
        return new LabReport(pFirstName, pLastName, submittedSample, labResult);
    }
}
