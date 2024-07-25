public class SongList {
    public static void main(String[] args) {
        // Array to store 10 song names
        String[] songs = {
            "Bohemian Rhapsody",
            "Stairway to Heaven",
            "Hotel California",
            "Imagine",
            "Hey Jude",
            "Smells Like Teen Spirit",
            "Billie Jean",
            "Like a Rolling Stone",
            "What's Going On",
            "Sweet Child O' Mine"
        };
        System.out.println("List of Songs:");
         for (int i = 0; i < songs.length; i++) {
            System.out.println(songs[i]);
        }
    }
}