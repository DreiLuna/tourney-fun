import java.util.Scanner;
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

        Scanner input = new Scanner(System.in);

        //! constructors

        tournList tournDefault = new tournList();
        Team WGHSEsports = new Team("WGHS-Esports");
        Player Atomic = new Player("Tom", "Atomic", WGHSEsports, 18, 0);
        Player TDark = new Player("Drei", "TDark", WGHSEsports, 17, 0);
        tournement algs = new tournement(0, "Apex ALGS", 1);

        //!methods (not all)
        TDark.printPlayerInfo();
        algs.addPlayer(TDark);
        algs.addPlayer(Atomic);
        algs.printPlayerList();
        WGHSEsports.printPlayerList();
        
        int answer;
        String command ="";
        int indexTourn;
        Player currentPlayer;
        //! Must add tournement before runnning(10/15/22)
        tournDefault.addTourn(algs);
        tournDefault.listTourn();
        System.out.println("What is your tournements index? ");
        indexTourn = input.nextInt();
        tournement currentTourn = tournDefault.getTourn(indexTourn-1);
        System.out.println("DEBUG: "+ tournDefault.getTourn(indexTourn-1).getTournName());


        while(!(command.equals("stop")))
        {
            //TODO add ifs for all commands to be able to run any method
            System.out.println("DEBUG: ran while loop");
            command = input.nextLine();

            if(command.equals("stop"))
            {
                System.out.println("DEBUG STOP");
            }


            if(command.equals("printPlayerInfo"))
            {
                currentTourn.printPlayerList();
                System.out.println("What index is the player? ");
                answer = input.nextInt();
                currentPlayer = currentTourn.getPlayer(answer+1);
                currentPlayer.printPlayerInfo();
            }


        }
        


    }



}