package exercises.technology.test;

import exercises.technology.main.Computer;
import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class ComputerTest {
    @Test
    public void addMemory() {
        Computer computerObj = new Computer("Dell", "Abc", 16);
        computerObj.addMemory(8);
        assertEquals(24, computerObj.getMemory());
    }
}
