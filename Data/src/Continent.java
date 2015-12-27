import java.util.List;

public class Continent
{
    String name;
    List<Territory> territories;
    int reinforcements;

    public Continent(String name, List<Territory> territories, int reinforcements)
    {
        this.name = name;
        this.territories = territories;
        this.reinforcements = reinforcements;
    }

    public String getName()
    {
        return name;
    }
    public List<Territory> getTerritories()
    {
        return territories;
    }
    public int getReinforcements()
    {
        return reinforcements;
    }
}
