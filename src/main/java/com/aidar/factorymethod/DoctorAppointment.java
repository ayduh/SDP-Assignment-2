package com.aidar.factorymethod;

public class DoctorAppointment extends MedicalDocument {
    private String doctorName;
    private String dateOfAppointment;

    public DoctorAppointment(String doctorFirstName, String doctorSecondName, String dateOfAppointment){
        this.doctorName = doctorFirstName + " " + doctorSecondName;
        this.dateOfAppointment = dateOfAppointment;
    }

    @Override
    public StringBuilder generateForm() {
        StringBuilder sb = new StringBuilder();
        sb.append("== Doctor Appointment ==").append("\n");
        sb.append("Name of Patient: ").append(getPatientFullName()).append("\n");
        sb.append("Name of Doctor: ").append(doctorName).append("\n");
        sb.append("Date of Appointment: ").append(dateOfAppointment).append("\n");
        
        return sb;
    }

    @Override
    public void putStamp() {
        System.out.println("DOCTOR STAMP");
    }
}
