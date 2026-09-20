package com.aidar;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

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
    }
}
