public class DVD extends Item {
    private String director;

    public DVD(String theTitle, String theDirector, int time)
    {
        super(theTitle, time);
        director = theDirector;
    }

    public String getDirector(){
        return director;
    }

    public void print()
    {
        super.print();  // Call the print method of the superclass (Item)

        System.out.println(" director: " + director);
    }
}
