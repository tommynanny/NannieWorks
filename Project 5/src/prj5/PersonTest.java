/**
 * 
 */
package prj5;

import student.TestCase;

/**
 * @author <Nanlin Sun> <nannie>
 * @version 2017/04/20
 */
public class PersonTest extends TestCase
{
    private Person p;


    /**
     * 
     */
    public void setUp()
    {
        p = new Person(Person.MajorEnum.CS, Person.RegionEnum.OUS,
            Person.HobbyEnum.ART);
    }


    /**
     * 
     */
    public void testGetStuff()
    {
        assertEquals(Person.MajorEnum.CS, p.getMajor());
        assertEquals(Person.RegionEnum.OUS, p.getRegion());
        assertEquals(Person.HobbyEnum.ART, p.getHobby());
        assertTrue(p.isEmptyChoice());
        assertEquals(0, p.numOfChoice());
        String[] input = new String[]
        { "Yes", "No", "No" };
        p.setChoice(input);
        assertFalse(p.isEmptyChoice());
        assertEquals(3, p.numOfChoice());
        assertEquals("[CS, OUS, ART          ===  Yes  , No   , No   ]", p
            .toString());
    }
}
