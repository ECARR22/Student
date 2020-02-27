package ie.gmit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class StudentListTest {

    private StudentList StudentList;

    @BeforeEach
    void init()
    { }

    @Test
    void testAdd() {
        StudentList sL = new StudentList();
        sL.addStudent();
    }
}
