/**
 * A person class for a simple BlueJ demo program. Person is used as
 * an abstract superclass of more specific person classes.
 */

abstract class Person
{
    private String name;
    private int yearOfBirth;

    /**
     * Create a person with given name and age.
     */
    Person(String name, int yearOfBirth)
    {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

 
    public void setName(String newName)
    {
        name = newName;
    }

    
    public String getName()
    {
        return name;
    }
    
   
    public void setYearOfBirth(int newYearOofBirth)
    {
        yearOfBirth = newYearOofBirth;
    }

    
    
    public int getYearOfBirth()
    {
        return yearOfBirth;
    }

   
    
    public String toString()    // redefined from "Object"
    {
        return "Name: " + name + "\n" +
               "Year of birth: " + yearOfBirth + "\n";
    }
}
