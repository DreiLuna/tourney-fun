import java.util.List;
import java.util.ArrayList;
public class Team 
{
    private String team;
    private int points;
    private int count = 0;
    int totalKills =0 ;
    private List<Player> playerList = new ArrayList<Player>();


    public Team(String teamName)
    {
        team = teamName;
        points = 0;
        //extra stuff
        
    }

    public void printPoints()
    {
        System.out.println(points);
    }

    public String getTeamName()
    {
        return team;
    }

    public void addPointsOverride(int value)
    {
        points += value;
    }

    public void updatePoints()
    {
        for(int i = 0; i<count; i++)
        {
            totalKills += playerList.get(i).getKills();
        }
        points += totalKills * tournement.killpoints;
        //add placement?
    }

    public void addPlayer(Player teamPlayer)
    {
        count +=1;
        playerList.add(teamPlayer);
        System.out.println("ADDED: " + playerList.get(count-1).getPlayerign());
        
    }
    public void printPlayerList()
    {
        System.out.print("Players on "+team+": ");
        for(int i = 0; i<playerList.size(); i++)
        {
            if(i<count-1)
            {
                System.out.print(i+1 +")"+playerList.get(i).getPlayerign() + ", ");
            }
            else
            {
                System.out.println(i+1 +")"+playerList.get(i).getPlayerign());
            }
        }
    }


}
