package lab3Pb4;

import java.text.DecimalFormat;

public class MainClass {

	public static void main(String[] args) {
		float sansaExtragere1 = 1 / 49;
		float sansaExtragere2 = 2 / 48;
		float sansaExtragere3 = 3 / 47;
		float sansaExtragere4 = 4 / 46;
		float sansaExtragere5 = 5 / 45;
		float sansaExtragere6 = 6 / 44;
		float a = (1 * 2 * 3 * 4 * 5 * 6) / (49 * 48 * 47 * 46 * 45 * 44);
		
		float sansaCastig = sansaExtragere1 * sansaExtragere2 * sansaExtragere3 * sansaExtragere4 * sansaExtragere5 * sansaExtragere6; 
		System.out.printf("%.10f\n", a);
	}

}
