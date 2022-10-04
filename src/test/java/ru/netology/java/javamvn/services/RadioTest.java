package ru.netology.java.javamvn.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

//Test Radio constructor
    @Test
    public void testRadioConstructorEmpty(){
        Radio radio = new Radio();

        assertEquals(10 , radio.getStationCount());
        assertEquals(5 , radio.getStationNumber());
        assertEquals(50 , radio.getVolume());
    }

    @Test
    public void testRadioConstructorCount(){
        Radio radio = new Radio(13);

        assertEquals(13 , radio.getStationCount());
        assertEquals(6 , radio.getStationNumber());
        assertEquals(50 , radio.getVolume());
    }


    // Test set StationNumber
    @Test
    void shouldSetStationNumber() {
        Radio radio = new Radio();

        int actual = 5;
//        radio.setStationNumber(5);
        int expected = radio.getStationNumber();
        assertEquals(actual, expected);
    }

    @Test
    void shouldSetStationNumberMore() {
        Radio radio = new Radio();
//        radio.setStationNumber(5);

        int actual = 5;
        radio.setStationNumber(15);
        int expected = radio.getStationNumber();
        assertEquals(actual, expected);
    }

    @Test
    void shouldSetStationNumberLess() {
        Radio radio = new Radio();
//        radio.setStationNumber(5);

        int actual = 5;
        radio.setStationNumber(-1);
        int expected = radio.getStationNumber();
        assertEquals(actual, expected);
    }


    @Test
    void shouldSetNextStationNumber() {
        Radio radio = new Radio();
//        radio.setStationNumber(5);

        int actual = 6;
        radio.setNextStationNumber();
        int expected = radio.getStationNumber();
        assertEquals(actual, expected);
    }

    @Test
    void shouldSetNextStationNumber9() {
        Radio radio = new Radio();
        radio.setStationNumber(9);

        int actual = 0;
        radio.setNextStationNumber();
        int expected = radio.getStationNumber();
        assertEquals(actual, expected);
    }


    @Test
    void shouldSetPrevStationNumber() {
        Radio radio = new Radio();
//        radio.setStationNumber(5);

        int actual = 4;
        radio.setPrevStationNumber();
        int expected = radio.getStationNumber();
        assertEquals(actual, expected);
    }

    @Test
    void shouldSetPrevStationNumber0() {
        Radio radio = new Radio();
        radio.setStationNumber(0);

        int actual = 9;
        radio.setPrevStationNumber();
        int expected = radio.getStationNumber();
        assertEquals(actual, expected);
    }

// Test set StationNumber

    @Test
    void shouldSetVolume() {
        Radio radio = new Radio();

        int actual = 40;
        radio.setVolume(40);
        int expected = radio.getVolume();
        assertEquals(actual, expected);

    }

    @Test
    void shouldSetVolumeMoreMax() {
        Radio radio = new Radio();
//        radio.setVolume(6);

        int actual = 50;
        radio.setVolume(101);
        int expected = radio.getVolume();
        assertEquals(actual, expected);
    }

    @Test
    void shouldSetVolumeLessMin() {
        Radio radio = new Radio();
//        radio.setVolume(6);

        int actual = 50;
        radio.setVolume(-1);
        int expected = radio.getVolume();
        assertEquals(actual, expected);
    }

    @Test
    void shouldSetMoreVolume() {
        Radio radio = new Radio();
//        radio.setVolume(6);

        int actual = 51;
        radio.setMoreVolume();
        int expected = radio.getVolume();
        assertEquals(actual, expected);

    }

    @Test
    void shouldSetMoreVolume100() {
        Radio radio = new Radio();
        radio.setVolume(100);

        int actual = 100;
        radio.setMoreVolume();
        int expected = radio.getVolume();
        assertEquals(actual, expected);

    }

    @Test
    void shouldSetLessVolume() {
        Radio radio = new Radio();
 //       radio.setVolume(6);

        int actual = 49;
        radio.setLessVolume();
        int expected = radio.getVolume();
        assertEquals(actual, expected);
    }

    @Test
    void shouldSetLessVolume0() {
        Radio radio = new Radio();
        radio.setVolume(0);

        int actual = 0;
        radio.setLessVolume();
        int expected = radio.getVolume();
        assertEquals(actual, expected);
    }

}