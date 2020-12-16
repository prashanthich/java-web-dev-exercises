package exercises.technology.test;

import exercises.technology.main.SmartPhone;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class SmartPhoneTest {

    SmartPhone smartPhoneObj;
    @Before
    public void createObject(){
         smartPhoneObj = new SmartPhone("Samsung", "S9", 16, 0.3, true);
    }
    @Test
    public void isaPortableReturnsFalse() {
        assertFalse(smartPhoneObj.isPortable());
    }
    @Test
    public void addNoteVerification(){
        smartPhoneObj.addNote("Note1");
        assertEquals("Note1",smartPhoneObj.getNotes().get(0));
    }
    @Test
    public void setMultipleNotes(){
        ArrayList<String> myNotes = new ArrayList<>();
        myNotes.add("Note1");
        myNotes.add("Note2");
        myNotes.add("Note3");
        smartPhoneObj.setNotes(myNotes);
        myNotes.add("Note4");
        assertEquals(4,smartPhoneObj.getNotes().size());
    }

}
