package dcll.cber;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Camy on 14/04/2016.
 */
public class SimpleStackImplTest {

    SimpleStack simpleStack;
    @Before
    public void setUp() throws Exception {
        simpleStack = new SimpleStackImpl();
    }

    @Test
    public void testIsEmpty() throws Exception {
        assertEquals(true, simpleStack.isEmpty());
        String element1 = "Toto";
        simpleStack.push(new Item(element1));
        assertEquals(false,simpleStack.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        assertEquals(0, simpleStack.getSize());
        String element1 = "Toto";
        simpleStack.push(new Item(element1));
        simpleStack.push(new Item(element1+2));
        assertEquals(2, simpleStack.getSize());
    }

    @Test
    public void testPush() throws Exception {
        Item item = new Item(new Integer(8));
        assertEquals(0,simpleStack.getSize());
        simpleStack.push(item);
        assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.peek();
        assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer) o.getValue();
        assertEquals(8, integer.intValue());
        assertEquals(item.getValue(), integer);
    }

    @Test
    public void testPeek() throws Exception {
        Item item = new Item(new Integer(8));
        assertEquals(0,simpleStack.getSize());
        simpleStack.push(item);
        assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.peek();
        assertEquals(1, simpleStack.getSize());
        assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer) o.getValue();
        assertEquals(8, integer.intValue());
        assertEquals(item.getValue(), integer);
    }

    @Test
    public void testPop() throws Exception {
        Item item = new Item(new Integer(8));
        assertEquals(0,simpleStack.getSize());
        simpleStack.push(item);
        assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.pop();
        assertEquals(0, simpleStack.getSize());
        assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer) o.getValue();
        assertEquals(8, integer.intValue());
        assertEquals(item.getValue(), integer);
    }
}