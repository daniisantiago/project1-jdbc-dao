package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao dep = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TEST 1: seller findAll =====");
		List<Department> list = dep.findAll();
		list.forEach(System.out::println);
	}
}
