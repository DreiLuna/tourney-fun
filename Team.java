public class Team 
{
    private String team;
    private int points;
    private Player playerList[];
    private int count = 0;
    int totalKills =0 ;
    
    //private Player extra;


    public Team(String teamName, Player extraPlayer, int amount)
    {
        team = teamName;
        points = 0;
        //extra stuff
        playerList = new Player[amount];
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
            totalKills += playerList[i].getKills();
        }
        points += totalKills * tournement.killpoints;
        //add placement?
    }

    public void addPlayer(Player teamPlayer)
    {


        count += 1; 
        playerList[count-1] = teamPlayer;
        System.out.println("ADDED: " + playerList[count-1].getPlayerign());
        
        
        
    }
    public void printPlayerList()
    {
        System.out.print("Players on "+team+":");
        for(int i = 0; i<count; i++)
        {
            if(i<count-1)
            {
                System.out.print(i+1 +")"+playerList[i].getPlayerign() + ", ");
            }
            else
            {
                System.out.print(i+1 +")"+playerList[i].getPlayerign());
            }
        }
        System.out.println();
    
    }


}
