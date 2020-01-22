package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao dep = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TEST 1: department findAll =====");
		List<Department> list = dep.findAll();
		list.forEach(System.out::println);
		
		System.out.println();
		System.out.println("==== TEST 2: department findById =====");
		Department department = dep.findById(2);
		System.out.println(department);
		
		System.out.println();
		System.out.println("==== TEST 3: department insert =====");
		Department newDep = new Department(null, "Reality");
		dep.insert(newDep);
		System.out.println("Inserted! New id = " + newDep.getId());
		
	}
}
