/**
 * 
 */
package prj5;

import student.TestCase;

/**
 * @author <Nanlin Sun> <nannie>
 * @version 2017/04/19
 */
public class ContainerTest extends TestCase
{
    private Container c;


    /**
     * default setup()
     */
    public void setUp()
    {
        c = new Container();
    }


    /**
     * 
     */
    public void testGetSongList()
    {
        c.scanSong("SongListTest1.csv");
        assertEquals(5, c.getSongList().size());
        assertEquals("American Pie", c.getSongList().get(2).getTitle());
        assertEquals("Don McLean", c.getSongList().get(2).getArtist());
        assertEquals(1971, c.getSongList().get(2).getDate());
        assertEquals("folk rock", c.getSongList().get(2).getGenre());
    }


    /**
     * testScanSongs()
     */
    public void testScanSongs()
    {
        assertTrue(c.getSongList().isEmpty());
        c.scanSong();
        assertFalse(c.getSongList().isEmpty());
        assertEquals(59, c.getSongList().size());
        Exception ee = null;
        try
        {
            c.scanSong("2");
        }
        catch (Exception e)
        {
            ee = e;
        }
        assertTrue(ee instanceof Exception);
    }


    /**
     * testScanSongs()
     */
    public void testScanPerson()
    {
        assertTrue(c.getPersonList().isEmpty());
        c.scanPerson();
        assertFalse(c.getPersonList().isEmpty());
        assertEquals(209, c.getPersonList().size());
        assertEquals(59 * 2, c.getPersonList().get(0).getChoice().length);
        Exception ee = null;
        try
        {
            c.scanPerson("2");
        }
        catch (Exception e)
        {
            ee = e;
        }
        assertTrue(ee instanceof Exception);
    }


    /**
     * test sort()
     */
    public void testSortByTitle()
    {
        //c.scanSong("SongListNoGenreRepeats.csv");
        //c.scanPerson("MusicSurveyDataNoGenreRepeats.csv");
        c.getSongList().add(new Song("zzz","nanlin",1996,"none"));
        c.getSongList().add(new Song("yyz","nanlin",1996,"none"));
        c.getSongList().add(new Song("yya","nanlin",1996,"none"));
        c.getSongList().add(new Song("aaa","nanlin",1996,"none"));
        c.sortByTitle();
        for (int i = 0; i < c.getSongList().size() - 1; i++)
        {
            assertTrue(c.getSongList().get(i).getTitle().compareTo(c
                .getSongList().get(i + 1).getTitle()) <= 0);
        }
    }


    /**
     * test sort()
     */
    public void testSortByArtist()
    {
        c.scanSong();
        c.scanPerson();
        c.sortByArtist();
        for (int i = 0; i < c.getSongList().size() - 1; i++)
        {
            assertTrue(c.getSongList().get(i).getArtist().compareTo(c
                .getSongList().get(i + 1).getArtist()) <= 0);
        }

    }


    /**
     * test sort()
     */
    public void testSortByDate()
    {
        c.scanSong();
        c.scanPerson();
        c.sortByDate();
        for (int i = 0; i < c.getSongList().size() - 1; i++)
        {
            assertTrue(c.getSongList().get(i).getDate() - c.getSongList().get(i
                + 1).getDate() <= 0);
        }
    }


    /**
     * test sort()
     */
    public void testSortByGenre()
    {
        c.scanSong("SongListNoGenreRepeats.csv");
        c.scanPerson();
        c.sortByGenre();
        for (int i = 0; i < c.getSongList().size() - 1; i++)
        {
            assertTrue(c.getSongList().get(i).getGenre().compareTo(c
                .getSongList().get(i + 1).getGenre()) <= 0);
        }
        // System.out.println(c.getSongList().getTHobby(0, 0));
        // System.out.println(c.getSongList().getTHobby(1, 0));
        // System.out.println(c.getSongList().getTHobby(2, 0));
        // System.out.println(c.getSongList().getTHobby(3, 0));
        // System.out.println(c.getSongList().toString());
    }


    /**
     * testScanSongs()
     */
    public void testScanSongs2()
    {
        assertTrue(c.getSongList().isEmpty());
        c.scanSong("SongListTest1.csv");
        assertFalse(c.getSongList().isEmpty());
        assertEquals(5, c.getSongList().size());

        assertEquals("All These Things I've Done", c.getSongList().get(0)
            .getTitle());
        assertEquals("The Killers", c.getSongList().get(0).getArtist());
        assertEquals(2005, c.getSongList().get(0).getDate());
        assertEquals("alternative", c.getSongList().get(0).getGenre());

        assertEquals("All You Need Is Love", c.getSongList().get(1).getTitle());
        assertEquals("The Beatles", c.getSongList().get(1).getArtist());
        assertEquals(1967, c.getSongList().get(1).getDate());
        assertEquals("pop rock", c.getSongList().get(1).getGenre());

        assertEquals("American Pie", c.getSongList().get(2).getTitle());
        assertEquals("Don McLean", c.getSongList().get(2).getArtist());
        assertEquals(1971, c.getSongList().get(2).getDate());
        assertEquals("folk rock", c.getSongList().get(2).getGenre());

        assertEquals("Anarchy in the UK", c.getSongList().get(3).getTitle());
        assertEquals("The Sex Pistols", c.getSongList().get(3).getArtist());
        assertEquals(1976, c.getSongList().get(3).getDate());
        assertEquals("punk", c.getSongList().get(3).getGenre());

        assertEquals("Another One Bites the Dust", c.getSongList().get(4)
            .getTitle());
        assertEquals("Queen", c.getSongList().get(4).getArtist());
        assertEquals(1980, c.getSongList().get(4).getDate());
        assertEquals("disco", c.getSongList().get(4).getGenre());
    }


