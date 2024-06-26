package org.example;

public class Radio {
    private int amountStation = 10;
    private int minStation = 0;
    private int maxStation = 9;
    private int minVolume = 0;
    private int maxVolume = 100;

    private int currentStation = minStation;
    private int currentVolume = minVolume;

    public Radio(int amountStation) {
        this.maxStation = amountStation - 1;
        this.amountStation = maxStation;
    }

    public Radio() {
    }

    public int getAmountStation() {
        return amountStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < minStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        int station = currentStation + 1;

        if (station > amountStation) {
            currentStation = minStation;
        } else {
            currentStation = station;
        }

    }

    public void prevStation() {
        int station = currentStation - 1;

        if (station < minStation) {
            currentStation = maxStation;
        } else {
            currentStation = station;
        }

    }

    public void setRandomStation(int newCurrentStation) {
        int station = newCurrentStation;
        setCurrentStation(station);
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setVolumePlusOne() {
        int volume = currentVolume + 1;
        setCurrentVolume(volume);
    }

    public void setVolumeMinusOne() {
        int volume = currentVolume - 1;
        setCurrentVolume(volume);
    }
}
