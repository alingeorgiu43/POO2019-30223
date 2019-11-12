import java.util.Scanner;

public class Pasageri_Blablacar {
	private String name;
	private  String varsta_pasager;
	private String CNP;
	private String pick_up_city;
	private String destination;
	private String numar_pasageri;
	
	Scanner scann=new Scanner(System.in);
	
	public String scann_and_get_nr_pasageri()
	{
		this.numar_pasageri=scann.nextLine();
		return numar_pasageri;
	}
	
	public String scann_and_get_nume_pasager()
	{
		this.name=scann.nextLine();
		return name;
	}
	public String  scann_and_get_varsta()
	{
		this.varsta_pasager=scann.nextLine();
		return varsta_pasager;
	}
	
	public String scann_and_get_CNP()
	{
		this.CNP=scann.nextLine();
		return CNP;
	}
	public String scann_and_get_pick_up_city()
	{
		this.pick_up_city=scann.nextLine();
		return pick_up_city;
		
	}
	public String scann_and_get_destination()
	{
		this.destination=scann.nextLine();
		return destination;
	}

}
