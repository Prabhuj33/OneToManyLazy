package OneToManyLazy.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import OneToManyLazy.dto.Company;
import OneToManyLazy.dto.Employee;



public class EmployeeDao {

	
	public EntityManager getEntityManager() {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			return entityManager;
		}
		public void saveEmployee(int companyId,Employee employee) {
			EntityManager entityManager=getEntityManager();
			Company dbCompany=entityManager.find(Company.class, companyId);
			if(dbCompany!=null) {
//				that company is present so i can join to that company
				EntityTransaction entityTransaction=entityManager.getTransaction();
				entityTransaction.begin();
				entityManager.persist(employee);
//				That company has to update the data
				List<Employee> employees=dbCompany.getEmployee();
//				employee=old employee
//				i need to add this new employee to that list
				employees.add(employee);
//				employees=old employees+new employee
//				reset this list of employee
				dbCompany.setEmployee(employees);
				entityTransaction.commit();
			}else {
				System.out.println("Sorry Id is not present");
			}
		}
		
		public void updateEMployee(int id,Employee employee) {
			EntityManager entityManager=getEntityManager();
			Employee dbEmployee=entityManager.find(Employee.class, id);
			if(dbEmployee!=null) {
//				id is present so i can update the data
				EntityTransaction entityTransaction=entityManager.getTransaction();
				entityTransaction.begin();
				employee.setId(id);
				entityManager.merge(employee);
				entityTransaction.commit();
			}else {
				System.out.println("Sorry Id is not present to update");
			}
		}
		
		public void findEMployee(int id) {
			EntityManager entityManager=getEntityManager();
			Employee dbEmployee=entityManager.find(Employee.class, id);
			if(dbEmployee!=null) {
//				id is present 
				System.out.println(dbEmployee);
			}else {
				System.out.println("Sorry Id is not present to update");
			}
		}
		
		public void deleteEMployee(int id) {
			EntityManager entityManager=getEntityManager();
			Employee dbEmployee=entityManager.find(Employee.class, id);
			if(dbEmployee!=null) {
//				id is present so i can update the data
				EntityTransaction entityTransaction=entityManager.getTransaction();
				entityTransaction.begin();
				entityManager.remove(dbEmployee);
				entityTransaction.commit();
			}else {
				System.out.println("Sorry Id is not present to update");
			}
		}
		
		
		
	
}
