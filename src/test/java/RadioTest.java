import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();


    @Test

    public void shouldSetOverLimitStation() {

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetUnderLimitStation() {

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetStationInLimit() {

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetStationInNext() {
        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);

    }

    @Test

    public void shouldSetStationInPrev() {
        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test

    public void shouldSetOverLimitVolume() {

        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual );
    }

    @Test

    public void shouldSetUnderLimitVolume() {

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual );
    }

    @Test

    public void shouldSetInLimitVolume() {

        radio.setCurrentVolume(6);

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual );
    }

    @Test

    public void shouldSetVolumePlusOneBorder() {

        radio.setCurrentVolume(10);
        radio.setVolumePlusOne();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual );
    }

    @Test

    public void shouldSetVolumePlusOne() {

        radio.setCurrentVolume(5);
        radio.setVolumePlusOne();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual );
    }

    @Test

    public void shouldSetVolumeMinusOneBorder() {

        radio.setCurrentVolume(0);
        radio.setVolumeMinusOne();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual );
    }

    @Test

    public void shouldSetVolumeMinusOne() {

        radio.setCurrentVolume(5);
        radio.setVolumeMinusOne();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual );
    }



}