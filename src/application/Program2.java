package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TEST 1: department findAll =====");
		List<Department> list = depDao.findAll();
		list.forEach(System.out::println);
		
		System.out.println();
		System.out.println("==== TEST 2: department findById =====");
		Department department = depDao.findById(2);
		System.out.println(department);
		
		System.out.println();
		System.out.println("==== TEST 3: department insert =====");
		Department newDep = new Department(null, "Reality");
		depDao.insert(newDep);
		System.out.println("Inserted! New id = " + newDep.getId());
		
		System.out.println();
		System.out.println("==== TEST 4: department update =====");
		department = depDao.findById(5);
		department.setName("Shows");
		depDao.update(department);
		System.out.println("Update completed");
		
	}
}
