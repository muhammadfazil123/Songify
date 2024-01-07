import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Songify {

    private ArrayList<SongData> playlistSongs = new ArrayList<SongData>();
    
    public Songify() {

        playlistSongs.add(new SongData("Shippuden", "Blanco", 44000000, "Rap"));
        playlistSongs.add(new SongData("Outside", "D-Block Europe", 267000000 , "Rap"));
        playlistSongs.add(new SongData("Alone With You", "Arz", 177000000, "Rap"));
        playlistSongs.add(new SongData("Savage Anthem", "PARTYNEXTDOOR", 150000000 , "R&B"));
        playlistSongs.add(new SongData("Who Hurt You?", "Daniel Caesar", 762000000, "R&B"));
        playlistSongs.add(new SongData("No Guidance", "Chris Brown", 468000000, "R&B"));
        playlistSongs.add(new SongData("On The Low", "Burna Boy", 365000000, "Afrobeats"));
        playlistSongs.add(new SongData("Soundgasm", "Rema", 670000000 , "Afrobeats"));
        playlistSongs.add(new SongData("Soso", "Omah Lay", 123000000, "Afrobeats"));
        playlistSongs.add(new SongData("Umbrella", "Rihanna", 988000000, "Hip-Hop"));
        playlistSongs.add(new SongData("Only", "Nicki Minaj", 535000000, "Hip-Hop"));
        playlistSongs.add(new SongData("Thang For You", "Rylo Rodrigeuz", 60000000 , "Hip-Hop"));
    }

    // Brief: Add a new song to the list of songs
    public void addNewSongData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have chosen to add a new song to the playlist");

        System.out.println("What is the title of the song you would like to add?");
        String songTitle = scanner.nextLine();

        System.out.println("What is the artist's name?");
        String artistName = scanner.nextLine();

        System.out.println("What is the stream count of this song?");
        int streamCount = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What genre does this song belong to?");
        String genre = scanner.nextLine();

        playlistSongs.add(new SongData(songTitle, artistName, streamCount, genre));
        System.out.println("Your song has sucessfully been added to the playlist!");
        }

    // Brief: Print a list of all the songs stored in the ArrayList
    public void printPlaylist() {
        System.out.println("The current Songify playlist is as follows:");

        for (SongData printPlaylist: playlistSongs) {
            System.out.println("Song Title: " + printPlaylist.getsongTitle() + " Artist Name: " + printPlaylist.getartistName() +
            " Stream Count: " + printPlaylist.getstreamCount() + " Genre: " + printPlaylist.getgenre());
        }
    }

    // Brief: Print a list of songs over a given number of plays 
    public void filterStreamCount(Scanner scanner) {
        System.out.println("What is the lowest stream count that you would like to appear on the playlist?");
        int streamCountUserInput = scanner.nextInt();

        System.out.println("Your playlist only includes songs with a higher stream count than " + streamCountUserInput + ":");

        for (SongData filterStreamCount : playlistSongs) {
            if (streamCountUserInput <= filterStreamCount.getstreamCount()) {
                System.out.println("Song Title: " + filterStreamCount.getsongTitle() + " Artist Name: " + filterStreamCount.getartistName() +
                " Stream Count: " + filterStreamCount.getstreamCount() + " Genre: " + filterStreamCount.getgenre()); 
            } 
        }
        System.out.println("Wrong genre");
    }

    // Added Feature: Print a list of songs based on genre
    public void filterGenre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have chosen to print a list of songs based on genre");

        System.out.println("What genre of songs would you like in your playlist?");
        String genreUserInput = scanner.nextLine();

        System.out.println("Your playlist now includes songs that belong to the " + genreUserInput + " genre:");

        for(SongData filterGenre : playlistSongs) {
            if (genreUserInput.equals(filterGenre.getgenre())) {
                System.out.println("Song Title: " + filterGenre.getsongTitle() + " Artist Name: " + filterGenre.getartistName() +
                " Stream Count: " + filterGenre.getstreamCount() + " Genre: " + filterGenre.getgenre()); 
            } 
        }
    }

    // Brief: delete a song from the list of songs
    public void deleteSong() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have chosen to delete a song from the playlist");

        System.out.println("What is the title of the song you would like to delete?");
        String deleteSongTitle = scanner.nextLine();

        System.out.println("What is the artist's name?");
        String deleteArtistName = scanner.nextLine();

        Iterator<SongData> iterator = playlistSongs.iterator();
            
        while(iterator.hasNext()) {
            SongData songDataPosition = iterator.next();

            if (songDataPosition.getsongTitle().equals(deleteSongTitle) && songDataPosition.getartistName().equals(deleteArtistName)) {
                iterator.remove();
                System.out.println( deleteSongTitle + " by " + deleteArtistName + " has been deleted from the playlist!");
            }
        }
    }
}   