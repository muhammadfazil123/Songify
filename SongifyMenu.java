import java.util.Scanner;

public class SongifyMenu {

    final static int PRINT_PLAYLIST = 1;
    final static int ADD_NEW_SONG = 2;
    final static int DELETE_SONG = 3;
    final static int FILTER_STREAM_COUNT = 4;
    final static int FILTER_GENRE = 5;
    final static int CLOSE_APPLICATION = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Songify useSongifyMethods = new Songify();

        System.out.println("Welcome to Songify, a streaming service perfect for you: ");

        int userChoice = 0;

        while(userChoice != CLOSE_APPLICATION) {
            songifyMenu();
            userChoice = scanner.nextInt();

            if(PRINT_PLAYLIST <= userChoice && CLOSE_APPLICATION >= userChoice) {
                userInputMenuChoice(userChoice, useSongifyMethods, scanner);
            } else {
                System.out.println("Wrong Number, Look at the Songify Menu and attempt again!");
            }
        }
    }

    public static void songifyMenu() {

        System.out.println("Songify Menu:");
        System.out.println("Click 1 - to access the current Songify playlist");
        System.out.println("Click 2 - to add a new song to the Songify playlist");
        System.out.println("Click 3 - to remove an existing song from the playlist");
        System.out.println("Click 4 - to filter the playlist based on the streamcount of songs");
        System.out.println("Click 5 - to filter the playlist to only show a specific genre");
        System.out.println("Click 6 - to close the Songify application");
    }

    public static void userInputMenuChoice(int userChoice, Songify useSongifyMethods, Scanner scanner) {

        switch(userChoice) {
            
            case PRINT_PLAYLIST:
            useSongifyMethods.printPlaylist();
            break;

            case ADD_NEW_SONG:
            useSongifyMethods.addNewSongData();
            break;

            case DELETE_SONG:
            useSongifyMethods.deleteSong();
            break;

            case FILTER_STREAM_COUNT:
            useSongifyMethods.filterStreamCount(scanner);
            break;

            case FILTER_GENRE:
            useSongifyMethods.filterGenre();
            break;

            case CLOSE_APPLICATION:
            System.out.println("Goodbye, you have closed the Songify application");
            scanner.close();
            break;

            default:
            System.out.println("Wrong Number, Look at the Songify Menu and attempt again!");
        }
    

    }
    
}
