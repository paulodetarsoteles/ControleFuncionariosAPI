package application;

import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "DP_Teste"); 
		System.out.println("Teste: " + obj.toString());
	}
}
