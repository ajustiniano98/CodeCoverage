
import Hello.Hello;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class HelloTest {
    private Hello subject;

    @Before
    public void setup() {
        subject = new Hello();
    }

    @Test
    public void testGetMessage() {
       assertEquals("Hello World!", subject.getMessage(false));
    }

   @Test
    public void testGetMessageTrue() {
        assertEquals("Hello Universe!", subject.getMessage(true));
   }
}
