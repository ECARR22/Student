package ie.gmit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class StudentTest {

    private Student student;

    @BeforeEach
    void init(){
    }

    @Test
    void testConstructor() {
        Student s = new Student("Evan", "Evan@gmail.com");
        assertEquals( "Evan", s.getName());
        assertEquals("Evan@gmail.com", s.getEmail());
    }

    @Test
    void testFailure() {
        assertThrows(IllegalArgumentException.class,()-> {new Student("Evan", null);});
    }


    @Test
    void testName() {
        Student s = new Student("Evan", "Evan@gmail.com");
        assertEquals("Evan", s.getName());
    }

    @Test
    void testEmail() {
        Student s = new Student("Evan", "Evan@gmail.com");
        assertEquals("Evan@gmail.com", s.getEmail());
    }

    @Test
    void testSetter() {
        Student s = new Student("", "");
        s.setName("Evan");
        assertEquals("Evan", s.getName());
        s.setEmail("Evan@gmail.com");
        assertEquals("Evan@gmail.com", s.getEmail());
    }



}
