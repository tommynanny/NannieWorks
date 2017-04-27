/**
 * 
 */
package prj5;

/**
 * @author <Nanlin Sun> <nannie>
 * @version 2017/04/18
 */
public class Song
{
    private String title;
    private String artist;
    private int date;
    private String genre;
    private int[] numHeardMajor;
    private int[] numLikedMajor;
    private int[] numHeardHobby;
    private int[] numLikedHobby;
    private int[] numHeardRegion;
    private int[] numLikedRegion;

    private int[] tHeardHobby;
    private int[] tHeardRegion;
    private int[] tHeardMajor;
    private int[] tLikedHobby;
    private int[] tLikedRegion;
    private int[] tLikedMajor;

    private int[] perHeardMajor;
    private int[] perLikedMajor;
    private int[] perHeardHobby;
    private int[] perLikedHobby;
    private int[] perHeardRegion;
    private int[] perLikedRegion;


    /**
     * Constructor with 3 variables for the Song class
     * 
     * @param a
     *            : the name of the title;
     * @param b
     *            : the name of the artist;
     * @param c
     *            : the date of the song;
     * @param d
     *            : the name of the genre;
     */
    public Song(String a, String b, int c, String d)
    {
        title = a;
        artist = b;
        date = c;
        genre = d;

        /* empty all the counter field */
        numHeardMajor = new int[4];
        numLikedMajor = new int[4];
        numHeardHobby = new int[4];
        numLikedHobby = new int[4];
        numHeardRegion = new int[4];
        numLikedRegion = new int[4];

        tHeardHobby = new int[4];
        tHeardRegion = new int[4];
        tHeardMajor = new int[4];

        tLikedHobby = new int[4];
        tLikedRegion = new int[4];
        tLikedMajor = new int[4];

        perHeardMajor = new int[4];
        perLikedMajor = new int[4];
        perHeardHobby = new int[4];
        perLikedHobby = new int[4];
        perHeardRegion = new int[4];
        perLikedRegion = new int[4];
    }


    /**
     * getTitle()
     * 
     * @return (String) the title of current song object.
     */
    public String getTitle()
    {
        return title;
    }


    /**
     * getArtist()
     * 
     * @return (String) the artist of current song object.
     */
    public String getArtist()
    {
        return artist;
    }


    /**
     * getDate()
     * 
     * @return (int) the date of current song object.
     */
    public int getDate()
    {
        return date;
    }


    /**
     * getGenre()
     * 
     * @return (String) the genre of current song object.
     */
    public String getGenre()
    {
        return genre;
    }


    /**
     * getHeardMajor()
     * 
     * @param a sub order
     * @param x
     *            the number add to the original variable
     * @return (int) the number of current variable
     */
    public int getHeardMajor(int a, int x)
    {
        numHeardMajor[a] = numHeardMajor[a] + x;
        return numHeardMajor[a];
    }


    /**
     * getLikedMajor()
     * 
     * @param a sub order
     * @param x
     *            the number add to the original variable
     * @return (int) the number of current variable
     */
    public int getLikedMajor(int a, int x)
    {
        numLikedMajor[a] = numLikedMajor[a] + x;
        return numLikedMajor[a];
    }


    /**
     * getHeardHobby()
     * 
     * @param a sub order
     * @param x
     *            the number add to the original variable
     * @return (int) the number of current variable
     */
    public int getHeardHobby(int a, int x)
    {
        numHeardHobby[a] = numHeardHobby[a] + x;
        return numHeardHobby[a];
    }


    /**
     * getLikedHobby()
     * 
     * @param a sub order
     * @param x
     *            the number add to the original variable
     * @return (int) the number of current variable
     */
    public int getLikedHobby(int a, int x)
    {
        numLikedHobby[a] = numLikedHobby[a] + x;
        return numLikedHobby[a];
    }


    /**
     * getHeardRegion()
     * 
     * @param a sub order
     * @param x
     *            the number add to the original variable
     * @return (int) the number of current variable
     */
    public int getHeardRegion(int a, int x)
    {
        numHeardRegion[a] = numHeardRegion[a] + x;
        return numHeardRegion[a];
    }


