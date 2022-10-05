package ru.netology.java.javamvn.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void shouldCreate() {
        Radio radio = new Radio();
    }

    //Test Radio constructor
    @Test
    public void testRadioConstructorEmpty() {
        Radio radio = new Radio();

        assertEquals(10, radio.getStationCount());
        assertEquals(5, radio.getStationNumber());
        assertEquals(50, radio.getVolume());
    }

    @Test
    public void testRadioConstructorCount() {
        Radio radio = new Radio(13, 6, 50);

        assertEquals(13, radio.getStationCount());
        assertEquals(6, radio.getStationNumber());
        assertEquals(50, radio.getVolume());
    }


    // Test setters
    @Test
    void shouldSetStationCount() {
        Radio radio = new Radio();

        radio.setStationCount(18);
        int actual = 18;
        int expected = radio.getStationCount();
        assertEquals(actual, expected);
    }

    @Test
    void shouldSetStationNumber() {
        Radio radio = new Radio();

        radio.setStationNumber(4);
        int actual = 4;
        int expected = radio.getStationNumber();
        assertEquals(actual, expected);
    }

    @Test
    void shouldSetVolume() {
        Radio radio = new Radio();

        int actual = 40;
        radio.setVolume(40);
        int expected = radio.getVolume();
        assertEquals(actual, expected);

    }

}