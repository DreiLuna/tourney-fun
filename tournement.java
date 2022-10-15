public class tournement
{
    int prizepool;
    String name;
    Player[] playerList;
    int amount;


    public tournement(int prize, String tName, int playerAmount)
    {
        prizepool = prize;
        name = tName;
        playerList = new Player[playerAmount];
        amount = playerAmount;
    }
    public void addPlayer(Player player)
    {
        
        int count = -1;
        count += 1; 
        playerList[count] = player;
    }
    public void printPlayerList()
    {
        
        for(int i = 0; i<=playerList.length; i++)
        {
            System.out.println(i);
            System.out.print(playerList[i].getPlayerign());
        }
        
    }
    public void test()
    {
        System.out.println(playerList[0].getPlayerign());
    }

}
