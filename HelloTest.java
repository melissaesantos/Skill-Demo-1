//import jUnit testing
import static org.junit.Assert.*;import org.junit.*;
public class HelloTest{
    //add tester
    @Test
    public void subtract(){
        assertEquals(5, Hello.subtract(10,5));
    }
}