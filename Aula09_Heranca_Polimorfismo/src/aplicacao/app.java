package aplicacao;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Forma;
import entities.Quadrado;
import entities.enums.Color;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Quadrado q1 = new Quadrado(Color.BLACK, 2.0, 5.0);
		Quadrado q2 = new Quadrado(Color.BLACK, 2.0, 10.0);
		Quadrado q3 = new Quadrado(Color.BLACK, 2.0, 15.0);
		Quadrado q4 = new Quadrado(Color.BLACK, 2.0, 20.0);
		
		List<Forma> lf = new ArrayList<Forma>();
		
		lf.add(q1);
		lf.add(q2);
		lf.add(q3);
		lf.add(q4);
		
		for(Forma f : lf) {
			System.out.println(f.area());
			System.out.println(f.getColor());
		}
		

	}

}
