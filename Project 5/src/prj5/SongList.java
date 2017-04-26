package prj5;

import java.util.Iterator;

/**
 * @author <Nanlin Sun> <nannie>
 * @version 2017/04/18
 */
public class SongList extends LinkedList<Song>
{

    /**
     * search song by title
     * 
     * @return true if the song with given title exists in the list
     * @param input title name
     */
    public boolean containsTitle(String input)
    {
        Iterator<Song> p = this.iterator();
        while (p.hasNext())
        {
            if (p.next().getTitle().equals(input))
            {
                return true;
            }
        }
        return false;
    }


    /**
     * @return the string()
     */
    public String toString()
    {
        StringBuilder c = new StringBuilder();
        Iterator<Song> p = this.iterator();
        while (p.hasNext())
        {
            Song s = p.next();
            int temp = 0;
            c.append("Song Title: " + s.getTitle() + "\n");
            c.append("Song Artist: " + s.getArtist() + "\n");
            c.append("Song Genre: " + s.getGenre() + "\n");
            c.append("Song Year: " + String.valueOf(s.getDate()) + "\n");
            c.append("Heard\n");
            /* ========================== */
            c.append("reading:");
            temp = s.getTHeardHobby(0, 0) == 0
                ? 0
                : s.getHeardHobby(0, 0) * 100 / s.getTHeardHobby(0, 0);
            c.append(temp);
            /* ========================== */
            c.append(" art:");
            temp = s.getTHeardHobby(1, 0) == 0
                ? 0
                : s.getHeardHobby(1, 0) * 100 / s.getTHeardHobby(1, 0);
            c.append(temp);
            /* ========================== */
            c.append(" sports:");
            temp = s.getTHeardHobby(2, 0) == 0
                ? 0
                : s.getHeardHobby(2, 0) * 100 / s.getTHeardHobby(2, 0);
            c.append(temp);
            /* ========================== */
            c.append(" music:");
            temp = s.getTHeardHobby(3, 0) == 0
                ? 0
                : s.getHeardHobby(3, 0) * 100 / s.getTHeardHobby(3, 0);
            c.append(temp);
            c.append("\n");

            c.append("Likes\n");
            /* ========================== */
            c.append("reading:");
            temp = s.getTLikedHobby(0, 0) == 0
                ? 0
                : s.getLikedHobby(0, 0) * 100 / s.getTLikedHobby(0, 0);
            c.append(temp);
            /* ========================== */
            c.append(" art:");
            temp = s.getTLikedHobby(1, 0) == 0
                ? 0
                : s.getLikedHobby(1, 0) * 100 / s.getTLikedHobby(1, 0);
            c.append(temp);
            /* ========================== */
            c.append(" sports:");
            temp = s.getTLikedHobby(2, 0) == 0
                ? 0
                : s.getLikedHobby(2, 0) * 100 / s.getTLikedHobby(2, 0);
            c.append(temp);
            /* ========================== */
            c.append(" music:");
            temp = s.getTLikedHobby(3, 0) == 0
                ? 0
                : s.getLikedHobby(3, 0) * 100 / s.getTLikedHobby(3, 0);
            c.append(temp);
            c.append("\n");
            if (p.hasNext())
            {
                c.append("\n");
            }
        }
        return c.toString();
    }


