/**
 * Project 5
 */
package prj5;

import java.awt.Color;
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

    private Shape upperLeft;
    private Shape upperMiddle;
    private Shape upperRight;
    private Shape left;
    private Shape middle;
    private Shape right;
    private Shape lowerLeft;
    private Shape lowerMiddle;
    private Shape lowerRight;
    private Shape sample;
    private Container con;


    /**
     * @param con
     */
    public ProjectWindow(Container a)
    {
        con = a;
        this.window = new Window();
        window.setTitle("prj 5 - Group 36");
        window.setSize(1000, 800);
        int w = window.getWidth() / 4;
        int h = (window.getHeight() - 100) / 3;
        int w1 = w / 2 - 5 / 2;
        int h1 = 70 + 2 / 3 * h;

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

        upperLeft = new Shape(w1, h1, 5, 40, Color.BLACK);
        upperMiddle = new Shape(w1 + w, h1, 5, 40, Color.BLACK);
        upperRight = new Shape(w1 + 2 * w, h1, 5, 40, Color.BLACK);

        left = new Shape(w1, h1 + h, 5, 40, Color.BLACK);
        middle = new Shape(w1 + w, h1 + h, 5, 40, Color.BLACK);
        right = new Shape(w1 + 2 * w, h1 + h, 5, 40, Color.BLACK);

        lowerLeft = new Shape(w1, h1 + 2 * h, 5, 40, Color.BLACK);
        lowerMiddle = new Shape(w1 + w, h1 + 2 * h, 5, 40, Color.BLACK);
        lowerRight = new Shape(w1 + 2 * w, h1 + 2 * h, 5, 40, Color.BLACK);
        sample = new Shape(908, 567, 5, 40, Color.BLACK);

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

        TextShape title = new TextShape(51, 31, "All These Things I've Done");
        title.setBackgroundColor(Color.WHITE);

        Shape l1 = new Shape(w1, h1, 40, 10, Color.PINK);
        Shape l2 = new Shape(w1, h1 + 10, 60, 10, Color.BLUE);
        Shape l3 = new Shape(w1, h1 + 20, 50, 10, Color.ORANGE);
        Shape l4 = new Shape(w1, h1 + 30, 20, 10, Color.GREEN);

        Shape l5 = new Shape(w1 - 40, h1, 40, 10, Color.PINK);
        Shape l6 = new Shape(w1 - 60, h1 + 10, 60, 10, Color.BLUE);
        Shape l7 = new Shape(w1 - 50, h1 + 20, 50, 10, Color.ORANGE);
        Shape l8 = new Shape(w1 - 20, h1 + 30, 20, 10, Color.GREEN);

        window.addShape(upperLeft);

        window.addShape(l1);
        window.addShape(l2);
        window.addShape(l3);
        window.addShape(l4);
        window.addShape(l5);
        window.addShape(l6);
        window.addShape(l7);
        window.addShape(l8);

        window.addShape(title);
        window.addShape(textHobby);
        window.addShape(textRead);
        window.addShape(textSport);
        window.addShape(textArt);
        window.addShape(textMusic);
        window.addShape(textHeard);
        window.addShape(textLiked);
        window.addShape(upperMiddle);
        window.addShape(upperRight);
        window.addShape(left);
        window.addShape(middle);
        window.addShape(right);
        window.addShape(lowerLeft);
        window.addShape(lowerMiddle);
        window.addShape(lowerRight);
        window.addShape(sample);
        window.addShape(boxLegend2);
        window.addShape(boxLegend);
    }


    /**
     * Prev
     * 
     * @param button Prev
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
