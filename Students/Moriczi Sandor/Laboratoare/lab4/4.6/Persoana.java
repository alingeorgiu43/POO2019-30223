package laborator4;

public class Persoana {

	private String nume;
	private String prenume;
	public Persoana(String nume, String prenume)
	{
		this.nume=nume;
		this.prenume=prenume;
	}
	public Persoana()
	{
		this("Moriczi","Sanyi");
	}
	public void getPersoana(Persoana p)
	{
		System.out.println(p);
	}
	public void getPersoanaAndCarte(Persoana p,CarteCopii c)
	{
		System.out.println(p.nume+" "+p.prenume+" detine cartea: "+c.nume);
	}
	public void getDetaliiCarte(CarteCopii c)
	{
		System.out.println(c);
	}
	public String toString()
	{
		return nume+ " "+prenume;
	}
	public void getCarte(CarteCopii c)
	{
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		Persoana p= new Persoana();
		CarteCopii c= new CarteCopii();
		p.getPersoana(p);
		p.getPersoanaAndCarte(p, c);
		p.getDetaliiCarte(c);
	}

}
