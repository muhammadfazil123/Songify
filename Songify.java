import java.util.ArrayList;
import java.util.Scanner;

public class Songify {

    private ArrayList<SongData> songifyDatas = new ArrayList<SongData>();
    
    public Songify() {

        songifyDatas.add(new SongData("Shippuden", "Blanco", 44000000, "Rap"));
        songifyDatas.add(new SongData("Outside", "D-Block Europe", 267000000 , "Rap"));
        songifyDatas.add(new SongData("Alone With You", "Arz", 177000000, "Rap"));
        songifyDatas.add(new SongData("Savage Anthem", "PARTYNEXTDOOR", 150000000 , "R&B"));
        songifyDatas.add(new SongData("Who Hurt You?", "Daniel Caesar", 762000000, "R&B"));
        songifyDatas.add(new SongData("No Guidance", "Chris Brown", 468000000, "R&B"));
        songifyDatas.add(new SongData("On The Low", "Burna Boy", 365000000, "Afrobeats"));
        songifyDatas.add(new SongData("Soundgasm", "Rema", 670000000 , "Afrobeats"));
        songifyDatas.add(new SongData("Soso", "Omah Lay", 123000000, "Afrobeats"));
        songifyDatas.add(new SongData("Umbrella", "Rihanna", 988000000, "Hip-Hop"));
        songifyDatas.add(new SongData("Only", "Nicki Minaj", 535000000, "Hip-Hop"));
        songifyDatas.add(new SongData("Thang For You", "Rylo Rodrigeuz", 60000000 , "Hip-Hop"));
       
    }

    // Brief: Add a new song to the list of songs
    public void addNewSongData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the title of the song you would like to add?");
        String songTitle = scanner.nextLine();

        System.out.println("What is the artist's name?");
        String artistName = scanner.nextLine();

        System.out.println("What is the stream count of this song?");
        int streamCount = scanner.nextInt();

        System.out.println("What genre does this song belong to?");
        String genre = scanner.nextLine();

        songifyDatas.add(new SongData(songTitle, artistName, streamCount, genre));
    }

    // Brief: Remove a song from the list of songs
    // Brief: Print a list of all the songs stored
    // Brief: Print a list of songs over a given number of plays 
    // Added Feature: Print a list of songs based on genre

}
