public class CD extends Item
{
    private String artist;
    private int numberOfTracks;

    public CD(String theTitle, String theArtist, int tracks, int time)
    {
        super(theTitle, time);
        artist = theArtist;
        numberOfTracks = tracks;
    }

    public int getNumberOfTracks()
    {
        return numberOfTracks;
    }

    public void print()
    {
        super.print();
        System.out.println(" " + artist);
        System.out.println(" tracks: " + numberOfTracks);
    }
}
