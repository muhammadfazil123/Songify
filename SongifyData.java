public class SongifyData {

    //private variables to improve code quality
    private String songTitle;
    private String artistName;
    private int streamCount;
    private String genre;

    //constructor
    public SongifyData(String songTitle, String artistName, int streamCount, String genre) {
        this.songTitle = songTitle;
        this.artistName = artistName;
        this.streamCount = streamCount;
        this.genre = genre;
    }
    
    //getter methods
    public String getsongTitle() {
        return songTitle;
    }

    public String getartistName() {
        return artistName;
    }

    public int getstreamCount() {
        return streamCount;
    }
    public String getgenre() {
        return genre;
    }

    //setter methods
    public void setsongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public void setartistName(String artistName) {
        this.artistName = artistName;
    }

    public void setstreamCount(int streamCount) {
        this.streamCount = streamCount;
    }

    public void setgenre(String genre) {
        this.genre = genre;
    }

}