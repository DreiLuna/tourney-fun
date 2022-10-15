import java.util.List;
import java.util.ArrayList;
public class tournList 
{
    private int count = 0;
    private List<tournement> tournList = new ArrayList<tournement>();
    public tournList()
    {

    }

    public void addTourn(tournement tourn)
    {
        count +=1;

        tournList.add(tourn);
        System.out.println("ADDED: " + tournList.get(count-1).getTournName());

    }

    public tournement getTourn(int index)
    {
        return tournList.get(index);
    }

    public void listTourn()
    {
        System.out.print("Tournements created: ");
        for(int i = 0; i<tournList.size(); i++)
        {
            if(i<count-1)
            {
                System.out.print(i+1 +")"+tournList.get(i).getTournName() + ", ");
            }
            else
            {
                System.out.println(i+1 +")"+tournList.get(i).getTournName());
            }
        }
    }

}
