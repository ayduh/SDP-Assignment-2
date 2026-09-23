package com.aidar.abstractfactory;

public class PediatricDiagnosis implements Diagnosis {
    @Override
    public void printDiagnosis() {
        System.out.println("Pediatric Diagnosis: Patient is a child with a mild fever.");
    }

    @Override
    public void printRiskLevel() {
        System.out.println("Risk Level: Moderate - ensure hydration and monitor temperature.");
    }
}
