import java.util.List;
import java.util.ArrayList;
public class tournement
{
    private int prizepool;
    private String name;
    //private Player playerList[];
    private int count = 0;
    public static int killpoints;
    private List<Player> playerList = new ArrayList<Player>();

    public tournement(int prize, String tName, int kp)
    {
        prizepool = prize;
        name = tName;
        killpoints = kp;
    }
    
    public String getTournName()
    {
        return name;
    }

    public void printPrizepool()
    {
        System.out.println(prizepool);
    }
    
    public void addPlayer(Player player)
    {
        count +=1;
        playerList.add(player);
        System.out.println("ADDED: " + playerList.get(count-1).getPlayerign());
    }

    public Player getPlayer(int index)
    {
        return playerList.get(index);
    }

    public void printPlayerList()
    {
        System.out.print("Players in "+name+": ");
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