    /**
     * getLikedRegion()
     * 
     * @param a sub order
     * @param x
     *            the number add to the original variable
     * @return (int) the number of current variable
     */
    public int getLikedRegion(int a, int x)
    {
        numLikedRegion[a] = numLikedRegion[a] + x;
        return numLikedRegion[a];
    }


    /**
     * getTHobby()
     * 
     * @param a sub order
     * @param x
     *            the number add to the original variable
     * @return (int) the number of current variable
     */
    public int getTHeardHobby(int a, int x)
    {
        tHeardHobby[a] = tHeardHobby[a] + x;
        return tHeardHobby[a];
    }


    /**
     * getTMajor()
     * 
     * @param a sub order
     * @param x
     *            the number add to the original variable
     * @return (int) the number of current variable
     */
    public int getTHeardMajor(int a, int x)
    {
        tHeardMajor[a] = tHeardMajor[a] + x;
        return tHeardMajor[a];
    }


    /**
     * getTRegion()
     * 
     * @param a sub order
     * @param x
     *            the number add to the original variable
     * @return (int) the number of current variable
     */
    public int getTHeardRegion(int a, int x)
    {
        tHeardRegion[a] = tHeardRegion[a] + x;
        return tHeardRegion[a];
    }


    /**
     * getTHobby()
     * 
     * @param a sub order
     * @param x
     *            the number add to the original variable
     * @return (int) the number of current variable
     */
    public int getTLikedHobby(int a, int x)
    {
        tLikedHobby[a] = tLikedHobby[a] + x;
        return tLikedHobby[a];
    }


    /**
     * getTMajor()
     * 
     * @param a sub order
     * @param x
     *            the number add to the original variable
     * @return (int) the number of current variable
     */
    public int getTLikedMajor(int a, int x)
    {
        tLikedMajor[a] = tLikedMajor[a] + x;
        return tLikedMajor[a];
    }


    /**
     * getTRegion()
     * 
     * @param a sub order
     * @param x
     *            the number add to the original variable
     * @return (int) the number of current variable
     */
    public int getTLikedRegion(int a, int x)
    {
        tLikedRegion[a] = tLikedRegion[a] + x;
        return tLikedRegion[a];
    }


    /**
     * getPHeardMajor()
     * 
     * @param a sub order
     * @param x
     *            the perber add to the original variable
     * @return (int) the perber of current variable
     */
    public int getPHeardMajor(int a, int x)
    {
        perHeardMajor[a] = perHeardMajor[a] + x;
        return perHeardMajor[a];
    }


    /**
     * getPLikedMajor()
     * 
     * @param a sub order
     * @param x
     *            the perber add to the original variable
     * @return (int) the perber of current variable
     */
    public int getPLikedMajor(int a, int x)
    {
        perLikedMajor[a] = perLikedMajor[a] + x;
        return perLikedMajor[a];
    }


    /**
     * getPHeardHobby()
     * 
     * @param a sub order
     * @param x
     *            the perber add to the original variable
     * @return (int) the perber of current variable
     */
    public int getPHeardHobby(int a, int x)
    {
        perHeardHobby[a] = perHeardHobby[a] + x;
        return perHeardHobby[a];
    }


    /**
     * getPLikedHobby()
     * 
     * @param a sub order
     * @param x
     *            the perber add to the original variable
     * @return (int) the perber of current variable
     */
    public int getPLikedHobby(int a, int x)
    {
        perLikedHobby[a] = perLikedHobby[a] + x;
        return perLikedHobby[a];
    }


    /**
     * getPHeardRegion()
     * 
     * @param a sub order
     * @param x
     *            the perber add to the original variable
     * @return (int) the perber of current variable
     */
    public int getPHeardRegion(int a, int x)
    {
        perHeardRegion[a] = perHeardRegion[a] + x;
        return perHeardRegion[a];
    }


    /**
     * getPLikedRegion()
     * 
     * @param a sub order
     * @param x
     *            the perber add to the original variable
     * @return (int) the perber of current variable
     */
    public int getPLikedRegion(int a, int x)
    {
        perLikedRegion[a] = perLikedRegion[a] + x;
        return perLikedRegion[a];
    }

}
