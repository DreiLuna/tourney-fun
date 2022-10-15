public class Player 
{
    private String name;
    private Team team;
    private String ign;
    private int age;
    private int kills;

    public Player(String playerName, String playerign, Team teamName, int playerAge, int playerKills)
    {
        name = playerName;
        team = teamName;
        ign = playerign;
        age = playerAge;
        kills = playerKills;

        
    }
    public void addKills(int playerKills)
    {
        kills += playerKills;
    }
    public void updateAge(int playerAge)
    {
        //make automatic if possible
        age = playerAge;
    }
    public String getPlayerign()
    {
        return ign;
    }
    public void printPlayerInfo()
    {
        System.out.println(ign +"(" +name+ ")" + " has a total of " + kills + " kills, is " + age + " years old, and apart of team " +team.getTeamName()+".");
    }
    public String toString()
    {
        return ign +"(" +name+ ")" + " has a total of " + kills + " kills, is " + age + " years old, and apart of team " +team.getTeamName()+".";
    }
}
