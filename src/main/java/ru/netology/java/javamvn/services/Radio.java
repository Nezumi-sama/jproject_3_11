package ru.netology.java.javamvn.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int stationCount = 10;
    private int stationNumber = stationCount / 2;
    private int volume = 50;

}
