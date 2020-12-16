package exercises.technology.test;

import exercises.technology.main.Laptop;
import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.*;

public class LaptopTest {
    @Test
    public void isPortableReturnsTrue(){
        Laptop laptopObj = new Laptop("Apple","Pro",8,3,false);
        assertTrue(laptopObj.isPortable());
    }
    @Test
    public void addMemoryShouldNotIncreaseTheMemory(){
        Laptop laptopObj = new Laptop("Apple","Pro",8,3,false);
        laptopObj.addMemory(16);
        assertEquals(8,laptopObj.getMemory());
    }
    @Test
    public void addMemoryShouldIncreaseTheMemory(){
        Laptop laptopObj = new Laptop("Dell","XPS",8,12,true);
        laptopObj.addMemory(16);
        assertEquals(24,laptopObj.getMemory());
    }
    @Test
    public void isPortableReturnsFalse(){
        Laptop laptopObj = new Laptop("Dell","XPS",8,12,true);
        assertFalse(laptopObj.isPortable());
    }
}
