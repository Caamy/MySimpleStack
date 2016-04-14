package dcll.cber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Camy on 14/04/2016.
 */
public class ItemTest {

    @Test
    public void testGetValue() throws Exception {
        Item item = new Item(new Integer(1));
        assertEquals(1, item.getValue());
    }

    @Test
    public void testSetValue() throws Exception {
        Item item = new Item(new Integer(1));
        assertEquals(1, item.getValue());
        item.setValue(2);
        assertEquals(2, item.getValue());
    }
}