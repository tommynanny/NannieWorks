/**
 * 
 */
package prj5;

import student.TestCase;

/**
 * @author <Nanlin Sun> <nannie>
 * @version 2017/04/20
 */
public class SongTest extends TestCase
{
    private Song song;


    /**
     * 
     */
    public void setUp()
    {
        song = new Song("title", "artist", 1996, "genre");
    }


    /**
     * 
     */
    public void testGetStuff()
    {
        assertEquals("title", song.getTitle());
        assertEquals("artist", song.getArtist());
        assertEquals(1996, song.getDate());
        assertEquals("genre", song.getGenre());
    }


    /**
     * 
     */
    public void testGetMethod()
    {
        assertEquals(0, song.getHeardMajor(0, 0));
        assertEquals(0, song.getHeardMajor(1, 0));
        assertEquals(0, song.getHeardMajor(2, 0));
        assertEquals(0, song.getHeardMajor(3, 0));

        assertEquals(1, song.getHeardMajor(0, 1));
        assertEquals(2, song.getHeardMajor(1, 2));
        assertEquals(3, song.getHeardMajor(2, 3));
        assertEquals(4, song.getHeardMajor(3, 4));

        assertEquals(1, song.getHeardMajor(0, 0));
        assertEquals(2, song.getHeardMajor(1, 0));
        assertEquals(3, song.getHeardMajor(2, 0));
        assertEquals(4, song.getHeardMajor(3, 0));

        assertEquals(0, song.getHeardMajor(0, -1));
        assertEquals(0, song.getHeardMajor(1, -2));
        assertEquals(0, song.getHeardMajor(2, -3));
        assertEquals(0, song.getHeardMajor(3, -4));

        for (int i = 1; i <= 120; i++)
        {
            assertEquals((1 + i) * i / 2, song.getHeardMajor(0, i));
            assertEquals((1 + i) * i / 2, song.getLikedMajor(0, i));
            assertEquals((1 + i) * i / 2, song.getHeardRegion(0, i));
            assertEquals((1 + i) * i / 2, song.getLikedRegion(0, i));
            assertEquals((1 + i) * i / 2, song.getHeardHobby(0, i));
            assertEquals((1 + i) * i / 2, song.getLikedHobby(0, i));
        }

    }


    /**
     * 
     */
    public void testGetMethod2()
    {
        assertEquals(0, song.getTHeardHobby(0, 0));
        assertEquals(0, song.getTHeardHobby(1, 0));
        assertEquals(0, song.getTHeardHobby(2, 0));
        assertEquals(0, song.getTHeardHobby(3, 0));

        assertEquals(1, song.getTHeardHobby(0, 1));
        assertEquals(2, song.getTHeardHobby(1, 2));
        assertEquals(3, song.getTHeardHobby(2, 3));
        assertEquals(4, song.getTHeardHobby(3, 4));

        assertEquals(1, song.getTHeardHobby(0, 0));
        assertEquals(2, song.getTHeardHobby(1, 0));
        assertEquals(3, song.getTHeardHobby(2, 0));
        assertEquals(4, song.getTHeardHobby(3, 0));

        assertEquals(0, song.getTHeardHobby(0, -1));
        assertEquals(0, song.getTHeardHobby(1, -2));
        assertEquals(0, song.getTHeardHobby(2, -3));
        assertEquals(0, song.getTHeardHobby(3, -4));

        for (int i = 1; i <= 120; i++)
        {
            assertEquals((1 + i) * i / 2, song.getTHeardHobby(0, i));
            assertEquals((1 + i) * i / 2, song.getTHeardMajor(0, i));
            assertEquals((1 + i) * i / 2, song.getTHeardRegion(0, i));

            assertEquals((1 + i) * i / 2, song.getTLikedHobby(0, i));
            assertEquals((1 + i) * i / 2, song.getTLikedMajor(0, i));
            assertEquals((1 + i) * i / 2, song.getTLikedRegion(0, i));
        }

    }


    /**
     * 
     */
    public void testGetMethod3()
    {
        assertEquals(0, song.getPHeardHobby(0, 0));
        assertEquals(0, song.getPHeardHobby(1, 0));
        assertEquals(0, song.getPHeardHobby(2, 0));
        assertEquals(0, song.getPHeardHobby(3, 0));

        assertEquals(1, song.getPHeardHobby(0, 1));
        assertEquals(2, song.getPHeardHobby(1, 2));
        assertEquals(3, song.getPHeardHobby(2, 3));
        assertEquals(4, song.getPHeardHobby(3, 4));

        assertEquals(1, song.getPHeardHobby(0, 0));
        assertEquals(2, song.getPHeardHobby(1, 0));
        assertEquals(3, song.getPHeardHobby(2, 0));
        assertEquals(4, song.getPHeardHobby(3, 0));

        assertEquals(0, song.getPHeardHobby(0, -1));
        assertEquals(0, song.getPHeardHobby(1, -2));
        assertEquals(0, song.getPHeardHobby(2, -3));
        assertEquals(0, song.getPHeardHobby(3, -4));

        for (int i = 1; i <= 120; i++)
        {
            assertEquals((1 + i) * i / 2, song.getPHeardHobby(0, i));
            assertEquals((1 + i) * i / 2, song.getPHeardMajor(0, i));
            assertEquals((1 + i) * i / 2, song.getPHeardRegion(0, i));

            assertEquals((1 + i) * i / 2, song.getPLikedHobby(0, i));
            assertEquals((1 + i) * i / 2, song.getPLikedMajor(0, i));
            assertEquals((1 + i) * i / 2, song.getPLikedRegion(0, i));
        }

    }
}
