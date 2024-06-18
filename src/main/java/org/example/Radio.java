package org.example;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        int station = currentStation + 1;

        if (station > 9) {
            currentStation = 0;
        } else {
            currentStation = station;
        }

    }

    public void prevStation() {
        int station = currentStation - 1;

        if (station < 0) {
            currentStation = 9;
        } else {
            currentStation = station;
        }

    }

    public void setRandomStation(int newCurrentStation) {
        int station = newCurrentStation;
        setCurrentStation(station);
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            return;
        }
        if (newCurrentVolume < 0) {
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
