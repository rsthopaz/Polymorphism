public class Item
{
    private String title;
    private int playingTime;
    private boolean gotIt;
    private String comment;
    public Item(String theTitle, int time)
    {
        title = theTitle;
        playingTime = time;
        gotIt = false;
        comment = "<no comment>";
    }

    public void setComemnt(String comment)
    {
        this.comment = comment;
    }

    public String getComment ()
    {
        return comment;
    }

    public void setOwn(boolean ownIt)
    {
        gotIt = ownIt;
    }

    public void print()
    {
        System.out.print(title + " (" + playingTime + " mins)");
        if(gotIt){
            System.out.println("*");
        }else{
            System.out.println();
        }
        System.out.println(" " + comment);
    }
}