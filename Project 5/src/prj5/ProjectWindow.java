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

    private ArrayList<TextShape> titlemain;
    private ArrayList<TextShape> titlesecond;
    private ArrayList<Shape> shape;
    private ArrayList<Shape> copyshape;
    private ArrayList<Shape> stick;
    private String sortMode;
    private String representMode;
    private Shape stick1;
    private Shape stick2;
    private Shape stick3;
    private Shape stick4;
    private Shape stick5;
    private Shape stick6;
    private Shape stick7;
    private Shape stick8;
    private Shape stick9;
    private TextShape sampleText1;
    private TextShape sampleText2;
    private TextShape sampleText3;
    private TextShape sampleText4;
    
    private int w;
    private int h;
    private int w1;
    private int h1;
    private int page;


    /**
     * @param con
     */
    @SuppressWarnings("unchecked")
    public ProjectWindow(Container a)
    {
        page = 0;
        con = a;
        this.window = new Window();
        stick = new ArrayList<Shape>();
        shape = new ArrayList<Shape>();
        titlemain = new ArrayList<TextShape>();
        titlesecond = new ArrayList<TextShape>();
        sortMode = "Title";
        representMode = "Hobby";

        /** title **/
        window.setTitle("prj 5 - Group 36");
        window.setSize(1100, 800);
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

        Shape boxLegend = new Shape(840, 450, 206, 200, Color.BLACK);
        Shape boxLegend2 = new Shape(841, 451, 204, 198, Color.WHITE);

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
        Shape sample = new Shape(938, 567, 5, 40, Color.BLACK);

        TextShape textLegend = new TextShape(862, 464, "Hobby Lengend");
        textLegend.setBackgroundColor(Color.WHITE);
         sampleText1 = new TextShape(862, 480, "Read");
        sampleText1.setForegroundColor(Color.PINK);
        sampleText1.setBackgroundColor(Color.WHITE);
         sampleText2 = new TextShape(862, 496, "Art");
        sampleText2.setForegroundColor(Color.BLUE);
        sampleText2.setBackgroundColor(Color.WHITE);
         sampleText3 = new TextShape(862, 512, "Sport");
        sampleText3.setForegroundColor(Color.ORANGE);
        sampleText3.setBackgroundColor(Color.WHITE);
         sampleText4 = new TextShape(862, 528, "Music");
        sampleText4.setForegroundColor(Color.GREEN);
        sampleText4.setBackgroundColor(Color.WHITE);
        TextShape textHeard = new TextShape(883, 580, "Heard");
        textHeard.setBackgroundColor(Color.WHITE);
        TextShape textLiked = new TextShape(960, 580, "Liked");
        textLiked.setBackgroundColor(Color.WHITE);

        for (int i = 0; i < 9; i++)
        {
            int aa = i % 3;
            int b = i / 3;

            Shape l1 = new Shape(w1 + 5 + aa * w, h1 + b * h, 100, 10,
                Color.PINK);
            Shape l2 = new Shape(w1 + 5 + aa * w, h1 + 10 + b * h, 100, 10,
                Color.BLUE);
            Shape l3 = new Shape(w1 + 5 + aa * w, h1 + 20 + b * h, 100, 10,
                Color.ORANGE);
            Shape l4 = new Shape(w1 + 5 + aa * w, h1 + 30 + b * h, 100, 10,
                Color.GREEN);

            Shape r1 = new Shape(w1 - 100 + aa * w, h1 + b * h, 100, 10,
                Color.PINK);
            Shape r2 = new Shape(w1 - 100 + aa * w, h1 + 10 + b * h, 100, 10,
                Color.BLUE);
            Shape r3 = new Shape(w1 - 100 + aa * w, h1 + 20 + b * h, 100, 10,
                Color.ORANGE);
            Shape r4 = new Shape(w1 - 100 + aa * w, h1 + 30 + b * h, 100, 10,
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
            copyshape = (ArrayList<Shape>)shape.clone();

            TextShape titleone = new TextShape(70 + aa * w, 31 + b * h,
                "xxxxxxxxxxxxxx");

            TextShape titletwo = new TextShape(70 + aa * w, 45 + b * h,
                "by yyyyyyyyyy");

            // title.setX(stick1.getX() - title.getWidth() / 2);
            titleone.setBackgroundColor(Color.WHITE);
            titletwo.setBackgroundColor(Color.WHITE);

            window.addShape(titleone);
            titlemain.add(titleone);

            window.addShape(titletwo);
            titlesecond.add(titletwo);
        }

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

        window.addShape(sampleText1);
        window.addShape(sampleText2);
        window.addShape(sampleText3);
        window.addShape(sampleText4);
        window.addShape(textLegend);
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

        if (con.getSongList().isEmpty() || con.getPersonList().isEmpty())
        {
            return;
        }

        // reset stick location
        stick1.moveTo(w1, h1);
        stick2.moveTo(w1 + w, h1);
        stick3.moveTo(w1 + 2 * w, h1);
        stick4.moveTo(w1, h1 + h);
        stick5.moveTo(w1 + w, h1 + h);
        stick6.moveTo(w1 + 2 * w, h1 + h);
        stick7.moveTo(w1, h1 + 2 * h);
        stick8.moveTo(w1 + w, h1 + 2 * h);
        stick9.moveTo(w1 + 2 * w, h1 + 2 * h);

        // set Song titles
        // adjust TextShap location
        // System.out.println(con.getSongList().size());

        // number of songs needed in current page
        int need = Math.min(con.getSongList().size() - page * 9, 9);
        for (int i = 0; i < need; i++)
        {
            if (i >= need)
            {
                continue;
            }
            // change content of title main
            String temp = con.getSongList().get(i + page * 9).getTitle();
            titlemain.get(i).setText(temp);

            // change content of title second
            switch (sortMode)
            {
                case "Title":
                    temp = con.getSongList().get(i + page * 9).getArtist();
                    titlesecond.get(i).setText("by " + temp);
                    break;
                case "Artist":
                    temp = con.getSongList().get(i + page * 9).getArtist();
                    titlesecond.get(i).setText("by " + temp);
                    break;
                case "Date":
                    temp = String.valueOf(con.getSongList().get(i + page * 9)
                        .getDate());
                    titlesecond.get(i).setText("Date : " + temp);
                    break;
                case "Genre":
                    temp = con.getSongList().get(i + page * 9).getGenre();
                    titlesecond.get(i).setText("Genre : " + temp);
                    break;
            }

            // adjust titlemain X
            int newx = stick.get(i).getX() + stick.get(i).getWidth() / 2
                - titlemain.get(i).getWidth() / 2;
            titlemain.get(i).setX(newx);

            // adjust titlesecond X
            newx = stick.get(i).getX() + stick.get(i).getWidth() / 2
                - titlesecond.get(i).getWidth() / 2;
            titlesecond.get(i).setX(newx);

        }

        // set percentage shape bars
        // adjust location

        for (int i = 0; i < shape.size(); i++)
        {
            if (i >= need * 8)
            {
                stick.get(i / 8).move(1000, 0);
                shape.get(i).move(1000, 0);
                titlemain.get(i / 8).move(1000, 0);
                titlesecond.get(i / 8).move(1000, 0);
                continue;
            }
            // #num element in the SongList
            int num = i / 8 + page * 9;

            // 0 for heard, 1 for Liked;
            // T for heard, F for Liked;
            boolean isHeard = (i / 4) % 2 == 1;

            if (isHeard)
            {
                Shape current = shape.get(i);
                window.removeShape(shape.get(i));

                int newwidth = 100;
                switch (representMode)
                {
                    case "Hobby":
                        newwidth = con.getSongList().get(num).getPHeardHobby(i
                            % 4, 0);
                        break;
                    case "Region":
                        newwidth = con.getSongList().get(num).getPHeardRegion(i
                            % 4, 0);
                        break;
                    case "Major":
                        newwidth = con.getSongList().get(num).getPHeardMajor(i
                            % 4, 0);
                        break;
                }

                Color color = current.getBackgroundColor();
                int newY = copyshape.get(i).getY();
                int newx = stick.get(i / 8).getX() - newwidth;
                Shape newshape = new Shape(newx, newY, newwidth, 10, color);
                shape.set(i, newshape);
                window.addShape(shape.get(i));
            }
            else
            {
                Shape current = shape.get(i);
                window.removeShape(shape.get(i));

                int newwidth = 100;
                switch (representMode)
                {
                    case "Hobby":
                        newwidth = con.getSongList().get(num).getPLikedHobby(i
                            % 4, 0);
                        break;
                    case "Region":
                        newwidth = con.getSongList().get(num).getPLikedRegion(i
                            % 4, 0);
                        break;
                    case "Major":
                        newwidth = con.getSongList().get(num).getPLikedMajor(i
                            % 4, 0);
                        break;
                }

                Color color = current.getBackgroundColor();
                int newY = copyshape.get(i).getY();
                int newX = copyshape.get(i).getX();
                // int newx = stick.get(num).getX() - newwidth;
                Shape newshape = new Shape(newX, newY, newwidth, 10, color);
                shape.set(i, newshape);
                window.addShape(shape.get(i));
            }

        }

    }


    /**
     * Previous
     * 
     * @param button clickedNext
     */
    public void clickedNext(Button button)
    {
        page++;
        int num = con.getSongList().size();
        if (page * 9 < num + (9 - num % 9))
        {
            glyph();
        }
        else
        {
            page--;
        }
    }


    /**
     * Next
     * 
     * @param button clickedPrevious
     */
    public void clickedPrevious(Button button)
    {
        page--;
        if (page >= 0)
        {
            glyph();
        }
        else
        {
            page++;
        }
    }


    /**
     * Artist
     * 
     * @param button Artist
     */
    public void clickedArtist(Button button)
    {
        con.sortByArtist();
        page = 0;
        sortMode = "Artist";
        glyph();
    }


    /**
     * Title
     * 
     * @param button Title
     */
    public void clickedTitle(Button button)
    {
        con.sortByTitle();
        page = 0;
        sortMode = "Title";
        glyph();
    }


    /**
     * Date
     * 
     * @param button Date
     */
    public void clickedDate(Button button)
    {
        con.sortByDate();
        page = 0;
        sortMode = "Date";
        glyph();
    }


    /**
     * Genre
     * 
     * @param button Genre
     */
    public void clickedGenre(Button button)
    {
        con.sortByGenre();
        page = 0;
        sortMode = "Genre";
        glyph();
    }


    /**
     * Hobby
     * 
     * @param button Hobby
     */
    public void clickedHobby(Button button)
    {
        representMode = "Hobby";
        sampleText1 .setText("Read");
        sampleText2 .setText("Art");
        sampleText3 .setText("Sport");
        sampleText4 .setText("Music");
        
        glyph();
    }


    /**
     * Major
     * 
     * @param button Major
     */
    public void clickedMajor(Button button)
    {
        representMode = "Major";
        sampleText1 .setText("CS");
        sampleText2 .setText("Math/CMDA");
        sampleText3 .setText("Other Engineering");
        sampleText4 .setText("Other");
        glyph();
    }


    /**
     * Region
     * 
     * @param button Region
     */
    public void clickedRegion(Button button)
    {
        representMode = "Region";
        sampleText1 .setText("Southeast");
        sampleText2 .setText("Northeast");
        sampleText3 .setText("United States");
        sampleText4 .setText("Outside of United States");
        glyph();
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
