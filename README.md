# SDP-Assignment-2

# Abstract Factory

This project demonstrates the Abstract Factory design pattern.

## Idea
A factory interface creates a family of related objects. In this example, `MedicalDocumentFactory` creates both a `Diagnosis` and a `Prescription` for a medical department.

## Main classes
- `MedicalDocumentFactory` - factory interface
- `CardiologyFactory` - creates cardiology-related products
- `PediatricFactory` - creates pediatric-related products
- `Diagnosis` / `Prescription` - product interfaces
- `Client` - uses the factory without depending on concrete classes

## Run
Run the `Main` class from the IDE or using Maven.



# Factory Method

This project demonstrates the Factory Method design pattern.

## Idea
A factory method creates a single type of object while letting subclasses decide which concrete class to produce.

## Main classes
- `DocumentFactory` - base factory interface
- `PatientInfoFactory` - creates patient info documents
- `LabReportFactory` - creates lab reports
- `DoctorAppointmentFactory` - creates appointment documents
- `MedicalDocument` - common document type
- `Client` - uses the factory to get a document

## Run
Run the project from the IDE or compile with Maven and execute the relevant class that creates the documents.