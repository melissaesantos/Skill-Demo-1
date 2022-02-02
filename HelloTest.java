//import jUnit testing
import org.junit.*;
import static org.junit.Assert.*;
public class HelloTest{
    //add tester
    @Test
    public void subtract(){
        assertEquals(5, Hello.subtract(10,2));
    }
}