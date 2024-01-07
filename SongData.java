public class SongData {

    // using private variables to store song data and improve code quality
    private String songTitle;
    private String artistName;
    private int streamCount;
    private String genre;

    // using a parameterised constructor for intialization of SongData and the variables
    public SongData(String songTitle, String artistName, int streamCount, String genre) {
        this.songTitle = songTitle;
        this.artistName = artistName;
        this.streamCount = streamCount;
        this.genre = genre;
    }
    
    /* using a series of getter methods to return variables 
    so they can be accessed as the variables are private */
    public String getsongTitle() {
        return songTitle; //using the get method to return the song title variable
    }

    public String getartistName() {
        return artistName; //using the get method to return the artist name variable
    }

    public int getstreamCount() {
        return streamCount; //using the get method to return the stream count variable
    }
    public String getgenre() {
        return genre; //using the get method to return the genre variable
    }

    /* using a series of setter methods to set variables by assigning parameters
    so they can be accessed as the variables in this class are private */  
    public void setsongTitle(String songTitle) {
        this.songTitle = songTitle; // Assigning the parameter to the variable song title using set method 
    }

    public void setartistName(String artistName) { 
        this.artistName = artistName; // Assigning the parameter to the variable artist name using set method 
    }

    public void setstreamCount(int streamCount) {
        this.streamCount = streamCount; // Assigning the parameter to the variable stream count using set method 
    }

    public void setgenre(String genre) {
        this.genre = genre; // Assigning the parameter to the variable genre using set method 
    }
}