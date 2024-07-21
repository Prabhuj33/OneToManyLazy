package OneToOneManyLazyController;

import OneToManyLazy.dao.CompanyDao;
import OneToManyLazy.dao.EmployeeDao;
import OneToManyLazy.dto.Company;
import OneToManyLazy.dto.Employee;

public class CompanyEmployeeController {

	public static void main(String[] args) {
		
//		Company c=new Company();
//		c.setId(4);
//		c.setName("prabhu");
//	    c.setGst("QSP2NJ");
//	    
//	    CompanyDao com=new CompanyDao();
//	    com.saveCompany(c);
//	
//	 Employee e=new Employee();
//	 e.setId(4);
//	 e.setName("prabhu");
//	 e.setAddress("kochi");
//	 
//	 EmployeeDao da=new EmployeeDao();
//	 da.saveEmployee(4, e);
	 

		
		// UPDATE
//		Company c=new Company();
//		c.setId(1);
//		c.setName("PRABHU");
//	    c.setGst("MOINONH");
//	    
//	    CompanyDao com=new CompanyDao();
//	    com.updateCompany(1, c);
//	
//	 Employee e=new Employee();
//	 e.setId(3);
//	 e.setName("kaviya");
//	 e.setAddress("kovai");
//	 
//	 EmployeeDao da=new EmployeeDao();
//	 da.updateEMployee(3, e);


		
		
		//delete
		
		
		
//	    CompanyDao com=new CompanyDao();
//	    com.deleteCompany(1);
//	
//	 
//	 EmployeeDao da=new EmployeeDao();
//	 da.deleteEMployee(1);

		
		
		//find
		
		
		CompanyDao da=new CompanyDao();   //relationship 
		da.findCompany(1);
	 
		
	}
}
