import java.util.ArrayList;
public class Vet
{
    private ArrayList<Animal> client;
    private String name;

    public Vet(String name)
    {
        this.name = name;
        client = new ArrayList<Animal>();
    }

    public void addClient(Animal x)
    {
        if(!client.contains(x)){
        client.add(x);
        System.out.println("Welcome to " + name + " office," + x.getName()+ "!");
        }
        else
        {

        }
    }
}
