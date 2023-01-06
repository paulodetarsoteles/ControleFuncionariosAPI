package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dpto = new Department(1, "DP_Teste"); 
		Seller sell = new Seller(1, "SL_Teste", "", new Date(), 0.0, dpto); 
		
		System.out.println("Teste dpto: " + dpto.toString());
		System.out.println("Teste sell: " + sell.toString());
	}
}
