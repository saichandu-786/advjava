package jdbcConnection;

public class Employee 
{
     int Id;
     String Name;
     double Salary;
	public Employee(int id, String name, double salary) {
		super();
		this.Id = id;
		this.Name = name;
		this.Salary = salary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		this.Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Salary=" + Salary + "]";
	}
	
}
