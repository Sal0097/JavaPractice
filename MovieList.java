public class MovieList {
    public static void main(String[] args) {
        String[] movies = {
            "The Shawshank Redemption",
            "The Godfather",
            "The Dark Knight",
            "Pulp Fiction",
            "The Lord of the Rings: The Return of the King",
            "Forrest Gump",
            "Inception",
            "Fight Club",
            "The Matrix",
            "Goodfellas",
            "The Empire Strikes Back",
            "The Silence of the Lambs",
            "Se7en",
            "The Usual Suspects",
            "Schindler's List",
            "The Green Mile",
            "Interstellar",
            "Gladiator",
            "The Departed",
            "The Prestige"
        };

        System.out.println("List of Movies:");
         for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i]);
        }
    }
}