package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("*** TEST1: Find Seller By Id: ");
		Seller seller = sellerDao.findById(3); 
		System.out.println(seller);
		
		System.out.println("\n*** TEST2: Find Seller By Department: ");
		Department department = new Department(2, null); 
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n*** TEST3: Find All Sellers: "); 
		List<Seller> listAll = sellerDao.findAll();
		for (Seller obj : listAll) {
			System.out.println(obj);
		}
		
		System.out.println("\n*** TEST4: Insert Sellers: ");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserido! Novo vendedor: " + newSeller.getId()); 
		
		System.out.println("\n*** TEST5: Update Sellers: ");
		Seller upSeller = sellerDao.findById(1); 
		upSeller.setName("Martha Wayne"); 
		sellerDao.update(upSeller); 
		System.out.println("Vendedor atualizado: " + upSeller.toString());
		
		System.out.println("\n*** TEST6: Delete Sellers: ");
		System.out.print("Digite um Id de vendedor para ser deletado: ");
		int Id = sc.nextInt(); 
		sellerDao.deleteById(Id);
		System.out.println("Vendedor " + Id + " foi deletado com sucesso" );
		sc.close();
	}
}
