package com.rgfp.psd.logbook.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NoteTest {

    @Test
    public void valorVacio() {

        // Arrange
        Note n = new Note();
        n.setContent("");

        // Act
        String result = n.getSummary();

        // Assert
        assertEquals("", result);
    }
    @Test
    public void valorLargoMenor() {

        // Arrange
        Note n = new Note();
        n.setContent("12345");

        // Act
        String result = n.getSummary();

        // Assert
        assertEquals("12345", result);
    }
    @Test
    public void valorLargoMayor() {

        // Arrange
        Note n = new Note();
        n.setContent("12345678901");

        // Act
        String result = n.getSummary();

        // Assert
        assertEquals("1234567890", result);
    }

}