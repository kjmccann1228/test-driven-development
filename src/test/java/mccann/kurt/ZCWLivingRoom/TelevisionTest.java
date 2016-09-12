package mccann.kurt.ZCWLivingRoom;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Created by kurtmccann on 9/10/16.
 */
public class TelevisionTest {
    @Test
    public void getVolumeTest() {
        Television television = new Television();
        Integer expectedValue = 0;
        Integer actualValue = television.getVolume();
        assertEquals("The value should be 0", expectedValue, actualValue);
    }
    @Test
    public void setVolumeTest() {
        Television television = new Television();
        int expectedValue = 5;
        television.setVolume(5);
        int actualValue = television.getVolume();
        assertEquals("The value should be 5", expectedValue, actualValue);
    }
}
