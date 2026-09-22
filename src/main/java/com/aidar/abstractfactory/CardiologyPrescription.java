package com.aidar.abstractfactory;

public class CardiologyPrescription implements Prescription {
    @Override
    public void printPrescription() {
        System.out.println("Cardiology Prescription: Take 1 tablet of Aspirin daily.");
    }

    @Override
    public void printUsageInstructions() {
        System.out.println("Usage Instructions: Take after meals and consult a doctor if symptoms persist.");
    }

}
