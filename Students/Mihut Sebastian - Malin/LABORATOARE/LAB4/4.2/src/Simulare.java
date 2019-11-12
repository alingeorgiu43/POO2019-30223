import java.awt.Color;

public class Simulare {
	
	public static void main(String[] args) {
		Autovehicul autovehicul =new Autovehicul();
		autovehicul.setMarca("BMW");
		autovehicul.setColor(Color.black);
		autovehicul.setVitezaMax(210);
		Proprietar proprietar =new Proprietar();
		proprietar.setNme("Claudiu");
		proprietar.setVarsta(52);
		Sofer sofer=new Sofer();
		sofer.setNme("David");
		sofer.setVarsta(29);
		sofer.setNrPermis(126574);
		Pasager pasager1=new Pasager();
		Pasager pasager2 =new Pasager("Dan",20,e.spate1);
		autovehicul.getAutovehicul();
		proprietar.getProprietar();
		sofer.getSofer();
		pasager1.getPasager();
		pasager2.getPasager();
		//Simulam deplasarea autovehiculului
		autovehicul.accelerareApoiOprire();
	}

}
