/**
 * 
 */
package prj5;

import java.io.File;
import java.util.Scanner;
import prj5.Person.*;
import java.util.Arrays;

/**
 * @author <Nanlin Sun> <nannie>
 * @version 2017/04/18
 */
public class Container
{
    private SongList listOfSongs;
    private LinkedList<Person> listOfPeople;
    private Scanner scan;
    private File songfile;
    private File personfile;


    /**
     * Default constructor for container
     */
    public Container()
    {
        listOfSongs = new SongList();
        listOfPeople = new LinkedList<Person>();
        scan = new Scanner("");
        songfile = new File("SongList.csv");
        personfile = new File("MusicSurveyData");
    }


    /**
     * 
     * @return SongList
     */
    public SongList getSongList()
    {
        return listOfSongs;
    }


    /**
     * 
     * @return SongList
     */
    public LinkedList<Person> getPersonList()
    {
        return listOfPeople;
    }


    /**
     * default scanning song file
     */
    public void scanSong()
    {
        scanSong("SongList.csv");
    }


    /**
     * default scanSong()
     * 
     * @param input
     *            the name of the songs data file
     */
    public void scanSong(String input)
    {
        songfile = new File(input);
        try
        {
            scan = new Scanner(songfile);
        }
        catch (Exception e)
        {
            System.out.println("FileExistanceError. Check the file"
                + " name and address of your songfile");
        }

        // clear list before scanning
        listOfSongs.clear();
        // start from the second line to read data
        scan.nextLine();

        while (scan.hasNext())
        {
            String str = scan.nextLine();
            String[] songInfo = str.split(",");
            listOfSongs.add(new Song(songInfo[0], songInfo[1], Integer.valueOf(
                songInfo[2]), songInfo[3]));
        }
    }


    /**
     * default scanning People file
     */
    public void scanPerson()
    {
        scanPerson("MusicSurveyData.csv");
    }


    /**
     * default scanPerson()
     * 
     * @param input
     *            the name of the person data file
     */
    public void scanPerson(String input)
    {
        personfile = new File(input);
        try
        {
            scan = new Scanner(personfile);
        }
        catch (Exception e)
        {
            System.out.println("FileExistanceError. Check the file"
                + " name and address of your personfile");
        }
        // clear list before scanning
        listOfPeople.clear();
        // start from the second line to read data
        scan.nextLine();

        while (scan.hasNext())
        {
            String str = scan.nextLine();
            String[] p = str.split(",", -1);
            // int major = -1;
            // int region = -1;
            int hobby = -1;
            MajorEnum a = Person.MajorEnum.NONE;
            RegionEnum b = Person.RegionEnum.NONE;
            HobbyEnum c = Person.HobbyEnum.NONE;

            if (p[2].equals("Computer Science"))
            {
                a = Person.MajorEnum.CS;
                // major = 0;
            }
            else if (p[2].equals("Math or CMDA"))
            {
                a = Person.MajorEnum.MC;
                // major = 1;
            }
            else if (p[2].equals("Other Engineering"))
            {
                a = Person.MajorEnum.OE;
                // major = 2;
            }
            else if (p[2].equals("Other"))
            {
                a = Person.MajorEnum.O;
                // major = 3;
            }
            else
            {
                a = Person.MajorEnum.NONE;
                // major = -1;
            }

            if (p[3].equals("Southeast"))
            {
                b = Person.RegionEnum.SE;
                // region = 0;
            }
            else if (p[3].equals("Northeast"))
            {
                b = Person.RegionEnum.NE;
                // region = 1;
            }
            else if (p[3].equals(
                "United States (other than Southeast or Northwest)"))
            {
                b = Person.RegionEnum.US;
                // region = 2;
            }
            else if (p[3].equals("Outside of United States"))
            {
                b = Person.RegionEnum.OUS;
                // region = 3;
            }
            else
            {
                b = Person.RegionEnum.NONE;
                // region = -1;
            }

            if (p[4].equals("reading"))
            {
                c = Person.HobbyEnum.READING;
                hobby = 0;
                // listOfSongs.getTHobby(0, 1);
            }
            else if (p[4].equals("art"))
            {
                c = Person.HobbyEnum.ART;
                hobby = 1;
                // listOfSongs.getTHobby(3, 1);
            }
            else if (p[4].equals("sports"))
            {
                c = Person.HobbyEnum.SPORT;
                hobby = 2;
                // listOfSongs.getTHobby(1, 1);
            }
            else if (p[4].equals("music"))
            {
                c = Person.HobbyEnum.MUSIC;
                hobby = 3;
                // listOfSongs.getTHobby(2, 1);
            }

            else
            {
                c = Person.HobbyEnum.NONE;
                hobby = -1;
            }

            Person boy = new Person(a, b, c);
            boy.setChoice(Arrays.copyOfRange(p, 5, p.length));
            listOfPeople.add(boy);

            if (hobby == -1)
            {
                continue;
            }

            for (int i = 0; i < listOfSongs.size(); i++)
            {
                Song currentSong = listOfSongs.get(i);
                String[] anwser = boy.getChoice();
                // deal with Heard Data
                if (anwser[2 * i].toLowerCase().contains("yes"))
                {
                    currentSong.getHeardHobby(hobby, 1);
                }
                // deal with Liked Data
                if (anwser[2 * i + 1].toLowerCase().contains("yes"))
                {
                    currentSong.getLikedHobby(hobby, 1);
                }
                // deal with Heard Data (total)
                if (anwser[2 * i].toLowerCase().contains("yes") || anwser[2 * i]
                    .toLowerCase().contains("no"))
                {
                    currentSong.getTHeardHobby(hobby, 1);
                }
                // deal with Like Data (total)
                if (anwser[2 * i + 1].toLowerCase().contains("yes") || anwser[2
                    * i + 1].toLowerCase().contains("no"))
                {
                    currentSong.getTLikedHobby(hobby, 1);
                }
            }
        }

    }


