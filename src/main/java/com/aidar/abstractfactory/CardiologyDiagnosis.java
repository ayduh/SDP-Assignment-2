package com.aidar.abstractfactory;

public class CardiologyDiagnosis implements Diagnosis {
    @Override
    public void printDiagnosis() {
        System.out.println("Cardiology Diagnosis: Patient has a history of heart disease.");
    }

    @Override
    public void printRiskLevel() {
        System.out.println("Risk Level: High - monitor blood pressure and cholesterol regularly.");
    }
}