    /**
     * to hobby()
     */
    public void toHobby()
    {
        Iterator<Song> p = this.iterator();
        while (p.hasNext())
        {
            Song s = p.next();
            int temp = 0;
            /* ========================== */
            temp = s.getTHeardHobby(0, 0) == 0
                ? 0
                : s.getHeardHobby(0, 0) * 100 / s.getTHeardHobby(0, 0);
            s.getPHeardHobby(0, temp);
            /* ========================== */
            temp = s.getTHeardHobby(1, 0) == 0
                ? 0
                : s.getHeardHobby(1, 0) * 100 / s.getTHeardHobby(1, 0);
            s.getPHeardHobby(1, temp);
            /* ========================== */
            temp = s.getTHeardHobby(2, 0) == 0
                ? 0
                : s.getHeardHobby(2, 0) * 100 / s.getTHeardHobby(2, 0);
            s.getPHeardHobby(2, temp);
            /* ========================== */
            temp = s.getTHeardHobby(3, 0) == 0
                ? 0
                : s.getHeardHobby(3, 0) * 100 / s.getTHeardHobby(3, 0);
            s.getPHeardHobby(3, temp);
            /* ========================== */
            temp = s.getTLikedHobby(0, 0) == 0
                ? 0
                : s.getLikedHobby(0, 0) * 100 / s.getTLikedHobby(0, 0);
            s.getPLikedHobby(0, temp);
            /* ========================== */
            temp = s.getTLikedHobby(3, 0) == 0
                ? 0
                : s.getLikedHobby(3, 0) * 100 / s.getTLikedHobby(3, 0);
            s.getPLikedHobby(3, temp);
            /* ========================== */
            temp = s.getTLikedHobby(1, 0) == 0
                ? 0
                : s.getLikedHobby(1, 0) * 100 / s.getTLikedHobby(1, 0);
            s.getPLikedHobby(1, temp);
            /* ========================== */
            temp = s.getTLikedHobby(2, 0) == 0
                ? 0
                : s.getLikedHobby(2, 0) * 100 / s.getTLikedHobby(2, 0);
            s.getPLikedHobby(2, temp);
        }
    }


    /**
     * to Region()
     */
    public void toRegion()
    {
        Iterator<Song> p = this.iterator();
        while (p.hasNext())
        {
            Song s = p.next();
            int temp = 0;
            /* ========================== */
            temp = s.getTHeardRegion(0, 0) == 0
                ? 0
                : s.getHeardRegion(0, 0) * 100 / s.getTHeardRegion(0, 0);
            s.getPHeardRegion(0, temp);
            /* ========================== */
            temp = s.getTHeardRegion(3, 0) == 0
                ? 0
                : s.getHeardRegion(3, 0) * 100 / s.getTHeardRegion(3, 0);
            s.getPHeardRegion(3, temp);
            /* ========================== */
            temp = s.getTHeardRegion(1, 0) == 0
                ? 0
                : s.getHeardRegion(1, 0) * 100 / s.getTHeardRegion(1, 0);
            s.getPHeardRegion(1, temp);
            /* ========================== */
            temp = s.getTHeardRegion(2, 0) == 0
                ? 0
                : s.getHeardRegion(2, 0) * 100 / s.getTHeardRegion(2, 0);
            s.getPHeardRegion(2, temp);
            /* ========================== */
            temp = s.getTLikedRegion(0, 0) == 0
                ? 0
                : s.getLikedRegion(0, 0) * 100 / s.getTLikedRegion(0, 0);
            s.getPLikedRegion(0, temp);
            /* ========================== */
            temp = s.getTLikedRegion(3, 0) == 0
                ? 0
                : s.getLikedRegion(3, 0) * 100 / s.getTLikedRegion(3, 0);
            s.getPLikedRegion(3, temp);
            /* ========================== */
            temp = s.getTLikedRegion(1, 0) == 0
                ? 0
                : s.getLikedRegion(1, 0) * 100 / s.getTLikedRegion(1, 0);
            s.getPLikedRegion(1, temp);
            /* ========================== */
            temp = s.getTLikedRegion(2, 0) == 0
                ? 0
                : s.getLikedRegion(2, 0) * 100 / s.getTLikedRegion(2, 0);
            s.getPLikedRegion(2, temp);
        }
    }


