
class Dog 
{
	static int dogCount = 0;  
	public Dog() 
	{
       dogCount += 1;
    }
	
    public static void main(String[] args) 
{
    new Dog();
    new Dog();
    new Dog();
    
    System.out.println("Frog count is now " + dogCount);
    
    // Intrebare:
    // Ce mesaj ar fi afișat dacă variabila dogCount ar fi
    // una instanță și nu una statică? 
    
    // Se afiseaza :
    // Cannot make a static reference to the non-static field dogCount
    
    // De ce?
    // O metodă sau câmp static există ca parte a unei clase și
    // independent de o instanță a clasei respective.
    // O metodă sau câmp nestatic depinde de existența
    // unei astfel de instante.
}
}
