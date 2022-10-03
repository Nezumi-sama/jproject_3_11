package ru.netology.java.javamvn.services;

public class Radio {
    private int stationNumber;
    private int volume;

    public int getStationNumber(){
        return stationNumber;
    }

    public int getVolume(){
        return volume;
    }

    public void setStationNumber(int number){
        if ((number >= 0) && (number <= 9)){
            stationNumber = number;
        }
    }

    public void setNextStationNumber(){
        if (stationNumber == 9) {
            stationNumber = 0;
        }
        else {
            stationNumber++;
        }
    }

    public void setPrevStationNumber(){
        if (stationNumber == 0) {
            stationNumber = 9;
        }
        else {
            stationNumber--;
        }
    }


    public void setVolume(int vol){
        if ((vol >= 0) && (vol <= 10)){
            volume = vol;
        }
    }


    public void setMoreVolume(){
        if (volume < 10) {
            volume++;
        }

    }

    public void setLessVolume(){
        if (volume > 0) {
            volume--;
        }
    }


}
