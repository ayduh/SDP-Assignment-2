package com.aidar.factorymethod;

public class HospitalAdmin {
    public static void main(String[] args) {
        DocumentFactory doctorAppointmentFactory = new DoctorAppointmentFactory(
            "Aidar", "Murat", "Alice", "Smith", "2026-06-15"
        );
        Client doctorAppointmentClient = new Client(doctorAppointmentFactory);
        MedicalDocument doctorAppointmentDocument = doctorAppointmentClient.getDocument();
        System.out.println(doctorAppointmentDocument.generateForm());
        doctorAppointmentDocument.putStamp();

        DocumentFactory patientInfoFactory = new PatientInfoFactory(
            "Aidar", "Murat", "1990-01-01", "Patient has a history of hypertension."
        );
        Client patientInfoClient = new Client(patientInfoFactory);
        MedicalDocument patientInfoDocument = patientInfoClient.getDocument();
        System.out.println(patientInfoDocument.generateForm());

        DocumentFactory labReportFactory = new LabReportFactory(
            "Aidar", "Murat", "Blood Sample", "All results are within normal ranges."
        );
        Client labReportClient = new Client(labReportFactory);
        MedicalDocument labReportDocument = labReportClient.getDocument();
        System.out.println(labReportDocument.generateForm());
        labReportDocument.putStamp();
    }
}
