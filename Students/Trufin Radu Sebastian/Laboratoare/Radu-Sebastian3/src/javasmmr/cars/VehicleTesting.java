package javasmmr.cars;
import java.awt.Color;

public class VehicleTesting 
{
	public static void main(String[] args) 
    {
    	System.out.println("Simulare deplasare :");
    	
        final Autovehicul constCar = new RaceCar("Default",Color.BLACK,0,0,180,false,true,false);
        
        System.out.println(constCar.marca + " - viteza maxima : " + constCar.v_max);
        
        RaceCar myCar = new RaceCar("Honda",Color.BLUE,0,0,220,true,false,false);
        
        Sofer S1 = new Sofer("Trufin","Radu-Sebastian",20,67);
        Adresa A1 = new Adresa("Calea Bucovinei","Radauti","725400","Romania");
        
        System.out.println(myCar.toString());
        System.out.print("Soferul " + S1.getName() + " " + S1.getSurname());
        System.out.print(" cu varsta de " + S1.getAge() + " ani ");
        System.out.print("si numarul de permis " + S1.getPassCode());
        System.out.println(" -> " + myCar.getTag());
        System.out.println("Destinatie finala : " + A1.getStreet() + " " + A1.getCity() + ", " + A1.getCountry());
        
        System.out.println("Viteza initiala : " + myCar.getSpeed());
        System.out.println("Treapta initiala : " + myCar.getGear());
        
        myCar.schimba_treapta(1);
        System.out.println("Treapta curenta : " + myCar.getGear());
        myCar.accelerare(5.5); 
        System.out.println("Viteza curenta : " + myCar.getSpeed());
        myCar.accelerare(10);
        System.out.println("Viteza curenta : " + myCar.getSpeed());
        myCar.schimba_treapta(2);
        System.out.println("Treapta curenta : " + myCar.getGear());
        myCar.decelerare(2);
        System.out.println("Viteza curenta : " + myCar.getSpeed());
        myCar.oprire();
        System.out.println("Viteza curenta : " + myCar.getSpeed());
       
    }
}