    /**
     * testScanSongs()
     */
    public void testScanPerson2()
    {
        assertTrue(c.getPersonList().isEmpty());
        c.scanPerson("MusicSurveyDataTest1.csv");
        assertFalse(c.getPersonList().isEmpty());
        assertEquals(6, c.getPersonList().size());
        assertEquals(10, c.getPersonList().get(0).getChoice().length);
        assertTrue(c.getSongList().isEmpty());
        for (int i = 0; i < c.getPersonList().size(); i++)
        {
            // System.out.println(c.getPersonList().get(i).toString());
        }
    }


    /**
     * 
     */
    public void testScanPerson3()
    {
        c.scanSong("SongListTest1.csv");
        c.scanPerson("MusicSurveyDataTest1.csv");
        assertFalse(c.getSongList().isEmpty());
        assertEquals(5, c.getSongList().size());

        /**
         * overall information
         */
        // 4 people love sports who have heard the first music
        assertEquals(4, c.getSongList().get(1).getTHeardHobby(1, 0));
        // 2 people love sports who like the first music
        assertEquals(2, c.getSongList().get(1).getTLikedHobby(1, 0));

        /*
         * first song
         */
        // 0 people have heard first song also love reading
        assertEquals(0, c.getSongList().get(0).getHeardHobby(0, 0));

        // 0 people love first song also love reading
        assertEquals(0, c.getSongList().get(0).getLikedHobby(0, 0));

        // 2 people have heard first song also love sport
        assertEquals(2, c.getSongList().get(0).getHeardHobby(1, 0));

        // 2 people love first song also love sport
        assertEquals(2, c.getSongList().get(0).getLikedHobby(1, 0));

        // 0 people have heard first song also love music
        assertEquals(0, c.getSongList().get(0).getHeardHobby(2, 0));

        // 0 people love first song also love music
        assertEquals(1, c.getSongList().get(0).getLikedHobby(2, 0));

        // 0 people have heard first song also love art
        assertEquals(0, c.getSongList().get(0).getHeardHobby(3, 0));

        // 0 people love first song also love art
        assertEquals(0, c.getSongList().get(0).getLikedHobby(3, 0));

        /**
         * second song
         */
        // 0 people have heard second song also love reading
        assertEquals(1, c.getSongList().get(1).getHeardHobby(0, 0));

        // 0 people love second song also love reading
        assertEquals(1, c.getSongList().get(1).getLikedHobby(0, 0));

        // 2 people have heard second song also love sport
        assertEquals(4, c.getSongList().get(1).getHeardHobby(1, 0));

        // 2 people love second song also love sport
        assertEquals(1, c.getSongList().get(1).getLikedHobby(1, 0));

        // 0 people have heard second song also love music
        assertEquals(0, c.getSongList().get(1).getHeardHobby(2, 0));

        // 0 people love second song also love music
        assertEquals(1, c.getSongList().get(1).getLikedHobby(0, 0));

        // 0 people have heard second song also love art
        assertEquals(0, c.getSongList().get(1).getHeardHobby(3, 0));

        // 0 people love second song also love art
        assertEquals(0, c.getSongList().get(1).getLikedHobby(3, 0));
    }


    /**
     * 
     */
    public void testReport()
    {
        c.scanSong("SongListTest1.csv");
        c.scanPerson("MusicSurveyDataTest1.csv");
        assertFalse(c.getSongList().isEmpty());
        assertEquals(5, c.getSongList().size());
        assertEquals(6, c.getPersonList().size());
        c.sortByGenre();
        // System.out.println(c.getSongList().report());
    }


    /**
     * 
     */
    public void testReport2()
    {
        c.scanSong("SongListNoGenreRepeats.csv");
        c.scanPerson("MusicSurveyDataNoGenreRepeats.csv");
        assertFalse(c.getSongList().isEmpty());
        assertEquals(17, c.getSongList().size());
        assertEquals(209, c.getPersonList().size());
        c.sortByGenre();
        System.out.println(c.getSongList().report());
        for (int i = 0; i < c.getPersonList().size(); i++)
        {
            // System.out.println(c.getPersonList().get(i).toString());
        }
        // System.out.println("Total number of songs :" +
        // String.valueOf(c.getSongList().size()));
        // System.out.println("Total number of people :" +
        // String.valueOf(c.getPersonList().size()));
    }
}
