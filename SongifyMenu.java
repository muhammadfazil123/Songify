import java.util.Scanner; // importing the Scanner class

public class SongifyMenu {

    // constant varaibles that will be used for the Songify menu
    final static int PRINT_PLAYLIST = 1;
    final static int ADD_NEW_SONG = 2;
    final static int DELETE_SONG = 3;
    final static int FILTER_BY_STREAM_COUNT = 4;
    final static int FILTER_BY_GENRE = 5;
    final static int CLOSE_APPLICATION = 9;

    // main method added to ensure all code inside can be called on and run
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // creating a Scanner object
        SongifyMethods useSongifyMethods = new SongifyMethods(); // instance of Songify class created so it's methods can be accessed

        System.out.println("Welcome to Songify, a streaming service perfect for you: ");

        // variable represents the number user seleted and sets it to 0
        int numberUserSelected = 0;

        // while loop executes as long as the condition is true, the code within the while loop will execute
        while(numberUserSelected != CLOSE_APPLICATION) {
            songifyTerminalMenu(); // calls on the method to print Songify menu 
            numberUserSelected = scanner.nextInt(); // enables user input for the number chosen to be read
            
            /* if condition is true, the menuResponse method will be called on
            else, the print statement will appear in the terminal */
            if(PRINT_PLAYLIST <= numberUserSelected && CLOSE_APPLICATION >= numberUserSelected) {
                menuResponse(numberUserSelected, useSongifyMethods, scanner);
            } else {
                System.out.println("Wrong Number, Look at the Songify Menu and attempt again!");
            } 
        } 
    }

    // creating a songify terminal menu to print statemnets that will instruct the user
    public static void songifyTerminalMenu() {

        System.out.println("\n                Songify Menu:"); // space added to have visual effect when executed
        System.out.println("Click 1 - to access the current Songify playlist");
        System.out.println("Click 2 - to add a new song to the Songify playlist");
        System.out.println("Click 3 - to remove an existing song from the playlist");
        System.out.println("Click 4 - to filter the playlist based on the streamcount of songs");
        System.out.println("Click 5 - to filter the playlist to only show a specific genre");
        System.out.println("Click 9 - to close the Songify application");
    }

    /* creating a method that provides a menu response based on user input 
    menu response has instances so that theY can be accesed */
    public static void menuResponse(int numberUserSelected, SongifyMethods useSongifyMethods, Scanner scanner) {

        /* the switch statement provides a menu response based on the number the user selected on the Songify menu,
         the case is matched to the variable so it can be execeuted */
        switch(numberUserSelected) {
            
            case PRINT_PLAYLIST:
            useSongifyMethods.printPlaylist();
            break;

            case ADD_NEW_SONG:
            useSongifyMethods.addNewSongData();
            break;

            case DELETE_SONG:
            useSongifyMethods.deleteSong();
            break;

            case FILTER_BY_STREAM_COUNT:
            useSongifyMethods.filterStreamCount(scanner);
            break;

            case FILTER_BY_GENRE:
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