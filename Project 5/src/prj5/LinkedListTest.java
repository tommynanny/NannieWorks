/**
 * 
 */
package prj5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import student.TestCase;

/**
 * @author <Nanlin Sun> <nannie>
 * @version 2017/04/18
 */
public class LinkedListTest extends TestCase
{
    private LinkedList<String> list;


    /**
     * the setUp method
     */
    public void setUp()
    {
        list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
    }


    /**
     * test the size() method
     */
    public void testSize()
    {
        assertEquals(list.size(), 3);
    }


    /**
     * test the add(int index, E obj) method
     */
    public void testAdd()
    {
        list.add(2, "b");
        assertEquals(list.size(), 4);

        Exception exception = null;
        try
        {
            list.add(6, "d");
            fail("add() is not throwing an exception when it should");
        }
        catch (Exception e)
        {
            exception = e;
        }
        assertTrue("add() is throwing the wrong type of exceptions",
            exception instanceof IndexOutOfBoundsException);

        exception = null;
        try
        {
            list.add(-1, "d");
            fail("add() is not throwing an exception when it should");
        }
        catch (Exception e)
        {
            exception = e;
        }
        assertTrue("add() is throwing the wrong type of exceptions",
            exception instanceof IndexOutOfBoundsException);

        exception = null;
        try
        {
            list.add(1, null);
            fail("add() is not throwing an exception when it should");
        }
        catch (Exception e)
        {
            exception = e;
        }
        assertTrue("add() is throwing the wrong type of exceptions",
            exception instanceof IllegalArgumentException);
    }


    /**
     * test add method
     */
    public void testAdd3()
    {
        list.clear();
        list.add(0, "a");
        assertEquals(1, list.size());
    }


    /**
     * test add(E obj) method
     */
    public void testAdd2()
    {
        list.add("b");
        assertEquals(list.size(), 4);

        Exception exception = null;
        try
        {
            list.add(null);
            fail("add() is not throwing an exception when it should");
        }
        catch (Exception e)
        {
            exception = e;
        }
        assertTrue("add() is throwing the wrong type of exceptions",
            exception instanceof IllegalArgumentException);
    }


    /**
     * test isEmpty() method
     */
    public void testIsEmpty()
    {
        assertFalse(list.isEmpty());
    }


    /**
     * test remove(E obj) method
     */
    public void testRemove()
    {
        assertTrue(list.remove("a"));
        assertFalse(list.remove("d"));
        assertTrue(list.remove("c"));
        assertTrue(list.remove("b"));

        list.add("a");
        list.add("b");

        assertTrue(list.remove("b"));

    }


    /**
     * Tests removing from an empty list
     */
    public void testRemoveFromEmpty()
    {
        list = new LinkedList<String>();
        list.add("dance");
        list.add(0, "safety");
        list.clear();
        assertFalse(list.remove("safety"));
        Exception exception;
        exception = null;
        try
        {
            list.remove(0);
        }
        catch (IndexOutOfBoundsException e)
        {
            exception = e;
        }
        assertTrue(exception instanceof IndexOutOfBoundsException);

        LinkedList<String> emptyList = new LinkedList<String>();
        exception = null;
        try
        {
            emptyList.remove(0);
        }
        catch (IndexOutOfBoundsException e)
        {
            exception = e;
        }
        assertTrue(exception instanceof IndexOutOfBoundsException);
    }


    /**
     * Tests removing a object changes the size appropiately and that you can
     * remove the first and last elements
     */
    public void testRemoveObj()
    {
        list = new LinkedList<String>();
        assertFalse(list.remove(null));
        list.add("A");
        list.add("B");
        assertTrue(list.remove("A"));
        assertEquals("B", list.get(0));
        assertEquals(1, list.size());
        list.add("C");
        assertTrue(list.remove("C"));
        assertEquals("B", list.get(0));
    }


    /**
     * Tests that objects can be removed at the beginning and end and that the
     * size is changed
     */
    public void testRemoveIndex()
    {
        list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        assertTrue(list.remove(1));
        assertEquals(1, list.size());
        list.add("B");
        assertTrue(list.remove(0));
        assertEquals(1, list.size());
    }


