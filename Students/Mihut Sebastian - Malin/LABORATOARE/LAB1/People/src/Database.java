import java.util.ArrayList;
import java.util.Iterator;

/**
 * A very simple database of people in a university. This class simply stores
 * persons and, at request, lists them on standard output.
 */

public class Database {

    private ArrayList<Person> persons;

    /**
     * Create a new, empty person database.
     */
    public Database() 
    {
        persons = new ArrayList<Person>();
    }

    
    
    public void addPerson(Person p) 
    {
        persons.add(p);
    }

   
    
    public void listAll () 
    {
        for (Iterator<Person> i = persons.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }
    }
}