    /**
     * to Major()
     */
    public void toMajor()
    {
        Iterator<Song> p = this.iterator();
        while (p.hasNext())
        {
            Song s = p.next();
            int temp = 0;
            /* ========================== */
            temp = s.getTHeardMajor(0, 0) == 0
                ? 0
                : s.getHeardMajor(0, 0) * 100 / s.getTHeardMajor(0, 0);
            s.getPHeardMajor(0, temp);
            /* ========================== */
            temp = s.getTHeardMajor(3, 0) == 0
                ? 0
                : s.getHeardMajor(3, 0) * 100 / s.getTHeardMajor(3, 0);
            s.getPHeardMajor(3, temp);
            /* ========================== */
            temp = s.getTHeardMajor(1, 0) == 0
                ? 0
                : s.getHeardMajor(1, 0) * 100 / s.getTHeardMajor(1, 0);
            s.getPHeardMajor(1, temp);
            /* ========================== */
            temp = s.getTHeardMajor(2, 0) == 0
                ? 0
                : s.getHeardMajor(2, 0) * 100 / s.getTHeardMajor(2, 0);
            s.getPHeardMajor(2, temp);
            /* ========================== */
            temp = s.getTLikedMajor(0, 0) == 0
                ? 0
                : s.getLikedMajor(0, 0) * 100 / s.getTLikedMajor(0, 0);
            s.getPLikedMajor(0, temp);
            /* ========================== */
            temp = s.getTLikedMajor(3, 0) == 0
                ? 0
                : s.getLikedMajor(3, 0) * 100 / s.getTLikedMajor(3, 0);
            s.getPLikedMajor(3, temp);
            /* ========================== */
            temp = s.getTLikedMajor(1, 0) == 0
                ? 0
                : s.getLikedMajor(1, 0) * 100 / s.getTLikedMajor(1, 0);
            s.getPLikedMajor(1, temp);
            /* ========================== */
            temp = s.getTLikedMajor(2, 0) == 0
                ? 0
                : s.getLikedMajor(2, 0) * 100 / s.getTLikedMajor(2, 0);
            s.getPLikedMajor(2, temp);
        }
    }


    /**
     * 
     * @return the report()
     */
    public String report()
    {
        StringBuilder c = new StringBuilder();
        Iterator<Song> p = this.iterator();
        while (p.hasNext())
        {
            Song s = p.next();
            c.append("Song Title: " + s.getTitle() + "\n");
            c.append("Song Artist: " + s.getArtist() + "\n");
            c.append("Song Genre: " + s.getGenre() + "\n");
            c.append("Song Year: " + String.valueOf(s.getDate()) + "\n");
            c.append("Heard\n");
            /* ========================== */
            c.append("reading:");
            c.append(String.valueOf(s.getHeardHobby(0, 0)) + "/" + String
                .valueOf(s.getTHeardHobby(0, 0)));
            /* ========================== */
            c.append(" art:");
            c.append(String.valueOf(s.getHeardHobby(1, 0)) + "/" + String
                .valueOf(s.getTHeardHobby(1, 0)));
            /* ========================== */
            c.append(" sports:");
            c.append(String.valueOf(s.getHeardHobby(2, 0)) + "/" + String
                .valueOf(s.getTHeardHobby(2, 0)));
            /* ========================== */
            c.append(" music:");
            c.append(String.valueOf(s.getHeardHobby(3, 0)) + "/" + String
                .valueOf(s.getTHeardHobby(3, 0)));
            c.append("\n");

            c.append("Likes\n");
            /* ========================== */
            c.append("reading:");
            c.append(String.valueOf(s.getLikedHobby(0, 0)) + "/" + String
                .valueOf(s.getTLikedHobby(0, 0)));
            /* ========================== */
            c.append(" art:");
            c.append(String.valueOf(s.getLikedHobby(1, 0)) + "/" + String
                .valueOf(s.getTLikedHobby(1, 0)));
            /* ========================== */
            c.append(" sports:");
            c.append(String.valueOf(s.getLikedHobby(2, 0)) + "/" + String
                .valueOf(s.getTLikedHobby(2, 0)));
            /* ========================== */
            c.append(" music:");
            c.append(String.valueOf(s.getLikedHobby(3, 0)) + "/" + String
                .valueOf(s.getTLikedHobby(3, 0)));
            c.append("\n");
            if (p.hasNext())
            {
                c.append("\n");
            }
        }
        return c.toString();
    }

}
