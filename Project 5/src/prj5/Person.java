/**
 * 
 */
package prj5;

/**
 * @author <Nanlin Sun> <nannie>
 * @version 2017/04/18
 */
public class Person
{
    /**
     * @author <Nanlin Sun> <nannie>
     * @version 2017/04/18
     */
    public enum MajorEnum
    {
        /**
         * ¡°CS¡± stands for ¡°Computer Science¡±
         * ¡°MC¡± stands for ¡°Math or CMDA"
         * ¡°OE¡± stands for ¡°Other Engineering"
         * ¡°O¡± stands for ¡°Other¡±
         */
        CS, MC, OE, O, NONE
    }


    /**
     * @author <Nanlin Sun> <nannie>
     * @version 2017/04/18
     */
    public enum RegionEnum
    {
        /**
         * ¡°SE¡± stands for ¡°Southeast¡±
         * ¡°NE¡± stands for ¡°Northeast¡±
         * ¡°US¡± stands for ¡°United States
         * (other than Southeast or Northwest)¡±
         * ¡°OUS¡± stands for ¡°Outside of United States
         */
        SE, NE, US, OUS, NONE
    }


    /**
     * @author <Nanlin Sun> <nannie>
     * @version 2017/04/18
     */
    public enum HobbyEnum
    {
        /**
         * ¡°READING¡± stands for ¡°Reading¡±
         * ¡°SPORT¡± stands for ¡°Sport¡±
         * ¡°MUSIC¡± stands for ¡°Music¡±
         * ¡°ART¡± stands for ¡°Art¡±
         */
        READING, SPORT, MUSIC, ART, NONE
    }

    private MajorEnum major;
    private RegionEnum region;
    private HobbyEnum hobby;
    private String[] choice;


    /**
     * default constructor
     * 
     * @param a MajorEnum
     * @param b RegionEnum
     * @param c HobbyEnum
     */
    public Person(MajorEnum a, RegionEnum b, HobbyEnum c)
    {
        setMajor(a);
        setRegion(b);
        setHobby(c);
        choice = new String[500];
    }


    /**
     * @return the major
     */
    public MajorEnum getMajor()
    {
        return major;
    }


    /**
     * @param major the major to set
     */
    public void setMajor(MajorEnum major)
    {
        this.major = major;
    }


    /**
     * @return the region
     */
    public RegionEnum getRegion()
    {
        return region;
    }


    /**
     * @param region the region to set
     */
    public void setRegion(RegionEnum region)
    {
        this.region = region;
    }


    /**
     * @return the hobby
     */
    public HobbyEnum getHobby()
    {
        return hobby;
    }


    /**
     * @param hobby the hobby to set
     */
    public void setHobby(HobbyEnum hobby)
    {
        this.hobby = hobby;
    }


    /**
     * @return the choice
     */
    public String[] getChoice()
    {
        return choice;
    }


    /**
     * @param choice the choice to set
     */
    public void setChoice(String[] choice)
    {
        this.choice = choice;
    }


    /**
     * @return if choice is empty
     */
    public int numOfChoice()
    {
        int result = 0;
        for (String every : getChoice())
        {
            if (every != null)
            {
                result++;
            }
        }
        return result;
    }


    /**
     * @return if choice is empty
     */
    public boolean isEmptyChoice()
    {
        return numOfChoice() == 0;
    }


    /**
     * @return return the string
     */
    public String toString()
    {
        StringBuilder c = new StringBuilder();
        c.append("[");
        String info = String.valueOf(this.getMajor()) + ", " + String.valueOf(
            this.getRegion()) + ", " + String.valueOf(this.getHobby());
        info = String.format("%1$-20s", info);
        c.append(info);
        c.append("  ===  ");
        for (int i = 0; i < numOfChoice(); i++)
        {
            String temp2 = getChoice()[i];
            temp2 = String.format("%1$-5s", temp2);
            c.append(temp2);
            if (i != getChoice().length - 1)
            {
                c.append(", ");
            }
        }
        c.append("]");
        return c.toString();
    }
}
