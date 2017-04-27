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
        c.scanSong("SongList2017S.csv");
        c.scanPerson("MusicSurveyData2017S.csv");
        c.getSongList().toHobby();
        c.getSongList().toRegion();
        c.getSongList().toMajor();
        GUIProjectWindow programWindow = new GUIProjectWindow(c);
    }

}
