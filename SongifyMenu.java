public class SongifyMenu {

    final int PRINT_PLAYLIST = 1;
    final int ADD_NEW_SONG = 2;
    final int REMOVE_SONG = 3;
    final int FILTER_STREAM_COUNT = 4;
    final int FILTER_GENRE = 5;
    final int EXIT = 0;

    public void songifyMenu() {
        System.out.println("Songify Menu:");
        System.out.println("Click 1 - to access the current Songify playlist");
        System.out.println("Click 2 - to add a new song to the Songify playlist");
        System.out.println("Click 3 - to remove an existing song from the playlist");
        System.out.println("Click 4 - to filter the playlist based on the streamcount of songs");
        System.out.println("Click 5 - to filter the playlist to only show a specific genre");
        System.out.println("Click 0 - to exit Songify");
    }
    
}