    /**
     * test remove(int index) method
     */
    public void testRemove2()
    {
        assertTrue(list.remove(1));

        Exception exception = null;
        try
        {
            list.remove(-1);
            fail("remove() is not throwing an exception when it should");
        }
        catch (Exception e)
        {
            exception = e;
        }
        assertTrue("remove() is throwing the wrong type of exceptions",
            exception instanceof IndexOutOfBoundsException);

        exception = null;
        try
        {
            list.remove(6);
            fail("remove() is not throwing an exception when it should");
        }
        catch (Exception e)
        {
            exception = e;
        }
        assertTrue("remove() is throwing the wrong type of exceptions",
            exception instanceof IndexOutOfBoundsException);

        list.clear();

        exception = null;
        try
        {
            list.remove(0);
            fail("remove() is not throwing an exception when it should");
        }
        catch (Exception e)
        {
            exception = e;
        }
        assertTrue("remove() is throwing the wrong type of exceptions",
            exception instanceof IndexOutOfBoundsException);

        list.clear();
        list.add("1");
        assertTrue(list.remove(0));

        list.clear();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        assertTrue(list.remove(0));
        assertTrue(list.remove(0));
        assertTrue(list.remove(0));
        assertTrue(list.remove(0));

        list.clear();
        exception = null;
        try
        {
            list.remove(0);
            fail("remove() is not throwing an exception when it should");
        }
        catch (Exception e)
        {
            exception = e;
        }
        assertTrue("remove() is throwing the wrong type of exceptions",
            exception instanceof IndexOutOfBoundsException);

        list.clear();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        exception = null;
        try
        {
            list.remove(99);
            fail("remove() is not throwing an exception when it should");
        }
        catch (Exception e)
        {
            exception = e;
        }
        assertTrue("remove() is throwing the wrong type of exceptions",
            exception instanceof IndexOutOfBoundsException);

    }


    /**
     * 
     */
    public void testToArray()
    {
        list.clear();
        assertTrue(Arrays.equals(new String[0], list.toArray()));

        list.clear();
        list.add("1");
        assertTrue(Arrays.equals(new String[]
        { "1" }, list.toArray()));

        list.clear();
        list.add("1");
        list.add("3");
        list.add("5");

        assertTrue(Arrays.equals(new String[]
        { "1", "3", "5" }, list.toArray()));
    }


    /**
     * test get(int index) method
     */
    public void testGet()
    {
        assertEquals(list.get(0), "a");

        Exception exception = null;
        try
        {
            list.get(-1);
            fail("get() is not throwing an exception when it should");
        }
        catch (Exception e)
        {
            exception = e;
        }
        assertTrue("get() is throwing the wrong type of exceptions",
            exception instanceof IndexOutOfBoundsException);
    }


    /**
     * test contains(E obj) method
     */
    public void testContains()
    {
        assertTrue(list.contains("b"));
        assertFalse(list.contains("d"));

        list.remove(0);
        assertFalse(list.contains("a"));
    }


    /**
     * test clear() method
     */
    public void testClear()
    {
        list.clear();
        assertEquals(list.size(), 0);
        list.clear();
        assertEquals(list.size(), 0);
    }


    /**
     * test lastIndexOf(E obj) method
     */
    public void testLastIndexOf()
    {
        list.add("a");
        assertEquals(list.lastIndexOf("a"), 3);
    }


    /**
     * test toString() method
     */
    public void testToString()
    {
        String str = "{a, b, c}";
        assertEquals(str.toString(), str);

        str = "{a, b, d, c}";
        list.add(2, "d");
        assertEquals(list.toString(), str);

        str = "{e, a, b, d, c}";
        list.add(0, "e");
        assertEquals(list.toString(), str);

        str = "{a, b, d, c}";
        list.remove(0);
        assertEquals(list.toString(), str);

        str = "{a, b, d}";
        list.remove(3);
        assertEquals(list.toString(), str);

        str = "{a, b}";
        list.remove(2);
        assertEquals(list.toString(), str);

        list.clear();
        assertEquals(list.toString(), "{}");
    }


    /**
     * test Iterator()
     */
    public void testIterator()
    {
        list = new LinkedList<String>();
        String p1 = "1";
        String p2 = "2";
        String p3 = "2";
        String p4 = "2";
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        Iterator<String> pp = list.iterator();

        assertEquals(p1, pp.next());
        assertTrue(pp.hasNext());
        assertEquals(p2, pp.next());
        assertTrue(pp.hasNext());
        assertEquals(p3, pp.next());
        assertTrue(pp.hasNext());
        assertEquals(p4, pp.next());
        assertFalse(pp.hasNext());

        Exception e = null;
        try
        {
            pp.next();
            fail("it should throw an exception");
        }
        catch (Exception ee)
        {
            e = ee;
        }
        assertTrue("it should throw an exception",
            e instanceof NoSuchElementException);
    }
}
