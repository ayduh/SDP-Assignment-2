package com.aidar.factorymethod;

public class DoctorAppointmentFactory implements DocumentFactory{
    private String pFirstName, pLastName;
    private String dFirstName, dLastName, dateOfAppointment;

    public DoctorAppointmentFactory(
        String pFirstName, String pLastName,
        String dFirstName, String dLastName, String dateOfAppointment
    ) {
        this.pFirstName = pFirstName;
        this.pLastName = pLastName;
        this.dFirstName = dFirstName;
        this.dLastName = dLastName;
        this.dateOfAppointment = dateOfAppointment;
    }

    @Override
    public MedicalDocument createMedicalDocument() {
        return new DoctorAppointment(pFirstName, pLastName, dFirstName, dLastName, dateOfAppointment);
    }
}
