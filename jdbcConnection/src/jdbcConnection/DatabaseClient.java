package jdbcConnection;

import java.util.List;

public class DatabaseClient {

	public static void main(String[] args) 
	{
	
		
		EmployeeDao employeeDao=new EmployeeDao();
	/*	int res1=employeeDao.save(new Employee(111,"chandu",60000));
		System.out.println("data inserted successfully...."+res1);
		
		int res2=employeeDao.save(new Employee(222,"mani",55000));
		System.out.println("data inserted successfully...."+res2);

		int res3=employeeDao.save(new Employee(333,"bharath",50000));
		System.out.println("data inserted successfully...."+res3);

		int res4=employeeDao.save(new Employee(444,"uday",45000));
		System.out.println("data inserted successfully...."+res4);

		int res5=employeeDao.save(new Employee(555,"ram",50000));
		System.out.println("data inserted successfully...."+res5);
		
		
		
		// findbyid() method
		/*Employee per=EmployeeDao.findById(111);
		System.out.println(per);
      */
		
		// for deletebyid() method
		/*int deletecount=EmployeeDao.deleteById(111);
		if(deletecount==1)
		{
			System.out.println("data deleted successfully.."+deletecount);
		}
		else
		{
			System.out.println("data deletion failed");
		}*/
		
		
		// deleteby salary()method
		
		/*int count=EmployeeDao.deleteBySalary(60000);
		if(count!=0)
		{
		System.out.println("records deleted successfully.."+count);
		}else {
			System.out.println("records deletion failed.."+count);
		}
		
		//findall() method
		
		/*List<Employee> al=employeeDao.findAll();
		for(Employee x:al)
	{
		System.out.println(x);
		}
//		al.forEach(x->System.out.println(al));*/
		
		// updateSalary()
		
		int updatecount=EmployeeDao.updateSalary(50000, 5000);
		System.out.println("data updated successfully.."+updatecount);
	}
	
}
