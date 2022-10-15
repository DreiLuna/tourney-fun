public class Main
{
    public static void main(String[] args)
    {
        //create tournement
        //add players
        //player details
        //link to teams
        //create score for teams
        //list teams in order?
        Player extra = new Player();
        Team WGHSEsports = new Team("WGHS-Esports", extra, 3);
        //String playerName, String playerign, Team teamName, int playerAge, int playerKills
        Player Atomic = new Player("Tom", "Atomic", WGHSEsports, 18, 0);
        Player TDark = new Player("Drei", "TDark", WGHSEsports, 17, 0);
        tournement algs = new tournement(0, "Apex ALGS", 5, Atomic, 1);
        TDark.printPlayerInfo();
        algs.addPlayer(TDark);
        algs.addPlayer(Atomic);
        algs.printPlayerList();
        WGHSEsports.printPlayerList();
        




    }



}