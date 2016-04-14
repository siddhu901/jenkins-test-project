import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by siddhartha.kakarla on 4/14/16.
 */
public class MainTest {

    @Test
    public void testCreateMessage() throws Exception {
        assertEquals("Hello World!",Main.CreateMessage());
    }
}