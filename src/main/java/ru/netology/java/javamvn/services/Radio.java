package ru.netology.java.javamvn.services;

public class Radio {
    private int stationCount = 10;
    private int stationNumber = stationCount / 2;
    private int volume = 50;

    public Radio() {

    }

    public Radio(int count) {
        this.stationCount = count;
        this.stationNumber = stationCount / 2;
    }

    public int getStationCount() {
        return stationCount;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setStationCount(int count) {
        stationCount = count;
    }


    public void setStationNumber(int number) {
        if ((number >= 0) && (number <= stationCount - 1)) {
            stationNumber = number;
        }
    }

    public void setNextStationNumber() {
        if (stationNumber == stationCount - 1) {
            stationNumber = 0;
        } else {
            stationNumber++;
        }
    }

    public void setPrevStationNumber() {
        if (stationNumber == 0) {
            stationNumber = stationCount - 1;
        } else {
            stationNumber--;
        }
    }


    public void setVolume(int vol) {
        if ((vol >= 0) && (vol <= 100)) {
            volume = vol;
        }
    }


    public void setMoreVolume() {
        if (volume < 100) {
            volume++;
        }

    }

    public void setLessVolume() {
        if (volume > 0) {
            volume--;
        }
    }


}
