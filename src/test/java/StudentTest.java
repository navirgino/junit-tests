import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    private ArrayList<Object> grades;
    private Student nico;

    @Before
    public void testCreateStudent(){
        Student fer = new Student(1L, "fer");
        Student ryan = null;
        assertNull(ryan);
        assertNotNull(fer);
    }
    @Test
    public void doesThisWork(){
        String expected = "Codeup";
        String actual = "Codeup";
        assertEquals(expected, actual);
    }
    @Test
    public void doesGetIdWork(){
        Student nico = new Student(2L, "nico");
        assertEquals(2, nico.getId());

    }
    @Test
    void doesGetNameWork(){
        Student nico = new Student(2L, "nico");
        assertEquals("nico", nico.getName());
    }
    @Test
    void doesAddGradeWork(){
        Student nico = new Student(2L, "nico");
        nico.addGrade(100);
        assertSame(100, nico.getGrades().get(0));
        nico.addGrade(72);
        assertSame(72, nico.getGrades().get(1));
    }
    @Test
    void doesGetGradeAvgWork(){
        Student nico = new Student(2L, "nico");
        nico.addGrade(100);
        nico.addGrade(50);
        assertEquals((double) ((100 + 50) / 2), nico.getGradeAverage(), 0);
    }

//    @Test
//    void doesUpdateGradeWork(){
//        nico.updateGrade(1, 80);
//        assertEquals((int) nico.grades.get(1), 80);
//    }



}
