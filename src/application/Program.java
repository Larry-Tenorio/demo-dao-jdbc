package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
	System.out.println("TESTE 1: SELLER findById");	
		
	SellerDao sellerDao = DaoFactory.createSellerDao();
	Seller seller = sellerDao.findByid(3);
	System.out.println(seller);
	
	System.out.println("TESTE 2: SELLER findByDepartment");
	
	Department department = new Department(2, null);
	List<Seller> list = sellerDao.findByDepartment(department);
	for(Seller obj : list) {
		System.out.println(obj);
	}
	
	
	System.out.println("TESTE 3: SELLER findAll");
	
	list = sellerDao.findAll();
	for(Seller obj : list) {
		System.out.println(obj);
	}
		
	}
}
