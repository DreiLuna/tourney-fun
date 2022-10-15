public class Team 
{
    String team;
    int points;
    public Team(String teamName)
    {
        team = teamName;
        points = 0;
    }
    public String getTeamName()
    {
        return team;
    }
    public void addPointsOverride(int value)
    {
        points += value;
    }
    


}
