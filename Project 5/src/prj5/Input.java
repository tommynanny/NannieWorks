/**
 * 
 */
package prj5;

/**
 *
 * @author <Nanlin Sun> <nannie>
 * @version 2017/04/19
 */
public class Input
{
    private static Container cc = new Container();


    /**
     * @param args
     */
    public static void main(String[] args)
    {

        cc.scanSong("SongListNoGenreRepeats.csv");
        cc.scanPerson("MusicSurveyDataNoGenreRepeats.csv");

        // cc.sortByGenre();
        System.out.println(cc.getSongList().toString());

        // System.out.println("\n");

        // cc.sortByTitle();
        // System.out.println(cc.getSongList().toString());
    }

}
