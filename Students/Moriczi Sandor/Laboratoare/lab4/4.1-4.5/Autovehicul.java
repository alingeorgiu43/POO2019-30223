package laborator4;
import java.awt.Color;
public class Autovehicul {
	
	private String marca= new String();
	private Color col = Color.green;
	
	private  int viteza;
	private  int t_viteza;
	private  int nr_t_viteza;
	private  int max_viteza=200;
	private static final int DEC_SEC=10;
	public Autovehicul (String marca, Color col, int max_viteza, int nr_t_viteza)
	{
		this.marca=marca;
		this.col=col;
		this.max_viteza=max_viteza;
		this.nr_t_viteza=nr_t_viteza;
	}
	public Autovehicul()
	{
		this("Ranger", Color.GREEN, 200, 6 );
	}
	public void getPasager(Pasager pas)
	{
		System.out.println(pas);
	}
	public void getSofer(Sofer sof)
	{
		System.out.println(sof);
	}
	public void accelerare( int acc)
	{
		viteza=viteza+acc;
		if(viteza>max_viteza)
		{
			viteza=max_viteza;
		}
		schimbareViteza();
	}
	public void decelerare( int sec)
	{
		viteza=viteza-DEC_SEC*sec;
		if(viteza<0)
			viteza=0;
		schimbareViteza();
	}
	
	private void decelerare()
	{
		decelerare(1);
	}
	private void schimbareViteza()
	{
		if (viteza==0)
			t_viteza=0;
		else {
			float kmHPerTreapta=max_viteza/(float)nr_t_viteza;
			t_viteza=(int)(viteza/kmHPerTreapta)+1;
			if (t_viteza>nr_t_viteza)
				t_viteza=nr_t_viteza;
		}
		System.out.println(this);
	}
	public void oprire()
	{
		while(viteza>0)
		{
			decelerare();
		}
	}
	public String toString() {
		return "Marca: "+marca+" Culoare: "+col+" VMax: "+max_viteza+" "
				+ " NrTrepte: "+nr_t_viteza+" Viteza: "+viteza+" Treapta: "+t_viteza;
	}
	
	public void vopseste(Color culoare) {
		this.col=culoare;
	}
	
	public Color obtineCuloare() {
		return col;
	}
	public int getViteza()
	{
		return viteza;
	}
	

public static void main(String[] args) 
{
	Autovehicul x= new Autovehicul();
	/*TestDrive.testeaza(x);
	
	Autovehicul y= new Autovehicul("audi", Color.white, 300, 6);
	TestDrive.testeaza(y);
	*/
	Pasager pas= new Pasager();
	Sofer sof= new Sofer();
	x.getPasager(pas);
	x.getSofer(sof);
	sof.setFullName("Darlaczi", "Zoltan");
	sof.setAge(19);
	sof.setPermisNr(190);
	x.getSofer(sof);
}
}