    /**
     * 
     */
    public void sortByTitle()
    {
        SongList list = listOfSongs;
        for (int i = 1; i < list.size(); i++)
        {
            int j = i;
            Song tmp;
            while (j > 0 && ((Song)list.get(j - 1)).getTitle().compareTo(
                ((Song)list.get(j)).getTitle()) > 0)
            {
                tmp = (Song)list.get(j);
                list.remove(j);
                list.add(j - 1, tmp);
                j = j - 1;
            }
        }
    }


    /**
     * 
     */
    public void sortByArtist()
    {
        SongList list = listOfSongs;
        for (int i = 1; i < list.size(); i++)
        {
            int j = i;
            Song tmp;
            while (j > 0 && ((Song)list.get(j - 1)).getArtist().compareTo(
                ((Song)list.get(j)).getArtist()) > 0)
            {
                tmp = (Song)list.get(j);
                list.remove(j);
                list.add(j - 1, tmp);
                j = j - 1;
            }
        }
    }


    /**
     * 
     */
    public void sortByGenre()
    {
        SongList list = listOfSongs;
        for (int i = 1; i < list.size(); i++)
        {
            int j = i;
            Song tmp;
            while (j > 0 && ((Song)list.get(j - 1)).getGenre().compareTo(
                ((Song)list.get(j)).getGenre()) > 0)
            {
                tmp = (Song)list.get(j);
                list.remove(j);
                list.add(j - 1, tmp);
                j = j - 1;
            }
        }
    }


    /**
     * 
     */
    public void sortByDate()
    {
        SongList list = listOfSongs;
        for (int i = 1; i < list.size(); i++)
        {
            int j = i;
            Song tmp;
            while (j > 0 && ((Song)list.get(j - 1)).getDate() - ((Song)list.get(
                j)).getDate() > 0)
            {
                tmp = (Song)list.get(j);
                list.remove(j);
                list.add(j - 1, tmp);
                j = j - 1;
            }
        }
    }

}
