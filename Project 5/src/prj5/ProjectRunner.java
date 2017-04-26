/**

 * 
 */
package prj5;

/**
 * @author <Nanlin Sun> <nannie>
 * @version 2017/04/20
 */
public class ProjectRunner
{

    /**
     * The main method
     * 
     * @param args parameter
     */
    public static void main(String[] args)
    {
        Container c = new Container();
        c.scanSong("SongListNoGenreRepeats.csv");
        c.scanPerson("MusicSurveyDataNoGenreRepeats.csv");
        c.getSongList().toHobby();
        c.getSongList().toRegion();
        c.getSongList().toMajor();
        ProjectWindow programWindow = new ProjectWindow(c);
    }

}
