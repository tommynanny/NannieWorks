/**
 * Project 5
 */
package prj5;

import java.awt.Color;
import java.util.ArrayList;
import CS2114.Button;
import CS2114.Shape;
import CS2114.TextShape;
import CS2114.Window;
import CS2114.WindowSide;

/**
 * Program Window
 * 
 * @author NANLIN (nannie)
 * @version 2017
 */
public class ProjectWindow
{
    private Window window;
    private Button clickedPrevious;
    private Button clickedNext;
    private Button clickedArtist;
    private Button clickedTitle;
    private Button clickedDate;
    private Button clickedGenre;
    private Button clickedHobby;
    private Button clickedMajor;
    private Button clickedRegion;
    private Button clickedQuit;
    private Container con;

    private ArrayList<TextShape> text;
    private ArrayList<Shape> shape;
    private ArrayList<Shape> stick;
    private Shape stick1;
    private Shape stick2;
    private Shape stick3;
    private Shape stick4;
    private Shape stick5;
    private Shape stick6;
    private Shape stick7;
    private Shape stick8;
    private Shape stick9;

    private int w;
    private int h;
    private int w1;
    private int h1;


    /**
     * @param con
     */
    public ProjectWindow(Container a)
    {
        con = a;
        this.window = new Window();
        stick = new ArrayList<Shape>();
        /** title **/
        window.setTitle("prj 5 - Group 36");
        window.setSize(1000, 800);
        w = window.getWidth() / 4;
        h = (window.getHeight() - 100) / 3;
        w1 = w / 2 - 5 / 2;
        h1 = 70 + 2 / 3 * h;

        /** shapes **/
        clickedPrevious = new Button("¡û Prev");
        clickedNext = new Button("¡ú Next");
        clickedArtist = new Button("Sort by Artist Name");
        clickedTitle = new Button("Sort by Song Title");
        clickedDate = new Button("Sort by Release Year");
        clickedGenre = new Button("Sort by Genre");
        clickedHobby = new Button("Represent Hobby");
        clickedMajor = new Button("Represent Major");
        clickedRegion = new Button("Represent Region");
        clickedQuit = new Button("Quit");

        clickedPrevious.onClick(this, "clickedPrevious");
        clickedNext.onClick(this, "clickedNext");
        clickedArtist.onClick(this, "clickedArtist");
        clickedTitle.onClick(this, "clickedTitle");
        clickedDate.onClick(this, "clickedDate");
        clickedGenre.onClick(this, "clickedGenre");
        clickedHobby.onClick(this, "clickedHobby");
        clickedMajor.onClick(this, "clickedMajor");
        clickedRegion.onClick(this, "clickedRegion");
        clickedQuit.onClick(this, "clickedQuit");

        window.addButton(clickedPrevious, WindowSide.NORTH);
        window.addButton(clickedArtist, WindowSide.NORTH);
        window.addButton(clickedTitle, WindowSide.NORTH);
        window.addButton(clickedDate, WindowSide.NORTH);
        window.addButton(clickedGenre, WindowSide.NORTH);
        window.addButton(clickedNext, WindowSide.NORTH);
        window.addButton(clickedHobby, WindowSide.SOUTH);
        window.addButton(clickedMajor, WindowSide.SOUTH);
        window.addButton(clickedRegion, WindowSide.SOUTH);
        window.addButton(clickedQuit, WindowSide.SOUTH);

        Shape boxLegend = new Shape(840, 450, 140, 200, Color.BLACK);
        Shape boxLegend2 = new Shape(841, 451, 138, 198, Color.WHITE);

        // black sticks
        stick1 = new Shape(w1, h1, 5, 40, Color.BLACK);
        stick2 = new Shape(w1 + w, h1, 5, 40, Color.BLACK);
        stick3 = new Shape(w1 + 2 * w, h1, 5, 40, Color.BLACK);
        stick4 = new Shape(w1, h1 + h, 5, 40, Color.BLACK);
        stick5 = new Shape(w1 + w, h1 + h, 5, 40, Color.BLACK);
        stick6 = new Shape(w1 + 2 * w, h1 + h, 5, 40, Color.BLACK);
        stick7 = new Shape(w1, h1 + 2 * h, 5, 40, Color.BLACK);
        stick8 = new Shape(w1 + w, h1 + 2 * h, 5, 40, Color.BLACK);
        stick9 = new Shape(w1 + 2 * w, h1 + 2 * h, 5, 40, Color.BLACK);
        stick.add(stick1);
        stick.add(stick2);
        stick.add(stick3);
        stick.add(stick4);
        stick.add(stick5);
        stick.add(stick6);
        stick.add(stick7);
        stick.add(stick8);
        stick.add(stick9);

        // legend
        Shape sample = new Shape(908, 567, 5, 40, Color.BLACK);

        TextShape textHobby = new TextShape(862, 464, "Hobby Lengend");
        textHobby.setBackgroundColor(Color.WHITE);
        TextShape textRead = new TextShape(862, 480, "Read");
        textRead.setForegroundColor(Color.PINK);
        textRead.setBackgroundColor(Color.WHITE);
        TextShape textArt = new TextShape(862, 496, "Art");
        textArt.setForegroundColor(Color.BLUE);
        textArt.setBackgroundColor(Color.WHITE);
        TextShape textSport = new TextShape(862, 512, "Sport");
        textSport.setForegroundColor(Color.ORANGE);
        textSport.setBackgroundColor(Color.WHITE);
        TextShape textMusic = new TextShape(862, 528, "Music");
        textMusic.setForegroundColor(Color.GREEN);
        textMusic.setBackgroundColor(Color.WHITE);
        TextShape textHeard = new TextShape(853, 580, "Heard");
        textHeard.setBackgroundColor(Color.WHITE);
        TextShape textLiked = new TextShape(930, 580, "Liked");
        textLiked.setBackgroundColor(Color.WHITE);

        /** glyph **/
        /** initialization **/
        glyph();

        /** add stuff to window **/
        window.addShape(stick1);
        window.addShape(stick2);
        window.addShape(stick3);
        window.addShape(stick4);
        window.addShape(stick5);
        window.addShape(stick6);
        window.addShape(stick7);
        window.addShape(stick8);
        window.addShape(stick9);

        window.addShape(textHobby);
        window.addShape(textRead);
        window.addShape(textSport);
        window.addShape(textArt);
        window.addShape(textMusic);
        window.addShape(textHeard);
        window.addShape(textLiked);
        window.addShape(sample);
        window.addShape(boxLegend2);
        window.addShape(boxLegend);

    }


