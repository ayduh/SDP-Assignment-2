package com.aidar.abstractfactory;

public class PediatricPrescription implements Prescription {
    @Override
    public void printPrescription() {
        System.out.println("Pediatric Prescription: Take 1 teaspoon of Children's Tylenol every 6 hours as needed.");
    }

    @Override
    public void printUsageInstructions() {
        System.out.println("Usage Instructions: Use only as directed and keep medication out of reach of children.");
    }

}
