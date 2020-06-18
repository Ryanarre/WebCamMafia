import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> players = generate();

        for (Player player : players)
        {
            System.out.println("[" + player.getRole() + "]: " + player.getGreeting());
        }
    }

    public static ArrayList<Player> generate()
    {
        ArrayList<Player> players = new ArrayList<>();

        Shuffler shuffler = new Shuffler(5, 2, 1, 0, 1, 1);
        int count = 10;

        for (int i = 1; i <= count; ++i)
        {
            players.add(new Player(i, shuffler.getRole()));
        }

        return players;
    }
}
