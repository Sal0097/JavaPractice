public class GameList {
    public static void main(String[] args) {
        String[] games = {
            "The Legend of Zelda: Breath of the Wild",
            "Red Dead Redemption 2",
            "The Witcher 3: Wild Hunt",
            "Minecraft",
            "Fortnite",
            "Among Us",
            "Overwatch",
            "Dark Souls III",
            "God of War",
            "Super Mario Odyssey"
        };

        System.out.println("List of Games:");
        for (int i = 0; i < games.length; i++) {
            System.out.println(games[i]);
        }
    }
}