    /**
     * set glyph()
     */
    public void glyph()
    {
        shape = new ArrayList<Shape>();
        text = new ArrayList<TextShape>();

        for (int i = 0; i < 9; i++)
        {
            int a = i % 3;
            int b = i / 3;

            Shape l1 = new Shape(w1 + 5 + a * w, h1 + b * h, 100, 10,
                Color.PINK);
            Shape l2 = new Shape(w1 + 5 + a * w, h1 + 10 + b * h, 100, 10,
                Color.BLUE);
            Shape l3 = new Shape(w1 + 5 + a * w, h1 + 20 + b * h, 100, 10,
                Color.ORANGE);
            Shape l4 = new Shape(w1 + 5 + a * w, h1 + 30 + b * h, 100, 10,
                Color.GREEN);

            Shape r1 = new Shape(w1 - 100 + a * w, h1 + b * h, 100, 10,
                Color.PINK);
            Shape r2 = new Shape(w1 - 100 + a * w, h1 + 10 + b * h, 100, 10,
                Color.BLUE);
            Shape r3 = new Shape(w1 - 100 + a * w, h1 + 20 + b * h, 100, 10,
                Color.ORANGE);
            Shape r4 = new Shape(w1 - 100 + a * w, h1 + 30 + b * h, 100, 10,
                Color.GREEN);

            window.addShape(l1);
            shape.add(l1);
            window.addShape(l2);
            shape.add(l2);
            window.addShape(l3);
            shape.add(l3);
            window.addShape(l4);
            shape.add(l4);
            window.addShape(r1);
            shape.add(r1);
            window.addShape(r2);
            shape.add(r2);
            window.addShape(r3);
            shape.add(r3);
            window.addShape(r4);
            shape.add(r4);

            TextShape title = new TextShape(70 + a * w, 31 + b * h,
                "xxxxxxxxxxxxxx");
            // title.setX(stick1.getX() - title.getWidth() / 2);
            title.setBackgroundColor(Color.WHITE);

            window.addShape(title);
            text.add(title);
        }

        // set Song names
        // adjust TextShap location
        for (int i = 0; i < 9; i++)
        {
            String temp = con.getSongList().get(i).getTitle();
            text.get(i).setText(temp);
            int newx = stick.get(i).getX() + stick.get(i).getWidth() / 2 - text
                .get(i).getWidth() / 2;
            text.get(i).setX(newx);
        }

        // set percentage shape bars
        // adjust location
        for (int i = 0; i < shape.size(); i++)
        {
            // #num element in the SongList
            int num = i / 9;

            // 0 for heard, 1 for Liked;
            // T for heard, F for Liked;
            boolean heardMod = (i / 4) % 2 == 0;

            int temp = 0;
            if (heardMod)
            {
                temp = con.getSongList().get(num).getPHeardHobby(i % 4, 0);
                shape.get(i)
                int newx = stick.get(i).getX()-shape.get
            }
            else
            {

            }

            shape.get(i).setX(temp);
        }
    }


    /**
     * Previous
     * 
     * @param button Previous
     */
    public void clickedPrevious(Button button)
    {

    }


    /**
     * Next
     * 
     * @param button Next
     */
    public void clickedNext(Button button)
    {

    }


    /**
     * Artist
     * 
     * @param button Artist
     */
    public void clickedArtist(Button button)
    {

    }


    /**
     * Title
     * 
     * @param button Title
     */
    public void clickedTitle(Button button)
    {

    }


    /**
     * Date
     * 
     * @param button Date
     */
    public void clickedDate(Button button)
    {

    }


    /**
     * Genre
     * 
     * @param button Genre
     */
    public void clickedGenre(Button button)
    {

    }


    /**
     * Hobby
     * 
     * @param button Hobby
     */
    public void clickedHobby(Button button)
    {

    }


    /**
     * Major
     * 
     * @param button Major
     */
    public void clickedMajor(Button button)
    {

    }


    /**
     * Region
     * 
     * @param button Region
     */
    public void clickedRegion(Button button)
    {

    }


    /**
     * Quit
     * 
     * @param button Quit
     */
    public void clickedQuit(Button button)
    {
        System.exit(0);
    }
}
