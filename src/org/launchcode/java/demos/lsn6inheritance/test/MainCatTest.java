package org.launchcode.java.demos.lsn6inheritance.test;

import org.launchcode.java.demos.lsn6inheritance.main.HouseCat;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class MainCatTest {
    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }
    @Test
    public void inheritsDefaultCatInSecondConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
        assertEquals(13,keyboardCat.getWeight(),.001);
    }
    @Test
    public void isNotInitiallyTired() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
        assertFalse(keyboardCat.isHungry());
        assertFalse(keyboardCat.isTired());
        keyboardCat.eat();
        assertTrue(keyboardCat.isTired());
    }
}
