package ru.netology.java.javamvn.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

// Test set StationNumber
    @Test
    void shouldSetStationNumber() {
        Radio radio = new Radio();

        int actual = 5;
        radio.setStationNumber(5);
        int expected = radio.getStationNumber();
        assertEquals(actual, expected);
    }

    @Test
    void shouldSetStationNumberMore() {
        Radio radio = new Radio();
        radio.setStationNumber(5);

        int actual = 5;
        radio.setStationNumber(15);
        int expected = radio.getStationNumber();
        assertEquals(actual, expected);
    }

    @Test
    void shouldSetStationNumberLess() {
        Radio radio = new Radio();
        radio.setStationNumber(5);

        int actual = 5;
        radio.setStationNumber(-1);
        int expected = radio.getStationNumber();
        assertEquals(actual, expected);
    }


    @Test
    void shouldSetNextStationNumber() {
        Radio radio = new Radio();
        radio.setStationNumber(5);

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
        radio.setStationNumber(5);

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

        int actual = 6;
        radio.setVolume(6);
        int expected = radio.getVolume();
        assertEquals(actual, expected);

    }

    @Test
    void shouldSetVolumeMore() {
        Radio radio = new Radio();
        radio.setVolume(6);

        int actual = 6;
        radio.setVolume(11);
        int expected = radio.getVolume();
        assertEquals(actual, expected);
    }

    @Test
    void shouldSetVolumeLess() {
        Radio radio = new Radio();
        radio.setVolume(6);

        int actual = 6;
        radio.setVolume(-1);
        int expected = radio.getVolume();
        assertEquals(actual, expected);
    }

    @Test
    void shouldSetMoreVolume() {
        Radio radio = new Radio();
        radio.setVolume(6);

        int actual = 7;
        radio.setMoreVolume();
        int expected = radio.getVolume();
        assertEquals(actual, expected);

    }

    @Test
    void shouldSetMoreVolume10() {
        Radio radio = new Radio();
        radio.setVolume(10);

        int actual = 10;
        radio.setMoreVolume();
        int expected = radio.getVolume();
        assertEquals(actual, expected);

    }

    @Test
    void shouldSetLessVolume() {
        Radio radio = new Radio();
        radio.setVolume(6);

        int actual = 5;
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