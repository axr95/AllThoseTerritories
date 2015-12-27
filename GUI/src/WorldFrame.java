import javax.swing.*;
import java.util.List;

public class WorldFrame extends JFrame
{
    public WorldFrame(List<Player> players, List<Territory> territories, List<Continent> continents)
    {
        this.continents = continents;
        this.players = players;
        this.territories = territories;
    }

    List<Continent> continents;
    List<Territory> territories;
    List<Player> players;

    int activePlayer;
    int activeReinforcements;

    Territory selectedTerritory;
    Territory attackedTerritory;

    Territory moveFromTerritory;
    Territory moveToTerritory;
    boolean movePossible;
}