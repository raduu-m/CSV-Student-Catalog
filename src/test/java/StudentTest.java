import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void testGettersAndSetters() {
        Student s = new Student();
        s.setNume("Radu");
        s.setPrezenta(10);
        s.setNota(9);
        assertEquals("Radu", s.getNume());
        assertEquals(10, s.getPrezenta());
        assertEquals(9, s.getNota());
    }

    @Test
    public void testComparaCu() {
        Student s1 = new Student();
        s1.setPrezenta(10);
        Student s2 = new Student();
        s2.setPrezenta(9);
        Student s3 = new Student();
        s3.setPrezenta(10);
        assertEquals(1, s1.comparaCu(s2));
        assertEquals(0, s1.comparaCu(s3));
        assertEquals(-1, s2.comparaCu(s3));
    }
}