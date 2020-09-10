package model;

public class Worker {

	private String name; 
	private String lastName;
	private String docId;
	private int salary;
		
	
	public Worker(String name, String lastName, String docId, int salary) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.docId = docId;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDocId() {
		return docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Trabajador: Nombre:" + name + " |Apellido:" + lastName + " |Doc. Idetificacion:" + docId + " |Salario:" + salary;
	}
	
	
	
}
