import java.util.ArrayList; // importing the ArrayList class
import java.util.Scanner; // importing the Scanner class
import java.util.Iterator; //importing the Iterator class

public class Songify {

    // using declaration of an ArrayList to store SongData objects naming the collection playlist songs
    private ArrayList<SongData> playlistSongs = new ArrayList<SongData>();
    
    // using Songify constuctor to intialize and add information to the SongData objects in the ArrayList
    public Songify() {

        playlistSongs.add(new SongData("Shippuden", "Blanco", 44000075, "Rap"));
        playlistSongs.add(new SongData("Outside", "D-Block Europe", 267052078 , "Rap"));
        playlistSongs.add(new SongData("Alone With You", "Arz", 177000452, "Rap"));
        playlistSongs.add(new SongData("Savage Anthem", "PARTYNEXTDOOR", 159006500 , "RNB"));
        playlistSongs.add(new SongData("Who Hurt You?", "Daniel Caesar", 762050069, "RNB"));
        playlistSongs.add(new SongData("No Guidance", "Chris Brown", 468000099, "RNB"));
        playlistSongs.add(new SongData("On The Low", "Burna Boy", 365000000, "Afrobeats"));
        playlistSongs.add(new SongData("Soundgasm", "Rema", 670800000 , "Afrobeats"));
        playlistSongs.add(new SongData("Soso", "Omah Lay", 123540000, "Afrobeats"));
        playlistSongs.add(new SongData("Umbrella", "Rihanna", 988070220, "Hip Hop"));
        playlistSongs.add(new SongData("Only", "Nicki Minaj", 535070980, "Hip Hop"));
        playlistSongs.add(new SongData("Thang For You", "Rylo Rodrigeuz", 625000330 , "Hip Hop"));
    }

    // creating a method to print a list of all the songs stored in the ArrayList
    public void printPlaylist() {
        System.out.println("The current Songify playlist is as follows:");
    
    /* using a for loop to iterate over each of the SongData objects in the playlist songs ArrayList
     and print the song data using get methods to access variables */
        for (SongData printPlaylist: playlistSongs) {
            System.out.println("Song Title: " + printPlaylist.getsongTitle() + ", Artist Name: " + printPlaylist.getartistName() +
            ", Stream Count: " + printPlaylist.getstreamCount() + ", Genre: " + printPlaylist.getgenre());
        }
    }

    // creating a method to add a new song to the list of SongaData objects in the ArrayList
    public void addNewSongData() {
        Scanner scanner = new Scanner(System.in); // creating a Scanner object
        System.out.println("You have chosen to add a new song to the Songify playlist");

        System.out.println("What is the title of the song you would like to add?");
        String songTitleUserInput = scanner.nextLine(); // enables user input for the song title to be read

        System.out.println("What is the artist's name?");
        String artistNameUserInput = scanner.nextLine(); // enables user input for the artist name to be read

        System.out.println("What is the stream count of this song?");
        int streamCountUserInput = scanner.nextInt(); // enables user input for interger stream count to be read
        scanner.nextLine(); //ensures user input can move to the next line

        System.out.println("What genre does this song belong to?");
        String genreUserInput = scanner.nextLine(); // enables user input for the genre to be read

        playlistSongs.add(new SongData(songTitleUserInput, artistNameUserInput, streamCountUserInput, genreUserInput));
        System.out.println("Your song has sucessfully been added to the playlist!");
        printPlaylist(); // calling the method to print and showcase the updated Songify playlist
    }

    // creating a method to delete a song from the list of SongData objects in the ArrayList
    public void deleteSong() {
        Scanner scanner = new Scanner(System.in); // creating a Scanner object
        // using the printPlaylist method to improve user experince as they can see what song they want to remove
        printPlaylist();
        
        System.out.println("What is the title of the song you would like to delete?");
        String deleteSongTitleInput = scanner.nextLine(); // enables user input for the song title that needs to be deleted to be read

        System.out.println("What is the artist's name?");
        String deleteArtistNameInput = scanner.nextLine(); // enables user input for the artist name that needs to be deleted to be read

        // getting the Iterator
        Iterator<SongData> iterator = playlistSongs.iterator();
        
        // using a while loop to get the Iterator to go through the songs in the ArrayList 
        while(iterator.hasNext()) {
            SongData songDataPosition = iterator.next();
        
        // if the if statement condition is true the code within the statement will execute 
            if (songDataPosition.getsongTitle().equals(deleteSongTitleInput) && songDataPosition.getartistName().equals(deleteArtistNameInput)) {
                iterator.remove(); // the iterator will remove the song from the ArrayList
                System.out.println( deleteSongTitleInput + " by " + deleteArtistNameInput + " has been deleted from the Songify playlist!");
            }
        }
    }   

    // creating a method to print a list of songs over a given number of plays 
    public void filterStreamCount(Scanner scanner) {
        
        System.out.println("You have chosen to filter the Songify playlist to only include songs over a given number of streams");
        System.out.println("What is the lowest stream count number that you would like to appear?");
        int lowestStreamCountUserInput = scanner.nextInt(); // enables user input for the lowest stream count to be read

        //concatentation used to vary print statement based on previous user input
        System.out.println("Your playlist only includes songs with a higher stream count than " + lowestStreamCountUserInput + ":");

        /* using a for loop to iterate over each of the SongData objects in the playlist songs ArrayList
        then if the if statement condition is true,
        the code within the statement will execute and print the song */ 
         for (SongData filterStreamCount : playlistSongs) {
            if (lowestStreamCountUserInput <= filterStreamCount.getstreamCount()) {
                System.out.println("Song Title: " + filterStreamCount.getsongTitle() + ", Artist Name: " + filterStreamCount.getartistName() +
                ", Stream Count: " + filterStreamCount.getstreamCount() + ", Genre: " + filterStreamCount.getgenre()); 
            } 
        }
    }

    /* Adding an extra feature by creating a method that allows the user to
    filter the list of songs in the ArrayList based on the genre they input */
    public void filterGenre() {
        Scanner scanner = new Scanner(System.in); // creating a Scanner object

        System.out.println("You have chosen to filter the Songify playlist based on genre");

        System.out.println("What genre of songs would you like to filter to?");
        String desiredGenreUserInput = scanner.nextLine(); // enables user input for the desired genre to be read

        // concatentation used to vary print statement based on previous user input
        System.out.println("Your playlist now includes songs that belong to the " + desiredGenreUserInput + " genre:");

        /* using a for loop to iterate over each of the SongData objects in the ArrayList
        then if the if statement is true,
        the code within the statement will execute and print the song */ 
        for(SongData filterGenre : playlistSongs) {
            if (desiredGenreUserInput.equals(filterGenre.getgenre())) {
                System.out.println("Song Title: " + filterGenre.getsongTitle() + ", Artist Name: " + filterGenre.getartistName() +
                ", Stream Count: " + filterGenre.getstreamCount() + ", Genre: " + filterGenre.getgenre()); 
            }
        }   
        // concatentation used to vary print statement based on previous user input
        System.out.println("There are no additional " + desiredGenreUserInput + " songs in the playlist");        
        // print statement allows better user experience as instructions are provided
        System.out.println("To add new songs of the " + desiredGenreUserInput + " genre, Click 2");
    }
} 