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

        Team WGHSEsports = new Team("WGHS-Esports");
        //String playerName, String playerign, Team teamName, int playerAge, int playerKills
        Player TDark = new Player("Drei", "TDark", WGHSEsports, 17, 0);
        tournement algs = new tournement(0, "Apex ALGS", 5);
        TDark.printPlayerInfo();
        algs.addPlayer(TDark);
        algs.test();
        algs.printPlayerList();
        




    }



}