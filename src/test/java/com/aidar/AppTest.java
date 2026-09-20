package com.aidar;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.aidar.factorymethod.DoctorAppointment;
import com.aidar.factorymethod.LabReport;
import com.aidar.factorymethod.PatientInfo;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        PatientInfo a = new PatientInfo("Aidar","Murat","2007.02.24", "Tall, Dark Skin, Skinny");
        System.out.println(a.generateForm());

        DoctorAppointment b = new DoctorAppointment("Aidar", "Murat", "Ivan", "Dmitrievich", "2026.05.05");
        System.out.println(b.generateForm());

        LabReport c = new LabReport("Aidar", "Murat", "Blood", "Normal");
        System.out.println(c.generateForm());
    }
}
