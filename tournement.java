public class tournement
{
    private int prizepool;
    private String name;
    private Player playerList[];
    private int amount;
    private Player extra;
    private int count = 0;
    public static int killpoints;

    public tournement(int prize, String tName, int playerAmount, Player extraPlayer, int kp)
    {
        prizepool = prize;
        name = tName;
        playerList = new Player[playerAmount];
        amount = playerAmount;
        extra = extraPlayer;
        playerList[0] = extra;
        killpoints = kp;
    }
    
    public void addPlayer(Player player)
    {
        
        
        count += 1; 
        playerList[count-1] = player;
    }
    public void printPlayerList()
    {
        System.out.print("Players:");
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
