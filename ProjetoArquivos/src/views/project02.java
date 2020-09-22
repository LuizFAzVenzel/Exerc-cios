package views;

import dao.Exercicio2;
import model.Viagem;

public class project02 {


	
	private static Exercicio2 nd = new Exercicio2();
	
	public static void main(String[] args) {
	
		
		
		for(Viagem n: nd.openEntrada()) {
			
			System.out.println(n.toString());
			
		}
		
		nd.saveSaida(nd.openEntrada());
	}

}